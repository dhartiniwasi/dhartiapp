package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3172bd extends C3533mb {
    C3172bd() {
        super(C3141af.class, new C3959zc(C3693r6.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m25107m(C3339gf gfVar) throws GeneralSecurityException {
        if (gfVar.mo16079z() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (gfVar.mo16079z() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m25108n(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3139ad(this, C3240df.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3141af.m25023C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3141af afVar = (C3141af) o3Var;
        C3544mm.m26218c(afVar.mo15735z(), 0);
        m25108n(afVar.mo15733E().mo15875f());
        m25107m(afVar.mo15732D());
    }
}
