package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.uc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3798uc {
    /* renamed from: a */
    public static int m27129a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    /* renamed from: b */
    public static final C3643pm m27130b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new C3765tc("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return C3643pm.m26493b(bArr);
    }
}
