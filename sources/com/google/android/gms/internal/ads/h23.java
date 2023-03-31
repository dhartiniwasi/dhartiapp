package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h23 extends kf2 {

    /* renamed from: e */
    private RandomAccessFile f10164e;

    /* renamed from: f */
    private Uri f10165f;

    /* renamed from: g */
    private long f10166g;

    /* renamed from: h */
    private boolean f10167h;

    public h23() {
        super(false);
    }

    /* renamed from: b */
    public final void mo8791b() throws g13 {
        this.f10165f = null;
        try {
            RandomAccessFile randomAccessFile = this.f10164e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f10164e = null;
            if (this.f10167h) {
                this.f10167h = false;
                mo11673m();
            }
        } catch (IOException e) {
            throw new g13(e, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f10164e = null;
            if (this.f10167h) {
                this.f10167h = false;
                mo11673m();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws g13 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f10166g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f10164e;
            int i3 = gb2.f9812a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f10166g -= (long) read;
                mo11672f0(read);
            }
            return read;
        } catch (IOException e) {
            throw new g13(e, AdError.SERVER_ERROR_CODE);
        }
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f10165f;
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws g13 {
        Uri uri = wq2.f19753a;
        this.f10165f = uri;
        mo11674n(wq2);
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f10164e = randomAccessFile;
            try {
                randomAccessFile.seek(wq2.f19758f);
                long j = wq2.f19759g;
                if (j == -1) {
                    j = this.f10164e.length() - wq2.f19758f;
                }
                this.f10166g = j;
                if (j >= 0) {
                    this.f10167h = true;
                    mo11675o(wq2);
                    return this.f10166g;
                }
                throw new g13((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e) {
                throw new g13(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new g13(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (gb2.f9812a < 21 || !f03.m12391b(e2.getCause())) {
                i = 2005;
            }
            throw new g13(e2, i);
        } catch (SecurityException e3) {
            throw new g13(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new g13(e4, AdError.SERVER_ERROR_CODE);
        }
    }
}
