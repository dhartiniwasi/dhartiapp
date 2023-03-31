package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fi3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ gi3 f9291b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fi3(gi3 gi3, Class cls) {
        super(cls);
        this.f9291b = gi3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        po3 po3 = (po3) cz3;
        new ji3();
        so3 g = ii3.m14349g(po3.mo13319J());
        cz3 a = new in3().mo9607a().mo8857a(po3.mo13320K());
        lo3 H = mo3.m16612H();
        H.mo12048p(g);
        H.mo12049r((jr3) a);
        H.mo12050s(0);
        return (mo3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return po3.m18703I(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", gi3.m13328k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", gi3.m13328k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", gi3.m13328k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", gi3.m13328k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        po3 po3 = (po3) cz3;
        ((ii3) new ji3().mo9607a()).mo8860d(po3.mo13319J());
        new in3().mo9607a().mo8860d(po3.mo13320K());
        lv3.m16238a(po3.mo13319J().mo14800G());
    }
}
