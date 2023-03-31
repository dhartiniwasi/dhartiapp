package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class v30 extends C2847sh implements x30 {
    v30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: B5 */
    public final void mo14449B5(j30 j30) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, j30);
        mo14003P0(1, p);
    }
}
