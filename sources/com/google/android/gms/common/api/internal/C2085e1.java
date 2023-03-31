package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C2085e1 {

    /* renamed from: a */
    public final int f6150a;

    public C2085e1(int i) {
        this.f6150a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m9252e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo8031a(Status status);

    /* renamed from: b */
    public abstract void mo8032b(Exception exc);

    /* renamed from: c */
    public abstract void mo8033c(C2115o0<?> o0Var) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo8034d(C2102k kVar, boolean z);
}
