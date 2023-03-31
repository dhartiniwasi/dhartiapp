package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7793e;
import p033d5.C4141r;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3878wr extends C3848vt {

    /* renamed from: w */
    private final C3938yn f22890w;

    public C3878wr(String str, C7793e eVar) {
        super(6);
        C4141r.m28218h(str, "token cannot be null or empty");
        this.f22890w = new C3938yn(str, eVar);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16914w(this.f22890w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        mo16970l((Object) null);
    }

    public final String zza() {
        return "sendEmailVerification";
    }
}
