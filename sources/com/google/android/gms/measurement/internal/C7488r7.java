package com.google.android.gms.measurement.internal;

import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7488r7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C13028f f32933a;

    /* renamed from: b */
    final /* synthetic */ C7521u7 f32934b;

    C7488r7(C7521u7 u7Var, C13028f fVar) {
        this.f32934b = u7Var;
        this.f32933a = fVar;
    }

    public final void run() {
        synchronized (this.f32934b) {
            this.f32934b.f33095a = false;
            if (!this.f32934b.f33097c.mo24727z()) {
                this.f32934b.f33097c.f32389a.mo24135l().mo24255p().mo24208a("Connected to remote service");
                this.f32934b.f33097c.mo24725x(this.f32933a);
            }
        }
    }
}
