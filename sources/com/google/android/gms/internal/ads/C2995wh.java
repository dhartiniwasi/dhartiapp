package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* renamed from: com.google.android.gms.internal.ads.wh */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2995wh extends C2847sh implements C3069yh {
    C2995wh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: C0 */
    public final void mo14925C0(int[] iArr) throws RemoteException {
        Parcel p = mo14006p();
        p.writeIntArray((int[]) null);
        mo14003P0(4, p);
    }

    /* renamed from: T */
    public final void mo14926T() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: f0 */
    public final void mo14927f0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(7, p);
    }

    /* renamed from: q0 */
    public final void mo14928q0(byte[] bArr) throws RemoteException {
        Parcel p = mo14006p();
        p.writeByteArray(bArr);
        mo14003P0(5, p);
    }

    /* renamed from: x0 */
    public final void mo14929x0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(0);
        mo14003P0(6, p);
    }

    /* renamed from: x5 */
    public final void mo14930x5(C4954a aVar, String str) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString("GMA_SDK");
        mo14003P0(2, p);
    }
}
