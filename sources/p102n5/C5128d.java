package p102n5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: n5.d */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C5128d extends C5125a implements C5130f {
    C5128d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: G */
    public final boolean mo19096G(boolean z) throws RemoteException {
        Parcel p = mo19095p();
        C5127c.m32012a(p, true);
        Parcel B0 = mo19093B0(2, p);
        boolean b = C5127c.m32013b(B0);
        B0.recycle();
        return b;
    }

    /* renamed from: b */
    public final boolean mo19097b() throws RemoteException {
        Parcel B0 = mo19093B0(6, mo19095p());
        boolean b = C5127c.m32013b(B0);
        B0.recycle();
        return b;
    }

    /* renamed from: e */
    public final String mo19098e() throws RemoteException {
        Parcel B0 = mo19093B0(1, mo19095p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }
}
