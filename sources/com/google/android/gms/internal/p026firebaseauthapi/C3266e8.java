package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3266e8 extends C3533mb {
    C3266e8() {
        super(C3176bh.class, new C3200c8(C3758t5.class));
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3233d8(this, C3275eh.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3176bh.m25118C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3176bh bhVar = (C3176bh) o3Var;
        C3544mm.m26218c(bhVar.mo15802z(), 0);
        if (bhVar.mo15801D().mo15875f() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
