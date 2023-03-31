package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7300a6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f32321a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32322b;

    C7300a6(C7388i6 i6Var, AtomicReference atomicReference) {
        this.f32322b = i6Var;
        this.f32321a = atomicReference;
    }

    public final void run() {
        synchronized (this.f32321a) {
            try {
                this.f32321a.set(Integer.valueOf(this.f32322b.f32389a.mo24443z().mo24290n(this.f32322b.f32389a.mo24412B().mo24736r(), C7516u2.f33026O)));
                this.f32321a.notify();
            } catch (Throwable th) {
                this.f32321a.notify();
                throw th;
            }
        }
    }
}
