package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3531m9 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3564n9 f22353b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3531m9(C3564n9 n9Var, Class cls) {
        super(cls);
        this.f22353b = n9Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3539mh mhVar = (C3539mh) o3Var;
        KeyPair d = C3675ql.m26585d(C3675ql.m26593l(C3860w9.m27276c(mhVar.mo16395C().mo16600D().mo17116E())));
        ECPoint w = ((ECPublicKey) d.getPublic()).getW();
        C3836vh B = C3868wh.m27292B();
        B.mo16950k(0);
        B.mo16949j(mhVar.mo16395C());
        B.mo16951l(C3325g1.m25613u(w.getAffineX().toByteArray()));
        B.mo16952m(C3325g1.m25613u(w.getAffineY().toByteArray()));
        C3737sh A = C3770th.m27016A();
        A.mo16762l(0);
        A.mo16761k((C3868wh) B.mo16062e());
        A.mo16760j(C3325g1.m25613u(((ECPrivateKey) d.getPrivate()).getS().toByteArray()));
        return (C3770th) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3539mh.m26201B(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C3564n9.m26295m(4, 5, 3, C3495l6.m26080a("AES128_GCM"), C3564n9.f22413e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C3564n9.m26295m(4, 5, 3, C3495l6.m26080a("AES128_GCM"), C3564n9.f22413e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C3564n9.m26295m(4, 5, 4, C3495l6.m26080a("AES128_GCM"), C3564n9.f22413e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C3564n9.m26295m(4, 5, 4, C3495l6.m26080a("AES128_GCM"), C3564n9.f22413e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C3564n9.m26295m(4, 5, 4, C3495l6.m26080a("AES128_GCM"), C3564n9.f22413e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C3564n9.m26295m(4, 5, 3, C3495l6.m26080a("AES128_CTR_HMAC_SHA256"), C3564n9.f22413e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C3564n9.m26295m(4, 5, 3, C3495l6.m26080a("AES128_CTR_HMAC_SHA256"), C3564n9.f22413e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C3564n9.m26295m(4, 5, 4, C3495l6.m26080a("AES128_CTR_HMAC_SHA256"), C3564n9.f22413e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C3564n9.m26295m(4, 5, 4, C3495l6.m26080a("AES128_CTR_HMAC_SHA256"), C3564n9.f22413e, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3860w9.m27274a(((C3539mh) o3Var).mo16395C());
    }
}
