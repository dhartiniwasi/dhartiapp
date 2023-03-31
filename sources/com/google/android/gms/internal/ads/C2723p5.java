package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.p5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2723p5 {

    /* renamed from: a */
    public int f15681a;

    /* renamed from: b */
    public long f15682b;

    /* renamed from: c */
    public int f15683c;

    /* renamed from: d */
    public int f15684d;

    /* renamed from: e */
    public int f15685e;

    /* renamed from: f */
    public final int[] f15686f = new int[255];

    /* renamed from: g */
    private final y22 f15687g = new y22(255);

    C2723p5() {
    }

    /* renamed from: a */
    public final void mo13134a() {
        this.f15681a = 0;
        this.f15682b = 0;
        this.f15683c = 0;
        this.f15684d = 0;
        this.f15685e = 0;
    }

    /* renamed from: b */
    public final boolean mo13135b(rn4 rn4, boolean z) throws IOException {
        mo13134a();
        this.f15687g.mo15290c(27);
        if (un4.m21757c(rn4, this.f15687g.mo15295h(), 0, 27, z) && this.f15687g.mo15280A() == 1332176723) {
            if (this.f15687g.mo15306s() == 0) {
                this.f15681a = this.f15687g.mo15306s();
                this.f15682b = this.f15687g.mo15311x();
                this.f15687g.mo15312y();
                this.f15687g.mo15312y();
                this.f15687g.mo15312y();
                int s = this.f15687g.mo15306s();
                this.f15683c = s;
                this.f15684d = s + 27;
                this.f15687g.mo15290c(s);
                if (un4.m21757c(rn4, this.f15687g.mo15295h(), 0, this.f15683c, z)) {
                    for (int i = 0; i < this.f15683c; i++) {
                        this.f15686f[i] = this.f15687g.mo15306s();
                        this.f15685e += this.f15686f[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw ea0.m11992c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo13136c(rn4 rn4, long j) throws IOException {
        int i;
        v91.m22050d(rn4.mo9003T() == rn4.mo9004a());
        this.f15687g.mo15290c(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || rn4.mo9003T() + 4 < j) && un4.m21757c(rn4, this.f15687g.mo15295h(), 0, 4, true)) {
                this.f15687g.mo15293f(0);
                if (this.f15687g.mo15280A() != 1332176723) {
                    ((fn4) rn4).mo10218n(1, false);
                } else {
                    rn4.mo9981W();
                    return true;
                }
            }
        }
        do {
            if ((i != 0 && rn4.mo9003T() >= j) || rn4.mo9982d(1) == -1) {
                return false;
            }
            break;
        } while (rn4.mo9982d(1) == -1);
        return false;
    }
}
