package p102n5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: n5.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class C5125a implements IInterface {

    /* renamed from: a */
    private final IBinder f26645a;

    /* renamed from: b */
    private final String f26646b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C5125a(IBinder iBinder, String str) {
        this.f26645a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final Parcel mo19093B0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f26645a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f26645a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo19095p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26646b);
        return obtain;
    }
}
