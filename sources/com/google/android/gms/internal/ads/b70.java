package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class b70 extends C2921uh implements c70 {
    public b70() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            mo9033v(readString);
        } else if (i != 2) {
            return false;
        } else {
            mo9032a();
        }
        parcel2.writeNoException();
        return true;
    }
}
