package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r92 implements d52 {

    /* renamed from: a */
    private final Context f16879a;

    /* renamed from: b */
    private final ls1 f16880b;

    /* renamed from: c */
    private final ur1 f16881c;

    /* renamed from: d */
    private final et2 f16882d;

    /* renamed from: e */
    private final Executor f16883e;

    /* renamed from: f */
    private final vm0 f16884f;

    /* renamed from: g */
    private final h60 f16885g;

    /* renamed from: h */
    private final boolean f16886h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14280D7)).booleanValue();

    public r92(Context context, vm0 vm0, et2 et2, Executor executor, ur1 ur1, ls1 ls1, h60 h60) {
        this.f16879a = context;
        this.f16882d = et2;
        this.f16881c = ur1;
        this.f16883e = executor;
        this.f16884f = vm0;
        this.f16880b = ls1;
        this.f16885g = h60;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        ns2 ns2 = is2.f11003t;
        return (ns2 == null || ns2.f14183a == null) ? false : true;
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        qs1 qs1 = new qs1();
        lf3 n = cf3.m10916n(cf3.m10911i((Object) null), new k92(this, is2, us2, qs1), this.f16883e);
        n.mo10135j(new l92(qs1), this.f16883e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo13694c(is2 is2, us2 us2, qs1 qs1, Object obj) throws Exception {
        is2 is22 = is2;
        us2 us22 = us2;
        vs0 a = this.f16880b.mo12076a(this.f16882d.f8934e, is22, us22.f18723b.f18244b);
        a.mo12109f1(is22.f10965X);
        qs1.mo13599a(this.f16879a, (View) a);
        in0 in0 = new in0();
        ur1 ur1 = this.f16881c;
        k61 k61 = new k61(us22, is22, (String) null);
        q92 q92 = r1;
        q92 q922 = new q92(this.f16879a, this.f16880b, this.f16882d, this.f16884f, is2, in0, a, this.f16885g, this.f16886h);
        qr1 b = ur1.mo13091b(k61, new rr1(q92, a));
        in0.mo11172d(b);
        w60.m22606b(a, b.mo11817i());
        b.mo10315b().mo11669m0(new m92(a), dn0.f8330f);
        b.mo11820l().mo11795i(a, true, this.f16886h ? this.f16885g : null);
        b.mo11820l();
        is2 is23 = is2;
        ns2 ns2 = is23.f11003t;
        return cf3.m10915m(ks1.m15591j(a, ns2.f14184b, ns2.f14183a), new n92(this, a, is23, b), this.f16883e);
    }
}
