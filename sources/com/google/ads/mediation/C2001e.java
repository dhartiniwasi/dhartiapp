package com.google.ads.mediation;

import p023c4.C1865f;
import p023c4.C1869h;
import p087l4.C4944p;
import p179z3.C6327d;
import p179z3.C6344n;

/* renamed from: com.google.ads.mediation.e */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C2001e extends C6327d implements C1869h.C1870a, C1865f.C1867b, C1865f.C1866a {

    /* renamed from: a */
    final AbstractAdViewAdapter f5702a;

    /* renamed from: b */
    final C4944p f5703b;

    public C2001e(AbstractAdViewAdapter abstractAdViewAdapter, C4944p pVar) {
        this.f5702a = abstractAdViewAdapter;
        this.f5703b = pVar;
    }

    /* renamed from: a */
    public final void mo7123a(C1869h hVar) {
        this.f5703b.mo13767k(this.f5702a, new C1997a(hVar));
    }

    /* renamed from: d */
    public final void mo7107d(C1865f fVar) {
        this.f5703b.mo13772p(this.f5702a, fVar);
    }

    /* renamed from: e */
    public final void mo7106e(C1865f fVar, String str) {
        this.f5703b.mo13765i(this.f5702a, fVar, str);
    }

    /* renamed from: f */
    public final void mo7698f() {
        this.f5703b.mo13762f(this.f5702a);
    }

    /* renamed from: g */
    public final void mo7699g(C6344n nVar) {
        this.f5703b.mo13764h(this.f5702a, nVar);
    }

    /* renamed from: h */
    public final void mo7707h() {
        this.f5703b.mo13774r(this.f5702a);
    }

    /* renamed from: j */
    public final void mo7700j() {
    }

    /* renamed from: k */
    public final void mo7701k() {
        this.f5703b.mo13758b(this.f5702a);
    }

    public final void onAdClicked() {
        this.f5703b.mo13766j(this.f5702a);
    }
}
