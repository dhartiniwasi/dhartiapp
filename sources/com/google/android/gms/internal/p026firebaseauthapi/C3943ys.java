package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ys */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class C3943ys {
    /* renamed from: a */
    public static String m27473a(C3975zs zsVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i = 0;
            while (i < length) {
                if (C3502ld.m26100a(str2.charAt(i))) {
                    char[] charArray = str2.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (C3502ld.m26100a(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            C3975zs.f22996l.mo17930c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }
}
