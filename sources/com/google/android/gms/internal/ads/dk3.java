package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dk3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ ek3 f8301b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dk3(ek3 ek3, Class cls) {
        super(cls);
        this.f8301b = ek3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        pq3 pq3 = (pq3) cz3;
        KeyPair c = qu3.m19359c(qu3.m19367k(nk3.m17164c(pq3.mo13328J().mo14121K().mo8923L())));
        ECPoint w = ((ECPublicKey) c.getPublic()).getW();
        xq3 I = yq3.m24159I();
        I.mo15231r(0);
        I.mo15230p(pq3.mo13328J());
        I.mo15232s(jw3.m15086K(w.getAffineX().toByteArray()));
        I.mo15233u(jw3.m15086K(w.getAffineY().toByteArray()));
        uq3 H = vq3.m22348H();
        H.mo14574s(0);
        H.mo14573r((yq3) I.mo13423m());
        H.mo14572p(jw3.m15086K(((ECPrivateKey) c.getPrivate()).getS().toByteArray()));
        return (vq3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return pq3.m18727I(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", ek3.m12157l(4, 5, 3, dh3.m11501a("AES128_GCM"), ek3.f8833e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", ek3.m12157l(4, 5, 3, dh3.m11501a("AES128_GCM"), ek3.f8833e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", ek3.m12157l(4, 5, 4, dh3.m11501a("AES128_GCM"), ek3.f8833e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", ek3.m12157l(4, 5, 4, dh3.m11501a("AES128_GCM"), ek3.f8833e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", ek3.m12157l(4, 5, 4, dh3.m11501a("AES128_GCM"), ek3.f8833e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ek3.m12157l(4, 5, 3, dh3.m11501a("AES128_CTR_HMAC_SHA256"), ek3.f8833e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ek3.m12157l(4, 5, 3, dh3.m11501a("AES128_CTR_HMAC_SHA256"), ek3.f8833e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ek3.m12157l(4, 5, 4, dh3.m11501a("AES128_CTR_HMAC_SHA256"), ek3.f8833e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", ek3.m12157l(4, 5, 4, dh3.m11501a("AES128_CTR_HMAC_SHA256"), ek3.f8833e, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        nk3.m17162a(((pq3) cz3).mo13328J());
    }
}
