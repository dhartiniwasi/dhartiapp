package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bc */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6896bc {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m39669a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m39673e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m39673e(b3) || m39673e(b4)) {
            throw C7139q9.m40664c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m39670b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m39673e(b2)) {
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
            if (!m39673e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C7139q9.m40664c();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m39671c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m39673e(b2)) {
            throw C7139q9.m40664c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m39672d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m39673e(byte b) {
        return b > -65;
    }
}
