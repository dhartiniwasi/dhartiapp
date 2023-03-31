package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.b */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface C1429b extends IInterface {

    /* renamed from: androidx.room.b$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C1430a extends Binder implements C1429b {

        /* renamed from: androidx.room.b$a$a */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C1431a implements C1429b {

            /* renamed from: a */
            private IBinder f4082a;

            C1431a(IBinder iBinder) {
                this.f4082a = iBinder;
            }

            /* renamed from: Q1 */
            public void mo5559Q1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f4082a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4082a;
            }
        }

        public C1430a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: p */
        public static C1429b m6736p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1429b)) {
                return new C1431a(iBinder);
            }
            return (C1429b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo5559Q1(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: Q1 */
    void mo5559Q1(String[] strArr) throws RemoteException;
}
