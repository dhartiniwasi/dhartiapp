package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3753t0 {
    /* renamed from: a */
    static int m26955a(byte[] bArr, int i, C3720s0 s0Var) throws C3689r2 {
        int j = m26964j(bArr, i, s0Var);
        int i2 = s0Var.f22646a;
        if (i2 < 0) {
            throw C3689r2.m26701f();
        } else if (i2 > bArr.length - j) {
            throw C3689r2.m26703i();
        } else if (i2 == 0) {
            s0Var.f22648c = C3325g1.f22056b;
            return j;
        } else {
            s0Var.f22648c = C3325g1.m25614v(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m26956b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m26957c(C3130a4 a4Var, byte[] bArr, int i, int i2, int i3, C3720s0 s0Var) throws IOException {
        Object a = a4Var.mo15699a();
        int n = m26968n(a, a4Var, bArr, i, i2, i3, s0Var);
        a4Var.mo15703e(a);
        s0Var.f22648c = a;
        return n;
    }

    /* renamed from: d */
    static int m26958d(C3130a4 a4Var, byte[] bArr, int i, int i2, C3720s0 s0Var) throws IOException {
        Object a = a4Var.mo15699a();
        int o = m26969o(a, a4Var, bArr, i, i2, s0Var);
        a4Var.mo15703e(a);
        s0Var.f22648c = a;
        return o;
    }

    /* renamed from: e */
    static int m26959e(C3130a4 a4Var, int i, byte[] bArr, int i2, int i3, C3590o2 o2Var, C3720s0 s0Var) throws IOException {
        int d = m26958d(a4Var, bArr, i2, i3, s0Var);
        o2Var.add(s0Var.f22648c);
        while (d < i3) {
            int j = m26964j(bArr, d, s0Var);
            if (i != s0Var.f22646a) {
                break;
            }
            d = m26958d(a4Var, bArr, j, i3, s0Var);
            o2Var.add(s0Var.f22648c);
        }
        return d;
    }

    /* renamed from: f */
    static int m26960f(byte[] bArr, int i, C3590o2 o2Var, C3720s0 s0Var) throws IOException {
        C3458k2 k2Var = (C3458k2) o2Var;
        int j = m26964j(bArr, i, s0Var);
        int i2 = s0Var.f22646a + j;
        while (j < i2) {
            j = m26964j(bArr, j, s0Var);
            k2Var.mo16244f(s0Var.f22646a);
        }
        if (j == i2) {
            return j;
        }
        throw C3689r2.m26703i();
    }

    /* renamed from: g */
    static int m26961g(byte[] bArr, int i, C3720s0 s0Var) throws C3689r2 {
        int j = m26964j(bArr, i, s0Var);
        int i2 = s0Var.f22646a;
        if (i2 < 0) {
            throw C3689r2.m26701f();
        } else if (i2 == 0) {
            s0Var.f22648c = "";
            return j;
        } else {
            s0Var.f22648c = new String(bArr, j, i2, C3623p2.f22496b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m26962h(byte[] bArr, int i, C3720s0 s0Var) throws C3689r2 {
        int j = m26964j(bArr, i, s0Var);
        int i2 = s0Var.f22646a;
        if (i2 < 0) {
            throw C3689r2.m26701f();
        } else if (i2 == 0) {
            s0Var.f22648c = "";
            return j;
        } else {
            s0Var.f22648c = C3395i5.m25771d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m26963i(int i, byte[] bArr, int i2, int i3, C3757t4 t4Var, C3720s0 s0Var) throws C3689r2 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m26967m(bArr, i2, s0Var);
                t4Var.mo16804j(i, Long.valueOf(s0Var.f22647b));
                return m;
            } else if (i4 == 1) {
                t4Var.mo16804j(i, Long.valueOf(m26970p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m26964j(bArr, i2, s0Var);
                int i5 = s0Var.f22646a;
                if (i5 < 0) {
                    throw C3689r2.m26701f();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        t4Var.mo16804j(i, C3325g1.f22056b);
                    } else {
                        t4Var.mo16804j(i, C3325g1.m25614v(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw C3689r2.m26703i();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C3757t4 f = C3757t4.m26980f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m26964j(bArr, i2, s0Var);
                    int i8 = s0Var.f22646a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m26963i(i8, bArr, j2, i3, f, s0Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C3689r2.m26702g();
                }
                t4Var.mo16804j(i, f);
                return i2;
            } else if (i4 == 5) {
                t4Var.mo16804j(i, Integer.valueOf(m26956b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C3689r2.m26698c();
            }
        } else {
            throw C3689r2.m26698c();
        }
    }

    /* renamed from: j */
    static int m26964j(byte[] bArr, int i, C3720s0 s0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m26965k(b, bArr, i2, s0Var);
        }
        s0Var.f22646a = b;
        return i2;
    }

    /* renamed from: k */
    static int m26965k(int i, byte[] bArr, int i2, C3720s0 s0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            s0Var.f22646a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            s0Var.f22646a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            s0Var.f22646a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            s0Var.f22646a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                s0Var.f22646a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m26966l(int i, byte[] bArr, int i2, int i3, C3590o2 o2Var, C3720s0 s0Var) {
        C3458k2 k2Var = (C3458k2) o2Var;
        int j = m26964j(bArr, i2, s0Var);
        k2Var.mo16244f(s0Var.f22646a);
        while (j < i3) {
            int j2 = m26964j(bArr, j, s0Var);
            if (i != s0Var.f22646a) {
                break;
            }
            j = m26964j(bArr, j2, s0Var);
            k2Var.mo16244f(s0Var.f22646a);
        }
        return j;
    }

    /* renamed from: m */
    static int m26967m(byte[] bArr, int i, C3720s0 s0Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            s0Var.f22647b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        s0Var.f22647b = j2;
        return i3;
    }

    /* renamed from: n */
    static int m26968n(Object obj, C3130a4 a4Var, byte[] bArr, int i, int i2, int i3, C3720s0 s0Var) throws IOException {
        int O = ((C3690r3) a4Var).mo16666O(obj, bArr, i, i2, i3, s0Var);
        s0Var.f22648c = obj;
        return O;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m26969o(java.lang.Object r6, com.google.android.gms.internal.p026firebaseauthapi.C3130a4 r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.p026firebaseauthapi.C3720s0 r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m26965k(r9, r8, r0, r11)
            int r9 = r11.f22646a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo15706h(r1, r2, r3, r4, r5)
            r11.f22648c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.firebase-auth-api.r2 r6 = com.google.android.gms.internal.p026firebaseauthapi.C3689r2.m26703i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3753t0.m26969o(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.a4, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.s0):int");
    }

    /* renamed from: p */
    static long m26970p(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
