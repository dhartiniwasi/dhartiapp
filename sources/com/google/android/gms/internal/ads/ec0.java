package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p060h4.C4527j2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class ec0 extends C2921uh implements fc0 {
    public ec0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: I6 */
    public static fc0 m12012I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof fc0 ? (fc0) queryLocalInterface : new dc0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String d0 = mo9525d0();
                parcel2.writeNoException();
                parcel2.writeString(d0);
                return true;
            case 3:
                List g0 = mo9528g0();
                parcel2.writeNoException();
                parcel2.writeList(g0);
                return true;
            case 4:
                String h = mo9529h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 5:
                r20 Z = mo9519Z();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, Z);
                return true;
            case 6:
                String e0 = mo9526e0();
                parcel2.writeNoException();
                parcel2.writeString(e0);
                return true;
            case 7:
                String b0 = mo9522b0();
                parcel2.writeNoException();
                parcel2.writeString(b0);
                return true;
            case 8:
                double a = mo9520a();
                parcel2.writeNoException();
                parcel2.writeDouble(a);
                return true;
            case 9:
                String j = mo9531j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case 10:
                String g = mo9527g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 11:
                C4527j2 W = mo9516W();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, W);
                return true;
            case 12:
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, (IInterface) null);
                return true;
            case 13:
                C4954a c0 = mo9524c0();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, c0);
                return true;
            case 14:
                C4954a a0 = mo9521a0();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, a0);
                return true;
            case 15:
                C4954a Y = mo9518Y();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, Y);
                return true;
            case 16:
                Bundle V = mo9515V();
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, V);
                return true;
            case 17:
                boolean l0 = mo9532l0();
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, l0);
                return true;
            case 18:
                boolean h0 = mo9530h0();
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, h0);
                return true;
            case 19:
                mo9534q();
                parcel2.writeNoException();
                return true;
            case 20:
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo9513U1(B0);
                parcel2.writeNoException();
                return true;
            case 21:
                C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C4954a B03 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C4954a B04 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo9533n1(B02, B03, B04);
                parcel2.writeNoException();
                return true;
            case 22:
                C4954a B05 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo9514U3(B05);
                parcel2.writeNoException();
                return true;
            case 23:
                float T = mo9511T();
                parcel2.writeNoException();
                parcel2.writeFloat(T);
                return true;
            case 24:
                float U = mo9512U();
                parcel2.writeNoException();
                parcel2.writeFloat(U);
                return true;
            case 25:
                float c = mo9523c();
                parcel2.writeNoException();
                parcel2.writeFloat(c);
                return true;
            default:
                return false;
        }
    }
}
