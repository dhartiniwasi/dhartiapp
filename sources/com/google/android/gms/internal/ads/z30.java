package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4567q0;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class z30 extends C2847sh implements b40 {
    z30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: b5 */
    public final void mo8668b5(C4567q0 q0Var, C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, q0Var);
        C2958vh.m22238g(p, aVar);
        mo14003P0(1, p);
    }
}
