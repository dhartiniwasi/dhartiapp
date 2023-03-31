package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3333g9 extends C3533mb {
    C3333g9() {
        super(C3835vg.class, new C3267e9(C3888x5.class));
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3300f9(this, C3931yg.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3835vg.m27219C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3835vg vgVar = (C3835vg) o3Var;
        C3544mm.m26218c(vgVar.mo16948z(), 0);
        if (vgVar.mo16947D().mo15875f() != 64) {
            int f = vgVar.mo16947D().mo15875f();
            throw new InvalidKeyException("invalid key size: " + f + ". Valid keys must have 64 bytes.");
        }
    }
}
