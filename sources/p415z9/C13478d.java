package p415z9;

import p212d9.C9924p;

/* renamed from: z9.d */
/* compiled from: FinderPattern */
public final class C13478d extends C9924p {

    /* renamed from: c */
    private final float f47854c;

    /* renamed from: d */
    private final int f47855d;

    C13478d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo38601f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo32481d()) > f || Math.abs(f3 - mo32480c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f47854c);
        if (abs <= 1.0f || abs <= this.f47854c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C13478d mo38602g(float f, float f2, float f3) {
        int i = this.f47855d;
        int i2 = i + 1;
        float c = (((float) i) * mo32480c()) + f2;
        float f4 = (float) i2;
        return new C13478d(c / f4, ((((float) this.f47855d) * mo32481d()) + f) / f4, ((((float) this.f47855d) * this.f47854c) + f3) / f4, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo38603h() {
        return this.f47855d;
    }

    /* renamed from: i */
    public float mo38604i() {
        return this.f47854c;
    }

    private C13478d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f47854c = f3;
        this.f47855d = i;
    }
}
