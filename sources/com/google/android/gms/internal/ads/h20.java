package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class h20 extends C2847sh implements j20 {
    h20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: U */
    public final List mo8181U() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        ArrayList b = C2958vh.m22233b(B0);
        B0.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo8184c() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }
}
