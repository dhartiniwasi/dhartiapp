package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class z10 extends C2847sh {
    z10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    /* renamed from: i5 */
    public final void mo15533i5(hg0 hg0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, hg0);
        mo14003P0(1, p);
    }
}
