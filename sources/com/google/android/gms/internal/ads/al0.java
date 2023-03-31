package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class al0 extends C2847sh implements cl0 {
    al0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* renamed from: d2 */
    public final void mo8428d2(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22236e(p, bundle);
        mo14003P0(3, p);
    }

    /* renamed from: i */
    public final void mo8429i(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        mo14003P0(2, p);
    }
}
