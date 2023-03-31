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
public final class cc0 extends C2847sh {
    cc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: H6 */
    public final C4954a mo9108H6() throws RemoteException {
        Parcel B0 = mo14002B0(20, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: I6 */
    public final C4954a mo9109I6() throws RemoteException {
        Parcel B0 = mo14002B0(21, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: J6 */
    public final List mo9110J6() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        ArrayList b = C2958vh.m22233b(B0);
        B0.recycle();
        return b;
    }

    /* renamed from: K6 */
    public final void mo9111K6(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(9, p);
    }

    /* renamed from: L6 */
    public final void mo9112L6(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(10, p);
    }

    /* renamed from: M6 */
    public final void mo9113M6(C4954a aVar, C4954a aVar2, C4954a aVar3) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, aVar2);
        C2958vh.m22238g(p, aVar3);
        mo14003P0(22, p);
    }

    /* renamed from: N6 */
    public final void mo9114N6(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(14, p);
    }

    /* renamed from: O6 */
    public final boolean mo9115O6() throws RemoteException {
        Parcel B0 = mo14002B0(12, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: P6 */
    public final boolean mo9116P6() throws RemoteException {
        Parcel B0 = mo14002B0(11, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: T5 */
    public final j20 mo9117T5() throws RemoteException {
        Parcel B0 = mo14002B0(19, mo14006p());
        j20 I6 = i20.m14117I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: V */
    public final C4954a mo9118V() throws RemoteException {
        Parcel B0 = mo14002B0(15, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: Y */
    public final String mo9119Y() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: Z */
    public final String mo9120Z() throws RemoteException {
        Parcel B0 = mo14002B0(7, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: a */
    public final Bundle mo9121a() throws RemoteException {
        Parcel B0 = mo14002B0(13, mo14006p());
        Bundle bundle = (Bundle) C2958vh.m22232a(B0, Bundle.CREATOR);
        B0.recycle();
        return bundle;
    }

    /* renamed from: a0 */
    public final String mo9122a0() throws RemoteException {
        Parcel B0 = mo14002B0(6, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: c0 */
    public final String mo9123c0() throws RemoteException {
        Parcel B0 = mo14002B0(4, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: e0 */
    public final void mo9124e0() throws RemoteException {
        mo14003P0(8, mo14006p());
    }

    /* renamed from: i5 */
    public final C4527j2 mo9125i5() throws RemoteException {
        Parcel B0 = mo14002B0(16, mo14006p());
        C4527j2 I6 = C4521i2.m29687I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: r6 */
    public final r20 mo9126r6() throws RemoteException {
        Parcel B0 = mo14002B0(5, mo14006p());
        r20 I6 = q20.m19033I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }
}
