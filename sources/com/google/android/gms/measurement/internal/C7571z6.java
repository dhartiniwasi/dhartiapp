package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4141r;
import p402y5.C13018a;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7571z6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f33224a;

    /* renamed from: b */
    final /* synthetic */ C7446n9 f33225b;

    /* renamed from: c */
    final /* synthetic */ C7532v7 f33226c;

    C7571z6(C7532v7 v7Var, AtomicReference atomicReference, C7446n9 n9Var) {
        this.f33226c = v7Var;
        this.f33224a = atomicReference;
        this.f33225b = n9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f33224a) {
            try {
                if (!this.f33226c.f32389a.mo24416F().mo24644p().mo38074i(C13018a.ANALYTICS_STORAGE)) {
                    this.f33226c.f32389a.mo24135l().mo24262x().mo24208a("Analytics storage consent denied; will not get app instance id");
                    this.f33226c.f32389a.mo24418I().mo24325C((String) null);
                    this.f33226c.f32389a.mo24416F().f32949g.mo24632b((String) null);
                    this.f33224a.set((Object) null);
                    this.f33224a.notify();
                    return;
                }
                C7532v7 v7Var = this.f33226c;
                C13028f H = v7Var.f33127d;
                if (H == null) {
                    v7Var.f32389a.mo24135l().mo24256q().mo24208a("Failed to get app instance id");
                    this.f33224a.notify();
                    return;
                }
                C4141r.m28221k(this.f33225b);
                this.f33224a.set(H.mo24164W1(this.f33225b));
                String str = (String) this.f33224a.get();
                if (str != null) {
                    this.f33226c.f32389a.mo24418I().mo24325C(str);
                    this.f33226c.f32389a.mo24416F().f32949g.mo24632b(str);
                }
                this.f33226c.m41978E();
                atomicReference = this.f33224a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f33226c.f32389a.mo24135l().mo24256q().mo24209b("Failed to get app instance id", e);
                    atomicReference = this.f33224a;
                } catch (Throwable th) {
                    this.f33224a.notify();
                    throw th;
                }
            }
        }
    }
}
