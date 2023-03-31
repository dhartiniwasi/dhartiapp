package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p073j4.C4745a0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rg0 extends C2847sh implements tg0 {
    rg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* renamed from: J3 */
    public final void mo13095J3(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, parcelFileDescriptor);
        mo14003P0(1, p);
    }

    /* renamed from: J5 */
    public final void mo13096J5(C4745a0 a0Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, a0Var);
        mo14003P0(2, p);
    }
}
