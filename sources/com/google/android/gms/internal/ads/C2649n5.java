package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.n5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2649n5 implements qn4 {

    /* renamed from: d */
    public static final xn4 f13848d = C2612m5.f13212b;

    /* renamed from: a */
    private tn4 f13849a;

    /* renamed from: b */
    private C2946v5 f13850b;

    /* renamed from: c */
    private boolean f13851c;

    /* renamed from: a */
    private final boolean m16934a(rn4 rn4) throws IOException {
        C2723p5 p5Var = new C2723p5();
        if (p5Var.mo13135b(rn4, true) && (p5Var.f15681a & 2) == 2) {
            int min = Math.min(p5Var.f15685e, 8);
            y22 y22 = new y22(min);
            ((fn4) rn4).mo9986i(y22.mo15295h(), 0, min, false);
            y22.mo15293f(0);
            if (y22.mo15296i() >= 5 && y22.mo15306s() == 127 && y22.mo15280A() == 1179402563) {
                this.f13850b = new C2575l5();
            } else {
                y22.mo15293f(0);
                try {
                    if (C3014x.m22986d(1, y22, true)) {
                        this.f13850b = new C3020x5();
                    }
                } catch (ea0 unused) {
                }
                y22.mo15293f(0);
                if (C2798r5.m19582j(y22)) {
                    this.f13850b = new C2798r5();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        try {
            return m16934a(rn4);
        } catch (ea0 unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f13849a = tn4;
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        v91.m22048b(this.f13849a);
        if (this.f13850b == null) {
            if (m16934a(rn4)) {
                rn4.mo9981W();
            } else {
                throw ea0.m11990a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f13851c) {
            C2792r n = this.f13849a.mo10060n(0, 1);
            this.f13849a.mo10058C();
            this.f13850b.mo14676g(this.f13849a, n);
            this.f13851c = true;
        }
        return this.f13850b.mo14673d(rn4, kVar);
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        C2946v5 v5Var = this.f13850b;
        if (v5Var != null) {
            v5Var.mo14678i(j, j2);
        }
    }
}
