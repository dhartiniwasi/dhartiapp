package com.google.ads.mediation;

import p006a4.C0100e;
import p060h4.C4470a;
import p087l4.C4937i;
import p179z3.C6327d;
import p179z3.C6344n;

/* renamed from: com.google.ads.mediation.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C1998b extends C6327d implements C0100e, C4470a {

    /* renamed from: a */
    final AbstractAdViewAdapter f5696a;

    /* renamed from: b */
    final C4937i f5697b;

    public C1998b(AbstractAdViewAdapter abstractAdViewAdapter, C4937i iVar) {
        this.f5696a = abstractAdViewAdapter;
        this.f5697b = iVar;
    }

    /* renamed from: c */
    public final void mo248c(String str, String str2) {
        this.f5697b.mo13773q(this.f5696a, str, str2);
    }

    /* renamed from: f */
    public final void mo7698f() {
        this.f5697b.mo13757a(this.f5696a);
    }

    /* renamed from: g */
    public final void mo7699g(C6344n nVar) {
        this.f5697b.mo13770n(this.f5696a, nVar);
    }

    /* renamed from: j */
    public final void mo7700j() {
        this.f5697b.mo13763g(this.f5696a);
    }

    /* renamed from: k */
    public final void mo7701k() {
        this.f5697b.mo13769m(this.f5696a);
    }

    public final void onAdClicked() {
        this.f5697b.mo13761e(this.f5696a);
    }
}
