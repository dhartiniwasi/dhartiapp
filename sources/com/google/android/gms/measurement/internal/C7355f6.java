package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7355f6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f32480a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32481b;

    C7355f6(C7388i6 i6Var, boolean z) {
        this.f32481b = i6Var;
        this.f32480a = z;
    }

    public final void run() {
        boolean n = this.f32481b.f32389a.mo24436n();
        boolean m = this.f32481b.f32389a.mo24435m();
        this.f32481b.f32389a.mo24432i(this.f32480a);
        if (m == this.f32480a) {
            this.f32481b.f32389a.mo24135l().mo24260v().mo24209b("Default data collection state already set to", Boolean.valueOf(this.f32480a));
        }
        if (this.f32481b.f32389a.mo24436n() == n || this.f32481b.f32389a.mo24436n() != this.f32481b.f32389a.mo24435m()) {
            this.f32481b.f32389a.mo24135l().mo24262x().mo24210c("Default data collection is different than actual status", Boolean.valueOf(this.f32480a), Boolean.valueOf(n));
        }
        this.f32481b.m41547P();
    }
}
