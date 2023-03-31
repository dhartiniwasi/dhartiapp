package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class di0 extends C2847sh implements fi0 {
    di0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: T */
    public final String mo9601T() throws RemoteException {
        Parcel B0 = mo14002B0(1, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: a */
    public final int mo9602a() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        int readInt = B0.readInt();
        B0.recycle();
        return readInt;
    }
}
