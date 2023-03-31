package p060h4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: h4.n3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4552n3 extends C4519i0 {

    /* renamed from: a */
    final /* synthetic */ C4558o3 f24922a;

    /* synthetic */ C4552n3(C4558o3 o3Var, C4546m3 m3Var) {
        this.f24922a = o3Var;
    }

    /* renamed from: H3 */
    public final void mo13731H3(C4541l4 l4Var) throws RemoteException {
        mo13735u1(l4Var, 1);
    }

    /* renamed from: T */
    public final String mo13732T() throws RemoteException {
        return null;
    }

    /* renamed from: V */
    public final boolean mo13733V() throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final String mo13734a() throws RemoteException {
        return null;
    }

    /* renamed from: u1 */
    public final void mo13735u1(C4541l4 l4Var, int i) throws RemoteException {
        pm0.m18664d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        im0.f10857b.post(new C4540l3(this));
    }
}
