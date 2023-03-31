package androidx.core.content.res;

import androidx.core.graphics.C0723b;

/* renamed from: androidx.core.content.res.a */
/* compiled from: CamColor */
class C0694a {

    /* renamed from: a */
    private final float f2208a;

    /* renamed from: b */
    private final float f2209b;

    /* renamed from: c */
    private final float f2210c;

    /* renamed from: d */
    private final float f2211d;

    /* renamed from: e */
    private final float f2212e;

    /* renamed from: f */
    private final float f2213f;

    /* renamed from: g */
    private final float f2214g;

    /* renamed from: h */
    private final float f2215h;

    /* renamed from: i */
    private final float f2216i;

    C0694a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f2208a = f;
        this.f2209b = f2;
        this.f2210c = f3;
        this.f2211d = f4;
        this.f2212e = f5;
        this.f2213f = f6;
        this.f2214g = f7;
        this.f2215h = f8;
        this.f2216i = f9;
    }

    /* renamed from: b */
    private static C0694a m3184b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        C0694a aVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int p = m3187e(f8, f2, f).mo3018p();
            float b = C0695b.m3201b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C0694a c = m3185c(p);
                float a = c.mo3010a(m3187e(c.mo3015k(), c.mo3013i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f4 = abs;
                    f5 = a;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (b < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return aVar;
    }

    /* renamed from: c */
    static C0694a m3185c(int i) {
        return m3186d(i, C0720l.f2253k);
    }

    /* renamed from: d */
    static C0694a m3186d(int i, C0720l lVar) {
        float[] f = C0695b.m3205f(i);
        float[][] fArr = C0695b.f2217a;
        float f2 = (f[0] * fArr[0][0]) + (f[1] * fArr[0][1]) + (f[2] * fArr[0][2]);
        float f3 = (f[0] * fArr[1][0]) + (f[1] * fArr[1][1]) + (f[2] * fArr[1][2]);
        float f4 = (f[0] * fArr[2][0]) + (f[1] * fArr[2][1]) + (f[2] * fArr[2][2]);
        float f5 = lVar.mo3051i()[0] * f2;
        float f6 = lVar.mo3051i()[1] * f3;
        float f7 = lVar.mo3051i()[2] * f4;
        float pow = (float) Math.pow(((double) (lVar.mo3045c() * Math.abs(f5))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.mo3045c() * Math.abs(f6))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.mo3045c() * Math.abs(f7))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f8 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f9 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f9, (double) f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f12 * lVar.mo3048f()) / lVar.mo3043a()), (double) (lVar.mo3044b() * lVar.mo3052j()))) * 100.0f;
        float d2 = lVar.mo3046d() * (4.0f / lVar.mo3044b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.mo3043a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.mo3047e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f13) < 20.14d ? 360.0f + f13 : f13)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.mo3049g()) * lVar.mo3050h()) * ((float) Math.sqrt((double) ((f8 * f8) + (f9 * f9))))) / (f11 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * lVar.mo3046d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.mo3044b()) / (lVar.mo3043a() + 4.0f)))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f14;
        return new C0694a(f13, sqrt, pow4, d2, d3, sqrt2, f15, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: e */
    private static C0694a m3187e(float f, float f2, float f3) {
        return m3188f(f, f2, f3, C0720l.f2253k);
    }

    /* renamed from: f */
    private static C0694a m3188f(float f, float f2, float f3, C0720l lVar) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / lVar.mo3044b()) * ((float) Math.sqrt(d)) * (lVar.mo3043a() + 4.0f) * lVar.mo3046d();
        float d2 = f2 * lVar.mo3046d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * lVar.mo3044b()) / (lVar.mo3043a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C0694a(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: m */
    static int m3189m(float f, float f2, float f3) {
        return m3190n(f, f2, f3, C0720l.f2253k);
    }

    /* renamed from: n */
    static int m3190n(float f, float f2, float f3, C0720l lVar) {
        float f4;
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return C0695b.m3200a(f3);
        }
        if (f < 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = Math.min(360.0f, f);
        }
        float f5 = f2;
        C0694a aVar = null;
        float f6 = 0.0f;
        boolean z = true;
        while (Math.abs(f6 - f2) >= 0.4f) {
            C0694a b = m3184b(f4, f5, f3);
            if (z) {
                if (b != null) {
                    return b.mo3017o(lVar);
                }
                z = false;
            } else if (b == null) {
                f2 = f5;
            } else {
                f6 = f5;
                aVar = b;
            }
            f5 = ((f2 - f6) / 2.0f) + f6;
        }
        if (aVar == null) {
            return C0695b.m3200a(f3);
        }
        return aVar.mo3017o(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3010a(C0694a aVar) {
        float l = mo3016l() - aVar.mo3016l();
        float g = mo3011g() - aVar.mo3011g();
        float h = mo3012h() - aVar.mo3012h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo3011g() {
        return this.f2215h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo3012h() {
        return this.f2216i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo3013i() {
        return this.f2209b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo3014j() {
        return this.f2208a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo3015k() {
        return this.f2210c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo3016l() {
        return this.f2214g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo3017o(C0720l lVar) {
        float pow = (float) Math.pow(((double) ((((double) mo3013i()) == 0.0d || ((double) mo3015k()) == 0.0d) ? 0.0f : mo3013i() / ((float) Math.sqrt(((double) mo3015k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.mo3047e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo3014j() * 3.1415927f) / 180.0f);
        float a = lVar.mo3043a() * ((float) Math.pow(((double) mo3015k()) / 100.0d, (1.0d / ((double) lVar.mo3044b())) / ((double) lVar.mo3052j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * lVar.mo3049g() * lVar.mo3050h();
        float f = a / lVar.mo3048f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / lVar.mo3045c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / lVar.mo3045c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum3 = Math.signum(f8) * (100.0f / lVar.mo3045c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float f9 = signum / lVar.mo3051i()[0];
        float f10 = signum2 / lVar.mo3051i()[1];
        float f11 = signum3 / lVar.mo3051i()[2];
        float[][] fArr = C0695b.f2218b;
        return C0723b.m3310a((double) ((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11)), (double) ((fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11)), (double) ((f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2])));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo3018p() {
        return mo3017o(C0720l.f2253k);
    }
}
