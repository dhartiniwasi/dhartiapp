package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7561y6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f33203a;

    /* renamed from: b */
    final /* synthetic */ C7532v7 f33204b;

    C7561y6(C7532v7 v7Var, C7446n9 n9Var) {
        this.f33204b = v7Var;
        this.f33203a = n9Var;
    }

    public final void run() {
        C7532v7 v7Var = this.f33204b;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C4141r.m28221k(this.f33203a);
            H.mo24169j5(this.f33203a);
        } catch (RemoteException e) {
            this.f33204b.f32389a.mo24135l().mo24256q().mo24209b("Failed to reset data on the service: remote exception", e);
        }
        this.f33204b.m41978E();
    }
}
