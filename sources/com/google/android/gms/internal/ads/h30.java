package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class h30 extends C2847sh implements j30 {
    h30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: P */
    public final boolean mo10250P(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        Parcel B0 = mo14002B0(10, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: U */
    public final C4954a mo10252U() throws RemoteException {
        Parcel B0 = mo14002B0(9, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: V */
    public final String mo10253V() throws RemoteException {
        Parcel B0 = mo14002B0(4, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }
}
