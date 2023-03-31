package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7848s0;
import p033d5.C4141r;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3319fs extends C3848vt {

    /* renamed from: w */
    private final C3744so f22044w;

    public C3319fs(C7848s0 s0Var, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3) {
        super(8);
        C4141r.m28221k(s0Var);
        C4141r.m28217g(str);
        this.f22044w = new C3744so(s0Var, str, str2, j, z, z2, str3, str4, z3);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16893a(this.f22044w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
    }

    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }
}
