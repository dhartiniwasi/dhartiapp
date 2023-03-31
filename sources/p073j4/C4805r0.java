package p073j4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import p088l5.C4954a;

/* renamed from: j4.r0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4805r0 extends C2847sh implements C4811t0 {
    C4805r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zze(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(2, p);
    }

    public final boolean zzf(C4954a aVar, String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        p.writeString(str2);
        Parcel B0 = mo14002B0(1, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }
}
