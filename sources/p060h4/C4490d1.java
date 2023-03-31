package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.d1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4490d1 extends C2847sh implements C4502f1 {
    C4490d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* renamed from: Q0 */
    public final void mo18022Q0(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(1, p);
    }

    /* renamed from: T */
    public final void mo18023T() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: a */
    public final void mo18024a() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: d */
    public final void mo18025d() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: e */
    public final void mo18026e() throws RemoteException {
        mo14003P0(3, mo14006p());
    }
}
