package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class je2 extends kf2 {

    /* renamed from: e */
    private final AssetManager f11526e;

    /* renamed from: f */
    private Uri f11527f;

    /* renamed from: g */
    private InputStream f11528g;

    /* renamed from: h */
    private long f11529h;

    /* renamed from: i */
    private boolean f11530i;

    public je2(Context context) {
        super(false);
        this.f11526e = context.getAssets();
    }

    /* renamed from: b */
    public final void mo8791b() throws id2 {
        this.f11527f = null;
        try {
            InputStream inputStream = this.f11528g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f11528g = null;
            if (this.f11530i) {
                this.f11530i = false;
                mo11673m();
            }
        } catch (IOException e) {
            throw new id2(e, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f11528g = null;
            if (this.f11530i) {
                this.f11530i = false;
                mo11673m();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws id2 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11529h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new id2(e, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.f11528g;
        int i3 = gb2.f9812a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f11529h;
        if (j2 != -1) {
            this.f11529h = j2 - ((long) read);
        }
        mo11672f0(read);
        return read;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f11527f;
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws id2 {
        try {
            Uri uri = wq2.f19753a;
            this.f11527f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo11674n(wq2);
            InputStream open = this.f11526e.open(path, 1);
            this.f11528g = open;
            if (open.skip(wq2.f19758f) >= wq2.f19758f) {
                long j = wq2.f19759g;
                if (j != -1) {
                    this.f11529h = j;
                } else {
                    long available = (long) this.f11528g.available();
                    this.f11529h = available;
                    if (available == 2147483647L) {
                        this.f11529h = -1;
                    }
                }
                this.f11530i = true;
                mo11675o(wq2);
                return this.f11529h;
            }
            throw new id2((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (id2 e) {
            throw e;
        } catch (IOException e2) {
            throw new id2(e2, true != (e2 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
        }
    }
}
