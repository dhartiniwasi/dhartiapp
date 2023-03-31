package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class w20 extends C2847sh implements y20 {
    w20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: w4 */
    public final IBinder mo14861w4(C4954a aVar, C4954a aVar2, C4954a aVar3, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, aVar2);
        C2958vh.m22238g(p, aVar3);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(1, p);
        IBinder readStrongBinder = B0.readStrongBinder();
        B0.recycle();
        return readStrongBinder;
    }
}
