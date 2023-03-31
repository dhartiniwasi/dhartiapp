package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h72 implements d52 {

    /* renamed from: a */
    private final Context f10226a;

    /* renamed from: b */
    private final ls1 f10227b;

    /* renamed from: c */
    private final mj1 f10228c;

    /* renamed from: d */
    private final et2 f10229d;

    /* renamed from: e */
    private final Executor f10230e;

    /* renamed from: f */
    private final vm0 f10231f;

    /* renamed from: g */
    private final h60 f10232g;

    /* renamed from: h */
    private final boolean f10233h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14280D7)).booleanValue();

    public h72(Context context, vm0 vm0, et2 et2, Executor executor, mj1 mj1, ls1 ls1, h60 h60) {
        this.f10226a = context;
        this.f10229d = et2;
        this.f10228c = mj1;
        this.f10230e = executor;
        this.f10231f = vm0;
        this.f10227b = ls1;
        this.f10232g = h60;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        ns2 ns2 = is2.f11003t;
        return (ns2 == null || ns2.f14183a == null) ? false : true;
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        qs1 qs1 = new qs1();
        lf3 n = cf3.m10916n(cf3.m10911i((Object) null), new b72(this, is2, us2, qs1), this.f10230e);
        n.mo10135j(new d72(qs1), this.f10230e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo10749c(is2 is2, us2 us2, qs1 qs1, Object obj) throws Exception {
        is2 is22 = is2;
        us2 us22 = us2;
        vs0 a = this.f10227b.mo12076a(this.f10229d.f8934e, is22, us22.f18723b.f18244b);
        a.mo12109f1(is22.f10965X);
        qs1.mo13599a(this.f10226a, (View) a);
        in0 in0 = new in0();
        mj1 mj1 = this.f10228c;
        k61 k61 = new k61(us22, is22, (String) null);
        g72 g72 = r1;
        g72 g722 = new g72(this.f10226a, this.f10231f, in0, is2, a, this.f10229d, this.f10233h, this.f10232g);
        li1 c = mj1.mo12362c(k61, new oi1(g72, a));
        in0.mo11172d(c);
        c.mo10315b().mo11669m0(new e72(a), dn0.f8330f);
        c.mo12025k().mo11795i(a, true, this.f10233h ? this.f10232g : null);
        c.mo12025k();
        is2 is23 = is2;
        ns2 ns2 = is23.f11003t;
        return cf3.m10915m(ks1.m15591j(a, ns2.f14184b, ns2.f14183a), new f72(this, a, is23, c), this.f10230e);
    }
}
