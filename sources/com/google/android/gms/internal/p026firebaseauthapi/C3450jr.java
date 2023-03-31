package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7842q0;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3450jr extends C3848vt {

    /* renamed from: w */
    private final C3380hn f22241w;

    public C3450jr(C7842q0 q0Var, String str, String str2) {
        super(2);
        C4141r.m28221k(q0Var);
        C4141r.m28217g(str);
        this.f22241w = new C3380hn(q0Var.mo26180a(), str, str2);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16906o(this.f22241w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, C3682qs.m26612o(this.f22823c, this.f22830j));
        mo16970l((Object) null);
    }

    public final String zza() {
        return "finalizeMfaEnrollment";
    }
}
