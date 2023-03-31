package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class li3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ mi3 f12815b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    li3(mi3 mi3, Class cls) {
        super(cls);
        this.f12815b = mi3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        ep3 ep3 = (ep3) cz3;
        ap3 H = bp3.m10535H();
        H.mo8492p(jw3.m15086K(jv3.m15081a(ep3.mo9993G())));
        H.mo8493r(ep3.mo9994K());
        H.mo8494s(0);
        return (bp3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return ep3.m12235J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", mi3.m16537k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", mi3.m16537k(16, 16, 3));
        hashMap.put("AES256_EAX", mi3.m16537k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", mi3.m16537k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        ep3 ep3 = (ep3) cz3;
        lv3.m16238a(ep3.mo9993G());
        if (ep3.mo9994K().mo11187G() != 12 && ep3.mo9994K().mo11187G() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
