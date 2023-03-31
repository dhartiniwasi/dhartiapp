package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class og0 extends C2921uh implements pg0 {
    public og0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        tg0 tg0 = null;
        if (i == 1) {
            jg0 jg0 = (jg0) C2958vh.m22232a(parcel, jg0.CREATOR);
            C2958vh.m22234c(parcel);
            parcel2.writeNoException();
            C2958vh.m22237f(parcel2, (Parcelable) null);
        } else if (i == 2) {
            jg0 jg02 = (jg0) C2958vh.m22232a(parcel, jg0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof qg0) {
                    qg0 qg0 = (qg0) queryLocalInterface;
                }
            }
            C2958vh.m22234c(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            yg0 yg0 = (yg0) C2958vh.m22232a(parcel, yg0.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                tg0 = queryLocalInterface2 instanceof tg0 ? (tg0) queryLocalInterface2 : new rg0(readStrongBinder2);
            }
            C2958vh.m22234c(parcel);
            mo11008r2(yg0, tg0);
            parcel2.writeNoException();
        } else if (i == 5) {
            yg0 yg02 = (yg0) C2958vh.m22232a(parcel, yg0.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                tg0 = queryLocalInterface3 instanceof tg0 ? (tg0) queryLocalInterface3 : new rg0(readStrongBinder3);
            }
            C2958vh.m22234c(parcel);
            mo11007c3(yg02, tg0);
            parcel2.writeNoException();
        } else if (i == 6) {
            yg0 yg03 = (yg0) C2958vh.m22232a(parcel, yg0.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                tg0 = queryLocalInterface4 instanceof tg0 ? (tg0) queryLocalInterface4 : new rg0(readStrongBinder4);
            }
            C2958vh.m22234c(parcel);
            mo11006Y0(yg03, tg0);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                tg0 = queryLocalInterface5 instanceof tg0 ? (tg0) queryLocalInterface5 : new rg0(readStrongBinder5);
            }
            C2958vh.m22234c(parcel);
            mo11005Q3(readString, tg0);
            parcel2.writeNoException();
        }
        return true;
    }
}
