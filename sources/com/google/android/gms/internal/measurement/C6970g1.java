package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C6970g1 extends C7098o0 implements C7003i1 {
    C6970g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: L2 */
    public final void mo23037L2(Bundle bundle) throws RemoteException {
        Parcel p = mo23708p();
        C7130q0.m40616e(p, bundle);
        mo23706P0(1, p);
    }
}
