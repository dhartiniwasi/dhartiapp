package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7369g9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7424l9 f32523a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f32524b;

    C7369g9(AppMeasurementDynamiteService appMeasurementDynamiteService, C7424l9 l9Var) {
        this.f32524b = appMeasurementDynamiteService;
        this.f32523a = l9Var;
    }

    public final void run() {
        this.f32524b.f32301a.mo24418I().mo24330H(this.f32523a);
    }
}
