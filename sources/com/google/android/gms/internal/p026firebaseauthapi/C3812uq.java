package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.uq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3812uq implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3781ts f22785a;

    /* renamed from: b */
    final /* synthetic */ C3186br f22786b;

    C3812uq(C3186br brVar, C3781ts tsVar) {
        this.f22786b = brVar;
        this.f22785a = tsVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3752t tVar = (C3752t) obj;
        this.f22786b.m25154o(new C3784tv(tVar.mo16782c(), tVar.mo16781b(), Long.valueOf(tVar.mo16780a()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (C7840p1) null, this.f22785a, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22785a.mo16404h(C11836l.m57255a(str));
    }
}
