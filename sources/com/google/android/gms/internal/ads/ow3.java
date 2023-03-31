package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ow3 extends sw3 {

    /* renamed from: f */
    private final Iterable f15387f;

    /* renamed from: g */
    private final Iterator f15388g;

    /* renamed from: h */
    private ByteBuffer f15389h;

    /* renamed from: i */
    private int f15390i;

    /* renamed from: j */
    private int f15391j;

    /* renamed from: k */
    private int f15392k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f15393l;

    /* renamed from: m */
    private int f15394m;

    /* renamed from: n */
    private long f15395n;

    /* renamed from: o */
    private long f15396o;

    /* renamed from: p */
    private long f15397p;

    /* synthetic */ ow3(Iterable iterable, int i, boolean z, mw3 mw3) {
        super((rw3) null);
        this.f15390i = i;
        this.f15387f = iterable;
        this.f15388g = iterable.iterator();
        this.f15394m = 0;
        if (i == 0) {
            this.f15389h = cy3.f7985e;
            this.f15395n = 0;
            this.f15396o = 0;
            this.f15397p = 0;
            return;
        }
        m18122H();
    }

    /* renamed from: D */
    private final int m18118D() {
        return (int) ((((long) (this.f15390i - this.f15394m)) - this.f15395n) + this.f15396o);
    }

    /* renamed from: E */
    private final void m18119E() throws ey3 {
        if (this.f15388g.hasNext()) {
            m18122H();
            return;
        }
        throw ey3.m12345j();
    }

    /* renamed from: F */
    private final void m18120F(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= m18118D()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.f15397p - this.f15395n == 0) {
                    m18119E();
                }
                int min = Math.min(i3, (int) (this.f15397p - this.f15395n));
                long j = (long) min;
                y04.m23673w(this.f15395n, bArr, (long) (i2 - i3), j);
                i3 -= min;
                this.f15395n += j;
            }
        } else if (i2 > 0) {
            throw ey3.m12345j();
        }
    }

    /* renamed from: G */
    private final void m18121G() {
        int i = this.f15390i + this.f15391j;
        this.f15390i = i;
        int i2 = this.f15392k;
        if (i > i2) {
            int i3 = i - i2;
            this.f15391j = i3;
            this.f15390i = i - i3;
            return;
        }
        this.f15391j = 0;
    }

    /* renamed from: H */
    private final void m18122H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f15388g.next();
        this.f15389h = byteBuffer;
        this.f15394m += (int) (this.f15395n - this.f15396o);
        long position = (long) byteBuffer.position();
        this.f15395n = position;
        this.f15396o = position;
        this.f15397p = (long) this.f15389h.limit();
        long m = y04.m23663m(this.f15389h);
        this.f15395n += m;
        this.f15396o += m;
        this.f15397p += m;
    }

    /* renamed from: A */
    public final String mo12176A() throws IOException {
        int K = mo13055K();
        if (K > 0) {
            long j = (long) K;
            long j2 = this.f15397p;
            long j3 = this.f15395n;
            if (j <= j2 - j3) {
                String g = d14.m11286g(this.f15389h, (int) (j3 - this.f15396o), K);
                this.f15395n += j;
                return g;
            }
        }
        if (K >= 0 && K <= m18118D()) {
            byte[] bArr = new byte[K];
            m18120F(bArr, 0, K);
            return d14.m11287h(bArr, 0, K);
        } else if (K == 0) {
            return "";
        } else {
            if (K <= 0) {
                throw ey3.m12342f();
            }
            throw ey3.m12345j();
        }
    }

    /* renamed from: B */
    public final void mo12177B(int i) throws ey3 {
        if (this.f15393l != i) {
            throw ey3.m12338b();
        }
    }

    /* renamed from: C */
    public final void mo13052C(int i) throws IOException {
        if (i >= 0 && ((long) i) <= (((long) (this.f15390i - this.f15394m)) - this.f15395n) + this.f15396o) {
            while (i > 0) {
                if (this.f15397p - this.f15395n == 0) {
                    m18119E();
                }
                int min = Math.min(i, (int) (this.f15397p - this.f15395n));
                i -= min;
                this.f15395n += (long) min;
            }
        } else if (i < 0) {
            throw ey3.m12342f();
        } else {
            throw ey3.m12345j();
        }
    }

    /* renamed from: I */
    public final byte mo13053I() throws IOException {
        if (this.f15397p - this.f15395n == 0) {
            m18119E();
        }
        long j = this.f15395n;
        this.f15395n = 1 + j;
        return y04.m23659i(j);
    }

    /* renamed from: J */
    public final int mo13054J() throws IOException {
        byte I;
        byte I2;
        long j = this.f15397p;
        long j2 = this.f15395n;
        if (j - j2 >= 4) {
            this.f15395n = 4 + j2;
            I = (y04.m23659i(j2) & 255) | ((y04.m23659i(1 + j2) & 255) << 8) | ((y04.m23659i(2 + j2) & 255) << 16);
            I2 = y04.m23659i(j2 + 3);
        } else {
            I = (mo13053I() & 255) | ((mo13053I() & 255) << 8) | ((mo13053I() & 255) << 16);
            I2 = mo13053I();
        }
        return I | ((I2 & 255) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (com.google.android.gms.internal.ads.y04.m23659i(r4) >= 0) goto L_0x0089;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13055K() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.f15395n
            long r2 = r10.f15397p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x008c
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.y04.m23659i(r0)
            if (r0 < 0) goto L_0x001a
            long r4 = r10.f15395n
            long r4 = r4 + r2
            r10.f15395n = r4
            return r0
        L_0x001a:
            long r6 = r10.f15397p
            long r8 = r10.f15395n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0033
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0089
        L_0x0033:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0042
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0040:
            r6 = r4
            goto L_0x0089
        L_0x0042:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0052
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0089
        L_0x0052:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.y04.m23659i(r4)
            if (r1 < 0) goto L_0x008c
        L_0x0089:
            r10.f15395n = r6
            return r0
        L_0x008c:
            long r0 = r10.mo13058N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ow3.mo13055K():int");
    }

    /* renamed from: L */
    public final long mo13056L() throws IOException {
        long I;
        byte I2;
        long j = this.f15397p;
        long j2 = this.f15395n;
        if (j - j2 >= 8) {
            this.f15395n = 8 + j2;
            I = (((long) y04.m23659i(j2)) & 255) | ((((long) y04.m23659i(1 + j2)) & 255) << 8) | ((((long) y04.m23659i(2 + j2)) & 255) << 16) | ((((long) y04.m23659i(3 + j2)) & 255) << 24) | ((((long) y04.m23659i(4 + j2)) & 255) << 32) | ((((long) y04.m23659i(5 + j2)) & 255) << 40) | ((((long) y04.m23659i(6 + j2)) & 255) << 48);
            I2 = y04.m23659i(j2 + 7);
        } else {
            I = (((long) mo13053I()) & 255) | ((((long) mo13053I()) & 255) << 8) | ((((long) mo13053I()) & 255) << 16) | ((((long) mo13053I()) & 255) << 24) | ((((long) mo13053I()) & 255) << 32) | ((((long) mo13053I()) & 255) << 40) | ((((long) mo13053I()) & 255) << 48);
            I2 = mo13053I();
        }
        return I | ((((long) I2) & 255) << 56);
    }

    /* renamed from: M */
    public final long mo13057M() throws IOException {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f15395n;
        if (this.f15397p != j4) {
            long j5 = j4 + 1;
            byte i = y04.m23659i(j4);
            if (i >= 0) {
                this.f15395n++;
                return (long) i;
            } else if (this.f15397p - this.f15395n >= 10) {
                long j6 = j5 + 1;
                byte i2 = i ^ (y04.m23659i(j5) << 7);
                if (i2 < 0) {
                    b = i2 ^ C8843b4.f36445d;
                } else {
                    long j7 = j6 + 1;
                    byte i3 = i2 ^ (y04.m23659i(j6) << 14);
                    if (i3 >= 0) {
                        j = (long) (i3 ^ C8843b4.f36445d);
                    } else {
                        j6 = j7 + 1;
                        byte i4 = i3 ^ (y04.m23659i(j7) << 21);
                        if (i4 < 0) {
                            b = i4 ^ C8843b4.f36445d;
                        } else {
                            j7 = j6 + 1;
                            long i5 = ((long) i4) ^ (((long) y04.m23659i(j6)) << 28);
                            if (i5 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = j7 + 1;
                                long i6 = i5 ^ (((long) y04.m23659i(j7)) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    i5 = i6 ^ (((long) y04.m23659i(j8)) << 42);
                                    if (i5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        i6 = i5 ^ (((long) y04.m23659i(j7)) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            j = (i6 ^ (((long) y04.m23659i(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) y04.m23659i(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f15395n = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = i6 ^ j2;
                                j6 = j8;
                                this.f15395n = j6;
                                return j;
                            }
                            j = i5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f15395n = j6;
                    return j;
                }
                j = (long) b;
                this.f15395n = j6;
                return j;
            }
        }
        return mo13058N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final long mo13058N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = mo13053I();
            j |= ((long) (I & Byte.MAX_VALUE)) << i;
            if ((I & C8843b4.f36445d) == 0) {
                return j;
            }
        }
        throw ey3.m12341e();
    }

    /* renamed from: a */
    public final void mo12185a(int i) {
        this.f15392k = i;
        m18121G();
    }

    /* renamed from: b */
    public final boolean mo12186b() throws IOException {
        return (((long) this.f15394m) + this.f15395n) - this.f15396o == ((long) this.f15390i);
    }

    /* renamed from: c */
    public final boolean mo12187c() throws IOException {
        return mo13057M() != 0;
    }

    /* renamed from: d */
    public final boolean mo12188d(int i) throws IOException {
        int r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (mo13053I() >= 0) {
                    return true;
                }
            }
            throw ey3.m12341e();
        } else if (i2 == 1) {
            mo13052C(8);
            return true;
        } else if (i2 == 2) {
            mo13052C(mo13055K());
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
                mo13052C(4);
                return true;
            }
            throw ey3.m12337a();
        }
    }

    /* renamed from: i */
    public final double mo12189i() throws IOException {
        return Double.longBitsToDouble(mo13056L());
    }

    /* renamed from: j */
    public final float mo12190j() throws IOException {
        return Float.intBitsToFloat(mo13054J());
    }

    /* renamed from: k */
    public final int mo12191k() {
        return (int) ((((long) this.f15394m) + this.f15395n) - this.f15396o);
    }

    /* renamed from: l */
    public final int mo12192l(int i) throws ey3 {
        if (i >= 0) {
            int k = i + mo12191k();
            int i2 = this.f15392k;
            if (k <= i2) {
                this.f15392k = k;
                m18121G();
                return i2;
            }
            throw ey3.m12345j();
        }
        throw ey3.m12342f();
    }

    /* renamed from: m */
    public final int mo12193m() throws IOException {
        return mo13055K();
    }

    /* renamed from: n */
    public final int mo12194n() throws IOException {
        return mo13054J();
    }

    /* renamed from: o */
    public final int mo12195o() throws IOException {
        return mo13055K();
    }

    /* renamed from: p */
    public final int mo12196p() throws IOException {
        return mo13054J();
    }

    /* renamed from: q */
    public final int mo12197q() throws IOException {
        return sw3.m20669e(mo13055K());
    }

    /* renamed from: r */
    public final int mo12198r() throws IOException {
        if (mo12186b()) {
            this.f15393l = 0;
            return 0;
        }
        int K = mo13055K();
        this.f15393l = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw ey3.m12339c();
    }

    /* renamed from: s */
    public final int mo12199s() throws IOException {
        return mo13055K();
    }

    /* renamed from: t */
    public final long mo12200t() throws IOException {
        return mo13056L();
    }

    /* renamed from: u */
    public final long mo12201u() throws IOException {
        return mo13057M();
    }

    /* renamed from: v */
    public final long mo12202v() throws IOException {
        return mo13056L();
    }

    /* renamed from: w */
    public final long mo12203w() throws IOException {
        return sw3.m20670f(mo13057M());
    }

    /* renamed from: x */
    public final long mo12204x() throws IOException {
        return mo13057M();
    }

    /* renamed from: y */
    public final jw3 mo12205y() throws IOException {
        int K = mo13055K();
        if (K > 0) {
            long j = (long) K;
            long j2 = this.f15397p;
            long j3 = this.f15395n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[K];
                y04.m23673w(j3, bArr, 0, j);
                this.f15395n += j;
                return jw3.m15090O(bArr);
            }
        }
        if (K > 0 && K <= m18118D()) {
            byte[] bArr2 = new byte[K];
            m18120F(bArr2, 0, K);
            return jw3.m15090O(bArr2);
        } else if (K == 0) {
            return jw3.f11808b;
        } else {
            if (K < 0) {
                throw ey3.m12342f();
            }
            throw ey3.m12345j();
        }
    }

    /* renamed from: z */
    public final String mo12206z() throws IOException {
        int K = mo13055K();
        if (K > 0) {
            long j = (long) K;
            long j2 = this.f15397p;
            long j3 = this.f15395n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[K];
                y04.m23673w(j3, bArr, 0, j);
                String str = new String(bArr, cy3.f7982b);
                this.f15395n += j;
                return str;
            }
        }
        if (K > 0 && K <= m18118D()) {
            byte[] bArr2 = new byte[K];
            m18120F(bArr2, 0, K);
            return new String(bArr2, cy3.f7982b);
        } else if (K == 0) {
            return "";
        } else {
            if (K < 0) {
                throw ey3.m12342f();
            }
            throw ey3.m12345j();
        }
    }
}
