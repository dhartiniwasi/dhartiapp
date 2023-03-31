package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C7346e8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C7357f8 f32458a;

    public /* synthetic */ C7346e8(C7357f8 f8Var) {
        this.f32458a = f8Var;
    }

    public final void run() {
        C7357f8 f8Var = this.f32458a;
        C7368g8 g8Var = f8Var.f32488c;
        long j = f8Var.f32486a;
        long j2 = f8Var.f32487b;
        g8Var.f32522b.mo24189f();
        g8Var.f32522b.f32389a.mo24135l().mo24255p().mo24208a("Application going to the background");
        g8Var.f32522b.f32389a.mo24416F().f32960r.mo24581a(true);
        Bundle bundle = new Bundle();
        if (!g8Var.f32522b.f32389a.mo24443z().mo24281D()) {
            g8Var.f32522b.f32706e.mo24448b(j2);
            g8Var.f32522b.f32706e.mo24450d(false, false, j2);
        }
        g8Var.f32522b.f32389a.mo24418I().mo24357v("auto", "_ab", j, bundle);
    }
}
