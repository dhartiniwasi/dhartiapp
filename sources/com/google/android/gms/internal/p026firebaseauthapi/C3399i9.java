package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3399i9 {

    /* renamed from: a */
    public static final String f22145a = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated

    /* renamed from: b */
    public static final C3806uk f22146b = C3806uk.m27140A();
    @Deprecated

    /* renamed from: c */
    public static final C3806uk f22147c = C3806uk.m27140A();

    static {
        new C3333g9();
        try {
            C3265e7.m25484o(new C3465k9());
            if (!C3234d9.m25412b()) {
                C3265e7.m25483n(new C3333g9(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
