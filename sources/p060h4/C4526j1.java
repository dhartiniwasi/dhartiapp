package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.s70;
import com.google.android.gms.internal.ads.z70;
import java.util.ArrayList;
import java.util.List;
import p088l5.C4954a;

/* renamed from: h4.j1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4526j1 extends C2847sh implements C4538l1 {
    C4526j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: A4 */
    public final void mo10680A4(qb0 qb0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, qb0);
        mo14003P0(11, p);
    }

    /* renamed from: E5 */
    public final void mo10681E5(C4618y3 y3Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, y3Var);
        mo14003P0(14, p);
    }

    /* renamed from: Q5 */
    public final void mo10684Q5(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(4, p);
    }

    /* renamed from: S2 */
    public final void mo10685S2(z70 z70) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, z70);
        mo14003P0(12, p);
    }

    /* renamed from: V */
    public final void mo10687V() throws RemoteException {
        mo14003P0(15, mo14006p());
    }

    /* renamed from: W */
    public final void mo10688W() throws RemoteException {
        mo14003P0(1, mo14006p());
    }

    /* renamed from: X5 */
    public final void mo10689X5(float f) throws RemoteException {
        Parcel p = mo14006p();
        p.writeFloat(f);
        mo14003P0(2, p);
    }

    /* renamed from: c */
    public final List mo10692c() throws RemoteException {
        Parcel B0 = mo14002B0(13, mo14006p());
        ArrayList<s70> createTypedArrayList = B0.createTypedArrayList(s70.CREATOR);
        B0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: h5 */
    public final void mo10696h5(C4954a aVar, String str) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        mo14003P0(5, p);
    }

    /* renamed from: i4 */
    public final void mo10697i4(String str, C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString((String) null);
        C2958vh.m22238g(p, aVar);
        mo14003P0(6, p);
    }

    /* renamed from: t4 */
    public final void mo10699t4(C4604w1 w1Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, w1Var);
        mo14003P0(16, p);
    }
}
