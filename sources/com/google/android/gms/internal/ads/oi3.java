package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oi3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ pi3 f15156b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    oi3(pi3 pi3, Class cls) {
        super(cls);
        this.f15156b = pi3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        kp3 H = lp3.m16085H();
        H.mo11758p(jw3.m15086K(jv3.m15081a(((op3) cz3).mo13019G())));
        H.mo11759r(0);
        return (lp3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return op3.m18020J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", pi3.m18630k(16, 1));
        hashMap.put("AES128_GCM_RAW", pi3.m18630k(16, 3));
        hashMap.put("AES256_GCM", pi3.m18630k(32, 1));
        hashMap.put("AES256_GCM_RAW", pi3.m18630k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        lv3.m16238a(((op3) cz3).mo13019G());
    }
}
