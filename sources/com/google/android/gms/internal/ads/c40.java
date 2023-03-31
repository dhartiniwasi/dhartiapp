package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class c40 extends C2847sh implements e40 {
    c40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: P2 */
    public final void mo9015P2(n40 n40) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, n40);
        mo14003P0(1, p);
    }
}
