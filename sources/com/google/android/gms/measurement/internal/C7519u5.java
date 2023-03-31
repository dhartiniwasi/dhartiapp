package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7519u5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f33092a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f33093b;

    C7519u5(C7388i6 i6Var, AtomicReference atomicReference) {
        this.f33093b = i6Var;
        this.f33092a = atomicReference;
    }

    public final void run() {
        synchronized (this.f33092a) {
            try {
                this.f33092a.set(Boolean.valueOf(this.f33093b.f32389a.mo24443z().mo24279B(this.f33093b.f32389a.mo24412B().mo24736r(), C7516u2.f33023L)));
                this.f33092a.notify();
            } catch (Throwable th) {
                this.f33092a.notify();
                throw th;
            }
        }
    }
}
