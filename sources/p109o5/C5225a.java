package p109o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o5.a */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public class C5225a implements IInterface {

    /* renamed from: a */
    private final IBinder f27080a;

    /* renamed from: b */
    private final String f27081b = "com.google.android.gms.appset.internal.IAppSetService";

    protected C5225a(IBinder iBinder, String str) {
        this.f27080a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final void mo19216B0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27080a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f27080a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo19218p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27081b);
        return obtain;
    }
}
