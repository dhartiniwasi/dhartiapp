package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3577nm {
    /* renamed from: a */
    public static byte[] m26312a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = C3477kl.f22298b;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    byte[][] bArr5 = C3477kl.f22297a;
                    if (!C3411il.m25822b(bArr5[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(C3247dm.m25434a(bArr5[i2])));
                    }
                }
                long[] k = C3214cm.m25354k(copyOf2);
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
                        C3477kl.m26006a(jArr4, jArr2, i6);
                        C3477kl.m26006a(jArr5, jArr3, i6);
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
                        C3214cm.m25352i(jArr4, jArr4, jArr5);
                        C3214cm.m25351h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        C3214cm.m25352i(jArr2, jArr2, jArr3);
                        C3214cm.m25351h(jArr3, copyOf4, jArr3);
                        C3214cm.m25345b(jArr13, jArr2, jArr5);
                        C3214cm.m25345b(jArr14, jArr4, jArr3);
                        C3214cm.m25348e(jArr13);
                        C3214cm.m25347d(jArr13);
                        C3214cm.m25348e(jArr14);
                        C3214cm.m25347d(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        C3214cm.m25352i(jArr13, jArr13, jArr14);
                        C3214cm.m25351h(jArr14, copyOf4, jArr14);
                        C3214cm.m25350g(jArr17, jArr13);
                        C3214cm.m25350g(jArr16, jArr14);
                        C3214cm.m25345b(jArr14, jArr16, k);
                        C3214cm.m25348e(jArr14);
                        C3214cm.m25347d(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        C3214cm.m25350g(jArr11, jArr4);
                        C3214cm.m25350g(jArr12, jArr5);
                        C3214cm.m25345b(jArr8, jArr11, jArr12);
                        C3214cm.m25348e(jArr8);
                        C3214cm.m25347d(jArr8);
                        C3214cm.m25351h(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        C3214cm.m25349f(jArr19, jArr12, 121665);
                        C3214cm.m25347d(jArr19);
                        C3214cm.m25352i(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        C3214cm.m25345b(jArr20, jArr12, jArr19);
                        C3214cm.m25348e(jArr20);
                        C3214cm.m25347d(jArr20);
                        int i10 = i9;
                        C3477kl.m26006a(jArr8, jArr6, i10);
                        C3477kl.m26006a(jArr20, jArr7, i10);
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
                C3214cm.m25350g(jArr28, jArr5);
                C3214cm.m25350g(jArr38, jArr28);
                C3214cm.m25350g(jArr36, jArr38);
                C3214cm.m25344a(jArr29, jArr36, jArr5);
                C3214cm.m25344a(jArr30, jArr29, jArr28);
                C3214cm.m25350g(jArr36, jArr30);
                C3214cm.m25344a(jArr31, jArr36, jArr29);
                C3214cm.m25350g(jArr36, jArr31);
                C3214cm.m25350g(jArr38, jArr36);
                C3214cm.m25350g(jArr36, jArr38);
                C3214cm.m25350g(jArr38, jArr36);
                C3214cm.m25350g(jArr36, jArr38);
                C3214cm.m25344a(jArr32, jArr36, jArr31);
                C3214cm.m25350g(jArr36, jArr32);
                C3214cm.m25350g(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    C3214cm.m25350g(jArr36, jArr38);
                    C3214cm.m25350g(jArr38, jArr36);
                }
                C3214cm.m25344a(jArr33, jArr38, jArr32);
                C3214cm.m25350g(jArr36, jArr33);
                C3214cm.m25350g(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    C3214cm.m25350g(jArr36, jArr38);
                    C3214cm.m25350g(jArr38, jArr36);
                }
                C3214cm.m25344a(jArr36, jArr38, jArr33);
                C3214cm.m25350g(jArr38, jArr36);
                C3214cm.m25350g(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    C3214cm.m25350g(jArr38, jArr36);
                    C3214cm.m25350g(jArr36, jArr38);
                }
                C3214cm.m25344a(jArr34, jArr36, jArr32);
                C3214cm.m25350g(jArr36, jArr34);
                C3214cm.m25350g(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    C3214cm.m25350g(jArr36, jArr38);
                    C3214cm.m25350g(jArr38, jArr36);
                }
                C3214cm.m25344a(jArr35, jArr38, jArr34);
                C3214cm.m25350g(jArr38, jArr35);
                C3214cm.m25350g(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    C3214cm.m25350g(jArr38, jArr36);
                    C3214cm.m25350g(jArr36, jArr38);
                }
                C3214cm.m25344a(jArr38, jArr36, jArr35);
                C3214cm.m25350g(jArr36, jArr38);
                C3214cm.m25350g(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    C3214cm.m25350g(jArr36, jArr38);
                    C3214cm.m25350g(jArr38, jArr36);
                }
                C3214cm.m25344a(jArr36, jArr38, jArr34);
                C3214cm.m25350g(jArr38, jArr36);
                C3214cm.m25350g(jArr36, jArr38);
                C3214cm.m25350g(jArr38, jArr36);
                C3214cm.m25350g(jArr36, jArr38);
                C3214cm.m25350g(jArr38, jArr36);
                C3214cm.m25344a(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                C3214cm.m25344a(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                C3214cm.m25344a(jArr40, k, jArr39);
                C3214cm.m25352i(jArr41, k, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                C3214cm.m25352i(jArr43, jArr41, jArr45);
                C3214cm.m25344a(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                C3214cm.m25352i(jArr43, jArr43, jArr46);
                C3214cm.m25344a(jArr43, jArr43, jArr40);
                C3214cm.m25344a(jArr43, jArr43, jArr46);
                C3214cm.m25349f(jArr42, jArr43, 4);
                C3214cm.m25347d(jArr42);
                C3214cm.m25344a(jArr43, jArr40, jArr3);
                C3214cm.m25351h(jArr43, jArr43, jArr3);
                C3214cm.m25344a(jArr44, jArr41, jArr46);
                C3214cm.m25352i(jArr43, jArr43, jArr44);
                C3214cm.m25350g(jArr43, jArr43);
                if (C3411il.m25822b(C3214cm.m25353j(jArr42), C3214cm.m25353j(jArr43))) {
                    return C3214cm.m25353j(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(C3247dm.m25434a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m26313b(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m26312a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
