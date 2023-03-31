package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7499s7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7521u7 f32973a;

    C7499s7(C7521u7 u7Var) {
        this.f32973a = u7Var;
    }

    public final void run() {
        C7532v7 v7Var = this.f32973a.f33097c;
        Context d = v7Var.f32389a.mo24121d();
        this.f32973a.f33097c.f32389a.mo24118b();
        C7532v7.m41985M(v7Var, new ComponentName(d, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
