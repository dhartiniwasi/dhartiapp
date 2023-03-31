package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fd4 {

    /* renamed from: a */
    private final int f9236a;

    /* renamed from: b */
    private final int f9237b;

    /* renamed from: c */
    private final float f9238c;

    /* renamed from: d */
    private final float f9239d;

    /* renamed from: e */
    private final float f9240e;

    /* renamed from: f */
    private final int f9241f;

    /* renamed from: g */
    private final int f9242g;

    /* renamed from: h */
    private final int f9243h;

    /* renamed from: i */
    private final short[] f9244i;

    /* renamed from: j */
    private short[] f9245j;

    /* renamed from: k */
    private int f9246k;

    /* renamed from: l */
    private short[] f9247l;

    /* renamed from: m */
    private int f9248m;

    /* renamed from: n */
    private short[] f9249n;

    /* renamed from: o */
    private int f9250o;

    /* renamed from: p */
    private int f9251p;

    /* renamed from: q */
    private int f9252q;

    /* renamed from: r */
    private int f9253r;

    /* renamed from: s */
    private int f9254s;

    /* renamed from: t */
    private int f9255t;

    /* renamed from: u */
    private int f9256u;

    /* renamed from: v */
    private int f9257v;

    public fd4(int i, int i2, float f, float f2, int i3) {
        this.f9236a = i;
        this.f9237b = i2;
        this.f9238c = f;
        this.f9239d = f2;
        this.f9240e = ((float) i) / ((float) i3);
        this.f9241f = i / 400;
        int i4 = i / 65;
        this.f9242g = i4;
        int i5 = i4 + i4;
        this.f9243h = i5;
        this.f9244i = new short[i5];
        int i6 = i5 * i2;
        this.f9245j = new short[i6];
        this.f9247l = new short[i6];
        this.f9249n = new short[i6];
    }

    /* renamed from: g */
    private final int m12566g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f9237b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f9256u = i5 / i7;
        this.f9257v = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m12567h(short[] sArr, int i, int i2) {
        short[] l = m12571l(this.f9247l, this.f9248m, i2);
        this.f9247l = l;
        int i3 = this.f9237b;
        System.arraycopy(sArr, i * i3, l, this.f9248m * i3, i3 * i2);
        this.f9248m += i2;
    }

    /* renamed from: i */
    private final void m12568i(short[] sArr, int i, int i2) {
        int i3 = this.f9243h / i2;
        int i4 = this.f9237b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f9244i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private static void m12569j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: k */
    private final void m12570k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f9248m;
        float f = this.f9238c;
        float f2 = this.f9239d;
        float f3 = f / f2;
        float f4 = this.f9240e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f9246k;
            if (i11 >= this.f9243h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f9253r;
                    if (i13 > 0) {
                        int min = Math.min(this.f9243h, i13);
                        m12567h(this.f9245j, i12, min);
                        this.f9253r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f9245j;
                        int i14 = this.f9236a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f9237b == i10 && i15 == i10) {
                            i5 = m12566g(sArr, i12, this.f9241f, this.f9242g);
                        } else {
                            m12568i(sArr, i12, i15);
                            int g = m12566g(this.f9244i, 0, this.f9241f / i15, this.f9242g / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f9241f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f9242g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f9237b == i10) {
                                    i5 = m12566g(sArr, i12, i18, i19);
                                } else {
                                    m12568i(sArr, i12, i10);
                                    i5 = m12566g(this.f9244i, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f9256u;
                        int i23 = (i22 == 0 || (i8 = this.f9254s) == 0 || this.f9257v > i22 * 3 || i22 + i22 <= this.f9255t * 3) ? i5 : i8;
                        this.f9255t = i22;
                        this.f9254s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f9245j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f3));
                            } else {
                                this.f9253r = (int) ((((float) i23) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i23;
                            }
                            short[] l = m12571l(this.f9247l, this.f9248m, i7);
                            this.f9247l = l;
                            int i24 = i7;
                            short[] sArr3 = sArr2;
                            m12569j(i7, this.f9237b, l, this.f9248m, sArr3, i12, sArr3, i12 + i23);
                            this.f9248m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f9245j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i25) * f3) / (f5 - f3));
                            } else {
                                this.f9253r = (int) ((((float) i25) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            short[] l2 = m12571l(this.f9247l, this.f9248m, i26);
                            this.f9247l = l2;
                            int i27 = this.f9237b;
                            System.arraycopy(sArr4, i12 * i27, l2, this.f9248m * i27, i27 * i25);
                            m12569j(i6, this.f9237b, this.f9247l, this.f9248m + i25, sArr4, i12 + i25, sArr4, i12);
                            this.f9248m += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f9243h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f9246k - i12;
                short[] sArr5 = this.f9245j;
                int i29 = this.f9237b;
                System.arraycopy(sArr5, i12 * i29, sArr5, 0, i29 * i28);
                this.f9246k = i28;
                f5 = 1.0f;
            }
        } else {
            m12567h(this.f9245j, 0, this.f9246k);
            this.f9246k = 0;
        }
        if (f4 != f5 && this.f9248m != i9) {
            int i30 = this.f9236a;
            int i31 = (int) (((float) i30) / f4);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f9248m - i9;
            short[] l3 = m12571l(this.f9249n, this.f9250o, i32);
            this.f9249n = l3;
            short[] sArr6 = this.f9247l;
            int i33 = this.f9237b;
            System.arraycopy(sArr6, i9 * i33, l3, this.f9250o * i33, i33 * i32);
            this.f9248m = i9;
            this.f9250o += i32;
            int i34 = 0;
            while (true) {
                i = this.f9250o;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f9251p + 1;
                    i4 = this.f9252q;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    this.f9247l = m12571l(this.f9247l, this.f9248m, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f9237b;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f9247l;
                        int i37 = this.f9248m;
                        short[] sArr8 = this.f9249n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i36];
                        int i39 = this.f9252q;
                        int i40 = this.f9251p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                    this.f9252q++;
                    this.f9248m++;
                }
                this.f9251p = i3;
                if (i3 == i30) {
                    this.f9251p = 0;
                    v91.m22052f(i4 == i31);
                    this.f9252q = 0;
                }
                i34++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f9249n;
                int i44 = this.f9237b;
                System.arraycopy(sArr9, i2 * i44, sArr9, 0, (i - i2) * i44);
                this.f9250o -= i2;
            }
        }
    }

    /* renamed from: l */
    private final short[] m12571l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f9237b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: a */
    public final int mo10141a() {
        int i = this.f9248m * this.f9237b;
        return i + i;
    }

    /* renamed from: b */
    public final int mo10142b() {
        int i = this.f9246k * this.f9237b;
        return i + i;
    }

    /* renamed from: c */
    public final void mo10143c() {
        this.f9246k = 0;
        this.f9248m = 0;
        this.f9250o = 0;
        this.f9251p = 0;
        this.f9252q = 0;
        this.f9253r = 0;
        this.f9254s = 0;
        this.f9255t = 0;
        this.f9256u = 0;
        this.f9257v = 0;
    }

    /* renamed from: d */
    public final void mo10144d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f9237b, this.f9248m);
        shortBuffer.put(this.f9247l, 0, this.f9237b * min);
        int i = this.f9248m - min;
        this.f9248m = i;
        short[] sArr = this.f9247l;
        int i2 = this.f9237b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: e */
    public final void mo10145e() {
        int i;
        int i2 = this.f9246k;
        float f = this.f9238c;
        float f2 = this.f9239d;
        int i3 = this.f9248m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f9250o)) / (this.f9240e * f2)) + 0.5f));
        short[] sArr = this.f9245j;
        int i4 = this.f9243h;
        this.f9245j = m12571l(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f9243h;
            i = i6 + i6;
            int i7 = this.f9237b;
            if (i5 >= i * i7) {
                break;
            }
            this.f9245j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f9246k += i;
        m12570k();
        if (this.f9248m > i3) {
            this.f9248m = i3;
        }
        this.f9246k = 0;
        this.f9253r = 0;
        this.f9250o = 0;
    }

    /* renamed from: f */
    public final void mo10146f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f9237b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] l = m12571l(this.f9245j, this.f9246k, i2);
        this.f9245j = l;
        shortBuffer.get(l, this.f9246k * this.f9237b, (i3 + i3) / 2);
        this.f9246k += i2;
        m12570k();
    }
}
