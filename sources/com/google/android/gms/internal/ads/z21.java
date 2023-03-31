package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z21 extends v51 {

    /* renamed from: i */
    private final View f20911i;

    /* renamed from: j */
    private final vs0 f20912j;

    /* renamed from: k */
    private final js2 f20913k;

    /* renamed from: l */
    private final int f20914l;

    /* renamed from: m */
    private final boolean f20915m;

    /* renamed from: n */
    private final boolean f20916n;

    /* renamed from: o */
    private final r21 f20917o;

    /* renamed from: p */
    private C2859st f20918p;

    z21(u51 u51, View view, vs0 vs0, js2 js2, int i, boolean z, boolean z2, r21 r21) {
        super(u51);
        this.f20911i = view;
        this.f20912j = vs0;
        this.f20913k = js2;
        this.f20914l = i;
        this.f20915m = z;
        this.f20916n = z2;
        this.f20917o = r21;
    }

    /* renamed from: h */
    public final int mo15538h() {
        return this.f20914l;
    }

    /* renamed from: i */
    public final View mo15539i() {
        return this.f20911i;
    }

    /* renamed from: j */
    public final js2 mo15540j() {
        return it2.m14549b(this.f18930b.f11002s, this.f20913k);
    }

    /* renamed from: k */
    public final void mo15541k(C2488it itVar) {
        this.f20912j.mo12125n1(itVar);
    }

    /* renamed from: l */
    public final boolean mo15542l() {
        return this.f20915m;
    }

    /* renamed from: m */
    public final boolean mo15543m() {
        return this.f20916n;
    }

    /* renamed from: n */
    public final boolean mo15544n() {
        return this.f20912j.mo12118l();
    }

    /* renamed from: o */
    public final boolean mo15545o() {
        return this.f20912j.mo12108f0() != null && this.f20912j.mo12108f0().mo9320u();
    }

    /* renamed from: p */
    public final void mo15546p(long j, int i) {
        this.f20917o.mo13658a(j, i);
    }

    /* renamed from: q */
    public final C2859st mo15547q() {
        return this.f20918p;
    }

    /* renamed from: r */
    public final void mo15548r(C2859st stVar) {
        this.f20918p = stVar;
    }
}
