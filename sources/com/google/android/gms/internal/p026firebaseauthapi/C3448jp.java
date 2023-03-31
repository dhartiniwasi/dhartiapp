package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3448jp implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3781ts f22237a;

    /* renamed from: b */
    final /* synthetic */ C3186br f22238b;

    C3448jp(C3186br brVar, C3781ts tsVar) {
        this.f22238b = brVar;
        this.f22237a = tsVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3752t tVar = (C3752t) obj;
        this.f22238b.m25154o(new C3784tv(tVar.mo16782c(), tVar.mo16781b(), Long.valueOf(tVar.mo16780a()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (C7840p1) null, this.f22237a, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22237a.mo16404h(C11836l.m57255a(str));
    }
}
