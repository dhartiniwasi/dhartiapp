package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7419l4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7326d f32691a;

    /* renamed from: b */
    final /* synthetic */ C7446n9 f32692b;

    /* renamed from: c */
    final /* synthetic */ C7310b5 f32693c;

    C7419l4(C7310b5 b5Var, C7326d dVar, C7446n9 n9Var) {
        this.f32693c = b5Var;
        this.f32691a = dVar;
        this.f32692b = n9Var;
    }

    public final void run() {
        this.f32693c.f32369a.mo24119c();
        if (this.f32691a.f32398c.mo24243I1() == null) {
            this.f32693c.f32369a.mo24144t(this.f32691a, this.f32692b);
        } else {
            this.f32693c.f32369a.mo24150z(this.f32691a, this.f32692b);
        }
    }
}
