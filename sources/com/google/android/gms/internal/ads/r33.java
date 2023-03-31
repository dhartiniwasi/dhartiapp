package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r33 extends C2847sh {
    r33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: T5 */
    public final y33 mo13660T5(w33 w33) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, w33);
        Parcel B0 = mo14002B0(3, p);
        y33 y33 = (y33) C2958vh.m22232a(B0, y33.CREATOR);
        B0.recycle();
        return y33;
    }

    /* renamed from: i5 */
    public final p33 mo13661i5(n33 n33) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, n33);
        Parcel B0 = mo14002B0(1, p);
        p33 p33 = (p33) C2958vh.m22232a(B0, p33.CREATOR);
        B0.recycle();
        return p33;
    }

    /* renamed from: r6 */
    public final void mo13662r6(k33 k33) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, k33);
        mo14003P0(2, p);
    }
}
