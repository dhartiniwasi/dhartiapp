package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p060h4.C4527j2;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class f30 extends C2921uh implements g30 {
    public f30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C4954a c = mo9262c();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, c);
                return true;
            case 3:
                String X = mo9257X();
                parcel2.writeNoException();
                parcel2.writeString(X);
                return true;
            case 4:
                List c0 = mo9263c0();
                parcel2.writeNoException();
                parcel2.writeList(c0);
                return true;
            case 5:
                String V = mo9255V();
                parcel2.writeNoException();
                parcel2.writeString(V);
                return true;
            case 6:
                r20 a = mo9259a();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, a);
                return true;
            case 7:
                String W = mo9256W();
                parcel2.writeNoException();
                parcel2.writeString(W);
                return true;
            case 8:
                String U = mo9254U();
                parcel2.writeNoException();
                parcel2.writeString(U);
                return true;
            case 9:
                Bundle d = mo9264d();
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, d);
                return true;
            case 10:
                mo9260a0();
                parcel2.writeNoException();
                return true;
            case 11:
                C4527j2 e = mo9265e();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, e);
                return true;
            case 12:
                C2958vh.m22234c(parcel);
                mo9266f2((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                C2958vh.m22234c(parcel);
                boolean n0 = mo9267n0((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, n0);
                return true;
            case 14:
                C2958vh.m22234c(parcel);
                mo9252F((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                j20 b = mo9261b();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, b);
                return true;
            case 16:
                C4954a T = mo9253T();
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, T);
                return true;
            case 17:
                String Z = mo9258Z();
                parcel2.writeNoException();
                parcel2.writeString(Z);
                return true;
            default:
                return false;
        }
    }
}
