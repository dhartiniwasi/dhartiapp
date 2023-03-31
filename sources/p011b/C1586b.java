package p011b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: b.b */
/* compiled from: ICustomTabsService */
public interface C1586b extends IInterface {

    /* renamed from: b.b$a */
    /* compiled from: ICustomTabsService */
    public static abstract class C1587a extends Binder implements C1586b {

        /* renamed from: b.b$a$a */
        /* compiled from: ICustomTabsService */
        private static class C1588a implements C1586b {

            /* renamed from: b */
            public static C1586b f4573b;

            /* renamed from: a */
            private IBinder f4574a;

            C1588a(IBinder iBinder) {
                this.f4574a = iBinder;
            }

            /* renamed from: K2 */
            public boolean mo6406K2(C1584a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (!this.f4574a.transact(4, obtain, obtain2, 0) && C1587a.m7336B0() != null) {
                        return C1587a.m7336B0().mo6406K2(aVar, uri, bundle, list);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: O4 */
            public boolean mo6407O4(C1584a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f4574a.transact(10, obtain, obtain2, 0) && C1587a.m7336B0() != null) {
                        return C1587a.m7336B0().mo6407O4(aVar, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4574a;
            }

            /* renamed from: k3 */
            public boolean mo6408k3(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    if (!this.f4574a.transact(2, obtain, obtain2, 0) && C1587a.m7336B0() != null) {
                        return C1587a.m7336B0().mo6408k3(j);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w3 */
            public boolean mo6409w3(C1584a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = false;
                    if (!this.f4574a.transact(3, obtain, obtain2, 0) && C1587a.m7336B0() != null) {
                        return C1587a.m7336B0().mo6409w3(aVar);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: B0 */
        public static C1586b m7336B0() {
            return C1588a.f4573b;
        }

        /* renamed from: p */
        public static C1586b m7337p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1586b)) {
                return new C1588a(iBinder);
            }
            return (C1586b) queryLocalInterface;
        }
    }

    /* renamed from: K2 */
    boolean mo6406K2(C1584a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: O4 */
    boolean mo6407O4(C1584a aVar, Bundle bundle) throws RemoteException;

    /* renamed from: k3 */
    boolean mo6408k3(long j) throws RemoteException;

    /* renamed from: w3 */
    boolean mo6409w3(C1584a aVar) throws RemoteException;
}
