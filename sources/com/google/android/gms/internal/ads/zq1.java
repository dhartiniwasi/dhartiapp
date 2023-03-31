package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p053g4.C4390a;
import p053g4.C4391b;
import p060h4.C4470a;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zq1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final tq1 f21231a = new tq1((sq1) null);

    /* renamed from: b */
    private final C4390a f21232b;

    /* renamed from: c */
    private final it0 f21233c;

    /* renamed from: d */
    private final Context f21234d;

    /* renamed from: e */
    private final gv1 f21235e;

    /* renamed from: f */
    private final ux2 f21236f;

    /* renamed from: g */
    private final Executor f21237g;

    /* renamed from: h */
    private final C2955ve f21238h;

    /* renamed from: i */
    private final vm0 f21239i;

    /* renamed from: j */
    private final u60 f21240j;

    /* renamed from: k */
    private final o42 f21241k;

    /* renamed from: l */
    private final rz2 f21242l;

    /* renamed from: m */
    private lf3 f21243m;

    zq1(wq1 wq1) {
        this.f21234d = wq1.f19745c;
        this.f21237g = wq1.f19749g;
        this.f21238h = wq1.f19750h;
        this.f21239i = wq1.f19751i;
        this.f21232b = wq1.f19743a;
        this.f21233c = wq1.f19744b;
        this.f21240j = new u60();
        this.f21241k = wq1.f19748f;
        this.f21242l = wq1.f19752j;
        this.f21235e = wq1.f19746d;
        this.f21236f = wq1.f19747e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ vs0 mo15640a(vs0 vs0) {
        vs0 vs02 = vs0;
        vs02.mo12105d1("/result", this.f21240j);
        ku0 f0 = vs0.mo12108f0();
        tq1 tq1 = this.f21231a;
        C4391b bVar = r2;
        C4391b bVar2 = new C4391b(this.f21234d, (nj0) null, (lg0) null);
        f0.mo9308g0((C4470a) null, tq1, tq1, tq1, tq1, false, (h60) null, bVar, (me0) null, (nj0) null, this.f21241k, this.f21242l, this.f21235e, this.f21236f, (f60) null, (qh1) null, (x60) null, (r60) null);
        return vs02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo15641c(String str, JSONObject jSONObject, vs0 vs0) throws Exception {
        return this.f21240j.mo14452b(vs0, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized lf3 mo15642d(String str, JSONObject jSONObject) {
        lf3 lf3 = this.f21243m;
        if (lf3 == null) {
            return cf3.m10911i((Object) null);
        }
        return cf3.m10916n(lf3, new kq1(this, str, jSONObject), this.f21237g);
    }

    /* renamed from: e */
    public final synchronized void mo15643e(is2 is2, ls2 ls2) {
        lf3 lf3 = this.f21243m;
        if (lf3 != null) {
            cf3.m10920r(lf3, new rq1(this, is2, ls2), this.f21237g);
        }
    }

    /* renamed from: f */
    public final synchronized void mo15644f() {
        lf3 lf3 = this.f21243m;
        if (lf3 != null) {
            cf3.m10920r(lf3, new nq1(this), this.f21237g);
            this.f21243m = null;
        }
    }

    /* renamed from: g */
    public final synchronized void mo15645g(String str, Map map) {
        lf3 lf3 = this.f21243m;
        if (lf3 != null) {
            cf3.m10920r(lf3, new qq1(this, "sendMessageToNativeJs", map), this.f21237g);
        }
    }

    /* renamed from: h */
    public final synchronized void mo15646h() {
        Context context = this.f21234d;
        vm0 vm0 = this.f21239i;
        C2344ez ezVar = C2679nz.f14415R2;
        lf3 m = cf3.m10915m(cf3.m10914l(new et0(context, this.f21238h, vm0, this.f21232b, (String) C4596v.m30088c().mo12227b(ezVar)), dn0.f8329e), new mq1(this), this.f21237g);
        this.f21243m = m;
        gn0.m13405a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void mo15647i(String str, e60 e60) {
        lf3 lf3 = this.f21243m;
        if (lf3 != null) {
            cf3.m10920r(lf3, new oq1(this, str, e60), this.f21237g);
        }
    }

    /* renamed from: j */
    public final void mo15648j(WeakReference weakReference, String str, e60 e60) {
        mo15647i(str, new yq1(this, weakReference, str, e60, (xq1) null));
    }

    /* renamed from: k */
    public final synchronized void mo15649k(String str, e60 e60) {
        lf3 lf3 = this.f21243m;
        if (lf3 != null) {
            cf3.m10920r(lf3, new pq1(this, str, e60), this.f21237g);
        }
    }
}
