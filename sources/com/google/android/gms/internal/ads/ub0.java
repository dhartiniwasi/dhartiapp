package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ub0 extends C2847sh implements wb0 {
    ub0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: A1 */
    public final void mo11352A1(int i, String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        p.writeString(str);
        mo14003P0(22, p);
    }

    /* renamed from: D0 */
    public final void mo11353D0(int i) throws RemoteException {
        throw null;
    }

    /* renamed from: E */
    public final void mo11354E(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        mo14003P0(21, p);
    }

    /* renamed from: I3 */
    public final void mo10766I3(fi0 fi0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, fi0);
        mo14003P0(16, p);
    }

    /* renamed from: R */
    public final void mo11355R(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(24, p);
    }

    /* renamed from: T */
    public final void mo11356T() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: Y */
    public final void mo11357Y() throws RemoteException {
        mo14003P0(6, mo14006p());
    }

    /* renamed from: Z4 */
    public final void mo11358Z4(String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        mo14003P0(9, p);
    }

    /* renamed from: a */
    public final void mo11359a() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: a0 */
    public final void mo11360a0() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: b0 */
    public final void mo11361b0() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: c0 */
    public final void mo8705c0() throws RemoteException {
        mo14003P0(8, mo14006p());
    }

    /* renamed from: f0 */
    public final void mo11362f0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(3, p);
    }

    /* renamed from: g0 */
    public final void mo10767g0() throws RemoteException {
        mo14003P0(11, mo14006p());
    }

    /* renamed from: g2 */
    public final void mo10768g2(bi0 bi0) throws RemoteException {
        throw null;
    }

    /* renamed from: j */
    public final void mo10769j() throws RemoteException {
        mo14003P0(18, mo14006p());
    }

    /* renamed from: m0 */
    public final void mo10770m0() throws RemoteException {
        mo14003P0(13, mo14006p());
    }

    /* renamed from: q */
    public final void mo11363q() throws RemoteException {
        mo14003P0(20, mo14006p());
    }

    /* renamed from: t */
    public final void mo11364t() throws RemoteException {
        mo14003P0(15, mo14006p());
    }

    /* renamed from: t2 */
    public final void mo11365t2(j30 j30, String str) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, j30);
        p.writeString(str);
        mo14003P0(10, p);
    }

    /* renamed from: u3 */
    public final void mo11366u3(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(23, p);
    }
}
