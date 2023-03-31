package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7465p6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f32866a;

    /* renamed from: b */
    final /* synthetic */ C7454o6 f32867b;

    /* renamed from: c */
    final /* synthetic */ C7454o6 f32868c;

    /* renamed from: d */
    final /* synthetic */ long f32869d;

    /* renamed from: e */
    final /* synthetic */ C7531v6 f32870e;

    C7465p6(C7531v6 v6Var, Bundle bundle, C7454o6 o6Var, C7454o6 o6Var2, long j) {
        this.f32870e = v6Var;
        this.f32866a = bundle;
        this.f32867b = o6Var;
        this.f32868c = o6Var2;
        this.f32869d = j;
    }

    public final void run() {
        C7531v6.m41963w(this.f32870e, this.f32866a, this.f32867b, this.f32868c, this.f32869d);
    }
}
