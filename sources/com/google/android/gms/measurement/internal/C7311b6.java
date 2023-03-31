package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7311b6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f32372a;

    /* renamed from: b */
    final /* synthetic */ C7388i6 f32373b;

    C7311b6(C7388i6 i6Var, AtomicReference atomicReference) {
        this.f32373b = i6Var;
        this.f32372a = atomicReference;
    }

    public final void run() {
        synchronized (this.f32372a) {
            try {
                this.f32372a.set(Double.valueOf(this.f32373b.f32389a.mo24443z().mo24286i(this.f32373b.f32389a.mo24412B().mo24736r(), C7516u2.f33027P)));
                this.f32372a.notify();
            } catch (Throwable th) {
                this.f32372a.notify();
                throw th;
            }
        }
    }
}
