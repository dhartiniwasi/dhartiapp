package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2169a8 {
    /* renamed from: a */
    public static int m9631a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m9632b(y22 y22, int i, int i2) {
        y22.mo15293f(i);
        if (y22.mo15296i() < 5) {
            return -9223372036854775807L;
        }
        int m = y22.mo15300m();
        if ((8388608 & m) != 0 || ((m >> 8) & 8191) != i2 || (m & 32) == 0 || y22.mo15306s() < 7 || y22.mo15296i() < 7 || (y22.mo15306s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        y22.mo15289b(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
