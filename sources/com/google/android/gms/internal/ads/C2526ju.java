package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ju */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2526ju extends C2847sh {
    C2526ju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: T5 */
    public final C2302du mo11513T5(C2451hu huVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, huVar);
        Parcel B0 = mo14002B0(1, p);
        C2302du duVar = (C2302du) C2958vh.m22232a(B0, C2302du.CREATOR);
        B0.recycle();
        return duVar;
    }

    /* renamed from: i5 */
    public final long mo11514i5(C2451hu huVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, huVar);
        Parcel B0 = mo14002B0(3, p);
        long readLong = B0.readLong();
        B0.recycle();
        return readLong;
    }

    /* renamed from: r6 */
    public final C2302du mo11515r6(C2451hu huVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, huVar);
        Parcel B0 = mo14002B0(2, p);
        C2302du duVar = (C2302du) C2958vh.m22232a(B0, C2302du.CREATOR);
        B0.recycle();
        return duVar;
    }
}
