package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2051a.C2053b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p007a5.C0111g;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C2073b<R extends C0111g, A extends C2051a.C2053b> extends BasePendingResult<R> {

    /* renamed from: r */
    private final C2051a.C2054c<A> f6113r;

    /* renamed from: s */
    private final C2051a<?> f6114s;

    protected C2073b(C2051a<?> aVar, GoogleApiClient googleApiClient) {
        super((GoogleApiClient) C4141r.m28222l(googleApiClient, "GoogleApiClient must not be null"));
        C4141r.m28222l(aVar, "Api must not be null");
        this.f6113r = aVar.mo7960b();
        this.f6114s = aVar;
    }

    /* renamed from: u */
    private void m9186u(RemoteException remoteException) {
        mo8030v(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo8025p(A a) throws RemoteException;

    /* renamed from: q */
    public final C2051a<?> mo8026q() {
        return this.f6114s;
    }

    /* renamed from: r */
    public final C2051a.C2054c<A> mo8027r() {
        return this.f6113r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo8028s(R r) {
    }

    /* renamed from: t */
    public final void mo8029t(A a) throws DeadObjectException {
        try {
            mo8025p(a);
        } catch (DeadObjectException e) {
            m9186u(e);
            throw e;
        } catch (RemoteException e2) {
            m9186u(e2);
        }
    }

    /* renamed from: v */
    public final void mo8030v(Status status) {
        C4141r.m28212b(!status.mo7953M1(), "Failed result must not be success");
        C0111g d = mo7990d(status);
        mo7994h(d);
        mo8028s(d);
    }
}
