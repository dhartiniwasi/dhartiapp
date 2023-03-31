package com.google.android.gms.measurement.internal;

import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7422l7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32699a;

    /* renamed from: b */
    final /* synthetic */ boolean f32700b;

    /* renamed from: c */
    final /* synthetic */ C7326d f32701c;

    /* renamed from: d */
    final /* synthetic */ C7326d f32702d;

    /* renamed from: e */
    final /* synthetic */ C7532v7 f32703e;

    C7422l7(C7532v7 v7Var, boolean z, C7446n9 n9Var, boolean z2, C7326d dVar, C7326d dVar2) {
        this.f32703e = v7Var;
        this.f32699a = n9Var;
        this.f32700b = z2;
        this.f32701c = dVar;
        this.f32702d = dVar2;
    }

    public final void run() {
        C7326d dVar;
        C7532v7 v7Var = this.f32703e;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C4141r.m28221k(this.f32699a);
        C7532v7 v7Var2 = this.f32703e;
        if (this.f32700b) {
            dVar = null;
        } else {
            dVar = this.f32701c;
        }
        v7Var2.mo24719q(H, dVar, this.f32699a);
        this.f32703e.m41978E();
    }
}
