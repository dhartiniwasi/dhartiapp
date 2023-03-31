package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3630p9 extends C3533mb {
    public C3630p9() {
        super(C3868wh.class, new C3597o9(C3952z5.class));
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3868wh.m27295E(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3868wh whVar = (C3868wh) o3Var;
        C3544mm.m26218c(whVar.mo16996z(), 0);
        C3860w9.m27274a(whVar.mo16993A());
    }
}
