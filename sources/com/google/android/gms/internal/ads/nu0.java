package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class nu0 extends C2921uh implements ou0 {
    public nu0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C2958vh.m22234c(parcel);
                mo10456F((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                C2958vh.m22234c(parcel);
                Bundle r0 = mo10473r0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, r0);
                return true;
            case 3:
                C2958vh.m22234c(parcel);
                mo10459L4(parcel.readString(), parcel.readString(), (Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10469k5(readString, readString2, B0);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean h = C2958vh.m22239h(parcel);
                C2958vh.m22234c(parcel);
                Map N5 = mo10460N5(readString3, readString4, h);
                parcel2.writeNoException();
                parcel2.writeMap(N5);
                return true;
            case 6:
                String readString5 = parcel.readString();
                C2958vh.m22234c(parcel);
                int i3 = mo10467i(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 7:
                C2958vh.m22234c(parcel);
                mo10471n0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                C2958vh.m22234c(parcel);
                mo10468j6(parcel.readString(), parcel.readString(), (Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                C2958vh.m22234c(parcel);
                List o4 = mo10472o4(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(o4);
                return true;
            case 10:
                String T = mo10461T();
                parcel2.writeNoException();
                parcel2.writeString(T);
                return true;
            case 11:
                String V = mo10463V();
                parcel2.writeNoException();
                parcel2.writeString(V);
                return true;
            case 12:
                long e = mo10466e();
                parcel2.writeNoException();
                parcel2.writeLong(e);
                return true;
            case 13:
                String readString8 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo10455E(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo10458J(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo10470l6(B02, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                String U = mo10462U();
                parcel2.writeNoException();
                parcel2.writeString(U);
                return true;
            case 17:
                String c = mo10465c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 18:
                String a = mo10464a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 19:
                C2958vh.m22234c(parcel);
                mo10457F0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
