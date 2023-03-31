package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p52 implements d52 {

    /* renamed from: a */
    private final e31 f15689a;

    /* renamed from: b */
    private final Context f15690b;

    /* renamed from: c */
    private final ls1 f15691c;

    /* renamed from: d */
    private final et2 f15692d;

    /* renamed from: e */
    private final Executor f15693e;

    /* renamed from: f */
    private final vm0 f15694f;

    /* renamed from: g */
    private final h60 f15695g;

    /* renamed from: h */
    private final boolean f15696h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14280D7)).booleanValue();

    public p52(e31 e31, Context context, Executor executor, ls1 ls1, et2 et2, vm0 vm0, h60 h60) {
        this.f15690b = context;
        this.f15689a = e31;
        this.f15693e = executor;
        this.f15691c = ls1;
        this.f15692d = et2;
        this.f15694f = vm0;
        this.f15695g = h60;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        ns2 ns2 = is2.f11003t;
        return (ns2 == null || ns2.f14183a == null) ? false : true;
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        qs1 qs1 = new qs1();
        lf3 n = cf3.m10916n(cf3.m10911i((Object) null), new n52(this, is2, us2, qs1), this.f15693e);
        n.mo10135j(new o52(qs1), this.f15693e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo13138c(is2 is2, us2 us2, qs1 qs1, Object obj) throws Exception {
        is2 is22 = is2;
        us2 us22 = us2;
        vs0 a = this.f15691c.mo12076a(this.f15692d.f8934e, is22, us22.f18723b.f18244b);
        a.mo12109f1(is22.f10965X);
        qs1.mo13599a(this.f15690b, (View) a);
        in0 in0 = new in0();
        e31 e31 = this.f15689a;
        k61 k61 = new k61(us22, is22, (String) null);
        r52 r52 = r1;
        r52 r522 = new r52(this.f15694f, in0, is2, a, this.f15692d, this.f15696h, this.f15695g);
        b31 a2 = e31.mo9792a(k61, new oi1(r52, a), new c31(is22.f10971b0));
        a2.mo8660j().mo11795i(a, false, this.f15696h ? this.f15695g : null);
        in0.mo11172d(a2);
        a2.mo10315b().mo11669m0(new l52(a), dn0.f8330f);
        a2.mo8660j();
        ns2 ns2 = is22.f11003t;
        return cf3.m10915m(ks1.m15591j(a, ns2.f14184b, ns2.f14183a), new m52(this, a, is22, a2), this.f15693e);
    }
}
