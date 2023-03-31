package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class oi0 extends C2921uh implements pi0 {
    public oi0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo8833c();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            C2958vh.m22234c(parcel);
            mo8835n(readInt);
        } else if (i != 3) {
            return false;
        } else {
            C2958vh.m22234c(parcel);
            mo8834l((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
