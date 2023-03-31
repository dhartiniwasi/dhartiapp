package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class re0 extends C2847sh implements te0 {
    re0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: T */
    public final void mo13784T() throws RemoteException {
        mo14003P0(3, mo14006p());
    }

    /* renamed from: T0 */
    public final void mo13785T0(Intent intent) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, intent);
        mo14003P0(1, p);
    }

    /* renamed from: v2 */
    public final void mo13786v2(C4954a aVar, String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        p.writeString(str2);
        mo14003P0(2, p);
    }
}
