package p155v3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p161w3.C5953m0;

/* renamed from: v3.h */
/* compiled from: ContentDataSource */
public final class C5808h extends C5803g {

    /* renamed from: e */
    private final ContentResolver f28815e;

    /* renamed from: f */
    private Uri f28816f;

    /* renamed from: g */
    private AssetFileDescriptor f28817g;

    /* renamed from: h */
    private FileInputStream f28818h;

    /* renamed from: i */
    private long f28819i;

    /* renamed from: j */
    private boolean f28820j;

    /* renamed from: v3.h$a */
    /* compiled from: ContentDataSource */
    public static class C5809a extends C5830m {
        public C5809a(IOException iOException, int i) {
            super((Throwable) iOException, i);
        }
    }

    public C5808h(Context context) {
        super(false);
        this.f28815e = context.getContentResolver();
    }

    public void close() throws C5809a {
        this.f28816f = null;
        try {
            FileInputStream fileInputStream = this.f28818h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f28818h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f28817g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f28817g = null;
                if (this.f28820j) {
                    this.f28820j = false;
                    mo20326r();
                }
            } catch (IOException e) {
                throw new C5809a(e, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.f28817g = null;
                if (this.f28820j) {
                    this.f28820j = false;
                    mo20326r();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C5809a(e2, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.f28818h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f28817g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f28817g = null;
                if (this.f28820j) {
                    this.f28820j = false;
                    mo20326r();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C5809a(e3, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.f28817g = null;
                if (this.f28820j) {
                    this.f28820j = false;
                    mo20326r();
                }
                throw th3;
            }
        }
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f28816f;
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws C5809a {
        AssetFileDescriptor assetFileDescriptor;
        C5837p pVar2 = pVar;
        int i = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = pVar2.f28881a;
            this.f28816f = uri;
            mo20327s(pVar);
            if ("content".equals(pVar2.f28881a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f28815e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f28815e.openAssetFileDescriptor(uri, "r");
            }
            this.f28817g = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f28818h = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    if (pVar2.f28887g > length) {
                        throw new C5809a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j = length;
                long skip = fileInputStream.skip(pVar2.f28887g + startOffset) - startOffset;
                if (skip == pVar2.f28887g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f28819i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f28819i = position;
                            if (position < 0) {
                                throw new C5809a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j2 = j - skip;
                        this.f28819i = j2;
                        if (j2 < 0) {
                            throw new C5809a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j3 = pVar2.f28888h;
                    if (j3 != -1) {
                        long j4 = this.f28819i;
                        if (j4 != -1) {
                            j3 = Math.min(j4, j3);
                        }
                        this.f28819i = j3;
                    }
                    this.f28820j = true;
                    mo20328t(pVar);
                    long j5 = pVar2.f28888h;
                    return j5 != -1 ? j5 : this.f28819i;
                }
                throw new C5809a((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new C5809a(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
        } catch (C5809a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C5809a(e2, i);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C5809a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f28819i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C5809a(e, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((FileInputStream) C5953m0.m35138j(this.f28818h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f28819i;
        if (j2 != -1) {
            this.f28819i = j2 - ((long) read);
        }
        mo20325q(read);
        return read;
    }
}
