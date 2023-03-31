package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import p053g4.C4409t;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pr1 extends v51 {

    /* renamed from: i */
    private final Context f15970i;

    /* renamed from: j */
    private final WeakReference f15971j;

    /* renamed from: k */
    private final uj1 f15972k;

    /* renamed from: l */
    private final yg1 f15973l;

    /* renamed from: m */
    private final ja1 f15974m;

    /* renamed from: n */
    private final rb1 f15975n;

    /* renamed from: o */
    private final p61 f15976o;

    /* renamed from: p */
    private final fi0 f15977p;

    /* renamed from: q */
    private final q23 f15978q;

    /* renamed from: r */
    private final ws2 f15979r;

    /* renamed from: s */
    private boolean f15980s = false;

    pr1(u51 u51, Context context, vs0 vs0, uj1 uj1, yg1 yg1, ja1 ja1, rb1 rb1, p61 p61, is2 is2, q23 q23, ws2 ws2) {
        super(u51);
        this.f15970i = context;
        this.f15972k = uj1;
        this.f15971j = new WeakReference(vs0);
        this.f15973l = yg1;
        this.f15974m = ja1;
        this.f15975n = rb1;
        this.f15976o = p61;
        this.f15978q = q23;
        bi0 bi0 = is2.f10992m;
        this.f15977p = new zi0(bi0 != null ? bi0.f7277a : "", bi0 != null ? bi0.f7278b : 1);
        this.f15979r = ws2;
    }

    public final void finalize() throws Throwable {
        try {
            vs0 vs0 = (vs0) this.f15971j.get();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14388O5)).booleanValue()) {
                if (!this.f15980s && vs0 != null) {
                    dn0.f8329e.execute(new or1(vs0));
                }
            } else if (vs0 != null) {
                vs0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final Bundle mo13343h() {
        return this.f15975n.mo13730p0();
    }

    /* renamed from: i */
    public final fi0 mo13344i() {
        return this.f15977p;
    }

    /* renamed from: j */
    public final ws2 mo13345j() {
        return this.f15979r;
    }

    /* renamed from: k */
    public final boolean mo13346k() {
        return this.f15976o.mo13146b();
    }

    /* renamed from: l */
    public final boolean mo13347l() {
        return this.f15980s;
    }

    /* renamed from: m */
    public final boolean mo13348m() {
        vs0 vs0 = (vs0) this.f15971j.get();
        return vs0 != null && !vs0.mo12107e1();
    }

    /* renamed from: n */
    public final boolean mo13349n(boolean z, Activity activity) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14738y0)).booleanValue()) {
            C4409t.m29326r();
            if (C4751b2.m30608c(this.f15970i)) {
                pm0.m18667g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f15974m.mo8287d();
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14748z0)).booleanValue()) {
                    this.f15978q.mo13461a(this.f18929a.f18723b.f18244b.f12930b);
                }
                return false;
            }
        }
        if (this.f15980s) {
            pm0.m18667g("The rewarded ad have been showed.");
            this.f15974m.mo8289g(eu2.m12271d(10, (String) null, (C4623z2) null));
            return false;
        }
        this.f15980s = true;
        this.f15973l.mo15437d();
        Context context = activity;
        if (activity == null) {
            context = this.f15970i;
        }
        try {
            this.f15972k.mo10408a(z, context, this.f15974m);
            this.f15973l.zza();
            return true;
        } catch (tj1 e) {
            this.f15974m.mo8288e0(e);
            return false;
        }
    }
}
