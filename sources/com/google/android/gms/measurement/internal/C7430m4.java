package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7430m4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7326d f32717a;

    /* renamed from: b */
    final /* synthetic */ C7310b5 f32718b;

    C7430m4(C7310b5 b5Var, C7326d dVar) {
        this.f32718b = b5Var;
        this.f32717a = dVar;
    }

    public final void run() {
        this.f32718b.f32369a.mo24119c();
        if (this.f32717a.f32398c.mo24243I1() == null) {
            this.f32718b.f32369a.mo24142r(this.f32717a);
        } else {
            this.f32718b.f32369a.mo24149y(this.f32717a);
        }
    }
}
