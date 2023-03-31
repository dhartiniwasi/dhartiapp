package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3890x7 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3922y7 f22906b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3890x7(C3922y7 y7Var, Class cls) {
        super(cls);
        this.f22906b = y7Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3373hg A = C3406ig.m25803A();
        A.mo16096j(C3325g1.m25613u(C3478km.m26007a(((C3505lg) o3Var).mo16335z())));
        A.mo16097k(0);
        return (C3406ig) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3505lg.m26107C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", C3922y7.m27426k(16, 1));
        hashMap.put("AES128_GCM_RAW", C3922y7.m27426k(16, 3));
        hashMap.put("AES256_GCM", C3922y7.m27426k(32, 1));
        hashMap.put("AES256_GCM_RAW", C3922y7.m27426k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3544mm.m26217b(((C3505lg) o3Var).mo16335z());
    }
}
