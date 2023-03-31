package p060h4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.v1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4598v1 extends C2921uh implements C4604w1 {
    public C4598v1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C2958vh.m22234c(parcel);
        mo8986j4((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
