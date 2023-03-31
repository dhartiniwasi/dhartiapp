package com.google.ads.mediation;

import p080k4.C4883a;
import p080k4.C4884b;
import p087l4.C4942n;
import p179z3.C6344n;

/* renamed from: com.google.ads.mediation.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C1999c extends C4884b {

    /* renamed from: a */
    final AbstractAdViewAdapter f5698a;

    /* renamed from: b */
    final C4942n f5699b;

    public C1999c(AbstractAdViewAdapter abstractAdViewAdapter, C4942n nVar) {
        this.f5698a = abstractAdViewAdapter;
        this.f5699b = nVar;
    }

    /* renamed from: d */
    public final void mo7703d(C6344n nVar) {
        this.f5699b.mo13759c(this.f5698a, nVar);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo7704e(Object obj) {
        C4883a aVar = (C4883a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f5698a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.mo13162c(new C2000d(abstractAdViewAdapter, this.f5699b));
        this.f5699b.mo13768l(this.f5698a);
    }
}
