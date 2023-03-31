package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ri3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ si3 f16969b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ri3(si3 si3, Class cls) {
        super(cls);
        this.f16969b = si3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        qp3 H = rp3.m19984H();
        H.mo13585p(jw3.m15086K(jv3.m15081a(((up3) cz3).mo14571G())));
        H.mo13586r(0);
        return (rp3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return up3.m21777J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", si3.m20387l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", si3.m20387l(16, 3));
        hashMap.put("AES256_GCM_SIV", si3.m20387l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", si3.m20387l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        lv3.m16238a(((up3) cz3).mo14571G());
    }
}
