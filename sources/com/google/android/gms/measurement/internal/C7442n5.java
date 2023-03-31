package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7442n5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f32773a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32774b;

    C7442n5(C7388i6 i6Var, long j) {
        this.f32774b = i6Var;
        this.f32773a = j;
    }

    public final void run() {
        this.f32774b.f32389a.mo24416F().f32953k.mo24605b(this.f32773a);
        this.f32774b.f32389a.mo24135l().mo24255p().mo24209b("Session timeout duration set", Long.valueOf(this.f32773a));
    }
}
