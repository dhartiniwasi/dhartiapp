package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7003i1;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class C7402j9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7003i1 f32654a;

    /* renamed from: b */
    final /* synthetic */ String f32655b;

    /* renamed from: c */
    final /* synthetic */ String f32656c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f32657d;

    C7402j9(AppMeasurementDynamiteService appMeasurementDynamiteService, C7003i1 i1Var, String str, String str2) {
        this.f32657d = appMeasurementDynamiteService;
        this.f32654a = i1Var;
        this.f32655b = str;
        this.f32656c = str2;
    }

    public final void run() {
        this.f32657d.f32301a.mo24421L().mo24712T(this.f32654a, this.f32655b, this.f32656c);
    }
}
