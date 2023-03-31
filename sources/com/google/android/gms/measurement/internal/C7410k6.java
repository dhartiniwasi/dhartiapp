package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7003i1;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7410k6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7003i1 f32666a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f32667b;

    C7410k6(AppMeasurementDynamiteService appMeasurementDynamiteService, C7003i1 i1Var) {
        this.f32667b = appMeasurementDynamiteService;
        this.f32666a = i1Var;
    }

    public final void run() {
        this.f32667b.f32301a.mo24421L().mo24710R(this.f32666a);
    }
}
