package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class hn3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ in3 f10429b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    hn3(in3 in3, Class cls) {
        super(cls);
        this.f10429b = in3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        mr3 mr3 = (mr3) cz3;
        hr3 H = jr3.m15026H();
        H.mo10932s(0);
        H.mo10931r(mr3.mo12419L());
        H.mo10930p(jw3.m15086K(jv3.m15081a(mr3.mo12418G())));
        return (jr3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return mr3.m16664K(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", in3.m14450m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", in3.m14450m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", in3.m14450m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", in3.m14450m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", in3.m14450m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", in3.m14450m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", in3.m14450m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", in3.m14450m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", in3.m14450m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", in3.m14450m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        mr3 mr3 = (mr3) cz3;
        if (mr3.mo12418G() >= 16) {
            in3.m14451n(mr3.mo12419L());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
