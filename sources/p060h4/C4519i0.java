package p060h4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.i0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4519i0 extends C2921uh implements C4525j0 {
    public C4519i0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C2958vh.m22234c(parcel);
            mo13731H3((C4541l4) C2958vh.m22232a(parcel, C4541l4.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String a = mo13734a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i == 3) {
            boolean V = mo13733V();
            parcel2.writeNoException();
            C2958vh.m22235d(parcel2, V);
        } else if (i == 4) {
            String T = mo13732T();
            parcel2.writeNoException();
            parcel2.writeString(T);
        } else if (i != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            C2958vh.m22234c(parcel);
            mo13735u1((C4541l4) C2958vh.m22232a(parcel, C4541l4.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
