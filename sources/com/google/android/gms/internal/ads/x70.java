package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class x70 extends C2847sh implements z70 {
    x70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: X4 */
    public final void mo15060X4(List list) throws RemoteException {
        Parcel p = mo14006p();
        p.writeTypedList(list);
        mo14003P0(1, p);
    }
}
