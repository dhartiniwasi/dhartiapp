package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.v5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class C2946v5 {

    /* renamed from: a */
    private final C2686o5 f18916a = new C2686o5();

    /* renamed from: b */
    private C2792r f18917b;

    /* renamed from: c */
    private tn4 f18918c;

    /* renamed from: d */
    private C2761q5 f18919d;

    /* renamed from: e */
    private long f18920e;

    /* renamed from: f */
    private long f18921f;

    /* renamed from: g */
    private long f18922g;

    /* renamed from: h */
    private int f18923h;

    /* renamed from: i */
    private int f18924i;

    /* renamed from: j */
    private C2835s5 f18925j = new C2835s5();

    /* renamed from: k */
    private long f18926k;

    /* renamed from: l */
    private boolean f18927l;

    /* renamed from: m */
    private boolean f18928m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo11899a(y22 y22);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11900b(boolean z) {
        int i;
        if (z) {
            this.f18925j = new C2835s5();
            this.f18921f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f18923h = i;
        this.f18920e = -1;
        this.f18922g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo11901c(y22 y22, long j, C2835s5 s5Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo14673d(rn4 rn4, C2532k kVar) throws IOException {
        rn4 rn42 = rn4;
        v91.m22048b(this.f18917b);
        int i = gb2.f9812a;
        int i2 = this.f18923h;
        if (i2 == 0) {
            while (this.f18916a.mo12833e(rn42)) {
                long T = rn4.mo9003T();
                long j = this.f18921f;
                this.f18926k = T - j;
                if (mo11901c(this.f18916a.mo12829a(), j, this.f18925j)) {
                    this.f18921f = rn4.mo9003T();
                } else {
                    C2388g4 g4Var = this.f18925j.f17261a;
                    this.f18924i = g4Var.f9687z;
                    if (!this.f18928m) {
                        this.f18917b.mo8823e(g4Var);
                        this.f18928m = true;
                    }
                    C2761q5 q5Var = this.f18925j.f17262b;
                    if (q5Var != null) {
                        this.f18919d = q5Var;
                    } else if (rn4.mo9005b() == -1) {
                        this.f18919d = new C2909u5((C2872t5) null);
                    } else {
                        C2723p5 b = this.f18916a.mo12830b();
                        this.f18919d = new C2501j5(this, this.f18921f, rn4.mo9005b(), (long) (b.f15684d + b.f15685e), b.f15682b, (b.f15681a & 4) != 0);
                    }
                    this.f18923h = 2;
                    this.f18916a.mo12832d();
                    return 0;
                }
            }
            this.f18923h = 3;
            return -1;
        } else if (i2 == 1) {
            ((fn4) rn42).mo10218n((int) this.f18921f, false);
            this.f18923h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long b2 = this.f18919d.mo11322b(rn42);
            if (b2 >= 0) {
                kVar.f11852a = b2;
                return 1;
            }
            if (b2 < -1) {
                mo14677h(-(b2 + 2));
            }
            if (!this.f18927l) {
                C2643n a = this.f18919d.mo11321a();
                v91.m22048b(a);
                this.f18918c.mo10059j(a);
                this.f18927l = true;
            }
            if (this.f18926k > 0 || this.f18916a.mo12833e(rn42)) {
                this.f18926k = 0;
                y22 a2 = this.f18916a.mo12829a();
                long a3 = mo11899a(a2);
                if (a3 >= 0) {
                    long j2 = this.f18922g;
                    if (j2 + a3 >= this.f18920e) {
                        long e = mo14674e(j2);
                        C2717p.m18261b(this.f18917b, a2, a2.mo15299l());
                        this.f18917b.mo8824f(e, 1, a2.mo15299l(), 0, (C2755q) null);
                        this.f18920e = -1;
                    }
                }
                this.f18922g += a3;
                return 0;
            }
            this.f18923h = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo14674e(long j) {
        return (j * 1000000) / ((long) this.f18924i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo14675f(long j) {
        return (((long) this.f18924i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14676g(tn4 tn4, C2792r rVar) {
        this.f18918c = tn4;
        this.f18917b = rVar;
        mo11900b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14677h(long j) {
        this.f18922g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo14678i(long j, long j2) {
        this.f18916a.mo12831c();
        if (j == 0) {
            mo11900b(!this.f18927l);
        } else if (this.f18923h != 0) {
            long f = mo14675f(j2);
            this.f18920e = f;
            C2761q5 q5Var = this.f18919d;
            int i = gb2.f9812a;
            q5Var.mo11320V(f);
            this.f18923h = 2;
        }
    }
}
