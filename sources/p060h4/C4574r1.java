package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.r1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4574r1 extends C2921uh implements C4580s1 {
    public C4574r1() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: I6 */
    public static C4580s1 m30004I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof C4580s1 ? (C4580s1) queryLocalInterface : new C4568q1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String a = mo18054a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i != 2) {
            return false;
        } else {
            String T = mo18053T();
            parcel2.writeNoException();
            parcel2.writeString(T);
        }
        return true;
    }
}
