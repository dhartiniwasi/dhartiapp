package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class nh0 extends C2921uh implements oh0 {
    public nh0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String e = mo12017e();
            parcel2.writeNoException();
            parcel2.writeString(e);
        } else if (i != 2) {
            return false;
        } else {
            int d = mo12016d();
            parcel2.writeNoException();
            parcel2.writeInt(d);
        }
        return true;
    }
}
