package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class g00 extends C2847sh implements i00 {
    g00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: S1 */
    public final void mo10369S1(f00 f00) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, f00);
        mo14003P0(1, p);
    }
}
