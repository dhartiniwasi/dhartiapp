package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.o5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2686o5 {

    /* renamed from: a */
    private final C2723p5 f14892a = new C2723p5();

    /* renamed from: b */
    private final y22 f14893b = new y22(new byte[65025], 0);

    /* renamed from: c */
    private int f14894c = -1;

    /* renamed from: d */
    private int f14895d;

    /* renamed from: e */
    private boolean f14896e;

    C2686o5() {
    }

    /* renamed from: f */
    private final int m17503f(int i) {
        int i2;
        int i3 = 0;
        this.f14895d = 0;
        do {
            int i4 = this.f14895d;
            int i5 = i + i4;
            C2723p5 p5Var = this.f14892a;
            if (i5 >= p5Var.f15683c) {
                break;
            }
            int[] iArr = p5Var.f15686f;
            this.f14895d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final y22 mo12829a() {
        return this.f14893b;
    }

    /* renamed from: b */
    public final C2723p5 mo12830b() {
        return this.f14892a;
    }

    /* renamed from: c */
    public final void mo12831c() {
        this.f14892a.mo13134a();
        this.f14893b.mo15290c(0);
        this.f14894c = -1;
        this.f14896e = false;
    }

    /* renamed from: d */
    public final void mo12832d() {
        y22 y22 = this.f14893b;
        if (y22.mo15295h().length != 65025) {
            y22.mo15291d(Arrays.copyOf(y22.mo15295h(), Math.max(65025, y22.mo15299l())), this.f14893b.mo15299l());
        }
    }

    /* renamed from: e */
    public final boolean mo12833e(rn4 rn4) throws IOException {
        if (this.f14896e) {
            this.f14896e = false;
            this.f14893b.mo15290c(0);
        }
        while (true) {
            boolean z = true;
            if (this.f14896e) {
                return true;
            }
            int i = this.f14894c;
            if (i < 0) {
                if (!this.f14892a.mo13136c(rn4, -1) || !this.f14892a.mo13135b(rn4, true)) {
                    return false;
                }
                C2723p5 p5Var = this.f14892a;
                int i2 = p5Var.f15684d;
                if ((p5Var.f15681a & 1) == 1 && this.f14893b.mo15299l() == 0) {
                    i2 += m17503f(0);
                    i = this.f14895d;
                } else {
                    i = 0;
                }
                if (!un4.m21759e(rn4, i2)) {
                    return false;
                }
                this.f14894c = i;
            }
            int f = m17503f(i);
            int i3 = this.f14894c + this.f14895d;
            if (f > 0) {
                y22 y22 = this.f14893b;
                y22.mo15287H(y22.mo15299l() + f);
                y22 y222 = this.f14893b;
                if (!un4.m21758d(rn4, y222.mo15295h(), y222.mo15299l(), f)) {
                    return false;
                }
                y22 y223 = this.f14893b;
                y223.mo15292e(y223.mo15299l() + f);
                if (this.f14892a.f15686f[i3 - 1] == 255) {
                    z = false;
                }
                this.f14896e = z;
            }
            if (i3 == this.f14892a.f15683c) {
                i3 = -1;
            }
            this.f14894c = i3;
        }
        return false;
    }
}
