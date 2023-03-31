package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7146r0 extends C7098o0 implements C7178t0 {
    C7146r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: r0 */
    public final Bundle mo23806r0(Bundle bundle) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        Parcel B0 = mo23705B0(1, p);
        Bundle bundle2 = (Bundle) C7130q0.m40612a(B0, Bundle.CREATOR);
        B0.recycle();
        return bundle2;
    }
}
