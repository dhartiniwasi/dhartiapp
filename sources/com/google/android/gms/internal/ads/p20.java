package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class p20 extends C2847sh implements r20 {
    p20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: T */
    public final C4954a mo9422T() throws RemoteException {
        Parcel B0 = mo14002B0(1, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: a */
    public final Uri mo9423a() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        Uri uri = (Uri) C2958vh.m22232a(B0, Uri.CREATOR);
        B0.recycle();
        return uri;
    }

    /* renamed from: b */
    public final int mo9424b() throws RemoteException {
        Parcel B0 = mo14002B0(4, mo14006p());
        int readInt = B0.readInt();
        B0.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final double mo9425d() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        double readDouble = B0.readDouble();
        B0.recycle();
        return readDouble;
    }

    /* renamed from: e */
    public final int mo9426e() throws RemoteException {
        Parcel B0 = mo14002B0(5, mo14006p());
        int readInt = B0.readInt();
        B0.recycle();
        return readInt;
    }
}
