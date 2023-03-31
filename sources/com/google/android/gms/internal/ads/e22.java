package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p073j4.C4745a0;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class e22 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ tg0 f8617a;

    e22(i22 i22, tg0 tg0) {
        this.f8617a = tg0;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        try {
            this.f8617a.mo13096J5(C4745a0.m30571I1(th));
        } catch (RemoteException e) {
            C4794n1.m30694l("Service can't call client", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        try {
            this.f8617a.mo13095J3((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            C4794n1.m30694l("Service can't call client", e);
        }
    }
}
