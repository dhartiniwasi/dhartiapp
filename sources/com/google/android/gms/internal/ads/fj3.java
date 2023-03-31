package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fj3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ gj3 f9298b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    fj3(gj3 gj3, Class cls) {
        super(cls);
        this.f9298b = gj3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        xt3 xt3 = (xt3) cz3;
        tt3 H = ut3.m21854H();
        H.mo14384r(0);
        H.mo14383p(jw3.m15086K(jv3.m15081a(32)));
        return (ut3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return xt3.m23540I(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new sl3(xt3.m23539H(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new sl3(xt3.m23539H(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        xt3 xt3 = (xt3) cz3;
    }
}
