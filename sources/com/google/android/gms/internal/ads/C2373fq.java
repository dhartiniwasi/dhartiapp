package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.fq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2373fq {

    /* renamed from: a */
    private static final byte[] f9392a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f9393b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f9394c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair m12781a(byte[] bArr) {
        C2596lq lqVar = new C2596lq(bArr, bArr.length);
        int c = m12783c(lqVar);
        int d = m12784d(lqVar);
        int a = lqVar.mo12058a(4);
        if (c == 5 || c == 29) {
            d = m12784d(lqVar);
            if (m12783c(lqVar) == 22) {
                a = lqVar.mo12058a(4);
            }
        }
        int i = f9394c[a];
        C2335eq.m12243c(i != -1);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[] m12782b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f9392a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: c */
    private static int m12783c(C2596lq lqVar) {
        int a = lqVar.mo12058a(5);
        return a == 31 ? lqVar.mo12058a(6) + 32 : a;
    }

    /* renamed from: d */
    private static int m12784d(C2596lq lqVar) {
        int a = lqVar.mo12058a(4);
        if (a == 15) {
            return lqVar.mo12058a(24);
        }
        C2335eq.m12243c(a < 13);
        return f9393b[a];
    }
}
