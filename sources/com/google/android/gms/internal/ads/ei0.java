package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class ei0 extends C2921uh implements fi0 {
    public ei0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: I6 */
    public static fi0 m12120I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof fi0 ? (fi0) queryLocalInterface : new di0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String T = mo9601T();
            parcel2.writeNoException();
            parcel2.writeString(T);
        } else if (i != 2) {
            return false;
        } else {
            int a = mo9602a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
