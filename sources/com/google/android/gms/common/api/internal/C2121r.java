package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.C2051a;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p033d5.C4087c;
import p033d5.C4141r;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.r */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2121r implements C4087c.C4090c {

    /* renamed from: a */
    private final WeakReference<C2071a0> f6269a;

    /* renamed from: b */
    private final C2051a<?> f6270b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f6271c;

    public C2121r(C2071a0 a0Var, C2051a<?> aVar, boolean z) {
        this.f6269a = new WeakReference<>(a0Var);
        this.f6270b = aVar;
        this.f6271c = z;
    }

    /* renamed from: c */
    public final void mo8121c(C6362b bVar) {
        Lock z;
        C2071a0 a0Var = (C2071a0) this.f6269a.get();
        if (a0Var != null) {
            C4141r.m28225o(Looper.myLooper() == a0Var.f6089a.f6220v.mo6991g(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            a0Var.f6090b.lock();
            try {
                if (!a0Var.m9164o(0)) {
                    z = a0Var.f6090b;
                } else {
                    if (!bVar.mo21755M1()) {
                        a0Var.m9162m(bVar, this.f6270b, this.f6271c);
                    }
                    if (a0Var.m9165p()) {
                        a0Var.m9163n();
                    }
                    z = a0Var.f6090b;
                }
                z.unlock();
            } catch (Throwable th) {
                a0Var.f6090b.unlock();
                throw th;
            }
        }
    }
}
