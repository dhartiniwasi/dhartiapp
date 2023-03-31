package p116p5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: p5.a */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public class C5319a extends Binder implements IInterface {
    protected C5319a(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return mo19293p(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo19293p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
