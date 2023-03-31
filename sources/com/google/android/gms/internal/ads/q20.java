package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class q20 extends C2921uh implements r20 {
    public q20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: I6 */
    public static r20 m19033I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof r20 ? (r20) queryLocalInterface : new p20(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4954a T = mo9422T();
            parcel2.writeNoException();
            C2958vh.m22238g(parcel2, T);
        } else if (i == 2) {
            Uri a = mo9423a();
            parcel2.writeNoException();
            C2958vh.m22237f(parcel2, a);
        } else if (i == 3) {
            double d = mo9425d();
            parcel2.writeNoException();
            parcel2.writeDouble(d);
        } else if (i == 4) {
            int b = mo9424b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        } else if (i != 5) {
            return false;
        } else {
            int e = mo9426e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        return true;
    }
}
