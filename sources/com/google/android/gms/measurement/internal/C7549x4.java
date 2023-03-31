package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7549x4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7336d9 f33177a;

    /* renamed from: b */
    final /* synthetic */ C7446n9 f33178b;

    /* renamed from: c */
    final /* synthetic */ C7310b5 f33179c;

    C7549x4(C7310b5 b5Var, C7336d9 d9Var, C7446n9 n9Var) {
        this.f33179c = b5Var;
        this.f33177a = d9Var;
        this.f33178b = n9Var;
    }

    public final void run() {
        this.f33179c.f32369a.mo24119c();
        if (this.f33177a.mo24243I1() == null) {
            this.f33179c.f32369a.mo24145u(this.f33177a, this.f33178b);
        } else {
            this.f33179c.f32369a.mo24103B(this.f33177a, this.f33178b);
        }
    }
}
