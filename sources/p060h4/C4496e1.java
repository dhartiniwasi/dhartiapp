package p060h4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.e1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4496e1 extends C2921uh implements C4502f1 {
    public C4496e1() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C2958vh.m22234c(parcel);
            mo18022Q0((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        } else if (i == 2) {
            mo18023T();
        } else if (i == 3) {
            mo18026e();
        } else if (i == 4) {
            mo18024a();
        } else if (i != 5) {
            return false;
        } else {
            mo18025d();
        }
        parcel2.writeNoException();
        return true;
    }
}
