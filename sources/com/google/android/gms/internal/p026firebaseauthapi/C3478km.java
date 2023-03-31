package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.km */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3478km {

    /* renamed from: a */
    private static final ThreadLocal f22299a = new C3445jm();

    /* renamed from: a */
    public static byte[] m26007a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f22299a.get()).nextBytes(bArr);
        return bArr;
    }
}
