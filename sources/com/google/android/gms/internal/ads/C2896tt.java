package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* renamed from: com.google.android.gms.internal.ads.tt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2896tt extends C2847sh implements C2970vt {
    C2896tt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* renamed from: Q0 */
    public final void mo12081Q0(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(3, p);
    }

    /* renamed from: T */
    public final void mo12082T() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: a */
    public final void mo12083a() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: d */
    public final void mo12084d() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: e */
    public final void mo12085e() throws RemoteException {
        mo14003P0(2, mo14006p());
    }
}
