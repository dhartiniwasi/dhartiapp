package p014b2;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p161w3.C5917a;

/* renamed from: b2.j0 */
/* compiled from: Sonic */
final class C1646j0 {

    /* renamed from: a */
    private final int f4724a;

    /* renamed from: b */
    private final int f4725b;

    /* renamed from: c */
    private final float f4726c;

    /* renamed from: d */
    private final float f4727d;

    /* renamed from: e */
    private final float f4728e;

    /* renamed from: f */
    private final int f4729f;

    /* renamed from: g */
    private final int f4730g;

    /* renamed from: h */
    private final int f4731h;

    /* renamed from: i */
    private final short[] f4732i;

    /* renamed from: j */
    private short[] f4733j;

    /* renamed from: k */
    private int f4734k;

    /* renamed from: l */
    private short[] f4735l;

    /* renamed from: m */
    private int f4736m;

    /* renamed from: n */
    private short[] f4737n;

    /* renamed from: o */
    private int f4738o;

    /* renamed from: p */
    private int f4739p;

    /* renamed from: q */
    private int f4740q;

    /* renamed from: r */
    private int f4741r;

    /* renamed from: s */
    private int f4742s;

    /* renamed from: t */
    private int f4743t;

    /* renamed from: u */
    private int f4744u;

    /* renamed from: v */
    private int f4745v;

    public C1646j0(int i, int i2, float f, float f2, int i3) {
        this.f4724a = i;
        this.f4725b = i2;
        this.f4726c = f;
        this.f4727d = f2;
        this.f4728e = ((float) i) / ((float) i3);
        this.f4729f = i / 400;
        int i4 = i / 65;
        this.f4730g = i4;
        int i5 = i4 * 2;
        this.f4731h = i5;
        this.f4732i = new short[i5];
        this.f4733j = new short[(i5 * i2)];
        this.f4735l = new short[(i5 * i2)];
        this.f4737n = new short[(i5 * i2)];
    }

    /* renamed from: a */
    private void m7561a(float f, int i) {
        int i2;
        int i3;
        if (this.f4736m != i) {
            int i4 = this.f4724a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m7571o(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f4738o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f4739p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f4740q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f4735l = m7566f(this.f4735l, this.f4736m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f4725b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f4735l[(this.f4736m * i10) + i9] = m7570n(this.f4737n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f4740q++;
                        this.f4736m++;
                    }
                    int i11 = i2 + 1;
                    this.f4739p = i11;
                    if (i11 == i4) {
                        this.f4739p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C5917a.m34873f(z);
                        this.f4740q = 0;
                    }
                    i6++;
                } else {
                    m7575u(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m7562b(float f) {
        int m;
        int i = this.f4734k;
        if (i >= this.f4731h) {
            int i2 = 0;
            do {
                if (this.f4741r > 0) {
                    m = m7563c(i2);
                } else {
                    int g = m7567g(this.f4733j, i2);
                    if (((double) f) > 1.0d) {
                        m = g + m7577w(this.f4733j, i2, f, g);
                    } else {
                        m = m7569m(this.f4733j, i2, f, g);
                    }
                }
                i2 += m;
            } while (this.f4731h + i2 <= i);
            m7576v(i2);
        }
    }

    /* renamed from: c */
    private int m7563c(int i) {
        int min = Math.min(this.f4731h, this.f4741r);
        m7564d(this.f4733j, i, min);
        this.f4741r -= min;
        return min;
    }

    /* renamed from: d */
    private void m7564d(short[] sArr, int i, int i2) {
        short[] f = m7566f(this.f4735l, this.f4736m, i2);
        this.f4735l = f;
        int i3 = this.f4725b;
        System.arraycopy(sArr, i * i3, f, this.f4736m * i3, i3 * i2);
        this.f4736m += i2;
    }

    /* renamed from: e */
    private void m7565e(short[] sArr, int i, int i2) {
        int i3 = this.f4731h / i2;
        int i4 = this.f4725b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f4732i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    private short[] m7566f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f4725b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    private int m7567g(short[] sArr, int i) {
        int i2;
        int i3 = this.f4724a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f4725b == 1 && i4 == 1) {
            i2 = m7568h(sArr, i, this.f4729f, this.f4730g);
        } else {
            m7565e(sArr, i, i4);
            int h = m7568h(this.f4732i, 0, this.f4729f / i4, this.f4730g / i4);
            if (i4 != 1) {
                int i5 = h * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f4729f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f4730g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f4725b == 1) {
                    i2 = m7568h(sArr, i, i7, i8);
                } else {
                    m7565e(sArr, i, 1);
                    i2 = m7568h(this.f4732i, 0, i7, i8);
                }
            } else {
                i2 = h;
            }
        }
        int i11 = m7573q(this.f4744u, this.f4745v) ? this.f4742s : i2;
        this.f4743t = this.f4744u;
        this.f4742s = i2;
        return i11;
    }

    /* renamed from: h */
    private int m7568h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f4725b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f4744u = i5 / i7;
        this.f4745v = i8 / i6;
        return i7;
    }

    /* renamed from: m */
    private int m7569m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f4741r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f2 = m7566f(this.f4735l, this.f4736m, i4);
        this.f4735l = f2;
        int i5 = this.f4725b;
        System.arraycopy(sArr, i * i5, f2, this.f4736m * i5, i5 * i2);
        m7572p(i3, this.f4725b, this.f4735l, this.f4736m + i2, sArr, i + i2, sArr, i);
        this.f4736m += i4;
        return i3;
    }

    /* renamed from: n */
    private short m7570n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f4725b];
        int i4 = this.f4740q * i2;
        int i5 = this.f4739p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: o */
    private void m7571o(int i) {
        int i2 = this.f4736m - i;
        short[] f = m7566f(this.f4737n, this.f4738o, i2);
        this.f4737n = f;
        short[] sArr = this.f4735l;
        int i3 = this.f4725b;
        System.arraycopy(sArr, i * i3, f, this.f4738o * i3, i3 * i2);
        this.f4736m = i;
        this.f4738o += i2;
    }

    /* renamed from: p */
    private static void m7572p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: q */
    private boolean m7573q(int i, int i2) {
        if (i == 0 || this.f4742s == 0 || i2 > i * 3 || i * 2 <= this.f4743t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m7574r() {
        int i = this.f4736m;
        float f = this.f4726c;
        float f2 = this.f4727d;
        float f3 = f / f2;
        float f4 = this.f4728e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            m7562b(f3);
        } else {
            m7564d(this.f4733j, 0, this.f4734k);
            this.f4734k = 0;
        }
        if (f4 != 1.0f) {
            m7561a(f4, i);
        }
    }

    /* renamed from: u */
    private void m7575u(int i) {
        if (i != 0) {
            short[] sArr = this.f4737n;
            int i2 = this.f4725b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f4738o - i) * i2);
            this.f4738o -= i;
        }
    }

