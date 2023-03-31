package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7345e7 extends C7447o {

    /* renamed from: e */
    final /* synthetic */ C7532v7 f32457e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7345e7(C7532v7 v7Var, C7343e5 e5Var) {
        super(e5Var);
        this.f32457e = v7Var;
    }

    /* renamed from: c */
    public final void mo24249c() {
        C7532v7 v7Var = this.f32457e;
        v7Var.mo24189f();
        if (v7Var.mo24727z()) {
            v7Var.f32389a.mo24135l().mo24260v().mo24208a("Inactivity, disconnecting from the service");
            v7Var.mo24709Q();
        }
    }
}
