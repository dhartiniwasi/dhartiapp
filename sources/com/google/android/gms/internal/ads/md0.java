package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class md0 extends C2921uh implements nd0 {
    public md0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            mo12306k(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            C2958vh.m22234c(parcel);
            mo12307v(readString2);
        } else if (i != 3) {
            return false;
        } else {
            C2958vh.m22234c(parcel);
            mo12303T2((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
