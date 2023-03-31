package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class p30 extends C2847sh implements r30 {
    p30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: N1 */
    public final void mo13124N1(g30 g30) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, g30);
        mo14003P0(1, p);
    }
}
