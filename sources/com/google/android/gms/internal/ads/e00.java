package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class e00 extends C2921uh implements f00 {
    public e00() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String d = mo9409d();
            parcel2.writeNoException();
            parcel2.writeString(d);
        } else if (i == 2) {
            String e = mo9410e();
            parcel2.writeNoException();
            parcel2.writeString(e);
        } else if (i == 3) {
            C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            C2958vh.m22234c(parcel);
            mo9406D(B0);
            parcel2.writeNoException();
        } else if (i == 4) {
            mo9408a();
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            mo9407T();
            parcel2.writeNoException();
        }
        return true;
    }
}
