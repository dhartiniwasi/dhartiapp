package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3547mp implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3781ts f22377a;

    /* renamed from: b */
    final /* synthetic */ C3186br f22378b;

    C3547mp(C3186br brVar, C3781ts tsVar) {
        this.f22378b = brVar;
        this.f22377a = tsVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3223cv cvVar = (C3223cv) obj;
        if (cvVar.mo15921g()) {
            this.f22377a.mo16826f(new C3382hp(cvVar.mo15917c(), cvVar.mo15919e(), (C7840p1) null));
            return;
        }
        this.f22378b.m25154o(new C3784tv(cvVar.mo15918d(), cvVar.mo15916b(), Long.valueOf(cvVar.mo15915a()), "Bearer"), (String) null, (String) null, Boolean.valueOf(cvVar.mo15922h()), (C7840p1) null, this.f22377a, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22377a.mo16404h(C11836l.m57255a(str));
    }
}
