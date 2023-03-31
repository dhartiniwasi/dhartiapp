package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class qu0 extends C2921uh implements ru0 {
    /* renamed from: I6 */
    public static ru0 m19351I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof ru0 ? (ru0) queryLocalInterface : new pu0(iBinder);
    }
}
