package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
abstract class C7538w3 extends C7557y2 {

    /* renamed from: b */
    private boolean f33152b;

    C7538w3(C7397j4 j4Var) {
        super(j4Var);
        this.f32389a.mo24430g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo24741g() {
        if (!mo24744k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void mo24742h() {
        if (this.f33152b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo24349m()) {
            this.f32389a.mo24428e();
            this.f33152b = true;
        }
    }

    /* renamed from: i */
    public final void mo24743i() {
        if (!this.f33152b) {
            mo24731j();
            this.f32389a.mo24428e();
            this.f33152b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo24731j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo24744k() {
        return this.f33152b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo24349m();
}
