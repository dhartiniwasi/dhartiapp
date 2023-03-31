package androidx.core.content.res;

/* renamed from: androidx.core.content.res.l */
/* compiled from: ViewingConditions */
final class C0720l {

    /* renamed from: k */
    static final C0720l f2253k = m3297k(C0695b.f2219c, (float) ((((double) C0695b.m3207h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f2254a;

    /* renamed from: b */
    private final float f2255b;

    /* renamed from: c */
    private final float f2256c;

    /* renamed from: d */
    private final float f2257d;

    /* renamed from: e */
    private final float f2258e;

    /* renamed from: f */
    private final float f2259f;

    /* renamed from: g */
    private final float[] f2260g;

    /* renamed from: h */
    private final float f2261h;

    /* renamed from: i */
    private final float f2262i;

    /* renamed from: j */
    private final float f2263j;

    private C0720l(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f2259f = f;
        this.f2254a = f2;
        this.f2255b = f3;
        this.f2256c = f4;
        this.f2257d = f5;
        this.f2258e = f6;
        this.f2260g = fArr;
        this.f2261h = f7;
        this.f2262i = f8;
        this.f2263j = f9;
    }

    /* renamed from: k */
    static C0720l m3297k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5 = f;
        float[][] fArr2 = C0695b.f2217a;
        float f6 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f7 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f8 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f9 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f9) >= 0.9d ? C0695b.m3203d(0.59f, 0.69f, (f9 - 0.9f) * 10.0f) : C0695b.m3203d(0.525f, 0.59f, (f9 - 0.8f) * 10.0f);
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = (1.0f - (((float) Math.exp((double) (((-f5) - 42.0f) / 92.0f))) * 0.2777778f)) * f9;
        }
        double d2 = (double) f4;
        if (d2 > 1.0d) {
            f4 = 1.0f;
        } else if (d2 < 0.0d) {
            f4 = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f6) * f4) + 1.0f) - f4, (((100.0f / f7) * f4) + 1.0f) - f4, (((100.0f / f8) * f4) + 1.0f) - f4};
        float f10 = 1.0f / ((5.0f * f5) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (f11 * f5) + (0.1f * f12 * f12 * ((float) Math.cbrt(((double) f5) * 5.0d)));
        float h = C0695b.m3207h(f2) / fArr[1];
        double d3 = (double) h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f8)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new C0720l(h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d, f9, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3043a() {
        return this.f2254a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo3044b() {
        return this.f2257d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo3045c() {
        return this.f2261h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo3046d() {
        return this.f2262i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo3047e() {
        return this.f2259f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo3048f() {
        return this.f2255b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo3049g() {
        return this.f2258e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo3050h() {
        return this.f2256c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] mo3051i() {
        return this.f2260g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo3052j() {
        return this.f2263j;
    }
}
