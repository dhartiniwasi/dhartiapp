package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7302a8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7303a9 f32326a;

    /* renamed from: b */
    final /* synthetic */ Runnable f32327b;

    C7302a8(C7313b8 b8Var, C7303a9 a9Var, Runnable runnable) {
        this.f32326a = a9Var;
        this.f32327b = runnable;
    }

    public final void run() {
        this.f32326a.mo24119c();
        this.f32326a.mo24136l0(this.f32327b);
        this.f32326a.mo24104C();
    }
}
