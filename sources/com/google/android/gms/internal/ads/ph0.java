package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ph0 extends C2847sh {
    ph0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: i5 */
    public final void mo13275i5(oh0 oh0, String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, oh0);
        p.writeString(str);
        p.writeString(str2);
        mo14003P0(2, p);
    }
}
