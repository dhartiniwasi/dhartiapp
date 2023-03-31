package p137s5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: s5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C5486b extends Binder implements IInterface {
    protected C5486b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo17486p(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo17486p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }
}
