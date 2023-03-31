package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7400j7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32648a;

    /* renamed from: b */
    final /* synthetic */ C7532v7 f32649b;

    C7400j7(C7532v7 v7Var, C7446n9 n9Var) {
        this.f32649b = v7Var;
        this.f32648a = n9Var;
    }

    public final void run() {
        C7532v7 v7Var = this.f32649b;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Failed to send consent settings to service");
            return;
        }
        try {
            C4141r.m28221k(this.f32648a);
            H.mo24157F4(this.f32648a);
            this.f32649b.m41978E();
        } catch (RemoteException e) {
            this.f32649b.f32389a.mo24135l().mo24256q().mo24209b("Failed to send consent settings to the service", e);
        }
    }
}
