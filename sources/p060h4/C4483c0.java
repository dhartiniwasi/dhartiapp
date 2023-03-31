package p060h4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.c0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4483c0 extends C2921uh implements C4489d0 {
    public C4483c0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo14153b();
                break;
            case 2:
                int readInt = parcel.readInt();
                C2958vh.m22234c(parcel);
                mo14157n(readInt);
                break;
            case 3:
                break;
            case 4:
                mo14151V();
                break;
            case 5:
                mo14152W();
                break;
            case 6:
                mo14155e();
                break;
            case 7:
                mo14154c();
                break;
            case 8:
                C2958vh.m22234c(parcel);
                mo14156l((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
