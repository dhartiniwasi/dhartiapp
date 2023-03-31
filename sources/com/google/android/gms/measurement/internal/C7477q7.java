package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7477q7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f32900a;

    /* renamed from: b */
    final /* synthetic */ C7521u7 f32901b;

    C7477q7(C7521u7 u7Var, ComponentName componentName) {
        this.f32901b = u7Var;
        this.f32900a = componentName;
    }

    public final void run() {
        C7532v7.m41985M(this.f32901b.f33097c, this.f32900a);
    }
}
