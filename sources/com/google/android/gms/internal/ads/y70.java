package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class y70 extends C2921uh implements z70 {
    public y70() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: I6 */
    public static z70 m23788I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof z70 ? (z70) queryLocalInterface : new x70(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<s70> createTypedArrayList = parcel.createTypedArrayList(s70.CREATOR);
        C2958vh.m22234c(parcel);
        mo15060X4(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
