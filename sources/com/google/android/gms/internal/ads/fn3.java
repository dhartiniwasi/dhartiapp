package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fn3 {

    /* renamed from: a */
    private static final pv3 f9352a;

    /* renamed from: b */
    private static final im3 f9353b;

    /* renamed from: c */
    private static final fm3 f9354c;

    /* renamed from: d */
    private static final rl3 f9355d;

    /* renamed from: e */
    private static final ol3 f9356e;

    static {
        Class<lm3> cls = lm3.class;
        Class<mm3> cls2 = mm3.class;
        pv3 a = pv3.m18935a("type.googleapis.com/google.crypto.tink.AesCmacKey".getBytes(StandardCharsets.US_ASCII));
        f9352a = a;
        f9353b = im3.m14428c(an3.f6684a, zm3.class, cls2);
        f9354c = fm3.m12713c(bn3.f7379a, a, cls2);
        f9355d = rl3.m19916c(cn3.f7845a, vm3.class, cls);
        f9356e = ol3.m17935c(dn3.f8333a, a, cls);
    }

    /* renamed from: a */
    public static void m12721a() throws GeneralSecurityException {
        bm3 a = bm3.m10489a();
        a.mo8881e(f9353b);
        a.mo8880d(f9354c);
        a.mo8879c(f9355d);
        a.mo8878b(f9356e);
    }
}
