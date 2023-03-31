package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.c2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4485c2 extends C2921uh implements C4491d2 {
    public C4485c2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: I6 */
    public static C4491d2 m29579I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof C4491d2 ? (C4491d2) queryLocalInterface : new C4479b2(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C2958vh.m22234c(parcel);
        mo18018l2((C4583s4) C2958vh.m22232a(parcel, C4583s4.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
