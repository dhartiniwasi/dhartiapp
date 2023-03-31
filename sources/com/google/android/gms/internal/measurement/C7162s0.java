package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C7162s0 extends C7114p0 implements C7178t0 {
    /* renamed from: B0 */
    public static C7178t0 m40862B0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C7178t0 ? (C7178t0) queryLocalInterface : new C7146r0(iBinder);
    }
}
