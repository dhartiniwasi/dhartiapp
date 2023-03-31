package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qp2 {

    /* renamed from: a */
    private final qu2 f16494a;

    /* renamed from: b */
    private final e91 f16495b;

    /* renamed from: c */
    private final Executor f16496c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public pp2 f16497d;

    public qp2(qu2 qu2, e91 e91, Executor executor) {
        this.f16494a = qu2;
        this.f16495b = e91;
        this.f16496c = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    /* renamed from: e */
    public final bv2 m19326e() {
        et2 c = this.f16495b.mo9829c();
        return this.f16494a.mo13603b(c.f8933d, c.f8935f, c.f8939j);
    }

    /* renamed from: c */
    public final lf3 mo13584c() {
        lf3 lf3;
        pp2 pp2 = this.f16497d;
        if (pp2 != null) {
            return cf3.m10911i(pp2);
        }
        if (!((Boolean) k10.f11863a.mo13438e()).booleanValue()) {
            pp2 pp22 = new pp2((yg0) null, m19326e(), (op2) null);
            this.f16497d = pp22;
            lf3 = cf3.m10911i(pp22);
        } else {
            lf3 = cf3.m10908f(cf3.m10915m(se3.m20287D(this.f16495b.mo9830d().mo8234e(this.f16494a.zza())), new np2(this), this.f16496c), g12.class, new mp2(this), this.f16496c);
        }
        return cf3.m10915m(lf3, lp2.f12876a, this.f16496c);
    }
}
