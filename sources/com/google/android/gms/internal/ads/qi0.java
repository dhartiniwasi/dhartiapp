package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class qi0 extends C2847sh {
    qi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* renamed from: i5 */
    public final void mo13549i5(fi0 fi0, String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, fi0);
        p.writeString(str);
        p.writeString(str2);
        mo14003P0(2, p);
    }
}
