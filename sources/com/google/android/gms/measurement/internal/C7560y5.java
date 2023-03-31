package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7560y5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f33201a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f33202b;

    C7560y5(C7388i6 i6Var, AtomicReference atomicReference) {
        this.f33202b = i6Var;
        this.f33201a = atomicReference;
    }

    public final void run() {
        synchronized (this.f33201a) {
            try {
                this.f33201a.set(this.f33202b.f32389a.mo24443z().mo24299x(this.f33202b.f32389a.mo24412B().mo24736r(), C7516u2.f33024M));
                this.f33201a.notify();
            } catch (Throwable th) {
                this.f33201a.notify();
                throw th;
            }
        }
    }
}
