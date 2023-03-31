package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
abstract class C7332d5 extends C7321c5 {

    /* renamed from: b */
    private boolean f32425b;

    C7332d5(C7397j4 j4Var) {
        super(j4Var);
        this.f32389a.mo24430g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo24234g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo24235h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo24236i() {
        if (!mo24239m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo24237j() {
        if (this.f32425b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo24235h()) {
            this.f32389a.mo24428e();
            this.f32425b = true;
        }
    }

    /* renamed from: k */
    public final void mo24238k() {
        if (!this.f32425b) {
            mo24234g();
            this.f32389a.mo24428e();
            this.f32425b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo24239m() {
        return this.f32425b;
    }
}
