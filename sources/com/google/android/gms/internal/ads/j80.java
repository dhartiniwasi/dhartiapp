package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class j80 extends C2847sh implements l80 {
    j80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: T */
    public final void mo11338T() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: n */
    public final void mo11339n(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(2, p);
    }
}
