package p073j4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;
import p088l5.C4954a;

/* renamed from: j4.s0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4808s0 extends C2921uh implements C4811t0 {
    public C4808s0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            C2958vh.m22234c(parcel);
            boolean zzf = zzf(B0, readString, readString2);
            parcel2.writeNoException();
            C2958vh.m22235d(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
            C2958vh.m22234c(parcel);
            zze(B02);
            parcel2.writeNoException();
        }
        return true;
    }
}
