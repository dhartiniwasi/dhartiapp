package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ze0 extends C2847sh implements bf0 {
    ze0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: B */
    public final void mo8763B(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(13, p);
    }

    /* renamed from: Q4 */
    public final void mo8764Q4(Bundle bundle) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, bundle);
        mo14003P0(1, p);
    }

    /* renamed from: U */
    public final void mo8765U() throws RemoteException {
        mo14003P0(10, mo14006p());
    }

    /* renamed from: Y */
    public final void mo8766Y() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: Z */
    public final void mo8767Z() throws RemoteException {
        mo14003P0(8, mo14006p());
    }

    /* renamed from: a0 */
    public final void mo8768a0() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: b0 */
    public final void mo8769b0() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: d0 */
    public final void mo8770d0() throws RemoteException {
        mo14003P0(7, mo14006p());
    }

    /* renamed from: e0 */
    public final void mo8771e0() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: g */
    public final void mo8772g() throws RemoteException {
        mo14003P0(14, mo14006p());
    }

    /* renamed from: g0 */
    public final void mo8773g0() throws RemoteException {
        mo14003P0(9, mo14006p());
    }

    /* renamed from: g3 */
    public final void mo8774g3(int i, int i2, Intent intent) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        p.writeInt(i2);
        C2958vh.m22236e(p, intent);
        mo14003P0(12, p);
    }

    /* renamed from: k0 */
    public final boolean mo8775k0() throws RemoteException {
        Parcel B0 = mo14002B0(11, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: n0 */
    public final void mo8776n0(Bundle bundle) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, bundle);
        Parcel B0 = mo14002B0(6, p);
        if (B0.readInt() != 0) {
            bundle.readFromParcel(B0);
        }
        B0.recycle();
    }
}
