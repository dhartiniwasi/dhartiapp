package p137s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: s5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C5485a implements IInterface {

    /* renamed from: a */
    private final IBinder f27835a;

    /* renamed from: b */
    private final String f27836b;

    protected C5485a(IBinder iBinder, String str) {
        this.f27835a = iBinder;
        this.f27836b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final Parcel mo19772B0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27836b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f27835a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo19774p(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f27835a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
