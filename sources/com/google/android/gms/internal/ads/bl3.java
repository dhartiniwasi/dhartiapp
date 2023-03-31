package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bl3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ dl3 f7343b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bl3(dl3 dl3, Class cls) {
        super(cls);
        this.f7343b = dl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        byte[] b = nv3.m17294b();
        byte[] c = nv3.m17295c(b);
        cs3 I = ds3.m11651I();
        I.mo9278s(0);
        I.mo9276p(((ur3) cz3).mo14601J());
        I.mo9277r(jw3.m15086K(c));
        zr3 H = as3.m9961H();
        H.mo15652s(0);
        H.mo15651r((ds3) I.mo13423m());
        H.mo15650p(jw3.m15086K(b));
        return (as3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return ur3.m21829I(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", dl3.m11558k(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", dl3.m11558k(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", dl3.m11558k(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", dl3.m11558k(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", dl3.m11558k(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", dl3.m11558k(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", dl3.m11558k(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", dl3.m11558k(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", dl3.m11558k(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", dl3.m11558k(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", dl3.m11558k(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", dl3.m11558k(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", dl3.m11558k(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", dl3.m11558k(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", dl3.m11558k(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", dl3.m11558k(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", dl3.m11558k(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", dl3.m11558k(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        gl3.m13379a(((ur3) cz3).mo14601J());
    }
}
