package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.na */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3565na extends C3533mb {
    public C3565na() {
        super(C3277ej.class, new C3532ma(C3952z5.class));
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3277ej.m25514E(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3277ej ejVar = (C3277ej) o3Var;
        C3544mm.m26218c(ejVar.mo15992z(), 0);
        if (ejVar.mo15991K()) {
            C3598oa.m26361a(ejVar.mo15989A());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
