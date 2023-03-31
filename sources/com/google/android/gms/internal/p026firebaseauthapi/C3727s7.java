package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3727s7 extends C3533mb {
    C3727s7() {
        super(C3669qf.class, new C3661q7(C3280em.class));
    }

    /* renamed from: l */
    public static final void m26886l(C3669qf qfVar) throws GeneralSecurityException {
        C3544mm.m26218c(qfVar.mo16599z(), 0);
        C3544mm.m26217b(qfVar.mo16598F().mo15875f());
        m26887m(qfVar.mo16597E());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m26887m(C3866wf wfVar) throws GeneralSecurityException {
        if (wfVar.mo16992z() < 12 || wfVar.mo16992z() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3694r7(this, C3768tf.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3669qf.m26563D(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        m26886l((C3669qf) o3Var);
    }
}
