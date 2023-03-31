package com.google.android.gms.internal.p026firebaseauthapi;

import com.startapp.C8843b4;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ka */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3466ka extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3499la f22289b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3466ka(C3499la laVar, Class cls) {
        super(cls);
        this.f22289b = laVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        C3837vi viVar = (C3837vi) o3Var;
        int E = viVar.mo16953C().mo17081E() - 2;
        if (E == 1) {
            bArr = C3478km.m26007a(32);
            bArr[0] = (byte) (bArr[0] | 7);
            byte b = bArr[31] & 63;
            bArr[31] = (byte) b;
            bArr[31] = (byte) (b | C8843b4.f36445d);
            bArr2 = C3577nm.m26313b(bArr);
        } else if (E == 2 || E == 3 || E == 4) {
            int g = C3598oa.m26367g(viVar.mo16953C().mo17081E());
            KeyPair d = C3675ql.m26585d(C3675ql.m26593l(g));
            bArr2 = C3675ql.m26594m(g, 1, ((ECPublicKey) d.getPublic()).getW());
            bArr = ((ECPrivateKey) d.getPrivate()).getS().toByteArray();
        } else {
            throw new GeneralSecurityException("Invalid KEM");
        }
        C3244dj B = C3277ej.m25511B();
        B.mo15960l(0);
        B.mo15958j(viVar.mo16953C());
        B.mo15959k(C3325g1.m25613u(bArr2));
        C3145aj A = C3178bj.m25125A();
        A.mo15740l(0);
        A.mo15739k((C3277ej) B.mo16062e());
        A.mo15738j(C3325g1.m25613u(bArr));
        return (C3178bj) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3837vi.m27230B(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C3499la.m26087l(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C3499la.m26087l(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C3499la.m26087l(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C3499la.m26087l(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", C3499la.m26087l(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", C3499la.m26087l(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C3499la.m26087l(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C3499la.m26087l(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C3499la.m26087l(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C3499la.m26087l(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", C3499la.m26087l(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", C3499la.m26087l(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", C3499la.m26087l(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", C3499la.m26087l(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", C3499la.m26087l(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", C3499la.m26087l(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", C3499la.m26087l(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", C3499la.m26087l(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3598oa.m26361a(((C3837vi) o3Var).mo16953C());
    }
}
