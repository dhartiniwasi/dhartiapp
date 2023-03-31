package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class i20 extends C2921uh implements j20 {
    public i20() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: I6 */
    public static j20 m14117I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof j20 ? (j20) queryLocalInterface : new h20(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String c = mo8184c();
            parcel2.writeNoException();
            parcel2.writeString(c);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List U = mo8181U();
            parcel2.writeNoException();
            parcel2.writeList(U);
            return true;
        }
    }
}
