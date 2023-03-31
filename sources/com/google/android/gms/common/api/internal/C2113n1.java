package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p017b5.C1810m0;
import p017b5.C1824v;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.n1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2113n1 implements C1824v {

    /* renamed from: a */
    final /* synthetic */ C2093h f6246a;

    /* synthetic */ C2113n1(C2093h hVar, C1810m0 m0Var) {
        this.f6246a = hVar;
    }

    /* renamed from: a */
    public final void mo6997a(Bundle bundle) {
        this.f6246a.f6200u.lock();
        try {
            C2093h.m9313v(this.f6246a, bundle);
            this.f6246a.f6197r = C6362b.f30577e;
            C2093h.m9314w(this.f6246a);
        } finally {
            this.f6246a.f6200u.unlock();
        }
    }

    /* renamed from: b */
    public final void mo6998b(C6362b bVar) {
        this.f6246a.f6200u.lock();
        try {
            this.f6246a.f6197r = bVar;
            C2093h.m9314w(this.f6246a);
        } finally {
            this.f6246a.f6200u.unlock();
        }
    }

    /* renamed from: c */
    public final void mo6999c(int i, boolean z) {
        Lock q;
        this.f6246a.f6200u.lock();
        try {
            C2093h hVar = this.f6246a;
            if (!hVar.f6199t && hVar.f6198s != null) {
                if (hVar.f6198s.mo21755M1()) {
                    this.f6246a.f6199t = true;
                    this.f6246a.f6192e.mo6919p(i);
                    q = this.f6246a.f6200u;
                    q.unlock();
                }
            }
            this.f6246a.f6199t = false;
            C2093h.m9312u(this.f6246a, i, z);
            q = this.f6246a.f6200u;
            q.unlock();
        } catch (Throwable th) {
            this.f6246a.f6200u.unlock();
            throw th;
        }
    }
}
