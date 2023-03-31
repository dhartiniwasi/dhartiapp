package p415z9;

import p212d9.C9924p;

/* renamed from: z9.a */
/* compiled from: AlignmentPattern */
public final class C13475a extends C9924p {

    /* renamed from: c */
    private final float f47842c;

    C13475a(float f, float f2, float f3) {
        super(f, f2);
        this.f47842c = f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo38594f(float f, float f2, float f3) {
        if (Math.abs(f2 - mo32481d()) > f || Math.abs(f3 - mo32480c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f47842c);
        if (abs <= 1.0f || abs <= this.f47842c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C13475a mo38595g(float f, float f2, float f3) {
        return new C13475a((mo32480c() + f2) / 2.0f, (mo32481d() + f) / 2.0f, (this.f47842c + f3) / 2.0f);
    }
}
