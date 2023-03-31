package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ng0 extends C2847sh implements pg0 {
    ng0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: Q3 */
    public final void mo11005Q3(String str, tg0 tg0) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        C2958vh.m22238g(p, tg0);
        mo14003P0(7, p);
    }

    /* renamed from: Y0 */
    public final void mo11006Y0(yg0 yg0, tg0 tg0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, yg0);
        C2958vh.m22238g(p, tg0);
        mo14003P0(6, p);
    }

    /* renamed from: c3 */
    public final void mo11007c3(yg0 yg0, tg0 tg0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, yg0);
        C2958vh.m22238g(p, tg0);
        mo14003P0(5, p);
    }

    /* renamed from: r2 */
    public final void mo11008r2(yg0 yg0, tg0 tg0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, yg0);
        C2958vh.m22238g(p, tg0);
        mo14003P0(4, p);
    }
}
