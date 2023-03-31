package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.z1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4622z1 extends C2921uh implements C4473a2 {
    public C4622z1() {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    /* renamed from: I6 */
    public static C4473a2 m30138I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof C4473a2 ? (C4473a2) queryLocalInterface : new C4610x1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18012a();
        parcel2.writeNoException();
        return true;
    }
}
