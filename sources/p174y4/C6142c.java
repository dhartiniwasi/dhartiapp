package p174y4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: y4.c */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
interface C6142c extends IInterface {

    /* renamed from: y4.c$a */
    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class C6143a implements C6142c {

        /* renamed from: a */
        private final IBinder f29578a;

        C6143a(IBinder iBinder) {
            this.f29578a = iBinder;
        }

        /* renamed from: K1 */
        public void mo21002K1(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f29578a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f29578a;
        }
    }

    /* renamed from: K1 */
    void mo21002K1(Message message) throws RemoteException;
}
