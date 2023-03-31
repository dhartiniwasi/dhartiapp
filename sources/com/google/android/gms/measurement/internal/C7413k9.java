package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7003i1;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7413k9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7003i1 f32674a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f32675b;

    C7413k9(AppMeasurementDynamiteService appMeasurementDynamiteService, C7003i1 i1Var) {
        this.f32675b = appMeasurementDynamiteService;
        this.f32674a = i1Var;
    }

    public final void run() {
        this.f32675b.f32301a.mo24423N().mo24367D(this.f32674a, this.f32675b.f32301a.mo24435m());
    }
}
