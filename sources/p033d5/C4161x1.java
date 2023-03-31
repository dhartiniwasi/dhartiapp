package p033d5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;
import p137s5.C5485a;

/* renamed from: d5.x1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4161x1 extends C5485a implements C4168z1 {
    C4161x1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final C4954a mo17489b() throws RemoteException {
        Parcel p = mo19774p(1, mo19772B0());
        C4954a B0 = C4954a.C4955a.m31383B0(p.readStrongBinder());
        p.recycle();
        return B0;
    }

    /* renamed from: e */
    public final int mo17490e() throws RemoteException {
        Parcel p = mo19774p(2, mo19772B0());
        int readInt = p.readInt();
        p.recycle();
        return readInt;
    }
}
