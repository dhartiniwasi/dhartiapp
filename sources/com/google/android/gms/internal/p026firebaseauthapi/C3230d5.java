package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3230d5 {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m25395a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m25399e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m25399e(b3) || m25399e(b4)) {
            throw C3689r2.m26699d();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m25396b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m25399e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m25399e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C3689r2.m26699d();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m25397c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m25399e(b2)) {
            throw C3689r2.m26699d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m25398d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m25399e(byte b) {
        return b > -65;
    }
}
