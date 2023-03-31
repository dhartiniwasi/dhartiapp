package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2109m0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2112n0 f6242a;

    C2109m0(C2112n0 n0Var) {
        this.f6242a = n0Var;
    }

    public final void run() {
        C2115o0 o0Var = this.f6242a.f6245a;
        o0Var.f6249b.mo6933d(o0Var.f6249b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
