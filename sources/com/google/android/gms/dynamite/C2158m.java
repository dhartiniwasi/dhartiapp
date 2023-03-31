package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;
import p137s5.C5485a;
import p137s5.C5487c;

/* renamed from: com.google.android.gms.dynamite.m */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C2158m extends C5485a {
    C2158m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: H6 */
    public final C4954a mo8142H6(C4954a aVar, String str, boolean z, long j) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        C5487c.m33440c(B0, z);
        B0.writeLong(j);
        Parcel p = mo19774p(7, B0);
        C4954a B02 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B02;
    }

    /* renamed from: P0 */
    public final int mo8143P0(C4954a aVar, String str, boolean z) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        C5487c.m33440c(B0, z);
        Parcel p = mo19774p(3, B0);
        int readInt = p.readInt();
        p.recycle();
        return readInt;
    }

    /* renamed from: T5 */
    public final C4954a mo8144T5(C4954a aVar, String str, int i, C4954a aVar2) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        B0.writeInt(i);
        C5487c.m33442e(B0, aVar2);
        Parcel p = mo19774p(8, B0);
        C4954a B02 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B02;
    }

    /* renamed from: a */
    public final int mo8145a() throws RemoteException {
        Parcel p = mo19774p(6, mo19772B0());
        int readInt = p.readInt();
        p.recycle();
        return readInt;
    }

    /* renamed from: i5 */
    public final C4954a mo8146i5(C4954a aVar, String str, int i) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        B0.writeInt(i);
        Parcel p = mo19774p(2, B0);
        C4954a B02 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B02;
    }

    /* renamed from: o3 */
    public final int mo8147o3(C4954a aVar, String str, boolean z) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        C5487c.m33440c(B0, z);
        Parcel p = mo19774p(5, B0);
        int readInt = p.readInt();
        p.recycle();
        return readInt;
    }

    /* renamed from: r6 */
    public final C4954a mo8148r6(C4954a aVar, String str, int i) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33442e(B0, aVar);
        B0.writeString(str);
        B0.writeInt(i);
        Parcel p = mo19774p(4, B0);
        C4954a B02 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B02;
    }
}
