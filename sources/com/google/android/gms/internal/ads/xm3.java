package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xm3 extends tl3 {
    xm3(ym3 ym3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        go3 go3 = (go3) cz3;
        bo3 H = co3.m11032H();
        H.mo8909s(0);
        H.mo8907p(jw3.m15086K(jv3.m15081a(go3.mo10594G())));
        H.mo8908r(go3.mo10595K());
        return (co3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return go3.m13437J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        eo3 H = go3.m13435H();
        H.mo9978p(32);
        io3 H2 = jo3.m14992H();
        H2.mo11183p(16);
        H.mo9979r((jo3) H2.mo13423m());
        hashMap.put("AES_CMAC", new sl3((go3) H.mo13423m(), 1));
        eo3 H3 = go3.m13435H();
        H3.mo9978p(32);
        io3 H4 = jo3.m14992H();
        H4.mo11183p(16);
        H3.mo9979r((jo3) H4.mo13423m());
        hashMap.put("AES256_CMAC", new sl3((go3) H3.mo13423m(), 1));
        eo3 H5 = go3.m13435H();
        H5.mo9978p(32);
        io3 H6 = jo3.m14992H();
        H6.mo11183p(16);
        H5.mo9979r((jo3) H6.mo13423m());
        hashMap.put("AES256_CMAC_RAW", new sl3((go3) H5.mo13423m(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        go3 go3 = (go3) cz3;
        ym3.m24099m(go3.mo10595K());
        ym3.m24100n(go3.mo10594G());
    }
}
