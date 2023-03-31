package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3397i7 {

    /* renamed from: a */
    public static final String f22140a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f22141b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final C3806uk f22142c;
    @Deprecated

    /* renamed from: d */
    public static final C3806uk f22143d;
    @Deprecated

    /* renamed from: e */
    public static final C3806uk f22144e;

    static {
        new C3628p7();
        new C3922y7();
        new C3167b8();
        new C3826v7();
        new C3398i8();
        new C3530m8();
        new C3266e8();
        new C3629p8();
        C3806uk A = C3806uk.m27140A();
        f22142c = A;
        f22143d = A;
        f22144e = A;
        try {
            m25783a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m25783a() throws GeneralSecurityException {
        C3265e7.m25484o(new C3529m7());
        C3305fe.m25569a();
        C3265e7.m25483n(new C3628p7(), true);
        C3265e7.m25483n(new C3922y7(), true);
        if (!C3234d9.m25412b()) {
            C3265e7.m25483n(new C3826v7(), true);
            C3167b8.m25089k(true);
            C3265e7.m25483n(new C3266e8(), true);
            C3265e7.m25483n(new C3398i8(), true);
            C3265e7.m25483n(new C3530m8(), true);
            C3265e7.m25483n(new C3629p8(), true);
        }
    }
}
