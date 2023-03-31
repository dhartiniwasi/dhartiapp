package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wv3 {
    /* renamed from: a */
    static int m22914a(byte[] bArr, int i, vv3 vv3) throws ey3 {
        int j = m22923j(bArr, i, vv3);
        int i2 = vv3.f19249a;
        if (i2 < 0) {
            throw ey3.m12342f();
        } else if (i2 > bArr.length - j) {
            throw ey3.m12345j();
        } else if (i2 == 0) {
            vv3.f19251c = jw3.f11808b;
            return j;
        } else {
            vv3.f19251c = jw3.m15087L(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m22915b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m22916c(wz3 wz3, byte[] bArr, int i, int i2, int i3, vv3 vv3) throws IOException {
        fz3 fz3 = (fz3) wz3;
        Object a = fz3.mo10359a();
        int I = fz3.mo10358I(a, bArr, i, i2, i3, vv3);
        fz3.mo10363e(a);
        vv3.f19251c = a;
        return I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m22917d(com.google.android.gms.internal.ads.wz3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.vv3 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m22924k(r8, r7, r0, r10)
            int r8 = r10.f19249a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo10359a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo10368j(r1, r2, r3, r4, r5)
            r6.mo10363e(r9)
            r10.f19251c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.ey3 r6 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wv3.m22917d(com.google.android.gms.internal.ads.wz3, byte[], int, int, com.google.android.gms.internal.ads.vv3):int");
    }

    /* renamed from: e */
    static int m22918e(wz3 wz3, int i, byte[] bArr, int i2, int i3, by3 by3, vv3 vv3) throws IOException {
        int d = m22917d(wz3, bArr, i2, i3, vv3);
        by3.add(vv3.f19251c);
        while (d < i3) {
            int j = m22923j(bArr, d, vv3);
            if (i != vv3.f19249a) {
                break;
            }
            d = m22917d(wz3, bArr, j, i3, vv3);
            by3.add(vv3.f19251c);
        }
        return d;
    }

    /* renamed from: f */
    static int m22919f(byte[] bArr, int i, by3 by3, vv3 vv3) throws IOException {
        tx3 tx3 = (tx3) by3;
        int j = m22923j(bArr, i, vv3);
        int i2 = vv3.f19249a + j;
        while (j < i2) {
            j = m22923j(bArr, j, vv3);
            tx3.mo14422i0(vv3.f19249a);
        }
        if (j == i2) {
            return j;
        }
        throw ey3.m12345j();
    }

    /* renamed from: g */
    static int m22920g(byte[] bArr, int i, vv3 vv3) throws ey3 {
        int j = m22923j(bArr, i, vv3);
        int i2 = vv3.f19249a;
        if (i2 < 0) {
            throw ey3.m12342f();
        } else if (i2 == 0) {
            vv3.f19251c = "";
            return j;
        } else {
            vv3.f19251c = new String(bArr, j, i2, cy3.f7982b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m22921h(byte[] bArr, int i, vv3 vv3) throws ey3 {
        int j = m22923j(bArr, i, vv3);
        int i2 = vv3.f19249a;
        if (i2 < 0) {
            throw ey3.m12342f();
        } else if (i2 == 0) {
            vv3.f19251c = "";
            return j;
        } else {
            vv3.f19251c = d14.m11287h(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m22922i(int i, byte[] bArr, int i2, int i3, o04 o04, vv3 vv3) throws ey3 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m22926m(bArr, i2, vv3);
                o04.mo12785h(i, Long.valueOf(vv3.f19250b));
                return m;
            } else if (i4 == 1) {
                o04.mo12785h(i, Long.valueOf(m22927n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m22923j(bArr, i2, vv3);
                int i5 = vv3.f19249a;
                if (i5 < 0) {
                    throw ey3.m12342f();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        o04.mo12785h(i, jw3.f11808b);
                    } else {
                        o04.mo12785h(i, jw3.m15087L(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw ey3.m12345j();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                o04 e = o04.m17406e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m22923j(bArr, i2, vv3);
                    int i8 = vv3.f19249a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m22922i(i8, bArr, j2, i3, e, vv3);
                }
                if (i2 > i3 || i7 != i6) {
                    throw ey3.m12343g();
                }
                o04.mo12785h(i, e);
                return i2;
            } else if (i4 == 5) {
                o04.mo12785h(i, Integer.valueOf(m22915b(bArr, i2)));
                return i2 + 4;
            } else {
                throw ey3.m12339c();
            }
        } else {
            throw ey3.m12339c();
        }
    }

    /* renamed from: j */
    static int m22923j(byte[] bArr, int i, vv3 vv3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m22924k(b, bArr, i2, vv3);
        }
        vv3.f19249a = b;
        return i2;
    }

    /* renamed from: k */
    static int m22924k(int i, byte[] bArr, int i2, vv3 vv3) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            vv3.f19249a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            vv3.f19249a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            vv3.f19249a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            vv3.f19249a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                vv3.f19249a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m22925l(int i, byte[] bArr, int i2, int i3, by3 by3, vv3 vv3) {
        tx3 tx3 = (tx3) by3;
        int j = m22923j(bArr, i2, vv3);
        tx3.mo14422i0(vv3.f19249a);
        while (j < i3) {
            int j2 = m22923j(bArr, j, vv3);
            if (i != vv3.f19249a) {
                break;
            }
            j = m22923j(bArr, j2, vv3);
            tx3.mo14422i0(vv3.f19249a);
        }
        return j;
    }

    /* renamed from: m */
    static int m22926m(byte[] bArr, int i, vv3 vv3) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            vv3.f19250b = j;
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
        vv3.f19250b = j2;
        return i3;
    }

    /* renamed from: n */
    static long m22927n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
