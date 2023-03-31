package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class i40 extends C2847sh implements j40 {
    i40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo11015a() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: v */
    public final void mo11016v(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        mo14003P0(1, p);
    }
}
