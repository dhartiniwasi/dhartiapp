package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7003i1;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7389i7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7003i1 f32578a;

    /* renamed from: b */
    final /* synthetic */ C7524v f32579b;

    /* renamed from: c */
    final /* synthetic */ String f32580c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f32581d;

    C7389i7(AppMeasurementDynamiteService appMeasurementDynamiteService, C7003i1 i1Var, C7524v vVar, String str) {
        this.f32581d = appMeasurementDynamiteService;
        this.f32578a = i1Var;
        this.f32579b = vVar;
        this.f32580c = str;
    }

    public final void run() {
        this.f32581d.f32301a.mo24421L().mo24717o(this.f32578a, this.f32579b, this.f32580c);
    }
}
