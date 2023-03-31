package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lw3 extends sw3 {

    /* renamed from: f */
    private final byte[] f12968f;

    /* renamed from: g */
    private int f12969g;

    /* renamed from: h */
    private int f12970h;

    /* renamed from: i */
    private int f12971i;

    /* renamed from: j */
    private final int f12972j;

    /* renamed from: k */
    private int f12973k;

    /* renamed from: l */
    private int f12974l = Integer.MAX_VALUE;

    /* synthetic */ lw3(byte[] bArr, int i, int i2, boolean z, kw3 kw3) {
        super((rw3) null);
        this.f12968f = bArr;
        this.f12969g = i2 + i;
        this.f12971i = i;
        this.f12972j = i;
    }

    /* renamed from: D */
    private final void m16262D() {
        int i = this.f12969g + this.f12970h;
        this.f12969g = i;
        int i2 = i - this.f12972j;
        int i3 = this.f12974l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f12970h = i4;
            this.f12969g = i - i4;
            return;
        }
        this.f12970h = 0;
    }

    /* renamed from: A */
    public final String mo12176A() throws IOException {
        int G = mo12181G();
        if (G > 0) {
            int i = this.f12969g;
            int i2 = this.f12971i;
            if (G <= i - i2) {
                String h = d14.m11287h(this.f12968f, i2, G);
                this.f12971i += G;
                return h;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw ey3.m12342f();
        }
        throw ey3.m12345j();
    }

    /* renamed from: B */
    public final void mo12177B(int i) throws ey3 {
        if (this.f12973k != i) {
            throw ey3.m12338b();
        }
    }

    /* renamed from: C */
    public final void mo12178C(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f12969g;
            int i3 = this.f12971i;
            if (i <= i2 - i3) {
                this.f12971i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw ey3.m12342f();
        }
        throw ey3.m12345j();
    }

    /* renamed from: E */
    public final byte mo12179E() throws IOException {
        int i = this.f12971i;
        if (i != this.f12969g) {
            byte[] bArr = this.f12968f;
            this.f12971i = i + 1;
            return bArr[i];
        }
        throw ey3.m12345j();
    }

    /* renamed from: F */
    public final int mo12180F() throws IOException {
        int i = this.f12971i;
        if (this.f12969g - i >= 4) {
            byte[] bArr = this.f12968f;
            this.f12971i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw ey3.m12345j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12181G() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f12971i
            int r1 = r5.f12969g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f12968f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f12971i = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f12971i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo12184J()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lw3.mo12181G():int");
    }

    /* renamed from: H */
    public final long mo12182H() throws IOException {
        int i = this.f12971i;
        if (this.f12969g - i >= 8) {
            byte[] bArr = this.f12968f;
            this.f12971i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw ey3.m12345j();
    }

    /* renamed from: I */
    public final long mo12183I() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f12971i;
        int i2 = this.f12969g;
        if (i2 != i) {
            byte[] bArr = this.f12968f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f12971i = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ C8843b4.f36445d;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ C8843b4.f36445d);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ C8843b4.f36445d;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f12971i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f12971i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f12971i = i4;
                    return j;
                }
                j = (long) b;
                this.f12971i = i4;
                return j;
            }
        }
        return mo12184J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final long mo12184J() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte E = mo12179E();
            j |= ((long) (E & Byte.MAX_VALUE)) << i;
            if ((E & C8843b4.f36445d) == 0) {
                return j;
            }
        }
        throw ey3.m12341e();
    }

    /* renamed from: a */
    public final void mo12185a(int i) {
        this.f12974l = i;
        m16262D();
    }

    /* renamed from: b */
    public final boolean mo12186b() throws IOException {
        return this.f12971i == this.f12969g;
    }

    /* renamed from: c */
    public final boolean mo12187c() throws IOException {
        return mo12183I() != 0;
    }

    /* renamed from: d */
    public final boolean mo12188d(int i) throws IOException {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f12969g - this.f12971i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f12968f;
                    int i4 = this.f12971i;
                    this.f12971i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw ey3.m12341e();
            }
            while (i3 < 10) {
                if (mo12179E() < 0) {
                    i3++;
                }
            }
            throw ey3.m12341e();
            return true;
        } else if (i2 == 1) {
            mo12178C(8);
            return true;
        } else if (i2 == 2) {
            mo12178C(mo12181G());
            return true;
        } else if (i2 == 3) {
            do {
                r = mo12198r();
                if (r == 0 || !mo12188d(r)) {
                    mo12177B(((i >>> 3) << 3) | 4);
                }
                r = mo12198r();
                break;
            } while (!mo12188d(r));
            mo12177B(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo12178C(4);
                return true;
            }
            throw ey3.m12337a();
        }
    }

    /* renamed from: i */
    public final double mo12189i() throws IOException {
        return Double.longBitsToDouble(mo12182H());
    }

    /* renamed from: j */
    public final float mo12190j() throws IOException {
        return Float.intBitsToFloat(mo12180F());
    }

    /* renamed from: k */
    public final int mo12191k() {
        return this.f12971i - this.f12972j;
    }

    /* renamed from: l */
    public final int mo12192l(int i) throws ey3 {
        if (i >= 0) {
            int i2 = i + (this.f12971i - this.f12972j);
            if (i2 >= 0) {
                int i3 = this.f12974l;
                if (i2 <= i3) {
                    this.f12974l = i2;
                    m16262D();
                    return i3;
                }
                throw ey3.m12345j();
            }
            throw ey3.m12343g();
        }
        throw ey3.m12342f();
    }

    /* renamed from: m */
    public final int mo12193m() throws IOException {
        return mo12181G();
    }

    /* renamed from: n */
    public final int mo12194n() throws IOException {
        return mo12180F();
    }

    /* renamed from: o */
    public final int mo12195o() throws IOException {
        return mo12181G();
    }

    /* renamed from: p */
    public final int mo12196p() throws IOException {
        return mo12180F();
    }

    /* renamed from: q */
    public final int mo12197q() throws IOException {
        return sw3.m20669e(mo12181G());
    }

    /* renamed from: r */
    public final int mo12198r() throws IOException {
        if (mo12186b()) {
            this.f12973k = 0;
            return 0;
        }
        int G = mo12181G();
        this.f12973k = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw ey3.m12339c();
    }

    /* renamed from: s */
    public final int mo12199s() throws IOException {
        return mo12181G();
    }

    /* renamed from: t */
    public final long mo12200t() throws IOException {
        return mo12182H();
    }

    /* renamed from: u */
    public final long mo12201u() throws IOException {
        return mo12183I();
    }

    /* renamed from: v */
    public final long mo12202v() throws IOException {
        return mo12182H();
    }

    /* renamed from: w */
    public final long mo12203w() throws IOException {
        return sw3.m20670f(mo12183I());
    }

    /* renamed from: x */
    public final long mo12204x() throws IOException {
        return mo12183I();
    }

    /* renamed from: y */
    public final jw3 mo12205y() throws IOException {
        int G = mo12181G();
        if (G > 0) {
            int i = this.f12969g;
            int i2 = this.f12971i;
            if (G <= i - i2) {
                jw3 L = jw3.m15087L(this.f12968f, i2, G);
                this.f12971i += G;
                return L;
            }
        }
        if (G == 0) {
            return jw3.f11808b;
        }
        if (G > 0) {
            int i3 = this.f12969g;
            int i4 = this.f12971i;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.f12971i = i5;
                return jw3.m15090O(Arrays.copyOfRange(this.f12968f, i4, i5));
            }
        }
        if (G <= 0) {
            throw ey3.m12342f();
        }
        throw ey3.m12345j();
    }

    /* renamed from: z */
    public final String mo12206z() throws IOException {
        int G = mo12181G();
        if (G > 0) {
            int i = this.f12969g;
            int i2 = this.f12971i;
            if (G <= i - i2) {
                String str = new String(this.f12968f, i2, G, cy3.f7982b);
                this.f12971i += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw ey3.m12342f();
        }
        throw ey3.m12345j();
    }
}
