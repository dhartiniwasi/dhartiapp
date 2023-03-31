package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
abstract class C7478q8 extends C7467p8 {

    /* renamed from: c */
    private boolean f32902c;

    C7478q8(C7303a9 a9Var) {
        super(a9Var);
        this.f32873b.mo24141q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo24623g() {
        if (!mo24625i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void mo24624h() {
        if (!this.f32902c) {
            mo24151j();
            this.f32873b.mo24134k();
            this.f32902c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo24625i() {
        return this.f32902c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo24151j();
}
