package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class dl0 extends C2847sh implements fl0 {
    dl0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: s5 */
    public final void mo9624s5(C4954a aVar, jl0 jl0, cl0 cl0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, jl0);
        C2958vh.m22238g(p, cl0);
        mo14003P0(1, p);
    }
}
