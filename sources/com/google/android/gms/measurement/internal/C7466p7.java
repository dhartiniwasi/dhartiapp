package com.google.android.gms.measurement.internal;

import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7466p7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C13028f f32871a;

    /* renamed from: b */
    final /* synthetic */ C7521u7 f32872b;

    C7466p7(C7521u7 u7Var, C13028f fVar) {
        this.f32872b = u7Var;
        this.f32871a = fVar;
    }

    public final void run() {
        synchronized (this.f32872b) {
            this.f32872b.f33095a = false;
            if (!this.f32872b.f33097c.mo24727z()) {
                this.f32872b.f33097c.f32389a.mo24135l().mo24260v().mo24208a("Connected to service");
                this.f32872b.f33097c.mo24725x(this.f32871a);
            }
        }
    }
}
