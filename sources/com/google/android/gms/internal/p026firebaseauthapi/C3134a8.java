package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3134a8 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3167b8 f21751b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3134a8(C3167b8 b8Var, Class cls) {
        super(cls);
        this.f21751b = b8Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3571ng A = C3637pg.m26477A();
        A.mo16460j(C3325g1.m25613u(C3478km.m26007a(((C3736sg) o3Var).mo16759z())));
        A.mo16461k(0);
        return (C3637pg) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3736sg.m26916C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", C3167b8.m25090l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", C3167b8.m25090l(16, 3));
        hashMap.put("AES256_GCM_SIV", C3167b8.m25090l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", C3167b8.m25090l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3544mm.m26217b(((C3736sg) o3Var).mo16759z());
    }
}
