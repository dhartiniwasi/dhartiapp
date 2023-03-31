package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;
import p137s5.C5485a;
import p137s5.C5487c;

/* renamed from: com.google.android.gms.dynamite.n */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C2159n extends C5485a {
    C2159n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: P0 */
    public final C4954a mo8149P0(C4954a aVar, String str, int i, C4954a aVar2) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        B0.writeInt(i);
        C5487c.m33442e(B0, aVar2);
        Parcel p = mo19774p(2, B0);
        C4954a B02 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B02;
    }

    /* renamed from: o3 */
    public final C4954a mo8150o3(C4954a aVar, String str, int i, C4954a aVar2) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        B0.writeInt(i);
        C5487c.m33442e(B0, aVar2);
        Parcel p = mo19774p(3, B0);
        C4954a B02 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B02;
    }
}
