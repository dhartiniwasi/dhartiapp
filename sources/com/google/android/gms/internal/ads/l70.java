package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l70 extends C2847sh {
    l70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: i5 */
    public final void mo11906i5(f70 f70, k70 k70) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, f70);
        C2958vh.m22238g(p, k70);
        mo14005o3(2, p);
    }
}
