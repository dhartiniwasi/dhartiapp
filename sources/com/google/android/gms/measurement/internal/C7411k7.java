package com.google.android.gms.measurement.internal;

import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7411k7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32668a;

    /* renamed from: b */
    final /* synthetic */ boolean f32669b;

    /* renamed from: c */
    final /* synthetic */ C7524v f32670c;

    /* renamed from: d */
    final /* synthetic */ String f32671d;

    /* renamed from: e */
    final /* synthetic */ C7532v7 f32672e;

    C7411k7(C7532v7 v7Var, boolean z, C7446n9 n9Var, boolean z2, C7524v vVar, String str) {
        this.f32672e = v7Var;
        this.f32668a = n9Var;
        this.f32669b = z2;
        this.f32670c = vVar;
        this.f32671d = str;
    }

    public final void run() {
        C7524v vVar;
        C7532v7 v7Var = this.f32672e;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Failed to send event to service");
            return;
        }
        C4141r.m28221k(this.f32668a);
        C7532v7 v7Var2 = this.f32672e;
        if (this.f32669b) {
            vVar = null;
        } else {
            vVar = this.f32670c;
        }
        v7Var2.mo24719q(H, vVar, this.f32668a);
        this.f32672e.m41978E();
    }
}
