package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class m30 extends C2847sh implements o30 {
    m30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: x3 */
    public final void mo12267x3(e30 e30) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, e30);
        mo14003P0(1, p);
    }
}
