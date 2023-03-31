package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class s30 extends C2847sh implements u30 {
    s30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: x6 */
    public final void mo13938x6(j30 j30, String str) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, j30);
        p.writeString(str);
        mo14003P0(1, p);
    }
}
