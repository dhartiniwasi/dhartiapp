package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7570z5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f33222a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f33223b;

    C7570z5(C7388i6 i6Var, AtomicReference atomicReference) {
        this.f33223b = i6Var;
        this.f33222a = atomicReference;
    }

    public final void run() {
        synchronized (this.f33222a) {
            try {
                this.f33222a.set(Long.valueOf(this.f33223b.f32389a.mo24443z().mo24293q(this.f33223b.f32389a.mo24412B().mo24736r(), C7516u2.f33025N)));
                this.f33222a.notify();
            } catch (Throwable th) {
                this.f33222a.notify();
                throw th;
            }
        }
    }
}
