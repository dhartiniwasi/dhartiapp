package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p060h4.C4527j2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class d30 extends C2921uh implements e30 {
    public d30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C4954a U = mo8498U();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, U);
                return true;
            case 3:
                String X = mo8501X();
                parcel2.writeNoException();
                parcel2.writeString(X);
                return true;
            case 4:
                List Y = mo8502Y();
                parcel2.writeNoException();
                parcel2.writeList(Y);
                return true;
            case 5:
                String V = mo8499V();
                parcel2.writeNoException();
                parcel2.writeString(V);
                return true;
            case 6:
                r20 T = mo8497T();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, T);
                return true;
            case 7:
                String W = mo8500W();
                parcel2.writeNoException();
                parcel2.writeString(W);
                return true;
            case 8:
                double d = mo8510d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                String a0 = mo8505a0();
                parcel2.writeNoException();
                parcel2.writeString(a0);
                return true;
            case 10:
                String c0 = mo8509c0();
                parcel2.writeNoException();
                parcel2.writeString(c0);
                return true;
            case 11:
                Bundle e = mo8511e();
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, e);
                return true;
            case 12:
                mo8507b0();
                parcel2.writeNoException();
                return true;
            case 13:
                C4527j2 b = mo8506b();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, b);
                return true;
            case 14:
                C2958vh.m22234c(parcel);
                mo8512n0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                C2958vh.m22234c(parcel);
                boolean z0 = mo8513z0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, z0);
                return true;
            case 16:
                C2958vh.m22234c(parcel);
                mo8496F0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                j20 a = mo8504a();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, a);
                return true;
            case 18:
                C4954a c = mo8508c();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, c);
                return true;
            case 19:
                String Z = mo8503Z();
                parcel2.writeNoException();
                parcel2.writeString(Z);
                return true;
            default:
                return false;
        }
    }
}
