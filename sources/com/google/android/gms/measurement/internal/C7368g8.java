package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7368g8 {

    /* renamed from: a */
    private C7357f8 f32521a;

    /* renamed from: b */
    final /* synthetic */ C7423l8 f32522b;

    C7368g8(C7423l8 l8Var) {
        this.f32522b = l8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24275a(long j) {
        this.f32521a = new C7357f8(this, this.f32522b.f32389a.mo24116a().mo18370a(), j);
        this.f32522b.f32704c.postDelayed(this.f32521a, 2000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24276b() {
        this.f32522b.mo24189f();
        C7357f8 f8Var = this.f32521a;
        if (f8Var != null) {
            this.f32522b.f32704c.removeCallbacks(f8Var);
        }
        this.f32522b.f32389a.mo24416F().f32960r.mo24581a(false);
    }
}
