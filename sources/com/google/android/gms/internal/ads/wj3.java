package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wj3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ xj3 f19658b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wj3(xj3 xj3, Class cls) {
        super(cls);
        this.f19658b = xj3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        wp3 H = xp3.m23493H();
        H.mo14968p(jw3.m15086K(jv3.m15081a(((aq3) cz3).mo8515G())));
        H.mo14969r(0);
        return (xp3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return aq3.m9947J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zp3 H = aq3.m9945H();
        H.mo15637p(64);
        hashMap.put("AES256_SIV", new sl3((aq3) H.mo13423m(), 1));
        zp3 H2 = aq3.m9945H();
        H2.mo15637p(64);
        hashMap.put("AES256_SIV_RAW", new sl3((aq3) H2.mo13423m(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        aq3 aq3 = (aq3) cz3;
        if (aq3.mo8515G() != 64) {
            int G = aq3.mo8515G();
            throw new InvalidAlgorithmParameterException("invalid key size: " + G + ". Valid keys must have 64 bytes.");
        }
    }
}
