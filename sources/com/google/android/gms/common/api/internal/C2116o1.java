package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p017b5.C1812n0;
import p017b5.C1824v;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.o1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2116o1 implements C1824v {

    /* renamed from: a */
    final /* synthetic */ C2093h f6261a;

    /* synthetic */ C2116o1(C2093h hVar, C1812n0 n0Var) {
        this.f6261a = hVar;
    }

    /* renamed from: a */
    public final void mo6997a(Bundle bundle) {
        this.f6261a.f6200u.lock();
        try {
            this.f6261a.f6198s = C6362b.f30577e;
            C2093h.m9314w(this.f6261a);
        } finally {
            this.f6261a.f6200u.unlock();
        }
    }

    /* renamed from: b */
    public final void mo6998b(C6362b bVar) {
        this.f6261a.f6200u.lock();
        try {
            this.f6261a.f6198s = bVar;
            C2093h.m9314w(this.f6261a);
        } finally {
            this.f6261a.f6200u.unlock();
        }
    }

    /* renamed from: c */
    public final void mo6999c(int i, boolean z) {
        Lock q;
        this.f6261a.f6200u.lock();
        try {
            C2093h hVar = this.f6261a;
            if (hVar.f6199t) {
                hVar.f6199t = false;
                C2093h.m9312u(this.f6261a, i, z);
                q = this.f6261a.f6200u;
            } else {
                hVar.f6199t = true;
                this.f6261a.f6191d.mo6919p(i);
                q = this.f6261a.f6200u;
            }
            q.unlock();
        } catch (Throwable th) {
            this.f6261a.f6200u.unlock();
            throw th;
        }
    }
}
