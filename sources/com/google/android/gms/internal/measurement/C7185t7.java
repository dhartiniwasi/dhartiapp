package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7185t7 {
    /* renamed from: a */
    static int m40930a(byte[] bArr, int i, C7169s7 s7Var) throws C7139q9 {
        int j = m40939j(bArr, i, s7Var);
        int i2 = s7Var.f32049a;
        if (i2 < 0) {
            throw C7139q9.m40665d();
        } else if (i2 > bArr.length - j) {
            throw C7139q9.m40667f();
        } else if (i2 == 0) {
            s7Var.f32051c = C6977g8.f31702b;
            return j;
        } else {
            s7Var.f32051c = C6977g8.m40061s(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m40931b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m40932c(C7268ya yaVar, byte[] bArr, int i, int i2, int i3, C7169s7 s7Var) throws IOException {
        Object a = yaVar.mo23782a();
        int n = m40943n(a, yaVar, bArr, i, i2, i3, s7Var);
        yaVar.mo23786e(a);
        s7Var.f32051c = a;
        return n;
    }

    /* renamed from: d */
    static int m40933d(C7268ya yaVar, byte[] bArr, int i, int i2, C7169s7 s7Var) throws IOException {
        Object a = yaVar.mo23782a();
        int o = m40944o(a, yaVar, bArr, i, i2, s7Var);
        yaVar.mo23786e(a);
        s7Var.f32051c = a;
        return o;
    }

    /* renamed from: e */
    static int m40934e(C7268ya yaVar, int i, byte[] bArr, int i2, int i3, C7091n9 n9Var, C7169s7 s7Var) throws IOException {
        int d = m40933d(yaVar, bArr, i2, i3, s7Var);
        n9Var.add(s7Var.f32051c);
        while (d < i3) {
            int j = m40939j(bArr, d, s7Var);
            if (i != s7Var.f32049a) {
                break;
            }
            d = m40933d(yaVar, bArr, j, i3, s7Var);
            n9Var.add(s7Var.f32051c);
        }
        return d;
    }

    /* renamed from: f */
    static int m40935f(byte[] bArr, int i, C7091n9 n9Var, C7169s7 s7Var) throws IOException {
        C7011i9 i9Var = (C7011i9) n9Var;
        int j = m40939j(bArr, i, s7Var);
        int i2 = s7Var.f32049a + j;
        while (j < i2) {
            j = m40939j(bArr, j, s7Var);
            i9Var.mo23531i0(s7Var.f32049a);
        }
        if (j == i2) {
            return j;
        }
        throw C7139q9.m40667f();
    }

    /* renamed from: g */
    static int m40936g(byte[] bArr, int i, C7169s7 s7Var) throws C7139q9 {
        int j = m40939j(bArr, i, s7Var);
        int i2 = s7Var.f32049a;
        if (i2 < 0) {
            throw C7139q9.m40665d();
        } else if (i2 == 0) {
            s7Var.f32051c = "";
            return j;
        } else {
            s7Var.f32051c = new String(bArr, j, i2, C7107o9.f31926b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m40937h(byte[] bArr, int i, C7169s7 s7Var) throws C7139q9 {
        int j = m40939j(bArr, i, s7Var);
        int i2 = s7Var.f32049a;
        if (i2 < 0) {
            throw C7139q9.m40665d();
        } else if (i2 == 0) {
            s7Var.f32051c = "";
            return j;
        } else {
            s7Var.f32051c = C6981gc.m40078d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m40938i(int i, byte[] bArr, int i2, int i3, C7157rb rbVar, C7169s7 s7Var) throws C7139q9 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m40942m(bArr, i2, s7Var);
                rbVar.mo23827j(i, Long.valueOf(s7Var.f32050b));
                return m;
            } else if (i4 == 1) {
                rbVar.mo23827j(i, Long.valueOf(m40945p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m40939j(bArr, i2, s7Var);
                int i5 = s7Var.f32049a;
                if (i5 < 0) {
                    throw C7139q9.m40665d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        rbVar.mo23827j(i, C6977g8.f31702b);
                    } else {
                        rbVar.mo23827j(i, C6977g8.m40061s(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw C7139q9.m40667f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C7157rb f = C7157rb.m40815f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m40939j(bArr, i2, s7Var);
                    int i8 = s7Var.f32049a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m40938i(i8, bArr, j2, i3, f, s7Var);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C7139q9.m40666e();
                }
                rbVar.mo23827j(i, f);
                return i2;
            } else if (i4 == 5) {
                rbVar.mo23827j(i, Integer.valueOf(m40931b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C7139q9.m40663b();
            }
        } else {
            throw C7139q9.m40663b();
        }
    }

    /* renamed from: j */
    static int m40939j(byte[] bArr, int i, C7169s7 s7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m40940k(b, bArr, i2, s7Var);
        }
        s7Var.f32049a = b;
        return i2;
    }

    /* renamed from: k */
    static int m40940k(int i, byte[] bArr, int i2, C7169s7 s7Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            s7Var.f32049a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            s7Var.f32049a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            s7Var.f32049a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            s7Var.f32049a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                s7Var.f32049a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m40941l(int i, byte[] bArr, int i2, int i3, C7091n9 n9Var, C7169s7 s7Var) {
        C7011i9 i9Var = (C7011i9) n9Var;
        int j = m40939j(bArr, i2, s7Var);
        i9Var.mo23531i0(s7Var.f32049a);
        while (j < i3) {
            int j2 = m40939j(bArr, j, s7Var);
            if (i != s7Var.f32049a) {
                break;
            }
            j = m40939j(bArr, j2, s7Var);
            i9Var.mo23531i0(s7Var.f32049a);
        }
        return j;
    }

    /* renamed from: m */
    static int m40942m(byte[] bArr, int i, C7169s7 s7Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            s7Var.f32050b = j;
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
        s7Var.f32050b = j2;
        return i3;
    }

    /* renamed from: n */
    static int m40943n(Object obj, C7268ya yaVar, byte[] bArr, int i, int i2, int i3, C7169s7 s7Var) throws IOException {
        int J = ((C7140qa) yaVar).mo23781J(obj, bArr, i, i2, i3, s7Var);
        s7Var.f32051c = obj;
        return J;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m40944o(java.lang.Object r6, com.google.android.gms.internal.measurement.C7268ya r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.C7169s7 r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m40940k(r9, r8, r0, r11)
            int r9 = r11.f32049a
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
            r0.mo23790i(r1, r2, r3, r4, r5)
            r11.f32051c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.q9 r6 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7185t7.m40944o(java.lang.Object, com.google.android.gms.internal.measurement.ya, byte[], int, int, com.google.android.gms.internal.measurement.s7):int");
    }

    /* renamed from: p */
    static long m40945p(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
