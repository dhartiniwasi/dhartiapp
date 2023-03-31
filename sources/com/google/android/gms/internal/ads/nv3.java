package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nv3 {
    /* renamed from: a */
    public static byte[] m17293a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = iu3.f11017b;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    byte[][] bArr5 = iu3.f11016a;
                    if (!gu3.m13539b(bArr5[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(cv3.m11208a(bArr5[i2])));
                    }
                }
                long[] k = bv3.m10603k(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(k, 0, jArr2, 0, 10);
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    byte b2 = copyOf[(32 - i3) - 1] & 255;
                    int i5 = 0;
                    while (i5 < 8) {
                        int i6 = (b2 >> (7 - i5)) & 1;
                        iu3.m14562a(jArr4, jArr2, i6);
                        iu3.m14562a(jArr5, jArr3, i6);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i7 = i3;
                        long[] jArr12 = new long[19];
                        int i8 = i5;
                        long[] jArr13 = new long[19];
                        int i9 = i6;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        bv3.m10601i(jArr4, jArr4, jArr5);
                        bv3.m10600h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        bv3.m10601i(jArr2, jArr2, jArr3);
                        bv3.m10600h(jArr3, copyOf4, jArr3);
                        bv3.m10594b(jArr13, jArr2, jArr5);
                        bv3.m10594b(jArr14, jArr4, jArr3);
                        bv3.m10597e(jArr13);
                        bv3.m10596d(jArr13);
                        bv3.m10597e(jArr14);
                        bv3.m10596d(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        bv3.m10601i(jArr13, jArr13, jArr14);
                        bv3.m10600h(jArr14, copyOf4, jArr14);
                        bv3.m10599g(jArr17, jArr13);
                        bv3.m10599g(jArr16, jArr14);
                        bv3.m10594b(jArr14, jArr16, k);
                        bv3.m10597e(jArr14);
                        bv3.m10596d(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        bv3.m10599g(jArr11, jArr4);
                        bv3.m10599g(jArr12, jArr5);
                        bv3.m10594b(jArr8, jArr11, jArr12);
                        bv3.m10597e(jArr8);
                        bv3.m10596d(jArr8);
                        bv3.m10600h(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        bv3.m10598f(jArr19, jArr12, 121665);
                        bv3.m10596d(jArr19);
                        bv3.m10601i(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        bv3.m10594b(jArr20, jArr12, jArr19);
                        bv3.m10597e(jArr20);
                        bv3.m10596d(jArr20);
                        int i10 = i9;
                        iu3.m14562a(jArr8, jArr6, i10);
                        iu3.m14562a(jArr20, jArr7, i10);
                        i5 = i8 + 1;
                        byte[] bArr7 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i3 = i7;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr6;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr8 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i3++;
                    byte[] bArr9 = bArr2;
                    copyOf = bArr8;
                }
                long[] jArr26 = jArr;
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[10];
                bv3.m10599g(jArr28, jArr5);
                bv3.m10599g(jArr38, jArr28);
                bv3.m10599g(jArr36, jArr38);
                bv3.m10593a(jArr29, jArr36, jArr5);
                bv3.m10593a(jArr30, jArr29, jArr28);
                bv3.m10599g(jArr36, jArr30);
                bv3.m10593a(jArr31, jArr36, jArr29);
                bv3.m10599g(jArr36, jArr31);
                bv3.m10599g(jArr38, jArr36);
                bv3.m10599g(jArr36, jArr38);
                bv3.m10599g(jArr38, jArr36);
                bv3.m10599g(jArr36, jArr38);
                bv3.m10593a(jArr32, jArr36, jArr31);
                bv3.m10599g(jArr36, jArr32);
                bv3.m10599g(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    bv3.m10599g(jArr36, jArr38);
                    bv3.m10599g(jArr38, jArr36);
                }
                bv3.m10593a(jArr33, jArr38, jArr32);
                bv3.m10599g(jArr36, jArr33);
                bv3.m10599g(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    bv3.m10599g(jArr36, jArr38);
                    bv3.m10599g(jArr38, jArr36);
                }
                bv3.m10593a(jArr36, jArr38, jArr33);
                bv3.m10599g(jArr38, jArr36);
                bv3.m10599g(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    bv3.m10599g(jArr38, jArr36);
                    bv3.m10599g(jArr36, jArr38);
                }
                bv3.m10593a(jArr34, jArr36, jArr32);
                bv3.m10599g(jArr36, jArr34);
                bv3.m10599g(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    bv3.m10599g(jArr36, jArr38);
                    bv3.m10599g(jArr38, jArr36);
                }
                bv3.m10593a(jArr35, jArr38, jArr34);
                bv3.m10599g(jArr38, jArr35);
                bv3.m10599g(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    bv3.m10599g(jArr38, jArr36);
                    bv3.m10599g(jArr36, jArr38);
                }
                bv3.m10593a(jArr38, jArr36, jArr35);
                bv3.m10599g(jArr36, jArr38);
                bv3.m10599g(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    bv3.m10599g(jArr36, jArr38);
                    bv3.m10599g(jArr38, jArr36);
                }
                bv3.m10593a(jArr36, jArr38, jArr34);
                bv3.m10599g(jArr38, jArr36);
                bv3.m10599g(jArr36, jArr38);
                bv3.m10599g(jArr38, jArr36);
                bv3.m10599g(jArr36, jArr38);
                bv3.m10599g(jArr38, jArr36);
                bv3.m10593a(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                bv3.m10593a(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                bv3.m10593a(jArr40, k, jArr39);
                bv3.m10601i(jArr41, k, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                bv3.m10601i(jArr43, jArr41, jArr45);
                bv3.m10593a(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                bv3.m10601i(jArr43, jArr43, jArr46);
                bv3.m10593a(jArr43, jArr43, jArr40);
                bv3.m10593a(jArr43, jArr43, jArr46);
                bv3.m10598f(jArr42, jArr43, 4);
                bv3.m10596d(jArr42);
                bv3.m10593a(jArr43, jArr40, jArr3);
                bv3.m10600h(jArr43, jArr43, jArr3);
                bv3.m10593a(jArr44, jArr41, jArr46);
                bv3.m10601i(jArr43, jArr43, jArr44);
                bv3.m10599g(jArr43, jArr43);
                if (gu3.m13539b(bv3.m10602j(jArr42), bv3.m10602j(jArr43))) {
                    return bv3.m10602j(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(cv3.m11208a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m17294b() {
        byte[] a = jv3.m15081a(32);
        a[0] = (byte) (a[0] | 7);
        byte b = a[31] & 63;
        a[31] = (byte) b;
        a[31] = (byte) (b | C8843b4.f36445d);
        return a;
    }

    /* renamed from: c */
    public static byte[] m17295c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m17293a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
