package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7334d7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32433a;

    /* renamed from: b */
    final /* synthetic */ Bundle f32434b;

    /* renamed from: c */
    final /* synthetic */ C7532v7 f32435c;

    C7334d7(C7532v7 v7Var, C7446n9 n9Var, Bundle bundle) {
        this.f32435c = v7Var;
        this.f32433a = n9Var;
        this.f32434b = bundle;
    }

    public final void run() {
        C7532v7 v7Var = this.f32435c;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Failed to send default event parameters to service");
            return;
        }
        try {
            C4141r.m28221k(this.f32433a);
            H.mo24173s1(this.f32434b, this.f32433a);
        } catch (RemoteException e) {
            this.f32435c.f32389a.mo24135l().mo24256q().mo24209b("Failed to send default event parameters to service", e);
        }
    }
}
