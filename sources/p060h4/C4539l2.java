package p060h4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.l2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4539l2 extends C2921uh implements C4545m2 {
    public C4539l2() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18039V();
        } else if (i == 2) {
            mo18038U();
        } else if (i == 3) {
            mo18041c();
        } else if (i == 4) {
            mo18040a();
        } else if (i != 5) {
            return false;
        } else {
            boolean h = C2958vh.m22239h(parcel);
            C2958vh.m22234c(parcel);
            mo18042v5(h);
        }
        parcel2.writeNoException();
        return true;
    }
}
