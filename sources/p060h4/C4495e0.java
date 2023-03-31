package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.e0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4495e0 extends C2847sh implements C4507g0 {
    C4495e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* renamed from: e */
    public final void mo18043e() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: o0 */
    public final void mo18044o0(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(2, p);
    }
}
