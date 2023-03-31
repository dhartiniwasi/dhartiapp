package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7003i1;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7390i8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7003i1 f32582a;

    /* renamed from: b */
    final /* synthetic */ String f32583b;

    /* renamed from: c */
    final /* synthetic */ String f32584c;

    /* renamed from: d */
    final /* synthetic */ boolean f32585d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f32586e;

    C7390i8(AppMeasurementDynamiteService appMeasurementDynamiteService, C7003i1 i1Var, String str, String str2, boolean z) {
        this.f32586e = appMeasurementDynamiteService;
        this.f32582a = i1Var;
        this.f32583b = str;
        this.f32584c = str2;
        this.f32585d = z;
    }

    public final void run() {
        this.f32586e.f32301a.mo24421L().mo24714V(this.f32582a, this.f32583b, this.f32584c, this.f32585d);
    }
}
