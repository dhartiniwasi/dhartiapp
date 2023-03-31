package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p073j4.C4745a0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class sg0 extends C2921uh implements tg0 {
    public sg0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C2958vh.m22234c(parcel);
            mo13095J3((ParcelFileDescriptor) C2958vh.m22232a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            C2958vh.m22234c(parcel);
            mo13096J5((C4745a0) C2958vh.m22232a(parcel, C4745a0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
