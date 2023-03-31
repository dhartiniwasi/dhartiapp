package p060h4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.z */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4620z extends C2921uh implements C4471a0 {
    public C4620z() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18011d();
        parcel2.writeNoException();
        return true;
    }
}
