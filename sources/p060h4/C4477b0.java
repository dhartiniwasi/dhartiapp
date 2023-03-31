package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.b0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4477b0 extends C2847sh implements C4489d0 {
    C4477b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: U */
    public final void mo14150U() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: V */
    public final void mo14151V() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: W */
    public final void mo14152W() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: b */
    public final void mo14153b() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: c */
    public final void mo14154c() throws RemoteException {
        mo14003P0(7, mo14006p());
    }

    /* renamed from: e */
    public final void mo14155e() throws RemoteException {
        mo14003P0(6, mo14006p());
    }

    /* renamed from: l */
    public final void mo14156l(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(8, p);
    }

    /* renamed from: n */
    public final void mo14157n(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(2, p);
    }
}
