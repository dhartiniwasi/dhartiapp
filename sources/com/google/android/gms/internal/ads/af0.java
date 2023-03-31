package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class af0 extends C2921uh implements bf0 {
    public af0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: I6 */
    public static bf0 m9700I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof bf0 ? (bf0) queryLocalInterface : new ze0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C2958vh.m22234c(parcel);
                mo8764Q4((Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                mo8771e0();
                parcel2.writeNoException();
                return true;
            case 4:
                mo8769b0();
                parcel2.writeNoException();
                return true;
            case 5:
                mo8768a0();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR);
                C2958vh.m22234c(parcel);
                mo8776n0(bundle);
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, bundle);
                return true;
            case 7:
                mo8770d0();
                parcel2.writeNoException();
                return true;
            case 8:
                mo8767Z();
                parcel2.writeNoException();
                return true;
            case 9:
                mo8773g0();
                parcel2.writeNoException();
                return true;
            case 10:
                mo8765U();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean k0 = mo8775k0();
                parcel2.writeNoException();
                C2958vh.m22235d(parcel2, k0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) C2958vh.m22232a(parcel, Intent.CREATOR);
                C2958vh.m22234c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8763B(B0);
                parcel2.writeNoException();
                return true;
            case 14:
                mo8772g();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