    /* renamed from: v */
    private void m7576v(int i) {
        int i2 = this.f4734k - i;
        short[] sArr = this.f4733j;
        int i3 = this.f4725b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f4734k = i2;
    }

    /* renamed from: w */
    private int m7577w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f4741r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] f2 = m7566f(this.f4735l, this.f4736m, i3);
        this.f4735l = f2;
        m7572p(i3, this.f4725b, f2, this.f4736m, sArr, i, sArr, i + i2);
        this.f4736m += i3;
        return i3;
    }

    /* renamed from: i */
    public void mo6527i() {
        this.f4734k = 0;
        this.f4736m = 0;
        this.f4738o = 0;
        this.f4739p = 0;
        this.f4740q = 0;
        this.f4741r = 0;
        this.f4742s = 0;
        this.f4743t = 0;
        this.f4744u = 0;
        this.f4745v = 0;
    }

    /* renamed from: j */
    public void mo6528j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f4725b, this.f4736m);
        shortBuffer.put(this.f4735l, 0, this.f4725b * min);
        int i = this.f4736m - min;
        this.f4736m = i;
        short[] sArr = this.f4735l;
        int i2 = this.f4725b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int mo6529k() {
        return this.f4736m * this.f4725b * 2;
    }

    /* renamed from: l */
    public int mo6530l() {
        return this.f4734k * this.f4725b * 2;
    }

    /* renamed from: s */
    public void mo6531s() {
        int i;
        int i2 = this.f4734k;
        float f = this.f4726c;
        float f2 = this.f4727d;
        int i3 = this.f4736m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f4738o)) / (this.f4728e * f2)) + 0.5f));
        this.f4733j = m7566f(this.f4733j, i2, (this.f4731h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f4731h;
            int i5 = this.f4725b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f4733j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f4734k += i * 2;
        m7574r();
        if (this.f4736m > i3) {
            this.f4736m = i3;
        }
        this.f4734k = 0;
        this.f4741r = 0;
        this.f4738o = 0;
    }

    /* renamed from: t */
    public void mo6532t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f4725b;
        int i2 = remaining / i;
        short[] f = m7566f(this.f4733j, this.f4734k, i2);
        this.f4733j = f;
        shortBuffer.get(f, this.f4734k * this.f4725b, ((i * i2) * 2) / 2);
        this.f4734k += i2;
        m7574r();
    }
}
