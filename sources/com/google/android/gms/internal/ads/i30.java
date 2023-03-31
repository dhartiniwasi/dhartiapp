package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p060h4.C4527j2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class i30 extends C2921uh implements j30 {
    public i30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: I6 */
    public static j30 m14142I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof j30 ? (j30) queryLocalInterface : new h30(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                C2958vh.m22234c(parcel);
                String F5 = mo10247F5(readString);
                parcel2.writeNoException();
                parcel2.writeString(F5);
                return true;
            case 2:
                String readString2 = parcel.readString();
                C2958vh.m22234c(parcel);
                r20 O = mo10249O(readString2);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, O);
                return true;
            case 3:
                List X = mo10254X();
                parcel2.writeNoException();
                parcel2.writeStringList(X);
                return true;
            case 4:
                String V = mo10253V();
                parcel2.writeNoException();
                parcel2.writeString(V);
                return true;
            case 5:
                String readString3 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo10248J(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                mo10255Y();
                parcel2.writeNoException();
                return true;
            case 7:
                C4527j2 a = mo10257a();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, a);
                return true;
            case 8:
                mo10256Z();
                parcel2.writeNoException();
                return true;
            case 9:
                C4954a U = mo10252U();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, U);
                return true;
            case 10:
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                boolean P = mo10250P(B0);
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, P);
                return true;
            case 11:
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean h = mo10260h();
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, h);
                return true;
            case 13:
                boolean d0 = mo10259d0();
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, d0);
                return true;
            case 14:
                C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10246A6(B02);
                parcel2.writeNoException();
                return true;
            case 15:
                mo10258c0();
                parcel2.writeNoException();
                return true;
            case 16:
                o20 T = mo10251T();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, T);
                return true;
            default:
                return false;
        }
    }
}
