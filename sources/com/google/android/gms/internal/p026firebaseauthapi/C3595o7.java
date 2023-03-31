package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3595o7 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3628p7 f22443b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3595o7(C3628p7 p7Var, Class cls) {
        super(cls);
        this.f22443b = p7Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3537mf mfVar = (C3537mf) o3Var;
        new C3727s7();
        C3669qf g = C3694r7.m26763g(mfVar.mo16393C());
        C3591o3 a = new C3766td().mo15786a().mo15720a(mfVar.mo16394D());
        C3405if A = C3438jf.m25898A();
        A.mo16174j(g);
        A.mo16175k((C3441ji) a);
        A.mo16176l(0);
        return (C3438jf) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3537mf.m26193B(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", C3628p7.m26454k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C3628p7.m26454k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", C3628p7.m26454k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C3628p7.m26454k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3537mf mfVar = (C3537mf) o3Var;
        ((C3694r7) new C3727s7().mo15786a()).mo15723d(mfVar.mo16393C());
        new C3766td().mo15786a().mo15723d(mfVar.mo16394D());
        C3544mm.m26217b(mfVar.mo16393C().mo16810z());
    }
}
