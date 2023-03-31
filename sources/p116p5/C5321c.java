package p116p5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: p5.c */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public class C5321c implements IInterface {

    /* renamed from: a */
    private final IBinder f27347a;

    /* renamed from: b */
    private final String f27348b;

    protected C5321c(IBinder iBinder, String str) {
        this.f27347a = iBinder;
        this.f27348b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final void mo19294B0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27347a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f27347a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo19296p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27348b);
        return obtain;
    }
}
