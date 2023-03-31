package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zh0 extends C2921uh implements ai0 {
    public zh0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: I6 */
    public static ai0 m24599I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof ai0 ? (ai0) queryLocalInterface : new yh0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8252s0(B0);
                break;
            case 2:
                C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                C2958vh.m22234c(parcel);
                mo8248N2(B02, readInt);
                break;
            case 3:
                C4954a B03 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8246L(B03);
                break;
            case 4:
                C4954a B04 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8241B(B04);
                break;
            case 5:
                C4954a B05 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8250S5(B05);
                break;
            case 6:
                C4954a B06 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8243I0(B06);
                break;
            case 7:
                C2958vh.m22234c(parcel);
                mo8253x2(C4954a.C4955a.m31383B0(parcel.readStrongBinder()), (bi0) C2958vh.m22232a(parcel, bi0.CREATOR));
                break;
            case 8:
                C4954a B07 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                zze(B07);
                break;
            case 9:
                C4954a B08 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                C2958vh.m22234c(parcel);
                mo8247L0(B08, readInt2);
                break;
            case 10:
                C4954a B09 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8251n6(B09);
                break;
            case 11:
                C4954a B010 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo8242D1(B010);
                break;
            case 12:
                Bundle bundle = (Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR);
                C2958vh.m22234c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
