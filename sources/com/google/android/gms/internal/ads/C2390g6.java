package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.g6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2390g6 implements C2576l6 {

    /* renamed from: v */
    private static final byte[] f9711v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f9712a;

    /* renamed from: b */
    private final x12 f9713b = new x12(new byte[7], 7);

    /* renamed from: c */
    private final y22 f9714c = new y22(Arrays.copyOf(f9711v, 10));

    /* renamed from: d */
    private final String f9715d;

    /* renamed from: e */
    private String f9716e;

    /* renamed from: f */
    private C2792r f9717f;

    /* renamed from: g */
    private C2792r f9718g;

    /* renamed from: h */
    private int f9719h;

    /* renamed from: i */
    private int f9720i;

    /* renamed from: j */
    private int f9721j;

    /* renamed from: k */
    private boolean f9722k;

    /* renamed from: l */
    private boolean f9723l;

    /* renamed from: m */
    private int f9724m;

    /* renamed from: n */
    private int f9725n;

    /* renamed from: o */
    private int f9726o;

    /* renamed from: p */
    private boolean f9727p;

    /* renamed from: q */
    private long f9728q;

    /* renamed from: r */
    private int f9729r;

    /* renamed from: s */
    private long f9730s;

    /* renamed from: t */
    private C2792r f9731t;

    /* renamed from: u */
    private long f9732u;

    public C2390g6(boolean z, String str) {
        m13049h();
        this.f9724m = -1;
        this.f9725n = -1;
        this.f9728q = -9223372036854775807L;
        this.f9730s = -9223372036854775807L;
        this.f9712a = z;
        this.f9715d = str;
    }

    /* renamed from: f */
    public static boolean m13047f(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: g */
    private final void m13048g() {
        this.f9723l = false;
        m13049h();
    }

    /* renamed from: h */
    private final void m13049h() {
        this.f9719h = 0;
        this.f9720i = 0;
        this.f9721j = 256;
    }

    /* renamed from: i */
    private final void m13050i() {
        this.f9719h = 3;
        this.f9720i = 0;
    }

    /* renamed from: j */
    private final void m13051j(C2792r rVar, long j, int i, int i2) {
        this.f9719h = 4;
        this.f9720i = i;
        this.f9731t = rVar;
        this.f9732u = j;
        this.f9729r = i2;
    }

    /* renamed from: k */
    private final boolean m13052k(y22 y22, byte[] bArr, int i) {
        int min = Math.min(y22.mo15296i(), i - this.f9720i);
        y22.mo15289b(bArr, this.f9720i, min);
        int i2 = this.f9720i + min;
        this.f9720i = i2;
        return i2 == i;
    }

    /* renamed from: l */
    private static final boolean m13053l(byte b, byte b2) {
        return m13047f((b2 & 255) | 65280);
    }

    /* renamed from: m */
    private static final boolean m13054m(y22 y22, byte[] bArr, int i) {
        if (y22.mo15296i() < i) {
            return false;
        }
        y22.mo15289b(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f9730s = -9223372036854775807L;
        m13048g();
    }

    /* renamed from: b */
    public final void mo8216b(y22 y22) throws ea0 {
        int i;
        byte b;
        int i2;
        y22 y222 = y22;
        Objects.requireNonNull(this.f9717f);
        int i3 = gb2.f9812a;
        while (y22.mo15296i() > 0) {
            int i4 = this.f9719h;
            int i5 = 13;
            int i6 = 2;
            if (i4 == 0) {
                byte[] h = y22.mo15295h();
                int k = y22.mo15298k();
                int l = y22.mo15299l();
                while (true) {
                    if (k >= l) {
                        y222.mo15293f(k);
                        break;
                    }
                    i = k + 1;
                    b = h[k] & 255;
                    if (this.f9721j == 512 && m13053l((byte) -1, (byte) b)) {
                        if (this.f9723l) {
                            break;
                        }
                        int i7 = i - 2;
                        y222.mo15293f(i7 + 1);
                        if (m13054m(y222, this.f9713b.f19942a, 1)) {
                            this.f9713b.mo15039h(4);
                            int c = this.f9713b.mo15034c(1);
                            int i8 = this.f9724m;
                            if (i8 == -1 || c == i8) {
                                if (this.f9725n != -1) {
                                    if (!m13054m(y222, this.f9713b.f19942a, 1)) {
                                        break;
                                    }
                                    this.f9713b.mo15039h(i6);
                                    if (this.f9713b.mo15034c(4) == this.f9725n) {
                                        y222.mo15293f(i7 + 2);
                                    }
                                }
                                if (!m13054m(y222, this.f9713b.f19942a, 4)) {
                                    break;
                                }
                                this.f9713b.mo15039h(14);
                                int c2 = this.f9713b.mo15034c(i5);
                                if (c2 >= 7) {
                                    byte[] h2 = y22.mo15295h();
                                    int l2 = y22.mo15299l();
                                    int i9 = i7 + c2;
                                    if (i9 < l2) {
                                        byte b2 = h2[i9];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i10 = i9 + 1;
                                                if (i10 != l2) {
                                                    if (h2[i10] == 68) {
                                                        int i11 = i9 + 2;
                                                        if (i11 != l2) {
                                                            if (h2[i11] == 51) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            int i12 = i9 + 1;
                                            if (i12 == l2) {
                                                break;
                                            }
                                            byte b3 = h2[i12];
                                            if (m13053l((byte) -1, b3) && ((b3 & 8) >> 3) == c) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i13 = this.f9721j;
                    byte b4 = i13 | b;
                    if (b4 == 329) {
                        i2 = 768;
                    } else if (b4 == 511) {
                        i2 = 512;
                    } else if (b4 != 836) {
                        if (b4 == 1075) {
                            this.f9719h = 2;
                            this.f9720i = 3;
                            this.f9729r = 0;
                            this.f9714c.mo15293f(0);
                            y222.mo15293f(i);
                            break;
                        } else if (i13 != 256) {
                            this.f9721j = 256;
                            k = i - 1;
                            i5 = 13;
                            i6 = 2;
                        } else {
                            k = i;
                            i5 = 13;
                            i6 = 2;
                        }
                    } else {
                        i2 = 1024;
                    }
                    this.f9721j = i2;
                    k = i;
                    i5 = 13;
                    i6 = 2;
                }
                this.f9726o = (b & 8) >> 3;
                this.f9722k = 1 == ((b & 1) ^ 1);
                if (!this.f9723l) {
                    this.f9719h = 1;
                    this.f9720i = 0;
                } else {
                    m13050i();
                }
                y222.mo15293f(i);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(y22.mo15296i(), this.f9729r - this.f9720i);
                        this.f9731t.mo8821c(y222, min);
                        int i14 = this.f9720i + min;
                        this.f9720i = i14;
                        int i15 = this.f9729r;
                        if (i14 == i15) {
                            long j = this.f9730s;
                            if (j != -9223372036854775807L) {
                                this.f9731t.mo8824f(j, 1, i15, 0, (C2755q) null);
                                this.f9730s += this.f9732u;
                            }
                            m13049h();
                        }
                    } else {
                        if (m13052k(y222, this.f9713b.f19942a, true != this.f9722k ? 5 : 7)) {
                            this.f9713b.mo15039h(0);
                            if (!this.f9727p) {
                                int c3 = this.f9713b.mo15034c(2) + 1;
                                if (c3 != 2) {
                                    ot1.m18060e("AdtsReader", "Detected audio object type: " + c3 + ", but assuming AAC LC.");
                                }
                                this.f9713b.mo15041j(5);
                                int c4 = this.f9713b.mo15034c(3);
                                int i16 = this.f9725n;
                                int i17 = nm4.f14120c;
                                byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((c4 << 3) & 120) | ((i16 << 7) & 128))};
                                mm4 a = nm4.m17191a(bArr);
                                C2311e2 e2Var = new C2311e2();
                                e2Var.mo9764h(this.f9716e);
                                e2Var.mo9776s("audio/mp4a-latm");
                                e2Var.mo9761f0(a.f13417c);
                                e2Var.mo9759e0(a.f13416b);
                                e2Var.mo9777t(a.f13415a);
                                e2Var.mo9766i(Collections.singletonList(bArr));
                                e2Var.mo9768k(this.f9715d);
                                C2388g4 y = e2Var.mo9782y();
                                this.f9728q = 1024000000 / ((long) y.f9687z);
                                this.f9717f.mo8823e(y);
                                this.f9727p = true;
                            } else {
                                this.f9713b.mo15041j(10);
                            }
                            this.f9713b.mo15041j(4);
                            int c5 = this.f9713b.mo15034c(13) - 7;
                            if (this.f9722k) {
                                c5 -= 2;
                            }
                            m13051j(this.f9717f, this.f9728q, 0, c5);
                        }
                    }
                } else if (m13052k(y222, this.f9714c.mo15295h(), 10)) {
                    this.f9718g.mo8821c(this.f9714c, 10);
                    this.f9714c.mo15293f(6);
                    m13051j(this.f9718g, 0, 10, 10 + this.f9714c.mo15305r());
                }
            } else if (y22.mo15296i() != 0) {
                x12 x12 = this.f9713b;
                x12.f19942a[0] = y22.mo15295h()[y22.mo15298k()];
                x12.mo15039h(2);
                int c6 = this.f9713b.mo15034c(4);
                int i18 = this.f9725n;
                if (i18 == -1 || c6 == i18) {
                    if (!this.f9723l) {
                        this.f9723l = true;
                        this.f9724m = this.f9726o;
                        this.f9725n = c6;
                    }
                    m13050i();
                } else {
                    m13048g();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f9716e = y7Var.mo15333b();
        C2792r n = tn4.mo10060n(y7Var.mo15332a(), 1);
        this.f9717f = n;
        this.f9731t = n;
        if (this.f9712a) {
            y7Var.mo15334c();
            C2792r n2 = tn4.mo10060n(y7Var.mo15332a(), 5);
            this.f9718g = n2;
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9764h(y7Var.mo15333b());
            e2Var.mo9776s("application/id3");
            n2.mo8823e(e2Var.mo9782y());
            return;
        }
        this.f9718g = new pn4();
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f9730s = j;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
