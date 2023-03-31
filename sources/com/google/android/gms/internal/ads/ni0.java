package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ni0 extends C2847sh implements pi0 {
    ni0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* renamed from: c */
    public final void mo8833c() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: l */
    public final void mo8834l(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(3, p);
    }

    /* renamed from: n */
    public final void mo8835n(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(2, p);
    }
}
