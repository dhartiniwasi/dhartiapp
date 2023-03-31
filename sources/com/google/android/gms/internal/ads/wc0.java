package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class wc0 extends C2921uh implements xc0 {
    public wc0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            C2958vh.m22234c(parcel);
            mo12537z5(B0);
        } else if (i == 2) {
            String readString = parcel.readString();
            C2958vh.m22234c(parcel);
            mo12535k(readString);
        } else if (i == 3) {
            C2958vh.m22234c(parcel);
            mo12536l((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            zb0 I6 = yb0.m23897I6(parcel.readStrongBinder());
            C2958vh.m22234c(parcel);
            mo12534I2(I6);
        }
        parcel2.writeNoException();
        return true;
    }
}
