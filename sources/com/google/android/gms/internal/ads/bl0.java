package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class bl0 extends C2921uh implements cl0 {
    public bl0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            C2958vh.m22234c(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            mo8429i(readString);
        } else if (i != 3) {
            return false;
        } else {
            C2958vh.m22234c(parcel);
            mo8428d2(parcel.readString(), parcel.readString(), (Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
