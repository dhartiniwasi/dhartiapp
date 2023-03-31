package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4473a2;
import p060h4.C4491d2;
import p060h4.C4503f2;
import p060h4.C4509g2;
import p060h4.C4541l4;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class gi0 extends C2847sh implements ii0 {
    gi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: H4 */
    public final void mo10536H4(C4541l4 l4Var, pi0 pi0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, pi0);
        mo14003P0(14, p);
    }

    /* renamed from: V0 */
    public final void mo10537V0(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(5, p);
    }

    /* renamed from: V3 */
    public final void mo10538V3(C4491d2 d2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, d2Var);
        mo14003P0(13, p);
    }

    /* renamed from: Y3 */
    public final void mo10539Y3(C4541l4 l4Var, pi0 pi0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, pi0);
        mo14003P0(1, p);
    }

    /* renamed from: d6 */
    public final void mo10540d6(li0 li0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, li0);
        mo14003P0(2, p);
    }

    /* renamed from: e */
    public final C4509g2 mo10541e() throws RemoteException {
        Parcel B0 = mo14002B0(12, mo14006p());
        C4509g2 I6 = C4503f2.m29645I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: s3 */
    public final void mo10542s3(C4473a2 a2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, a2Var);
        mo14003P0(8, p);
    }

    /* renamed from: u0 */
    public final void mo10543u0(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(15, p);
    }

    /* renamed from: u4 */
    public final void mo10544u4(wi0 wi0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, wi0);
        mo14003P0(7, p);
    }
}
