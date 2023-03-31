package p364u5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: u5.i */
public final class C12688i extends C12680a implements C12687h {
    C12688i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    /* renamed from: O1 */
    public final void mo37565O1(C12685f fVar, byte[] bArr, String str) throws RemoteException {
        Parcel p = mo37552p();
        C12682c.m60191b(p, fVar);
        p.writeByteArray(bArr);
        p.writeString(str);
        mo37550B0(7, p);
    }
}
