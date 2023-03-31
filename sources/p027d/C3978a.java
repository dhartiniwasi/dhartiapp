package p027d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: d.a */
/* compiled from: IResultReceiver */
public interface C3978a extends IInterface {

    /* renamed from: d.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C3979a extends Binder implements C3978a {

        /* renamed from: d.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C3980a implements C3978a {

            /* renamed from: a */
            private IBinder f22997a;

            C3980a(IBinder iBinder) {
                this.f22997a = iBinder;
            }

            /* renamed from: C6 */
            public void mo17136C6(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    C3981b.m27599d(obtain, bundle, 0);
                    this.f22997a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f22997a;
            }
        }

        public C3979a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: p */
        public static C3978a m27594p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3978a)) {
                return new C3980a(iBinder);
            }
            return (C3978a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo17136C6(parcel.readInt(), (Bundle) C3981b.m27598c(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: d.a$b */
    /* compiled from: IResultReceiver */
    public static class C3981b {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m27598c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m27599d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: C6 */
    void mo17136C6(int i, Bundle bundle) throws RemoteException;
}
