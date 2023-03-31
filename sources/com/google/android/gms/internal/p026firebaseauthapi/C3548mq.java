package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3548mq implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3781ts f22379a;

    /* renamed from: b */
    final /* synthetic */ C3186br f22380b;

    C3548mq(C3186br brVar, C3781ts tsVar) {
        this.f22380b = brVar;
        this.f22379a = tsVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3355gv gvVar = (C3355gv) obj;
        this.f22380b.m25154o(new C3784tv(gvVar.mo16092b(), gvVar.mo16091a(), Long.valueOf(C3191c.m25215a(gvVar.mo16091a())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (C7840p1) null, this.f22379a, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22379a.mo16404h(C11836l.m57255a(str));
    }
}
