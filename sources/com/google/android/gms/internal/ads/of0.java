package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class of0 extends C2847sh implements qf0 {
    of0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: Y1 */
    public final void mo12906Y1(List list) throws RemoteException {
        Parcel p = mo14006p();
        p.writeTypedList(list);
        mo14003P0(1, p);
    }

    /* renamed from: k */
    public final void mo12907k(String str) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        mo14003P0(2, p);
    }
}
