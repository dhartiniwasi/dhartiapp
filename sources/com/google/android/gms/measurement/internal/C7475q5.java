package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7475q5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f32893a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32894b;

    C7475q5(C7388i6 i6Var, long j) {
        this.f32894b = i6Var;
        this.f32893a = j;
    }

    public final void run() {
        this.f32894b.mo24361z(this.f32893a, true);
        this.f32894b.f32389a.mo24421L().mo24711S(new AtomicReference());
    }
}
