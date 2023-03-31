package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class v52 implements d52 {

    /* renamed from: a */
    private final t21 f18937a;

    /* renamed from: b */
    private final Context f18938b;

    /* renamed from: c */
    private final ls1 f18939c;

    /* renamed from: d */
    private final Executor f18940d;

    public v52(t21 t21, Context context, Executor executor, ls1 ls1) {
        this.f18938b = context;
        this.f18937a = t21;
        this.f18940d = executor;
        this.f18939c = ls1;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        ns2 ns2 = is2.f11003t;
        return (ns2 == null || ns2.f14183a == null) ? false : true;
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        return cf3.m10916n(cf3.m10911i((Object) null), new s52(this, us2, is2), this.f18940d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo14684c(us2 us2, is2 is2, Object obj) throws Exception {
        C4571q4 a = it2.m14548a(this.f18938b, is2.f11005v);
        vs0 a2 = this.f18939c.mo12076a(a, is2, us2.f18723b.f18244b);
        k21 a3 = this.f18937a.mo13608a(new k61(us2, is2, (String) null), new l21((View) a2, a2, it2.m14550c(a), is2.f10971b0, is2.f10979f0, is2.f10957P));
        a3.mo10317i().mo11795i(a2, false, (h60) null);
        oa1 b = a3.mo10315b();
        t52 t52 = new t52(a2);
        mf3 mf3 = dn0.f8330f;
        b.mo11669m0(t52, mf3);
        a3.mo10317i();
        ns2 ns2 = is2.f11003t;
        return cf3.m10915m(ks1.m15591j(a2, ns2.f14184b, ns2.f14183a), new u52(a3), mf3);
    }
}
