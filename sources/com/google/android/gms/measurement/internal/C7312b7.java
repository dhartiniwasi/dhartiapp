package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p033d5.C4141r;
import p040e5.C4240a;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7312b7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32374a;

    /* renamed from: b */
    final /* synthetic */ C7532v7 f32375b;

    C7312b7(C7532v7 v7Var, C7446n9 n9Var) {
        this.f32375b = v7Var;
        this.f32374a = n9Var;
    }

    public final void run() {
        C7532v7 v7Var = this.f32375b;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C4141r.m28221k(this.f32374a);
            H.mo24154B3(this.f32374a);
            this.f32375b.f32389a.mo24413C().mo24773t();
            this.f32375b.mo24719q(H, (C4240a) null, this.f32374a);
            this.f32375b.m41978E();
        } catch (RemoteException e) {
            this.f32375b.f32389a.mo24135l().mo24256q().mo24209b("Failed to send app launch to the service", e);
        }
    }
}
