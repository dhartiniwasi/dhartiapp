package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7003i1;
import p033d5.C4141r;
import p402y5.C13018a;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7301a7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7446n9 f32323a;

    /* renamed from: b */
    final /* synthetic */ C7003i1 f32324b;

    /* renamed from: c */
    final /* synthetic */ C7532v7 f32325c;

    C7301a7(C7532v7 v7Var, C7446n9 n9Var, C7003i1 i1Var) {
        this.f32325c = v7Var;
        this.f32323a = n9Var;
        this.f32324b = i1Var;
    }

    public final void run() {
        C7397j4 j4Var;
        String str = null;
        try {
            if (!this.f32325c.f32389a.mo24416F().mo24644p().mo38074i(C13018a.ANALYTICS_STORAGE)) {
                this.f32325c.f32389a.mo24135l().mo24262x().mo24208a("Analytics storage consent denied; will not get app instance id");
                this.f32325c.f32389a.mo24418I().mo24325C((String) null);
                this.f32325c.f32389a.mo24416F().f32949g.mo24632b((String) null);
                j4Var = this.f32325c.f32389a;
            } else {
                C7532v7 v7Var = this.f32325c;
                C13028f H = v7Var.f33127d;
                if (H == null) {
                    v7Var.f32389a.mo24135l().mo24256q().mo24208a("Failed to get app instance id");
                    j4Var = this.f32325c.f32389a;
                } else {
                    C4141r.m28221k(this.f32323a);
                    str = H.mo24164W1(this.f32323a);
                    if (str != null) {
                        this.f32325c.f32389a.mo24418I().mo24325C(str);
                        this.f32325c.f32389a.mo24416F().f32949g.mo24632b(str);
                    }
                    this.f32325c.m41978E();
                    j4Var = this.f32325c.f32389a;
                }
            }
        } catch (RemoteException e) {
            this.f32325c.f32389a.mo24135l().mo24256q().mo24209b("Failed to get app instance id", e);
            j4Var = this.f32325c.f32389a;
        } catch (Throwable th) {
            this.f32325c.f32389a.mo24423N().mo24373J(this.f32324b, (String) null);
            throw th;
        }
        j4Var.mo24423N().mo24373J(this.f32324b, str);
    }
}
