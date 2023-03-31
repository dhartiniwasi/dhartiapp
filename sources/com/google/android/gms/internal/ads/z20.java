package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class z20 extends C2921uh implements a30 {
    public z20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            C2958vh.m22234c(parcel);
            mo8190v3(B0);
        } else if (i == 2) {
            mo8188b();
        } else if (i != 3) {
            return false;
        } else {
            C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            C2958vh.m22234c(parcel);
            mo8189p0(B02);
        }
        parcel2.writeNoException();
        return true;
    }
}
