package com.google.android.gms.measurement.internal;

import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7551x6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f33181a;

    /* renamed from: b */
    final /* synthetic */ boolean f33182b;

    /* renamed from: c */
    final /* synthetic */ C7336d9 f33183c;

    /* renamed from: d */
    final /* synthetic */ C7532v7 f33184d;

    C7551x6(C7532v7 v7Var, C7446n9 n9Var, boolean z, C7336d9 d9Var) {
        this.f33184d = v7Var;
        this.f33181a = n9Var;
        this.f33182b = z;
        this.f33183c = d9Var;
    }

    public final void run() {
        C7336d9 d9Var;
        C7532v7 v7Var = this.f33184d;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Failed to set user property");
            return;
        }
        C4141r.m28221k(this.f33181a);
        C7532v7 v7Var2 = this.f33184d;
        if (this.f33182b) {
            d9Var = null;
        } else {
            d9Var = this.f33183c;
        }
        v7Var2.mo24719q(H, d9Var, this.f33181a);
        this.f33184d.m41978E();
    }
}
