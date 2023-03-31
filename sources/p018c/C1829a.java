package p018c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: c.a */
/* compiled from: INotificationSideChannel */
public interface C1829a extends IInterface {

    /* renamed from: c.a$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C1830a extends Binder implements C1829a {

        /* renamed from: c.a$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C1831a implements C1829a {

            /* renamed from: a */
            private IBinder f5374a;

            C1831a(IBinder iBinder) {
                this.f5374a = iBinder;
            }

            public IBinder asBinder() {
                return this.f5374a;
            }

            /* renamed from: h4 */
            public void mo7011h4(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f5374a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: k6 */
            public void mo7012k6(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C1832b.m8537b(obtain, notification, 0);
                    this.f5374a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: o2 */
            public void mo7013o2(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f5374a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: p */
        public static C1829a m8532p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1829a)) {
                return new C1831a(iBinder);
            }
            return (C1829a) queryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    /* compiled from: INotificationSideChannel */
    public static class C1832b {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static <T extends Parcelable> void m8537b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: h4 */
    void mo7011h4(String str, int i, String str2) throws RemoteException;

    /* renamed from: k6 */
    void mo7012k6(String str, int i, String str2, Notification notification) throws RemoteException;

    /* renamed from: o2 */
    void mo7013o2(String str) throws RemoteException;
}
