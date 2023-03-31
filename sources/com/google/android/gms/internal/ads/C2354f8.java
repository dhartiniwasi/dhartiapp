package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2354f8 implements C2317e8 {

    /* renamed from: a */
    private final tn4 f9174a;

    /* renamed from: b */
    private final C2792r f9175b;

    /* renamed from: c */
    private final C2429h8 f9176c;

    /* renamed from: d */
    private final C2388g4 f9177d;

    /* renamed from: e */
    private final int f9178e;

    /* renamed from: f */
    private long f9179f;

    /* renamed from: g */
    private int f9180g;

    /* renamed from: h */
    private long f9181h;

    public C2354f8(tn4 tn4, C2792r rVar, C2429h8 h8Var, String str, int i) throws ea0 {
        this.f9174a = tn4;
        this.f9175b = rVar;
        this.f9176c = h8Var;
        int i2 = (h8Var.f10240b * h8Var.f10243e) / 8;
        int i3 = h8Var.f10242d;
        if (i3 == i2) {
            int i4 = h8Var.f10241c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f9178e = max;
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9776s(str);
            e2Var.mo9757d0(i5);
            e2Var.mo9772o(i5);
            e2Var.mo9769l(max);
            e2Var.mo9759e0(h8Var.f10240b);
            e2Var.mo9777t(h8Var.f10241c);
            e2Var.mo9771n(i);
            this.f9177d = e2Var.mo9782y();
            return;
        }
        throw ea0.m11990a("Expected block size: " + i2 + "; got: " + i3, (Throwable) null);
    }

    /* renamed from: c */
    public final void mo9453c(long j) {
        this.f9179f = j;
        this.f9180g = 0;
        this.f9181h = 0;
    }

    /* renamed from: d */
    public final void mo9454d(int i, long j) {
        this.f9174a.mo10059j(new C2578l8(this.f9176c, 1, (long) i, j));
        this.f9175b.mo8823e(this.f9177d);
    }

    /* renamed from: e */
    public final boolean mo9455e(rn4 rn4, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.f9180g) >= (i3 = this.f9178e)) {
                C2429h8 h8Var = this.f9176c;
                int i4 = h8Var.f10242d;
                int i5 = this.f9180g / i4;
            } else {
                int a = C2717p.m18260a(this.f9175b, rn4, (int) Math.min((long) (i3 - i2), j2), true);
                if (a == -1) {
                    j2 = 0;
                } else {
                    this.f9180g += a;
                    j2 -= (long) a;
                }
            }
        }
        C2429h8 h8Var2 = this.f9176c;
        int i42 = h8Var2.f10242d;
        int i52 = this.f9180g / i42;
        if (i52 > 0) {
            long j3 = this.f9179f;
            long g0 = gb2.m13170g0(this.f9181h, 1000000, (long) h8Var2.f10241c);
            int i6 = i52 * i42;
            int i7 = this.f9180g - i6;
            this.f9175b.mo8824f(j3 + g0, 1, i6, i7, (C2755q) null);
            this.f9181h += (long) i52;
            this.f9180g = i7;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
