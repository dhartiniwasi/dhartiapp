package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3497l8 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3530m8 f22328b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3497l8(C3530m8 m8Var, Class cls) {
        super(cls);
        this.f22328b = m8Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3476kk A = C3509lk.m26115A();
        A.mo16262j((C3608ok) o3Var);
        A.mo16263k(0);
        return (C3509lk) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3608ok.m26389C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3608ok okVar = (C3608ok) o3Var;
        if (okVar.mo16513D().isEmpty() || !okVar.mo16514E()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
