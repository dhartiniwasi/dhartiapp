package com.google.android.gms.internal.p026firebaseauthapi;

import com.startapp.C8843b4;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3391i1 extends C3457k1 {

    /* renamed from: f */
    private final byte[] f22126f;

    /* renamed from: g */
    private int f22127g;

    /* renamed from: h */
    private int f22128h;

    /* renamed from: i */
    private int f22129i;

    /* renamed from: j */
    private int f22130j;

    /* renamed from: k */
    private int f22131k = Integer.MAX_VALUE;

    /* synthetic */ C3391i1(byte[] bArr, int i, int i2, boolean z, C3358h1 h1Var) {
        super((C3424j1) null);
        this.f22126f = bArr;
        this.f22127g = i2;
        this.f22129i = 0;
    }

    /* renamed from: v */
    private final void m25740v() {
        int i = this.f22127g + this.f22128h;
        this.f22127g = i;
        int i2 = this.f22131k;
        if (i > i2) {
            int i3 = i - i2;
            this.f22128h = i3;
            this.f22127g = i - i3;
            return;
        }
        this.f22128h = 0;
    }

    /* renamed from: a */
    public final int mo16123a() {
        return this.f22129i;
    }

    /* renamed from: b */
    public final int mo16124b(int i) throws C3689r2 {
        if (i >= 0) {
            int i2 = i + this.f22129i;
            if (i2 >= 0) {
                int i3 = this.f22131k;
                if (i2 <= i3) {
                    this.f22131k = i2;
                    m25740v();
                    return i3;
                }
                throw C3689r2.m26703i();
            }
            throw C3689r2.m26702g();
        }
        throw C3689r2.m26701f();
    }

    /* renamed from: c */
    public final int mo16125c() throws IOException {
        if (mo16131i()) {
            this.f22130j = 0;
            return 0;
        }
        int q = mo16136q();
        this.f22130j = q;
        if ((q >>> 3) != 0) {
            return q;
        }
        throw C3689r2.m26698c();
    }

    /* renamed from: d */
    public final C3325g1 mo16126d() throws IOException {
        int q = mo16136q();
        if (q > 0) {
            int i = this.f22127g;
            int i2 = this.f22129i;
            if (q <= i - i2) {
                C3325g1 v = C3325g1.m25614v(this.f22126f, i2, q);
                this.f22129i += q;
                return v;
            }
        }
        if (q == 0) {
            return C3325g1.f22056b;
        }
        if (q > 0) {
            int i3 = this.f22127g;
            int i4 = this.f22129i;
            if (q <= i3 - i4) {
                int i5 = q + i4;
                this.f22129i = i5;
                return C3325g1.m25616x(Arrays.copyOfRange(this.f22126f, i4, i5));
            }
        }
        if (q <= 0) {
            throw C3689r2.m26701f();
        }
        throw C3689r2.m26703i();
    }

    /* renamed from: e */
    public final String mo16127e() throws IOException {
        int q = mo16136q();
        if (q > 0) {
            int i = this.f22127g;
            int i2 = this.f22129i;
            if (q <= i - i2) {
                String str = new String(this.f22126f, i2, q, C3623p2.f22496b);
                this.f22129i += q;
                return str;
            }
        }
        if (q == 0) {
            return "";
        }
        if (q < 0) {
            throw C3689r2.m26701f();
        }
        throw C3689r2.m26703i();
    }

    /* renamed from: f */
    public final String mo16128f() throws IOException {
        int q = mo16136q();
        if (q > 0) {
            int i = this.f22127g;
            int i2 = this.f22129i;
            if (q <= i - i2) {
                String d = C3395i5.m25771d(this.f22126f, i2, q);
                this.f22129i += q;
                return d;
            }
        }
        if (q == 0) {
            return "";
        }
        if (q <= 0) {
            throw C3689r2.m26701f();
        }
        throw C3689r2.m26703i();
    }

    /* renamed from: g */
    public final void mo16129g(int i) throws C3689r2 {
        if (this.f22130j != i) {
            throw C3689r2.m26697b();
        }
    }

    /* renamed from: h */
    public final void mo16130h(int i) {
        this.f22131k = i;
        m25740v();
    }

    /* renamed from: i */
    public final boolean mo16131i() throws IOException {
        return this.f22129i == this.f22127g;
    }

    /* renamed from: j */
    public final boolean mo16132j() throws IOException {
        return mo16138s() != 0;
    }

    /* renamed from: k */
    public final boolean mo16133k(int i) throws IOException {
        int c;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f22127g - this.f22129i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f22126f;
                    int i4 = this.f22129i;
                    this.f22129i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C3689r2.m26700e();
            }
            while (i3 < 10) {
                if (mo16134o() < 0) {
                    i3++;
                }
            }
            throw C3689r2.m26700e();
            return true;
        } else if (i2 == 1) {
            mo16140u(8);
            return true;
        } else if (i2 == 2) {
            mo16140u(mo16136q());
            return true;
        } else if (i2 == 3) {
            do {
                c = mo16125c();
                if (c == 0 || !mo16133k(c)) {
                    mo16129g(((i >>> 3) << 3) | 4);
                }
                c = mo16125c();
                break;
            } while (!mo16133k(c));
            mo16129g(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo16140u(4);
                return true;
            }
            throw C3689r2.m26696a();
        }
    }

    /* renamed from: o */
    public final byte mo16134o() throws IOException {
        int i = this.f22129i;
        if (i != this.f22127g) {
            byte[] bArr = this.f22126f;
            this.f22129i = i + 1;
            return bArr[i];
        }
        throw C3689r2.m26703i();
    }

    /* renamed from: p */
    public final int mo16135p() throws IOException {
        int i = this.f22129i;
        if (this.f22127g - i >= 4) {
            byte[] bArr = this.f22126f;
            this.f22129i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C3689r2.m26703i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16136q() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f22129i
            int r1 = r5.f22127g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f22126f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f22129i = r3
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
            r5.f22129i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo16139t()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3391i1.mo16136q():int");
    }

    /* renamed from: r */
    public final long mo16137r() throws IOException {
        int i = this.f22129i;
        if (this.f22127g - i >= 8) {
            byte[] bArr = this.f22126f;
            this.f22129i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C3689r2.m26703i();
    }

    /* renamed from: s */
    public final long mo16138s() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f22129i;
        int i2 = this.f22127g;
        if (i2 != i) {
            byte[] bArr = this.f22126f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f22129i = i3;
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
                                                    this.f22129i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f22129i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f22129i = i4;
                    return j;
                }
                j = (long) b;
                this.f22129i = i4;
                return j;
            }
        }
        return mo16139t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final long mo16139t() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte o = mo16134o();
            j |= ((long) (o & Byte.MAX_VALUE)) << i;
            if ((o & C8843b4.f36445d) == 0) {
                return j;
            }
        }
        throw C3689r2.m26700e();
    }

    /* renamed from: u */
    public final void mo16140u(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f22127g;
            int i3 = this.f22129i;
            if (i <= i2 - i3) {
                this.f22129i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C3689r2.m26701f();
        }
        throw C3689r2.m26703i();
    }
}
