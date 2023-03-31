package p364u5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: u5.a */
public class C12680a implements IInterface {

    /* renamed from: a */
    private final IBinder f46449a;

    /* renamed from: b */
    private final String f46450b;

    protected C12680a(IBinder iBinder, String str) {
        this.f46449a = iBinder;
        this.f46450b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final void mo37550B0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46449a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f46449a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo37552p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46450b);
        return obtain;
    }
}
