package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2404gk {

    /* renamed from: a */
    private final int f9920a;

    /* renamed from: b */
    private final int f9921b;

    /* renamed from: c */
    private final int f9922c;

    /* renamed from: d */
    private final int f9923d;

    /* renamed from: e */
    private final int f9924e;

    /* renamed from: f */
    private final short[] f9925f;

    /* renamed from: g */
    private int f9926g;

    /* renamed from: h */
    private short[] f9927h;

    /* renamed from: i */
    private int f9928i;

    /* renamed from: j */
    private short[] f9929j;

    /* renamed from: k */
    private int f9930k;

    /* renamed from: l */
    private short[] f9931l;

    /* renamed from: m */
    private int f9932m = 0;

    /* renamed from: n */
    private int f9933n = 0;

    /* renamed from: o */
    private float f9934o = 1.0f;

    /* renamed from: p */
    private float f9935p = 1.0f;

    /* renamed from: q */
    private int f9936q;

    /* renamed from: r */
    private int f9937r;

    /* renamed from: s */
    private int f9938s;

    /* renamed from: t */
    private int f9939t;

    /* renamed from: u */
    private int f9940u = 0;

    /* renamed from: v */
    private int f9941v;

    /* renamed from: w */
    private int f9942w;

    /* renamed from: x */
    private int f9943x;

    public C2404gk(int i, int i2) {
        this.f9920a = i;
        this.f9921b = i2;
        this.f9922c = i / 400;
        int i3 = i / 65;
        this.f9923d = i3;
        int i4 = i3 + i3;
        this.f9924e = i4;
        this.f9925f = new short[i4];
        this.f9926g = i4;
        int i5 = i2 * i4;
        this.f9927h = new short[i5];
        this.f9928i = i4;
        this.f9929j = new short[i5];
        this.f9930k = i4;
        this.f9931l = new short[i5];
    }

    /* renamed from: g */
    private final int m13358g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f9921b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
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
        this.f9942w = i5 / i7;
        this.f9943x = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m13359h(short[] sArr, int i, int i2) {
        m13362k(i2);
        int i3 = this.f9921b;
        System.arraycopy(sArr, i * i3, this.f9929j, this.f9937r * i3, i3 * i2);
        this.f9937r += i2;
    }

    /* renamed from: i */
    private final void m13360i(short[] sArr, int i, int i2) {
        int i3 = this.f9924e / i2;
        int i4 = this.f9921b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f9925f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private final void m13361j(int i) {
        int i2 = this.f9936q;
        int i3 = this.f9926g;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f9926g = i4;
            this.f9927h = Arrays.copyOf(this.f9927h, i4 * this.f9921b);
        }
    }

    /* renamed from: k */
    private final void m13362k(int i) {
        int i2 = this.f9937r;
        int i3 = this.f9928i;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f9928i = i4;
            this.f9929j = Arrays.copyOf(this.f9929j, i4 * this.f9921b);
        }
    }

    /* renamed from: l */
    private static void m13363l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: m */
    private final void m13364m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f9937r;
        float f = this.f9934o / this.f9935p;
        double d = (double) f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f9936q;
            if (i11 >= this.f9924e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f9939t;
                    if (i13 > 0) {
                        int min = Math.min(this.f9924e, i13);
                        m13359h(this.f9927h, i12, min);
                        this.f9939t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f9927h;
                        int i14 = this.f9920a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f9921b == i10 && i15 == i10) {
                            i5 = m13358g(sArr, i12, this.f9922c, this.f9923d);
                        } else {
                            m13360i(sArr, i12, i15);
                            int g = m13358g(this.f9925f, 0, this.f9922c / i15, this.f9923d / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f9922c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f9923d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f9921b == i10) {
                                    i5 = m13358g(sArr, i12, i18, i19);
                                } else {
                                    m13360i(sArr, i12, i10);
                                    i5 = m13358g(this.f9925f, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f9942w;
                        int i23 = (i22 == 0 || (i8 = this.f9940u) == 0 || this.f9943x > i22 * 3 || i22 + i22 <= this.f9941v * 3) ? i5 : i8;
                        this.f9941v = i22;
                        this.f9940u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f9927h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f));
                            } else {
                                this.f9939t = (int) ((((float) i23) * (2.0f - f)) / (-1.0f + f));
                                i7 = i23;
                            }
                            m13362k(i7);
                            int i24 = i7;
                            m13363l(i7, this.f9921b, this.f9929j, this.f9937r, sArr2, i12, sArr2, i12 + i23);
                            this.f9937r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f9927h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i25) * f) / (1.0f - f));
                            } else {
                                this.f9939t = (int) ((((float) i25) * ((f + f) - 4.0f)) / (1.0f - f));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            m13362k(i26);
                            int i27 = this.f9921b;
                            System.arraycopy(sArr3, i12 * i27, this.f9929j, this.f9937r * i27, i27 * i25);
                            m13363l(i6, this.f9921b, this.f9929j, this.f9937r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.f9937r += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f9924e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.f9936q - i12;
                short[] sArr4 = this.f9927h;
                int i29 = this.f9921b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f9936q = i28;
            }
        } else {
            m13359h(this.f9927h, 0, this.f9936q);
            this.f9936q = 0;
        }
        float f2 = this.f9935p;
        if (f2 != 1.0f && this.f9937r != i9) {
            int i30 = this.f9920a;
            int i31 = (int) (((float) i30) / f2);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f9937r - i9;
            int i33 = this.f9938s;
            int i34 = this.f9930k;
            if (i33 + i32 > i34) {
                int i35 = i34 + (i34 / 2) + i32;
                this.f9930k = i35;
                this.f9931l = Arrays.copyOf(this.f9931l, i35 * this.f9921b);
            }
            short[] sArr5 = this.f9929j;
            int i36 = this.f9921b;
            System.arraycopy(sArr5, i9 * i36, this.f9931l, this.f9938s * i36, i36 * i32);
            this.f9937r = i9;
            this.f9938s += i32;
            int i37 = 0;
            while (true) {
                i = this.f9938s;
                i2 = i - 1;
                if (i37 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f9932m + 1;
                    i4 = this.f9933n;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    m13362k(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f9921b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f9929j;
                        int i40 = this.f9937r;
                        short[] sArr7 = this.f9931l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f9933n;
                        int i43 = this.f9932m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                    this.f9933n++;
                    this.f9937r++;
                }
                this.f9932m = i3;
                if (i3 == i30) {
                    this.f9932m = 0;
                    C2335eq.m12245e(i4 == i31);
                    this.f9933n = 0;
                }
                i37++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f9931l;
                int i47 = this.f9921b;
                System.arraycopy(sArr8, i2 * i47, sArr8, 0, (i - i2) * i47);
                this.f9938s -= i2;
            }
        }
    }

    /* renamed from: a */
    public final int mo10557a() {
        return this.f9937r;
    }

    /* renamed from: b */
    public final void mo10558b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f9921b, this.f9937r);
        shortBuffer.put(this.f9929j, 0, this.f9921b * min);
        int i = this.f9937r - min;
        this.f9937r = i;
        short[] sArr = this.f9929j;
        int i2 = this.f9921b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void mo10559c() {
        int i;
        int i2 = this.f9936q;
        float f = this.f9934o;
        float f2 = this.f9935p;
        int i3 = this.f9937r + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f9938s)) / f2) + 0.5f));
        int i4 = this.f9924e;
        m13361j(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f9924e;
            i = i6 + i6;
            int i7 = this.f9921b;
            if (i5 >= i * i7) {
                break;
            }
            this.f9927h[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f9936q += i;
        m13364m();
        if (this.f9937r > i3) {
            this.f9937r = i3;
        }
        this.f9936q = 0;
        this.f9939t = 0;
        this.f9938s = 0;
    }

    /* renamed from: d */
    public final void mo10560d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f9921b;
        int i2 = remaining / i;
        int i3 = i * i2;
        m13361j(i2);
        shortBuffer.get(this.f9927h, this.f9936q * this.f9921b, (i3 + i3) / 2);
        this.f9936q += i2;
        m13364m();
    }

    /* renamed from: e */
    public final void mo10561e(float f) {
        this.f9935p = f;
    }

    /* renamed from: f */
    public final void mo10562f(float f) {
        this.f9934o = f;
    }
}
