package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class sh0 extends C2847sh implements uh0 {
    sh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: T */
    public final void mo14007T() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: U */
    public final void mo14008U() throws RemoteException {
        mo14003P0(6, mo14006p());
    }

    /* renamed from: V */
    public final void mo14009V() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: W */
    public final void mo14010W() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: X */
    public final void mo14011X() throws RemoteException {
        mo14003P0(8, mo14006p());
    }

    /* renamed from: Z */
    public final void mo14012Z() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: f0 */
    public final void mo14013f0(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(7, p);
    }

    /* renamed from: t5 */
    public final void mo14014t5(oh0 oh0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, oh0);
        mo14003P0(5, p);
    }
}
