package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class el0 extends C2921uh implements fl0 {
    public el0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: I6 */
    public static fl0 m12163I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof fl0 ? (fl0) queryLocalInterface : new dl0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        cl0 cl0 = null;
        switch (i) {
            case 1:
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                jl0 jl0 = (jl0) C2958vh.m22232a(parcel, jl0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    cl0 = queryLocalInterface instanceof cl0 ? (cl0) queryLocalInterface : new al0(readStrongBinder);
                }
                C2958vh.m22234c(parcel);
                mo9624s5(B0, jl0, cl0);
                parcel2.writeNoException();
                return true;
            case 2:
                C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10175B(B02);
                parcel2.writeNoException();
                return true;
            case 3:
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, (IInterface) null);
                return true;
            case 4:
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, (IInterface) null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                C4954a B03 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qf0 I6 = pf0.m18607I6(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10177W5(createTypedArrayList, B03, I6);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                C4954a B04 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qf0 I62 = pf0.m18607I6(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10179i1(createTypedArrayList2, B04, I62);
                parcel2.writeNoException();
                return true;
            case 7:
                C2958vh.m22234c(parcel);
                mo10178f3((vf0) C2958vh.m22232a(parcel, vf0.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                C4954a B05 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10176L(B05);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                C4954a B06 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qf0 I63 = pf0.m18607I6(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10180j3(createTypedArrayList3, B06, I63);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                C4954a B07 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qf0 I64 = pf0.m18607I6(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                mo10181l4(createTypedArrayList4, B07, I64);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
