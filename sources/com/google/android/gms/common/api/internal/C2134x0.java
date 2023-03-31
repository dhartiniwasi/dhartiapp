package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p007a5.C0104a;
import p017b5.C1825w;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
abstract class C2134x0<T> extends C1825w {

    /* renamed from: b */
    protected final C9977j<T> f6300b;

    public C2134x0(int i, C9977j<T> jVar) {
        super(i);
        this.f6300b = jVar;
    }

    /* renamed from: a */
    public final void mo8031a(Status status) {
        this.f6300b.mo32545d(new C0104a(status));
    }

    /* renamed from: b */
    public final void mo8032b(Exception exc) {
        this.f6300b.mo32545d(exc);
    }

    /* renamed from: c */
    public final void mo8033c(C2115o0<?> o0Var) throws DeadObjectException {
        try {
            mo8053h(o0Var);
        } catch (DeadObjectException e) {
            mo8031a(C2085e1.m9252e(e));
            throw e;
        } catch (RemoteException e2) {
            mo8031a(C2085e1.m9252e(e2));
        } catch (RuntimeException e3) {
            this.f6300b.mo32545d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo8053h(C2115o0<?> o0Var) throws RemoteException;
}
