package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7323c7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7454o6 f32392a;

    /* renamed from: b */
    final /* synthetic */ C7532v7 f32393b;

    C7323c7(C7532v7 v7Var, C7454o6 o6Var) {
        this.f32393b = v7Var;
        this.f32392a = o6Var;
    }

    public final void run() {
        C7532v7 v7Var = this.f32393b;
        C13028f H = v7Var.f33127d;
        if (H == null) {
            v7Var.f32389a.mo24135l().mo24256q().mo24208a("Failed to send current screen to service");
            return;
        }
        try {
            C7454o6 o6Var = this.f32392a;
            if (o6Var == null) {
                H.mo24162T3(0, (String) null, (String) null, v7Var.f32389a.mo24121d().getPackageName());
            } else {
                H.mo24162T3(o6Var.f32831c, o6Var.f32829a, o6Var.f32830b, v7Var.f32389a.mo24121d().getPackageName());
            }
            this.f32393b.m41978E();
        } catch (RemoteException e) {
            this.f32393b.f32389a.mo24135l().mo24256q().mo24209b("Failed to send current screen to the service", e);
        }
    }
}
