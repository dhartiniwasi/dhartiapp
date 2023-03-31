package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pf4 implements ci4 {

    /* renamed from: a */
    public final ci4 f15850a;

    /* renamed from: b */
    private boolean f15851b;

    /* renamed from: c */
    final /* synthetic */ qf4 f15852c;

    public pf4(qf4 qf4, ci4 ci4) {
        this.f15852c = qf4;
        this.f15850a = ci4;
    }

    /* renamed from: a */
    public final boolean mo9177a() {
        return !this.f15852c.mo13531k() && this.f15850a.mo9177a();
    }

    /* renamed from: b */
    public final void mo9178b() throws IOException {
        this.f15850a.mo9178b();
    }

    /* renamed from: c */
    public final int mo9179c(long j) {
        if (this.f15852c.mo13531k()) {
            return -3;
        }
        return this.f15850a.mo9179c(j);
    }

    /* renamed from: d */
    public final int mo9180d(c74 c74, fo3 fo3, int i) {
        if (this.f15852c.mo13531k()) {
            return -3;
        }
        if (this.f15851b) {
            fo3.mo15594c(4);
            return -4;
        }
        int d = this.f15850a.mo9180d(c74, fo3, i);
        if (d == -5) {
            C2388g4 g4Var = c74.f7638a;
            Objects.requireNonNull(g4Var);
            int i2 = g4Var.f9657B;
            int i3 = 0;
            if (i2 == 0) {
                if (g4Var.f9658C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.f15852c.f16365e == Long.MIN_VALUE) {
                i3 = g4Var.f9658C;
            }
            C2311e2 b = g4Var.mo10384b();
            b.mo9754c(i2);
            b.mo9756d(i3);
            c74.f7638a = b.mo9782y();
            return -5;
        }
        qf4 qf4 = this.f15852c;
        long j = qf4.f16365e;
        if (j == Long.MIN_VALUE || ((d != -4 || fo3.f9375e < j) && (d != -3 || qf4.mo8354d() != Long.MIN_VALUE || fo3.f9374d))) {
            return d;
        }
        fo3.mo10233b();
        fo3.mo15594c(4);
        this.f15851b = true;
        return -4;
    }

    /* renamed from: e */
    public final void mo13272e() {
        this.f15851b = false;
    }
}
