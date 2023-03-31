package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j43 extends C2847sh implements l43 {
    j43(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* renamed from: C0 */
    public final void mo11314C0(int[] iArr) throws RemoteException {
        Parcel p = mo14006p();
        p.writeIntArray((int[]) null);
        mo14003P0(4, p);
    }

    /* renamed from: S0 */
    public final void mo11315S0(C4954a aVar, String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        p.writeString((String) null);
        mo14003P0(8, p);
    }

    /* renamed from: T */
    public final void mo11316T() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: f0 */
    public final void mo11317f0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(7, p);
    }

    /* renamed from: q0 */
    public final void mo11318q0(byte[] bArr) throws RemoteException {
        Parcel p = mo14006p();
        p.writeByteArray(bArr);
        mo14003P0(5, p);
    }

    /* renamed from: x0 */
    public final void mo11319x0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(6, p);
    }
}
