package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ui3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ vi3 f18557b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ui3(vi3 vi3, Class cls) {
        super(cls);
        this.f18557b = vi3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        gq3 gq3 = (gq3) cz3;
        cq3 H = dq3.m11608H();
        H.mo9269r(0);
        H.mo9268p(jw3.m15086K(jv3.m15081a(32)));
        return (dq3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return gq3.m13476I(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final Map mo8859c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new sl3(gq3.m13475H(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new sl3(gq3.m13475H(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        gq3 gq3 = (gq3) cz3;
    }
}
