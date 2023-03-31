package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class yb0 extends C2921uh implements zb0 {
    public yb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: I6 */
    public static zb0 m23897I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zb0 ? (zb0) queryLocalInterface : new xb0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4954a a = mo13526a();
            parcel2.writeNoException();
            C2958vh.m22238g(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            boolean T = mo13525T();
            parcel2.writeNoException();
            C2958vh.m22235d(parcel2, T);
        }
        return true;
    }
}
