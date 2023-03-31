package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class k43 extends C2921uh implements l43 {
    public k43() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                parcel.readString();
                C2958vh.m22234c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                C2958vh.m22234c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                C2958vh.m22234c(parcel);
                break;
            case 6:
                parcel.readInt();
                C2958vh.m22234c(parcel);
                break;
            case 7:
                parcel.readInt();
                C2958vh.m22234c(parcel);
                break;
            case 8:
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                C2958vh.m22234c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
