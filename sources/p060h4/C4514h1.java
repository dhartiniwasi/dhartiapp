package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.qb0;

/* renamed from: h4.h1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4514h1 extends C2921uh implements C4520i1 {
    public C4514h1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static C4520i1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof C4520i1 ? (C4520i1) queryLocalInterface : new C4508g1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4516h3 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            C2958vh.m22237f(parcel2, liteSdkVersion);
        } else if (i != 2) {
            return false;
        } else {
            qb0 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            C2958vh.m22238g(parcel2, adapterCreator);
        }
        return true;
    }
}
