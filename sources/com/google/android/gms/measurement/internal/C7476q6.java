package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7476q6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7454o6 f32895a;

    /* renamed from: b */
    final /* synthetic */ C7454o6 f32896b;

    /* renamed from: c */
    final /* synthetic */ long f32897c;

    /* renamed from: d */
    final /* synthetic */ boolean f32898d;

    /* renamed from: e */
    final /* synthetic */ C7531v6 f32899e;

    C7476q6(C7531v6 v6Var, C7454o6 o6Var, C7454o6 o6Var2, long j, boolean z) {
        this.f32899e = v6Var;
        this.f32895a = o6Var;
        this.f32896b = o6Var2;
        this.f32897c = j;
        this.f32898d = z;
    }

    public final void run() {
        this.f32899e.m41958n(this.f32895a, this.f32896b, this.f32897c, this.f32898d, (Bundle) null);
    }
}
