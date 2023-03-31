package com.google.android.gms.measurement.internal;

import p033d5.C4141r;
import p402y5.C13020b;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7507t4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32992a;

    /* renamed from: b */
    final /* synthetic */ C7310b5 f32993b;

    C7507t4(C7310b5 b5Var, C7446n9 n9Var) {
        this.f32993b = b5Var;
        this.f32992a = n9Var;
    }

    public final void run() {
        this.f32993b.f32369a.mo24119c();
        C7303a9 o3 = this.f32993b.f32369a;
        C7446n9 n9Var = this.f32992a;
        o3.mo24143s().mo24189f();
        o3.mo24123e();
        C4141r.m28217g(n9Var.f32787a);
        C13020b b = C13020b.m61314b(n9Var.f32784D);
        C13020b V = o3.mo24111V(n9Var.f32787a);
        o3.mo24135l().mo24260v().mo24210c("Setting consent, package, consent", n9Var.f32787a, b);
        o3.mo24102A(n9Var.f32787a, b);
        if (b.mo38075k(V)) {
            o3.mo24146v(n9Var);
        }
    }
}
