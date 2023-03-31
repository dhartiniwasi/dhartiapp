package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ji0 extends C2847sh implements li0 {
    ji0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* renamed from: P4 */
    public final void mo8394P4(fi0 fi0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, fi0);
        mo14003P0(3, p);
    }

    /* renamed from: T */
    public final void mo8395T() throws RemoteException {
        mo14003P0(6, mo14006p());
    }

    /* renamed from: W */
    public final void mo8396W() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: a */
    public final void mo8397a() throws RemoteException {
        mo14003P0(7, mo14006p());
    }

    /* renamed from: c */
    public final void mo8398c() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: i0 */
    public final void mo8399i0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(4, p);
    }

    /* renamed from: m3 */
    public final void mo8400m3(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(5, p);
    }
}
