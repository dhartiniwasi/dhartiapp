package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class mi0 extends C2847sh {
    mi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* renamed from: i5 */
    public final IBinder mo12358i5(C4954a aVar, String str, qb0 qb0, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        C2958vh.m22238g(p, qb0);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(1, p);
        IBinder readStrongBinder = B0.readStrongBinder();
        B0.recycle();
        return readStrongBinder;
    }
}
