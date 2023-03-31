package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3481kp implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3781ts f22303a;

    /* renamed from: b */
    final /* synthetic */ C3186br f22304b;

    C3481kp(C3186br brVar, C3781ts tsVar) {
        this.f22304b = brVar;
        this.f22303a = tsVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3390i0 i0Var = (C3390i0) obj;
        if (i0Var.mo16122g()) {
            this.f22303a.mo16826f(new C3382hp(i0Var.mo16119c(), i0Var.mo16121e(), (C7840p1) null));
            return;
        }
        this.f22304b.m25154o(new C3784tv(i0Var.mo16120d(), i0Var.mo16118b(), Long.valueOf(i0Var.mo16117a()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (C7840p1) null, this.f22303a, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22303a.mo16404h(C11836l.m57255a(str));
    }
}
