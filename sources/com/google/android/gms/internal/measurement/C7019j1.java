package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7019j1 extends C7098o0 implements C7035k1 {
    C7019j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: b */
    public final int mo23543b() throws RemoteException {
        Parcel B0 = mo23705B0(2, mo23708p());
        int readInt = B0.readInt();
        B0.recycle();
        return readInt;
    }

    /* renamed from: b1 */
    public final void mo23544b1(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel p = mo23708p();
        p.writeString(str);
        p.writeString(str2);
        C7130q0.m40616e(p, bundle);
        p.writeLong(j);
        mo23706P0(1, p);
    }
}
