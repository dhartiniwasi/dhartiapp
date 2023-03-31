package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p053g4.C4391b;
import p053g4.C4409t;
import p060h4.C4571q4;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tp1 {

    /* renamed from: a */
    private final et2 f18199a;

    /* renamed from: b */
    private final Executor f18200b;

    /* renamed from: c */
    private final ls1 f18201c;

    /* renamed from: d */
    private final fr1 f18202d;

    /* renamed from: e */
    private final Context f18203e;

    /* renamed from: f */
    private final gv1 f18204f;

    /* renamed from: g */
    private final ux2 f18205g;

    /* renamed from: h */
    private final rz2 f18206h;

    /* renamed from: i */
    private final o42 f18207i;

    public tp1(et2 et2, Executor executor, ls1 ls1, Context context, gv1 gv1, ux2 ux2, rz2 rz2, o42 o42, fr1 fr1) {
        this.f18199a = et2;
        this.f18200b = executor;
        this.f18201c = ls1;
        this.f18203e = context;
        this.f18204f = gv1;
        this.f18205g = ux2;
        this.f18206h = rz2;
        this.f18207i = o42;
        this.f18202d = fr1;
    }

    /* renamed from: h */
    private final void m21159h(vs0 vs0) {
        m21160i(vs0);
        vs0.mo12105d1("/video", d60.f8089l);
        vs0.mo12105d1("/videoMeta", d60.f8090m);
        vs0.mo12105d1("/precache", new hr0());
        vs0.mo12105d1("/delayPageLoaded", d60.f8093p);
        vs0.mo12105d1("/instrument", d60.f8091n);
        vs0.mo12105d1("/log", d60.f8084g);
        vs0.mo12105d1("/click", d60.m11324a((qh1) null));
        if (this.f18199a.f8931b != null) {
            vs0.mo12108f0().mo9284H(true);
            vs0.mo12105d1("/open", new q60((C4391b) null, (ee0) null, (o42) null, (gv1) null, (ux2) null));
        } else {
            vs0.mo12108f0().mo9284H(false);
        }
        if (C4409t.m29324p().mo14043z(vs0.getContext())) {
            vs0.mo12105d1("/logScionEvent", new l60(vs0.getContext()));
        }
    }

    /* renamed from: i */
    private static final void m21160i(vs0 vs0) {
        vs0.mo12105d1("/videoClicked", d60.f8085h);
        vs0.mo12108f0().mo9316r0(true);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14435T2)).booleanValue()) {
            vs0.mo12105d1("/getNativeAdViewSignals", d60.f8096s);
        }
        vs0.mo12105d1("/getNativeClickMeta", d60.f8097t);
    }

    /* renamed from: a */
    public final lf3 mo14358a(JSONObject jSONObject) {
        return cf3.m10916n(cf3.m10916n(cf3.m10911i((Object) null), new ip1(this), this.f18200b), new jp1(this, jSONObject), this.f18200b);
    }

    /* renamed from: b */
    public final lf3 mo14359b(String str, String str2, is2 is2, ls2 ls2, C4571q4 q4Var) {
        return cf3.m10916n(cf3.m10911i((Object) null), new mp1(this, q4Var, is2, ls2, str, str2), this.f18200b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo14360c(JSONObject jSONObject, vs0 vs0) throws Exception {
        hn0 f = hn0.m13926f(vs0);
        if (this.f18199a.f8931b != null) {
            vs0.mo12100Z0(mu0.m16711d());
        } else {
            vs0.mo12100Z0(mu0.m16712e());
        }
        vs0.mo12108f0().mo9283G(new hp1(this, vs0, f));
        vs0.mo9090t0("google.afma.nativeAds.renderVideo", jSONObject);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ lf3 mo14361d(C4571q4 q4Var, is2 is2, ls2 ls2, String str, String str2, Object obj) throws Exception {
        vs0 a = this.f18201c.mo12076a(q4Var, is2, ls2);
        hn0 f = hn0.m13926f(a);
        if (this.f18199a.f8931b != null) {
            m21159h(a);
            a.mo12100Z0(mu0.m16711d());
        } else {
            cr1 b = this.f18202d.mo10266b();
            cr1 cr1 = b;
            ku0 f0 = a.mo12108f0();
            C4391b bVar = r3;
            C4391b bVar2 = new C4391b(this.f18203e, (nj0) null, (lg0) null);
            f0.mo9308g0(b, cr1, b, b, b, false, (h60) null, bVar, (me0) null, (nj0) null, this.f18207i, this.f18206h, this.f18204f, this.f18205g, (f60) null, b, (x60) null, (r60) null);
            m21160i(a);
        }
        a.mo12108f0().mo9283G(new np1(this, a, f));
        a.mo12115i1(str, str2, (String) null);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ lf3 mo14362e(Object obj) throws Exception {
        vs0 a = this.f18201c.mo12076a(C4571q4.m29983K1(), (is2) null, (ls2) null);
        hn0 f = hn0.m13926f(a);
        m21159h(a);
        a.mo12108f0().mo9290P(new lp1(f));
        a.loadUrl((String) C4596v.m30088c().mo12227b(C2679nz.f14425S2));
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo14363f(vs0 vs0, hn0 hn0, boolean z) {
        if (!(this.f18199a.f8930a == null || vs0.mo8467d0() == null)) {
            vs0.mo8467d0().mo14138M6(this.f18199a.f8930a);
        }
        hn0.mo10843g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo14364g(vs0 vs0, hn0 hn0, boolean z) {
        if (z) {
            if (!(this.f18199a.f8930a == null || vs0.mo8467d0() == null)) {
                vs0.mo8467d0().mo14138M6(this.f18199a.f8930a);
            }
            hn0.mo10843g();
            return;
        }
        hn0.mo11173e(new v82(1, "Html video Web View failed to load."));
    }
}
