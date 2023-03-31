package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3318fr extends C3848vt {

    /* renamed from: w */
    private final C3182bn f22043w;

    public C3318fr(String str, String str2, String str3) {
        super(4);
        C4141r.m28218h(str, "code cannot be null or empty");
        C4141r.m28218h(str2, "new password cannot be null or empty");
        this.f22043w = new C3182bn(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16903l(this.f22043w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        mo16970l((Object) null);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }
}
