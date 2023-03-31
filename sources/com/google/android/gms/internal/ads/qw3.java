package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qw3 extends sw3 {

    /* renamed from: f */
    private final InputStream f16717f;

    /* renamed from: g */
    private final byte[] f16718g;

    /* renamed from: h */
    private int f16719h;

    /* renamed from: i */
    private int f16720i;

    /* renamed from: j */
    private int f16721j;

    /* renamed from: k */
    private int f16722k;

    /* renamed from: l */
    private int f16723l;

    /* renamed from: m */
    private int f16724m = Integer.MAX_VALUE;

    /* synthetic */ qw3(InputStream inputStream, int i, pw3 pw3) {
        super((rw3) null);
        cy3.m11234f(inputStream, "input");
        this.f16717f = inputStream;
        this.f16718g = new byte[4096];
        this.f16719h = 0;
        this.f16721j = 0;
        this.f16723l = 0;
    }

    /* renamed from: D */
    private final List m19429D(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f16717f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f16723l += read;
                    i2 += read;
                } else {
                    throw ey3.m12345j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: E */
    private final void m19430E() {
        int i = this.f16719h + this.f16720i;
        this.f16719h = i;
        int i2 = this.f16723l + i;
        int i3 = this.f16724m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f16720i = i4;
            this.f16719h = i - i4;
            return;
        }
        this.f16720i = 0;
    }

    /* renamed from: F */
    private final void m19431F(int i) throws IOException {
        if (m19432G(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f16723l) - this.f16721j) {
            throw ey3.m12344i();
        }
        throw ey3.m12345j();
    }

    /* renamed from: G */
    private final boolean m19432G(int i) throws IOException {
        int i2 = this.f16721j;
        int i3 = this.f16719h;
        if (i2 + i > i3) {
            int i4 = this.f16723l;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f16724m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f16718g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f16723l + i2;
                this.f16723l = i4;
                i3 = this.f16719h - i2;
                this.f16719h = i3;
                this.f16721j = 0;
            }
            try {
                int read = this.f16717f.read(this.f16718g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.f16717f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f16719h += read;
                    m19430E();
                    if (this.f16719h >= i) {
                        return true;
                    }
                    return m19432G(i);
                }
            } catch (ey3 e) {
                e.mo10047k();
                throw e;
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
    }

    /* renamed from: H */
    private final byte[] m19433H(int i, boolean z) throws IOException {
        byte[] I = m19434I(i);
        if (I != null) {
            return I;
        }
        int i2 = this.f16721j;
        int i3 = this.f16719h;
        int i4 = i3 - i2;
        this.f16723l += i3;
        this.f16721j = 0;
        this.f16719h = 0;
        List<byte[]> D = m19429D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f16718g, i2, bArr, 0, i4);
        for (byte[] bArr2 : D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: I */
    private final byte[] m19434I(int i) throws IOException {
        if (i == 0) {
            return cy3.f7984d;
        }
        if (i >= 0) {
            int i2 = this.f16723l;
            int i3 = this.f16721j;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.f16724m;
                if (i4 <= i5) {
                    int i6 = this.f16719h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f16717f.available()) {
                                return null;
                            }
                        } catch (ey3 e) {
                            e.mo10047k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f16718g, this.f16721j, bArr, 0, i6);
                    this.f16723l += this.f16719h;
                    this.f16721j = 0;
                    this.f16719h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f16717f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f16723l += read;
                                i6 += read;
                            } else {
                                throw ey3.m12345j();
                            }
                        } catch (ey3 e2) {
                            e2.mo10047k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo13611C((i5 - i2) - i3);
                throw ey3.m12345j();
            }
            throw ey3.m12344i();
        }
        throw ey3.m12342f();
    }

    /* renamed from: A */
    public final String mo12176A() throws IOException {
        byte[] bArr;
        int L = mo13614L();
        int i = this.f16721j;
        int i2 = this.f16719h;
        if (L <= i2 - i && L > 0) {
            bArr = this.f16718g;
            this.f16721j = i + L;
        } else if (L == 0) {
            return "";
        } else {
            if (L <= i2) {
                m19431F(L);
                bArr = this.f16718g;
                this.f16721j = L;
            } else {
                bArr = m19433H(L, false);
            }
            i = 0;
        }
        return d14.m11287h(bArr, i, L);
    }

    /* renamed from: B */
    public final void mo12177B(int i) throws ey3 {
        if (this.f16722k != i) {
            throw ey3.m12338b();
        }
    }

    /* renamed from: C */
    public final void mo13611C(int i) throws IOException {
        int i2 = this.f16719h;
        int i3 = this.f16721j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f16721j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f16723l;
            int i6 = i5 + i3;
            int i7 = this.f16724m;
            if (i6 + i <= i7) {
                this.f16723l = i6;
                this.f16719h = 0;
                this.f16721j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f16717f.skip(j);
                        int i8 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f16717f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (ey3 e) {
                        e.mo10047k();
                        throw e;
                    } catch (Throwable th) {
                        this.f16723l += i4;
                        m19430E();
                        throw th;
                    }
                }
                this.f16723l += i4;
                m19430E();
                if (i4 < i) {
                    int i9 = this.f16719h;
                    int i10 = i9 - this.f16721j;
                    this.f16721j = i9;
                    m19431F(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.f16719h;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f16721j = i12;
                            m19431F(1);
                        } else {
                            this.f16721j = i11;
                            return;
                        }
                    }
                }
            } else {
                mo13611C((i7 - i5) - i3);
                throw ey3.m12345j();
            }
        } else {
            throw ey3.m12342f();
        }
    }

    /* renamed from: J */
    public final byte mo13612J() throws IOException {
        if (this.f16721j == this.f16719h) {
            m19431F(1);
        }
        byte[] bArr = this.f16718g;
        int i = this.f16721j;
        this.f16721j = i + 1;
        return bArr[i];
    }

    /* renamed from: K */
    public final int mo13613K() throws IOException {
        int i = this.f16721j;
        if (this.f16719h - i < 4) {
            m19431F(4);
            i = this.f16721j;
        }
        byte[] bArr = this.f16718g;
        this.f16721j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13614L() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f16721j
            int r1 = r5.f16719h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f16718g
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f16721j = r3
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
            r5.f16721j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo13617O()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qw3.mo13614L():int");
    }

    /* renamed from: M */
    public final long mo13615M() throws IOException {
        int i = this.f16721j;
        if (this.f16719h - i < 8) {
            m19431F(8);
            i = this.f16721j;
        }
        byte[] bArr = this.f16718g;
        this.f16721j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: N */
    public final long mo13616N() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f16721j;
        int i2 = this.f16719h;
        if (i2 != i) {
            byte[] bArr = this.f16718g;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f16721j = i3;
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
                                                    this.f16721j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f16721j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f16721j = i4;
                    return j;
                }
                j = (long) b;
                this.f16721j = i4;
                return j;
            }
        }
        return mo13617O();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final long mo13617O() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte J = mo13612J();
            j |= ((long) (J & Byte.MAX_VALUE)) << i;
            if ((J & C8843b4.f36445d) == 0) {
                return j;
            }
        }
        throw ey3.m12341e();
    }

    /* renamed from: a */
    public final void mo12185a(int i) {
        this.f16724m = i;
        m19430E();
    }

    /* renamed from: b */
    public final boolean mo12186b() throws IOException {
        return this.f16721j == this.f16719h && !m19432G(1);
    }

    /* renamed from: c */
    public final boolean mo12187c() throws IOException {
        return mo13616N() != 0;
    }

    /* renamed from: d */
    public final boolean mo12188d(int i) throws IOException {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f16719h - this.f16721j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f16718g;
                    int i4 = this.f16721j;
                    this.f16721j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw ey3.m12341e();
            }
            while (i3 < 10) {
                if (mo13612J() < 0) {
                    i3++;
                }
            }
            throw ey3.m12341e();
            return true;
        } else if (i2 == 1) {
            mo13611C(8);
            return true;
        } else if (i2 == 2) {
            mo13611C(mo13614L());
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
                mo13611C(4);
                return true;
            }
            throw ey3.m12337a();
        }
    }

    /* renamed from: i */
    public final double mo12189i() throws IOException {
        return Double.longBitsToDouble(mo13615M());
    }

    /* renamed from: j */
    public final float mo12190j() throws IOException {
        return Float.intBitsToFloat(mo13613K());
    }

    /* renamed from: k */
    public final int mo12191k() {
        return this.f16723l + this.f16721j;
    }

    /* renamed from: l */
    public final int mo12192l(int i) throws ey3 {
        if (i >= 0) {
            int i2 = i + this.f16723l + this.f16721j;
            int i3 = this.f16724m;
            if (i2 <= i3) {
                this.f16724m = i2;
                m19430E();
                return i3;
            }
            throw ey3.m12345j();
        }
        throw ey3.m12342f();
    }

    /* renamed from: m */
    public final int mo12193m() throws IOException {
        return mo13614L();
    }

    /* renamed from: n */
    public final int mo12194n() throws IOException {
        return mo13613K();
    }

    /* renamed from: o */
    public final int mo12195o() throws IOException {
        return mo13614L();
    }

    /* renamed from: p */
    public final int mo12196p() throws IOException {
        return mo13613K();
    }

    /* renamed from: q */
    public final int mo12197q() throws IOException {
        return sw3.m20669e(mo13614L());
    }

    /* renamed from: r */
    public final int mo12198r() throws IOException {
        if (mo12186b()) {
            this.f16722k = 0;
            return 0;
        }
        int L = mo13614L();
        this.f16722k = L;
        if ((L >>> 3) != 0) {
            return L;
        }
        throw ey3.m12339c();
    }

    /* renamed from: s */
    public final int mo12199s() throws IOException {
        return mo13614L();
    }

    /* renamed from: t */
    public final long mo12200t() throws IOException {
        return mo13615M();
    }

    /* renamed from: u */
    public final long mo12201u() throws IOException {
        return mo13616N();
    }

    /* renamed from: v */
    public final long mo12202v() throws IOException {
        return mo13615M();
    }

    /* renamed from: w */
    public final long mo12203w() throws IOException {
        return sw3.m20670f(mo13616N());
    }

    /* renamed from: x */
    public final long mo12204x() throws IOException {
        return mo13616N();
    }

    /* renamed from: y */
    public final jw3 mo12205y() throws IOException {
        int L = mo13614L();
        int i = this.f16719h;
        int i2 = this.f16721j;
        if (L <= i - i2 && L > 0) {
            jw3 L2 = jw3.m15087L(this.f16718g, i2, L);
            this.f16721j += L;
            return L2;
        } else if (L == 0) {
            return jw3.f11808b;
        } else {
            byte[] I = m19434I(L);
            if (I != null) {
                return jw3.m15086K(I);
            }
            int i3 = this.f16721j;
            int i4 = this.f16719h;
            int i5 = i4 - i3;
            this.f16723l += i4;
            this.f16721j = 0;
            this.f16719h = 0;
            List<byte[]> D = m19429D(L - i5);
            byte[] bArr = new byte[L];
            System.arraycopy(this.f16718g, i3, bArr, 0, i5);
            for (byte[] bArr2 : D) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return jw3.m15090O(bArr);
        }
    }

    /* renamed from: z */
    public final String mo12206z() throws IOException {
        int L = mo13614L();
        if (L > 0) {
            int i = this.f16719h;
            int i2 = this.f16721j;
            if (L <= i - i2) {
                String str = new String(this.f16718g, i2, L, cy3.f7982b);
                this.f16721j += L;
                return str;
            }
        }
        if (L == 0) {
            return "";
        }
        if (L > this.f16719h) {
            return new String(m19433H(L, false), cy3.f7982b);
        }
        m19431F(L);
        String str2 = new String(this.f16718g, this.f16721j, L, cy3.f7982b);
        this.f16721j += L;
        return str2;
    }
}
