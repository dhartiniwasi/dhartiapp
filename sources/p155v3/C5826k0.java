package p155v3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: v3.k0 */
/* compiled from: RawResourceDataSource */
public final class C5826k0 extends C5803g {

    /* renamed from: e */
    private final Resources f28851e;

    /* renamed from: f */
    private final String f28852f;

    /* renamed from: g */
    private Uri f28853g;

    /* renamed from: h */
    private AssetFileDescriptor f28854h;

    /* renamed from: i */
    private InputStream f28855i;

    /* renamed from: j */
    private long f28856j;

    /* renamed from: k */
    private boolean f28857k;

    /* renamed from: v3.k0$a */
    /* compiled from: RawResourceDataSource */
    public static class C5827a extends C5830m {
        public C5827a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C5826k0(Context context) {
        super(false);
        this.f28851e = context.getResources();
        this.f28852f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public void close() throws C5827a {
        this.f28853g = null;
        try {
            InputStream inputStream = this.f28855i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f28855i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f28854h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f28854h = null;
                if (this.f28857k) {
                    this.f28857k = false;
                    mo20326r();
                }
            } catch (IOException e) {
                throw new C5827a((String) null, e, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th) {
                this.f28854h = null;
                if (this.f28857k) {
                    this.f28857k = false;
                    mo20326r();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C5827a((String) null, e2, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th2) {
            this.f28855i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f28854h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f28854h = null;
                if (this.f28857k) {
                    this.f28857k = false;
                    mo20326r();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C5827a((String) null, e3, AdError.SERVER_ERROR_CODE);
            } catch (Throwable th3) {
                this.f28854h = null;
                if (this.f28857k) {
                    this.f28857k = false;
                    mo20326r();
                }
                throw th3;
            }
        }
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f28853g;
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws C5827a {
        int i;
        String str;
        C5837p pVar2 = pVar;
        Uri uri = pVar2.f28881a;
        this.f28853g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C5917a.m34872e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i = Integer.parseInt((String) C5917a.m34872e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C5827a("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) C5917a.m34872e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            i = this.f28851e.getIdentifier(sb.toString(), "raw", this.f28852f);
            if (i == 0) {
                throw new C5827a("Resource not found.", (Throwable) null, 2005);
            }
        } else {
            throw new C5827a("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        mo20327s(pVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f28851e.openRawResourceFd(i);
            this.f28854h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f28855i = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    try {
                        if (pVar2.f28887g > length) {
                            throw new C5827a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (C5827a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new C5827a((String) null, e2, AdError.SERVER_ERROR_CODE);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(pVar2.f28887g + startOffset) - startOffset;
                if (skip == pVar2.f28887g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f28856j = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f28856j = size;
                            if (size < 0) {
                                throw new C5827a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f28856j = j;
                        if (j < 0) {
                            throw new C5830m(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j2 = pVar2.f28888h;
                    if (j2 != -1) {
                        long j3 = this.f28856j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f28856j = j2;
                    }
                    this.f28857k = true;
                    mo20328t(pVar);
                    long j4 = pVar2.f28888h;
                    return j4 != -1 ? j4 : this.f28856j;
                }
                throw new C5827a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new C5827a("Resource is compressed: " + uri, (Throwable) null, AdError.SERVER_ERROR_CODE);
        } catch (Resources.NotFoundException e3) {
            throw new C5827a((String) null, e3, 2005);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C5827a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f28856j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C5827a((String) null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) C5953m0.m35138j(this.f28855i)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f28856j;
            if (j2 != -1) {
                this.f28856j = j2 - ((long) read);
            }
            mo20325q(read);
            return read;
        } else if (this.f28856j == -1) {
            return -1;
        } else {
            throw new C5827a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
    }
}
