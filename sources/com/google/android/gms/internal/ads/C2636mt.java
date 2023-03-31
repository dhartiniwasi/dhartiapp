package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4491d2;
import p060h4.C4503f2;
import p060h4.C4509g2;
import p088l5.C4954a;

/* renamed from: com.google.android.gms.internal.ads.mt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2636mt extends C2847sh implements C2710ot {
    C2636mt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* renamed from: H2 */
    public final void mo11559H2(C4491d2 d2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, d2Var);
        mo14003P0(7, p);
    }

    /* renamed from: T */
    public final C4509g2 mo11560T() throws RemoteException {
        Parcel B0 = mo14002B0(5, mo14006p());
        C4509g2 I6 = C4503f2.m29645I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: p6 */
    public final void mo11563p6(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(6, p);
    }

    /* renamed from: y4 */
    public final void mo11564y4(C4954a aVar, C2970vt vtVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, vtVar);
        mo14003P0(4, p);
    }
}
