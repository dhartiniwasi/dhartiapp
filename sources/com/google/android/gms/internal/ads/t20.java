package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class t20 extends C2847sh implements v20 {
    t20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: D */
    public final void mo14188D(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(7, p);
    }

    /* renamed from: L3 */
    public final void mo14189L3(o20 o20) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, o20);
        mo14003P0(8, p);
    }

    /* renamed from: W4 */
    public final void mo14190W4(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(3, p);
    }

    /* renamed from: a6 */
    public final void mo14191a6(C4954a aVar, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeInt(i);
        mo14003P0(5, p);
    }

    /* renamed from: e */
    public final void mo14192e() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: g6 */
    public final void mo14193g6(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(9, p);
    }

    /* renamed from: i */
    public final C4954a mo14194i(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        Parcel B0 = mo14002B0(2, p);
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: i2 */
    public final void mo14195i2(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(6, p);
    }

    /* renamed from: v4 */
    public final void mo14196v4(String str, C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        C2958vh.m22238g(p, aVar);
        mo14003P0(1, p);
    }
}
