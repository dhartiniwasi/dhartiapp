package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class pb0 extends C2921uh implements qb0 {
    public pb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: I6 */
    public static qb0 m18446I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof qb0 ? (qb0) queryLocalInterface : new ob0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            tb0 i3 = mo12562i(readString);
            parcel2.writeNoException();
            C2958vh.m22238g(parcel2, i3);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            C2958vh.m22234c(parcel);
            boolean k = mo12563k(readString2);
            parcel2.writeNoException();
            C2958vh.m22235d(parcel2, k);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            C2958vh.m22234c(parcel);
            kd0 x = mo12564x(readString3);
            parcel2.writeNoException();
            C2958vh.m22238g(parcel2, x);
        } else if (i != 4) {
            return false;
        } else {
            String readString4 = parcel.readString();
            C2958vh.m22234c(parcel);
            boolean z = mo12565z(readString4);
            parcel2.writeNoException();
            C2958vh.m22235d(parcel2, z);
        }
        return true;
    }
}
