package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class fd0 extends C2921uh implements hd0 {
    public fd0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo9469c();
        } else if (i == 3) {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            mo9470k(readString);
        } else if (i != 4) {
            return false;
        } else {
            C2958vh.m22234c(parcel);
            mo9471l((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
