package p033d5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d5.x0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C4160x0 implements C4124m {

    /* renamed from: a */
    private final IBinder f23423a;

    C4160x0(IBinder iBinder) {
        this.f23423a = iBinder;
    }

    /* renamed from: D4 */
    public final void mo17426D4(C4121l lVar, C4102f fVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                C4129n1.m28187a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f23423a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f23423a;
    }
}
