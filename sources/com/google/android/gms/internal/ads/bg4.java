package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bg4 implements ql2 {

    /* renamed from: a */
    private final ql2 f7247a;

    /* renamed from: b */
    private final int f7248b;

    /* renamed from: c */
    private final ag4 f7249c;

    /* renamed from: d */
    private final byte[] f7250d;

    /* renamed from: e */
    private int f7251e;

    public bg4(ql2 ql2, int i, ag4 ag4) {
        v91.m22050d(i > 0);
        this.f7247a = ql2;
        this.f7248b = i;
        this.f7249c = ag4;
        this.f7250d = new byte[1];
        this.f7251e = i;
    }

    /* renamed from: a */
    public final Map mo8790a() {
        return this.f7247a.mo8790a();
    }

    /* renamed from: b */
    public final void mo8791b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f7251e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f7247a.mo8792c(this.f7250d, 0, 1) != -1) {
                int i5 = (this.f7250d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int c = this.f7247a.mo8792c(bArr2, i4, i6);
                        if (c != -1) {
                            i4 += c;
                            i6 -= c;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f7249c.mo8331b(new y22(bArr2, i5));
                    }
                }
                i3 = this.f7248b;
                this.f7251e = i3;
            }
            return -1;
        }
        int c2 = this.f7247a.mo8792c(bArr, i, Math.min(i3, i2));
        if (c2 != -1) {
            this.f7251e -= c2;
        }
        return c2;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f7247a.mo8793e();
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public final void mo8795k(ve3 ve3) {
        Objects.requireNonNull(ve3);
        this.f7247a.mo8795k(ve3);
    }
}
