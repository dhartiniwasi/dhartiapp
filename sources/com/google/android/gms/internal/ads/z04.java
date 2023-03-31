package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class z04 {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m24329a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m24335g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m24335g(b3) || m24335g(b4)) {
            throw ey3.m12340d();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m24330b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m24335g(b2)) {
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
            if (!m24335g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw ey3.m12340d();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m24331c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m24335g(b2)) {
            throw ey3.m12340d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m24332d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ boolean m24333e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ boolean m24334f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    private static boolean m24335g(byte b) {
        return b > -65;
    }
}
