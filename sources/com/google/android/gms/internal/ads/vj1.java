package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import p053g4.C4409t;
import p060h4.C4596v;
import p066i4.C4680t;
import p088l5.C4954a;
import p124r.C5413a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vj1 implements lb1, C4680t, qa1 {

    /* renamed from: a */
    private final Context f19115a;

    /* renamed from: b */
    private final vs0 f19116b;

    /* renamed from: c */
    private final is2 f19117c;

    /* renamed from: d */
    private final vm0 f19118d;

    /* renamed from: e */
    private final C2378fv f19119e;

    /* renamed from: f */
    C4954a f19120f;

    public vj1(Context context, vs0 vs0, is2 is2, vm0 vm0, C2378fv fvVar) {
        this.f19115a = context;
        this.f19116b = vs0;
        this.f19117c = is2;
        this.f19118d = vm0;
        this.f19119e = fvVar;
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        if (this.f19120f != null && this.f19116b != null) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14612l4)).booleanValue()) {
                this.f19116b.mo9081R("onSdkImpression", new C5413a());
            }
        }
    }

    /* renamed from: a */
    public final void mo8931a() {
    }

    /* renamed from: a0 */
    public final void mo10019a0() {
        b52 b52;
        c52 c52;
        c52 c522;
        C2378fv fvVar = this.f19119e;
        if ((fvVar == C2378fv.REWARD_BASED_VIDEO_AD || fvVar == C2378fv.INTERSTITIAL || fvVar == C2378fv.APP_OPEN) && this.f19117c.f10962U && this.f19116b != null && C4409t.m29309a().mo15330d(this.f19115a)) {
            vm0 vm0 = this.f19118d;
            String str = vm0.f19151b + "." + vm0.f19152c;
            String a = this.f19117c.f10964W.mo10946a();
            if (this.f19117c.f10964W.mo10947b() == 1) {
                b52 = b52.VIDEO;
                c52 = c52.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.f19117c.f10967Z == 2) {
                    c522 = c52.UNSPECIFIED;
                } else {
                    c522 = c52.BEGIN_TO_RENDER;
                }
                c52 = c522;
                b52 = b52.HTML_DISPLAY;
            }
            C4954a c = C4409t.m29309a().mo15329c(str, this.f19116b.mo12086A(), "", "javascript", a, c52, b52, this.f19117c.f10995n0);
            this.f19120f = c;
            if (c != null) {
                C4409t.m29309a().mo15328b(this.f19120f, (View) this.f19116b);
                this.f19116b.mo12116j1(this.f19120f);
                C4409t.m29309a().mo15326D(this.f19120f);
                this.f19116b.mo9081R("onSdkLoaded", new C5413a());
            }
        }
    }

    /* renamed from: d */
    public final void mo8932d() {
        if (this.f19120f != null && this.f19116b != null) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14612l4)).booleanValue()) {
                this.f19116b.mo9081R("onSdkImpression", new C5413a());
            }
        }
    }

    /* renamed from: i5 */
    public final void mo8933i5() {
    }

    /* renamed from: o3 */
    public final void mo8934o3() {
    }

    /* renamed from: p */
    public final void mo8935p(int i) {
        this.f19120f = null;
    }

    /* renamed from: r6 */
    public final void mo8936r6() {
    }
}
