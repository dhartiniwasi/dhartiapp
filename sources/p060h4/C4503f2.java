package p060h4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;
import java.util.List;

/* renamed from: h4.f2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4503f2 extends C2921uh implements C4509g2 {
    public C4503f2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: I6 */
    public static C4509g2 m29645I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof C4509g2 ? (C4509g2) queryLocalInterface : new C4497e2(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String c = mo12867c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 2:
                String V = mo12862V();
                parcel2.writeNoException();
                parcel2.writeString(V);
                return true;
            case 3:
                List W = mo12863W();
                parcel2.writeNoException();
                parcel2.writeTypedList(W);
                return true;
            case 4:
                C4595u4 T = mo12860T();
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, T);
                return true;
            case 5:
                Bundle a = mo12865a();
                parcel2.writeNoException();
                C2958vh.m22237f(parcel2, a);
                return true;
            case 6:
                String U = mo12861U();
                parcel2.writeNoException();
                parcel2.writeString(U);
                return true;
            default:
                return false;
        }
    }
}
