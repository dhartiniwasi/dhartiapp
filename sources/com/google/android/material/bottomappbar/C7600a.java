package com.google.android.material.bottomappbar;

import p375v6.C12821f;
import p375v6.C12836m;

/* renamed from: com.google.android.material.bottomappbar.a */
/* compiled from: BottomAppBarTopEdgeTreatment */
public class C7600a extends C12821f implements Cloneable {

    /* renamed from: a */
    private float f33347a;

    /* renamed from: b */
    private float f33348b;

    /* renamed from: c */
    private float f33349c;

    /* renamed from: d */
    private float f33350d;

    /* renamed from: e */
    private float f33351e;

    /* renamed from: a */
    public void mo24929a(float f, float f2, float f3, C12836m mVar) {
        float f4 = f;
        C12836m mVar2 = mVar;
        float f5 = this.f33349c;
        if (f5 == 0.0f) {
            mVar2.mo37820l(f4, 0.0f);
            return;
        }
        float f6 = ((this.f33348b * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f33347a;
        float f8 = f2 + this.f33351e;
        float f9 = (this.f33350d * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar2.mo37820l(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar2.mo37820l(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        mVar.mo37813a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.mo37813a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.mo37813a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        mVar2.mo37820l(f4, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo24930b() {
        return this.f33350d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo24931c() {
        return this.f33348b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo24932d() {
        return this.f33347a;
    }

    /* renamed from: e */
    public float mo24933e() {
        return this.f33349c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24934f(float f) {
        this.f33350d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24935g(float f) {
        this.f33348b = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo24936h(float f) {
        this.f33347a = f;
    }

    /* renamed from: i */
    public void mo24937i(float f) {
        this.f33349c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo24938j(float f) {
        this.f33351e = f;
    }
}
