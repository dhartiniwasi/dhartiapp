package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
import p017b5.C1813o;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C2091g0 {

    /* renamed from: a */
    private final C1813o f6186a;

    protected C2091g0(C1813o oVar) {
        this.f6186a = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8066a();

    /* renamed from: b */
    public final void mo8067b(C2097i0 i0Var) {
        Lock i;
        i0Var.f6207a.lock();
        try {
            if (i0Var.f6217s != this.f6186a) {
                i = i0Var.f6207a;
            } else {
                mo8066a();
                i = i0Var.f6207a;
            }
            i.unlock();
        } catch (Throwable th) {
            i0Var.f6207a.unlock();
            throw th;
        }
    }
}
