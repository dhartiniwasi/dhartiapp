package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.k2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4533k2 extends C2847sh implements C4545m2 {
    C4533k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: U */
    public final void mo18038U() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: V */
    public final void mo18039V() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: a */
    public final void mo18040a() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: c */
    public final void mo18041c() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: v5 */
    public final void mo18042v5(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(5, p);
    }
}
