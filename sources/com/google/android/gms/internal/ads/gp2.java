package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gp2 implements up2 {

    /* renamed from: a */
    private final qu2 f10029a;

    /* renamed from: b */
    private final Executor f10030b;

    /* renamed from: c */
    private final ye3 f10031c = new ep2(this);

    public gp2(qu2 qu2, Executor executor) {
        this.f10029a = qu2;
        this.f10030b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ lf3 mo8486a(wp2 wp2, tp2 tp2, Object obj) {
        return mo10603d(wp2, tp2, (e91) null);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo8487b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo10602c(e91 e91, pp2 pp2) throws Exception {
        bv2 bv2 = pp2.f15949b;
        yg0 yg0 = pp2.f15948a;
        zu2 d = bv2 != null ? this.f10029a.mo13605d(bv2) : null;
        if (bv2 == null) {
            return cf3.m10911i((Object) null);
        }
        if (!(d == null || yg0 == null)) {
            cf3.m10920r(e91.mo9830d().mo8236g(yg0), this.f10031c, this.f10030b);
        }
        return cf3.m10911i(new fp2(bv2, yg0, d));
    }

    /* renamed from: d */
    public final lf3 mo10603d(wp2 wp2, tp2 tp2, e91 e91) {
        return cf3.m10908f(cf3.m10916n(se3.m20287D(new qp2(this.f10029a, e91, this.f10030b).mo13584c()), new cp2(this, e91), this.f10030b), Exception.class, new dp2(this), this.f10030b);
    }
}
