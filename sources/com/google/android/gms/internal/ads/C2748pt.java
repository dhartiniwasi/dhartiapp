package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* renamed from: com.google.android.gms.internal.ads.pt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2748pt extends C2847sh implements C2822rt {
    C2748pt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: U5 */
    public final void mo11509U5(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(3, p);
    }

    /* renamed from: l3 */
    public final void mo11510l3(C2710ot otVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, otVar);
        mo14003P0(1, p);
    }

    /* renamed from: s */
    public final void mo11511s(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(2, p);
    }
}
