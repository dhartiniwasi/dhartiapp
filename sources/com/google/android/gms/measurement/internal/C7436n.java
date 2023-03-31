package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7436n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7343e5 f32759a;

    /* renamed from: b */
    final /* synthetic */ C7447o f32760b;

    C7436n(C7447o oVar, C7343e5 e5Var) {
        this.f32760b = oVar;
        this.f32759a = e5Var;
    }

    public final void run() {
        this.f32759a.mo24118b();
        if (C7315c.m41378a()) {
            this.f32759a.mo24143s().mo24309z(this);
            return;
        }
        boolean e = this.f32760b.mo24589e();
        this.f32760b.f32808c = 0;
        if (e) {
            this.f32760b.mo24249c();
        }
    }
}
