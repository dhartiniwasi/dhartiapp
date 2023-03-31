package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class vb0 extends C2921uh implements wb0 {
    public vb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: I6 */
    public static wb0 m22062I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof wb0 ? (wb0) queryLocalInterface : new ub0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo11359a();
                break;
            case 2:
                mo11356T();
                break;
            case 3:
                int readInt = parcel.readInt();
                C2958vh.m22234c(parcel);
                mo11362f0(readInt);
                break;
            case 4:
                mo11360a0();
                break;
            case 5:
                mo11361b0();
                break;
            case 6:
                mo11357Y();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof ac0) {
                        ac0 ac0 = (ac0) queryLocalInterface;
                    }
                }
                C2958vh.m22234c(parcel);
                break;
            case 8:
                mo8705c0();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo11358Z4(readString, readString2);
                break;
            case 10:
                i30.m14142I6(parcel.readStrongBinder());
                parcel.readString();
                C2958vh.m22234c(parcel);
                break;
            case 11:
                mo10767g0();
                break;
            case 12:
                parcel.readString();
                C2958vh.m22234c(parcel);
                break;
            case 13:
                mo10770m0();
                break;
            case 14:
                C2958vh.m22234c(parcel);
                mo10768g2((bi0) C2958vh.m22232a(parcel, bi0.CREATOR));
                break;
            case 15:
                mo11364t();
                break;
            case 16:
                fi0 I6 = ei0.m12120I6(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10766I3(I6);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                C2958vh.m22234c(parcel);
                mo11353D0(readInt2);
                break;
            case 18:
                mo10769j();
                break;
            case 19:
                Bundle bundle = (Bundle) C2958vh.m22232a(parcel, Bundle.CREATOR);
                C2958vh.m22234c(parcel);
                break;
            case 20:
                mo11363q();
                break;
            case 21:
                String readString3 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo11354E(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                C2958vh.m22234c(parcel);
                mo11352A1(readInt3, readString4);
                break;
            case 23:
                C2958vh.m22234c(parcel);
                mo11366u3((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
                break;
            case 24:
                C2958vh.m22234c(parcel);
                mo11355R((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
