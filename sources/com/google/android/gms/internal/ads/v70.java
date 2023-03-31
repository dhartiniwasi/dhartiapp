package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class v70 extends C2921uh implements w70 {
    public v70() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: I6 */
    public static w70 m22013I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof w70 ? (w70) queryLocalInterface : new u70(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo11533T();
        } else if (i != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            mo11534k(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
