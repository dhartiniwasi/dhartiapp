package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import p053g4.C4391b;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ks1 {

    /* renamed from: a */
    private final t91 f12263a;

    /* renamed from: b */
    private final oh1 f12264b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final eb1 f12265c;

    /* renamed from: d */
    private final rb1 f12266d;

    /* renamed from: e */
    private final ec1 f12267e;

    /* renamed from: f */
    private final te1 f12268f;

    /* renamed from: g */
    private final Executor f12269g;

    /* renamed from: h */
    private final lh1 f12270h;

    /* renamed from: i */
    private final x11 f12271i;

    /* renamed from: j */
    private final C4391b f12272j;

    /* renamed from: k */
    private final nj0 f12273k;

    /* renamed from: l */
    private final C2955ve f12274l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ke1 f12275m;

    /* renamed from: n */
    private final o42 f12276n;

    /* renamed from: o */
    private final rz2 f12277o;

    /* renamed from: p */
    private final gv1 f12278p;

    /* renamed from: q */
    private final ux2 f12279q;

    public ks1(t91 t91, eb1 eb1, rb1 rb1, ec1 ec1, te1 te1, Executor executor, lh1 lh1, x11 x11, C4391b bVar, nj0 nj0, C2955ve veVar, ke1 ke1, o42 o42, rz2 rz2, gv1 gv1, ux2 ux2, oh1 oh1) {
        this.f12263a = t91;
        this.f12265c = eb1;
        this.f12266d = rb1;
        this.f12267e = ec1;
        this.f12268f = te1;
        this.f12269g = executor;
        this.f12270h = lh1;
        this.f12271i = x11;
        this.f12272j = bVar;
        this.f12273k = nj0;
        this.f12274l = veVar;
        this.f12275m = ke1;
        this.f12276n = o42;
        this.f12277o = rz2;
        this.f12278p = gv1;
        this.f12279q = ux2;
        this.f12264b = oh1;
    }

    /* renamed from: j */
    public static final lf3 m15591j(vs0 vs0, String str, String str2) {
        in0 in0 = new in0();
        vs0.mo12108f0().mo9283G(new is1(in0));
        vs0.mo12115i1(str, str2, (String) null);
        return in0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo11789c() {
        this.f12263a.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo11790d(String str, String str2) {
        this.f12268f.mo8204R(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo11791e() {
        this.f12265c.mo9866d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11792f(View view) {
        this.f12272j.mo17896a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo11793g(vs0 vs0, vs0 vs02, Map map) {
        this.f12271i.mo15029g(vs0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ boolean mo11794h(View view, MotionEvent motionEvent) {
        this.f12272j.mo17896a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* renamed from: i */
    public final void mo11795i(vs0 vs0, boolean z, h60 h60) {
        C2807re c;
        vs0 vs02 = vs0;
        ku0 f0 = vs0.mo12108f0();
        bs1 bs1 = r4;
        bs1 bs12 = new bs1(this);
        rb1 rb1 = this.f12266d;
        ec1 ec1 = this.f12267e;
        cs1 cs1 = r7;
        cs1 cs12 = new cs1(this);
        ds1 ds1 = r10;
        ds1 ds12 = new ds1(this);
        C4391b bVar = this.f12272j;
        js1 js1 = r12;
        js1 js12 = new js1(this);
        f0.mo9308g0(bs1, rb1, ec1, cs1, ds1, z, h60, bVar, js1, this.f12273k, this.f12276n, this.f12277o, this.f12278p, this.f12279q, (f60) null, this.f12264b, (x60) null, (r60) null);
        vs0 vs03 = vs0;
        vs03.setOnTouchListener(new es1(this));
        vs03.setOnClickListener(new fs1(this));
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14570h2)).booleanValue() && (c = this.f12274l.mo14737c()) != null) {
            c.mo12590a((View) vs03);
        }
        this.f12270h.mo11669m0(vs03, this.f12269g);
        this.f12270h.mo11669m0(new gs1(vs03), this.f12269g);
        this.f12270h.mo12019p0((View) vs03);
        vs03.mo12105d1("/trackActiveViewUnit", new hs1(this, vs03));
        this.f12271i.mo15030h(vs03);
    }
}
