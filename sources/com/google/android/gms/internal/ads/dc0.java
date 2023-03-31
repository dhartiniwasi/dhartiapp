package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p060h4.C4521i2;
import p060h4.C4527j2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class dc0 extends C2847sh implements fc0 {
    dc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: T */
    public final float mo9511T() throws RemoteException {
        Parcel B0 = mo14002B0(23, mo14006p());
        float readFloat = B0.readFloat();
        B0.recycle();
        return readFloat;
    }

    /* renamed from: U */
    public final float mo9512U() throws RemoteException {
        Parcel B0 = mo14002B0(24, mo14006p());
        float readFloat = B0.readFloat();
        B0.recycle();
        return readFloat;
    }

    /* renamed from: U1 */
    public final void mo9513U1(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(20, p);
    }

    /* renamed from: U3 */
    public final void mo9514U3(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(22, p);
    }

    /* renamed from: V */
    public final Bundle mo9515V() throws RemoteException {
        Parcel B0 = mo14002B0(16, mo14006p());
        Bundle bundle = (Bundle) C2958vh.m22232a(B0, Bundle.CREATOR);
        B0.recycle();
        return bundle;
    }

    /* renamed from: W */
    public final C4527j2 mo9516W() throws RemoteException {
        Parcel B0 = mo14002B0(11, mo14006p());
        C4527j2 I6 = C4521i2.m29687I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: X */
    public final j20 mo9517X() throws RemoteException {
        Parcel B0 = mo14002B0(12, mo14006p());
        j20 I6 = i20.m14117I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: Y */
    public final C4954a mo9518Y() throws RemoteException {
        Parcel B0 = mo14002B0(15, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: Z */
    public final r20 mo9519Z() throws RemoteException {
        Parcel B0 = mo14002B0(5, mo14006p());
        r20 I6 = q20.m19033I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: a */
    public final double mo9520a() throws RemoteException {
        Parcel B0 = mo14002B0(8, mo14006p());
        double readDouble = B0.readDouble();
        B0.recycle();
        return readDouble;
    }

    /* renamed from: a0 */
    public final C4954a mo9521a0() throws RemoteException {
        Parcel B0 = mo14002B0(14, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: b0 */
    public final String mo9522b0() throws RemoteException {
        Parcel B0 = mo14002B0(7, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: c */
    public final float mo9523c() throws RemoteException {
        Parcel B0 = mo14002B0(25, mo14006p());
        float readFloat = B0.readFloat();
        B0.recycle();
        return readFloat;
    }

    /* renamed from: c0 */
    public final C4954a mo9524c0() throws RemoteException {
        Parcel B0 = mo14002B0(13, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: d0 */
    public final String mo9525d0() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: e0 */
    public final String mo9526e0() throws RemoteException {
        Parcel B0 = mo14002B0(6, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: g */
    public final String mo9527g() throws RemoteException {
        Parcel B0 = mo14002B0(10, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: g0 */
    public final List mo9528g0() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        ArrayList b = C2958vh.m22233b(B0);
        B0.recycle();
        return b;
    }

    /* renamed from: h */
    public final String mo9529h() throws RemoteException {
        Parcel B0 = mo14002B0(4, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: h0 */
    public final boolean mo9530h0() throws RemoteException {
        Parcel B0 = mo14002B0(18, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: j */
    public final String mo9531j() throws RemoteException {
        Parcel B0 = mo14002B0(9, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: l0 */
    public final boolean mo9532l0() throws RemoteException {
        Parcel B0 = mo14002B0(17, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: n1 */
    public final void mo9533n1(C4954a aVar, C4954a aVar2, C4954a aVar3) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, aVar2);
        C2958vh.m22238g(p, aVar3);
        mo14003P0(21, p);
    }

    /* renamed from: q */
    public final void mo9534q() throws RemoteException {
        mo14003P0(19, mo14006p());
    }
}
