package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lg2 extends kf2 {

    /* renamed from: e */
    private final byte[] f12795e;

    /* renamed from: f */
    private Uri f12796f;

    /* renamed from: g */
    private int f12797g;

    /* renamed from: h */
    private int f12798h;

    /* renamed from: i */
    private boolean f12799i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lg2(byte[] bArr) {
        super(false);
        boolean z = false;
        Objects.requireNonNull(bArr);
        v91.m22050d(bArr.length > 0 ? true : z);
        this.f12795e = bArr;
    }

    /* renamed from: b */
    public final void mo8791b() {
        if (this.f12799i) {
            this.f12799i = false;
            mo11673m();
        }
        this.f12796f = null;
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f12798h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f12795e, this.f12797g, bArr, i, min);
        this.f12797g += min;
        this.f12798h -= min;
        mo11672f0(min);
        return min;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f12796f;
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws IOException {
        this.f12796f = wq2.f19753a;
        mo11674n(wq2);
        long j = wq2.f19758f;
        int length = this.f12795e.length;
        if (j <= ((long) length)) {
            int i = (int) j;
            this.f12797g = i;
            int i2 = length - i;
            this.f12798h = i2;
            long j2 = wq2.f19759g;
            if (j2 != -1) {
                this.f12798h = (int) Math.min((long) i2, j2);
            }
            this.f12799i = true;
            mo11675o(wq2);
            long j3 = wq2.f19759g;
            return j3 != -1 ? j3 : (long) this.f12798h;
        }
        throw new rm2(AdError.REMOTE_ADS_SERVICE_ERROR);
    }
}
