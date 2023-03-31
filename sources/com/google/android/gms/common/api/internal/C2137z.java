package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import p017b5.C1811n;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C2137z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2071a0 f6309a;

    /* synthetic */ C2137z(C2071a0 a0Var, C1811n nVar) {
        this.f6309a = a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8122a();

    public final void run() {
        Lock z;
        this.f6309a.f6090b.lock();
        try {
            if (Thread.interrupted()) {
                z = this.f6309a.f6090b;
            } else {
                mo8122a();
                z = this.f6309a.f6090b;
            }
        } catch (RuntimeException e) {
            this.f6309a.f6089a.mo8079n(e);
            z = this.f6309a.f6090b;
        } catch (Throwable th) {
            this.f6309a.f6090b.unlock();
            throw th;
        }
        z.unlock();
    }
}
