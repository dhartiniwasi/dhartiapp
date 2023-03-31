package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
abstract class C7164s2 implements Runnable {

    /* renamed from: a */
    final long f32044a;

    /* renamed from: b */
    final long f32045b;

    /* renamed from: c */
    final boolean f32046c;

    /* renamed from: d */
    final /* synthetic */ C6904c3 f32047d;

    C7164s2(C6904c3 c3Var, boolean z) {
        this.f32047d = c3Var;
        this.f32044a = c3Var.f31607b.mo18370a();
        this.f32045b = c3Var.f31607b.mo18371b();
        this.f32046c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo22992a() throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23306b() {
    }

    public final void run() {
        if (this.f32047d.f31612g) {
            mo23306b();
            return;
        }
        try {
            mo22992a();
        } catch (Exception e) {
            this.f32047d.m39701p(e, false, this.f32046c);
            mo23306b();
        }
    }
}
