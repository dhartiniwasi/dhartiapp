package p123q5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: q5.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C5403a implements IInterface {

    /* renamed from: a */
    private final IBinder f27627a;

    /* renamed from: b */
    private final String f27628b;

    protected C5403a(IBinder iBinder, String str) {
        this.f27627a = iBinder;
        this.f27628b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final void mo19527B0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27627a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo19528P0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f27627a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f27627a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo19530p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27628b);
        return obtain;
    }
}
