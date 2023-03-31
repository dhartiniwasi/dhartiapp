package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import p060h4.C4499e4;
import p060h4.C4571q4;
import p060h4.C4596v;
import p073j4.C4810t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e62 implements d52 {

    /* renamed from: a */
    private final o41 f8683a;

    /* renamed from: b */
    private final Context f8684b;

    /* renamed from: c */
    private final ls1 f8685c;

    /* renamed from: d */
    private final et2 f8686d;

    /* renamed from: e */
    private final Executor f8687e;

    /* renamed from: f */
    private final q73 f8688f;

    public e62(o41 o41, Context context, Executor executor, ls1 ls1, et2 et2, q73 q73) {
        this.f8684b = context;
        this.f8683a = o41;
        this.f8687e = executor;
        this.f8685c = ls1;
        this.f8686d = et2;
        this.f8688f = q73;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        ns2 ns2 = is2.f11003t;
        return (ns2 == null || ns2.f14183a == null) ? false : true;
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        return cf3.m10916n(cf3.m10911i((Object) null), new x52(this, us2, is2), this.f8687e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo9807c(us2 us2, is2 is2, Object obj) throws Exception {
        View view;
        C4571q4 a = it2.m14548a(this.f8684b, is2.f11005v);
        vs0 a2 = this.f8685c.mo12076a(a, is2, us2.f18723b.f18244b);
        a2.mo12109f1(is2.f10965X);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14339J6)).booleanValue() || !is2.f10985i0) {
            view = new ps1(this.f8684b, (View) a2, (C4810t) this.f8688f.apply(is2));
        } else {
            view = g51.m13041a(this.f8684b, (View) a2, is2);
        }
        s31 a3 = this.f8683a.mo8570a(new k61(us2, is2, (String) null), new y31(view, a2, new y52(a2), it2.m14550c(a)));
        a3.mo13941j().mo11795i(a2, false, (h60) null);
        oa1 b = a3.mo10315b();
        z52 z52 = new z52(a2);
        mf3 mf3 = dn0.f8330f;
        b.mo11669m0(z52, mf3);
        a3.mo13941j();
        ns2 ns2 = is2.f11003t;
        lf3 j = ks1.m15591j(a2, ns2.f14184b, ns2.f14183a);
        if (is2.f10955N) {
            j.mo10135j(new a62(a2), this.f8687e);
        }
        j.mo10135j(new c62(this, a2), this.f8687e);
        return cf3.m10915m(j, new d62(a3), mf3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo9808d(vs0 vs0) {
        vs0.mo12143v1();
        st0 d0 = vs0.mo8467d0();
        C4499e4 e4Var = this.f8686d.f8930a;
        if (e4Var != null && d0 != null) {
            d0.mo14138M6(e4Var);
        }
    }
}
