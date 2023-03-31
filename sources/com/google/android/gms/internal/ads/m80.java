package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class m80 extends C2847sh implements o80 {
    m80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: l */
    public final void mo12287l(C4623z2 z2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, z2Var);
        mo14003P0(3, p);
    }

    /* renamed from: n */
    public final void mo12288n(int i) throws RemoteException {
        Parcel p = mo14006p();
        p.writeInt(i);
        mo14003P0(2, p);
    }

    /* renamed from: p1 */
    public final void mo12289p1(i80 i80) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, i80);
        mo14003P0(1, p);
    }
}
