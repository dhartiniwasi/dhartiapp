package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class f40 extends C2847sh implements h40 {
    f40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: p0 */
    public final boolean mo10069p0(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        Parcel B0 = mo14002B0(2, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }
}
