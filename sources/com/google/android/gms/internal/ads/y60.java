package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class y60 extends C2847sh implements a70 {
    y60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: i */
    public final void mo8230i(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        mo14003P0(1, p);
    }
}
