package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ai3 {

    /* renamed from: a */
    public static final String f6586a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f6587b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final rt3 f6588c;
    @Deprecated

    /* renamed from: d */
    public static final rt3 f6589d;
    @Deprecated

    /* renamed from: e */
    public static final rt3 f6590e;

    static {
        new gi3();
        new pi3();
        new si3();
        new mi3();
        new yi3();
        new dj3();
        new vi3();
        new gj3();
        rt3 H = rt3.m20025H();
        f6588c = H;
        f6589d = H;
        f6590e = H;
        try {
            m9789a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m9789a() throws GeneralSecurityException {
        xh3.m23230o(new di3());
        jn3.m14990a();
        xh3.m23229n(new gi3(), true);
        xh3.m23229n(new pi3(), true);
        if (!uj3.m21664b()) {
            xh3.m23229n(new mi3(), true);
            si3.m20386k(true);
            xh3.m23229n(new vi3(), true);
            xh3.m23229n(new yi3(), true);
            xh3.m23229n(new dj3(), true);
            xh3.m23229n(new gj3(), true);
        }
    }
}
