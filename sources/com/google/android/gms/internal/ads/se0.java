package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class se0 extends C2921uh implements te0 {
    public se0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: I6 */
    public static te0 m20283I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof te0 ? (te0) queryLocalInterface : new re0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C2958vh.m22234c(parcel);
            mo13785T0((Intent) C2958vh.m22232a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C2958vh.m22234c(parcel);
            mo13786v2(B0, readString, readString2);
        } else if (i != 3) {
            return false;
        } else {
            mo13784T();
        }
        parcel2.writeNoException();
        return true;
    }
}
