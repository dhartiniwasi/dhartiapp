package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p060h4.C4491d2;
import p060h4.C4503f2;
import p060h4.C4509g2;
import p060h4.C4521i2;
import p060h4.C4527j2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class k40 extends C2847sh implements n40 {
    k40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: Q2 */
    public final void mo10897Q2(C4491d2 d2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, d2Var);
        mo14003P0(32, p);
    }

    /* renamed from: U */
    public final C4527j2 mo10899U() throws RemoteException {
        Parcel B0 = mo14002B0(11, mo14006p());
        C4527j2 I6 = C4521i2.m29687I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.j20 mo10901V() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 14
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.j20
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.j20 r1 = (com.google.android.gms.internal.ads.j20) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.h20 r2 = new com.google.android.gms.internal.ads.h20
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k40.mo10901V():com.google.android.gms.internal.ads.j20");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.o20 mo10902W() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 29
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.o20
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.o20 r1 = (com.google.android.gms.internal.ads.o20) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.l20 r2 = new com.google.android.gms.internal.ads.l20
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k40.mo10902W():com.google.android.gms.internal.ads.o20");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.r20 mo10904X() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 5
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.r20
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.r20 r1 = (com.google.android.gms.internal.ads.r20) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.p20 r2 = new com.google.android.gms.internal.ads.p20
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k40.mo10904X():com.google.android.gms.internal.ads.r20");
    }

    /* renamed from: Y */
    public final String mo10905Y() throws RemoteException {
        Parcel B0 = mo14002B0(4, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: Z */
    public final C4954a mo10906Z() throws RemoteException {
        Parcel B0 = mo14002B0(19, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: a */
    public final double mo10907a() throws RemoteException {
        Parcel B0 = mo14002B0(8, mo14006p());
        double readDouble = B0.readDouble();
        B0.recycle();
        return readDouble;
    }

    /* renamed from: a0 */
    public final String mo10908a0() throws RemoteException {
        Parcel B0 = mo14002B0(7, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: b0 */
    public final String mo10909b0() throws RemoteException {
        Parcel B0 = mo14002B0(6, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: c */
    public final C4509g2 mo10910c() throws RemoteException {
        Parcel B0 = mo14002B0(31, mo14006p());
        C4509g2 I6 = C4503f2.m29645I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: c0 */
    public final C4954a mo10911c0() throws RemoteException {
        Parcel B0 = mo14002B0(18, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: d0 */
    public final String mo10912d0() throws RemoteException {
        Parcel B0 = mo14002B0(10, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: g */
    public final String mo10915g() throws RemoteException {
        Parcel B0 = mo14002B0(9, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: g0 */
    public final List mo10916g0() throws RemoteException {
        Parcel B0 = mo14002B0(23, mo14006p());
        ArrayList b = C2958vh.m22233b(B0);
        B0.recycle();
        return b;
    }

    /* renamed from: h */
    public final String mo10917h() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: j */
    public final List mo10920j() throws RemoteException {
        Parcel B0 = mo14002B0(3, mo14006p());
        ArrayList b = C2958vh.m22233b(B0);
        B0.recycle();
        return b;
    }
}
