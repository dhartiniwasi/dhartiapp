package com.startapp;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.startapp.c4 */
/* compiled from: Sta */
public interface C8874c4 extends IInterface {

    /* renamed from: com.startapp.c4$a */
    /* compiled from: Sta */
    public static abstract class C8875a extends Binder implements C8874c4 {

        /* renamed from: a */
        public static final /* synthetic */ int f36569a = 0;

        /* renamed from: com.startapp.c4$a$a */
        /* compiled from: Sta */
        public static class C8876a implements C8874c4 {

            /* renamed from: a */
            public IBinder f36570a;

            public C8876a(IBinder iBinder) {
                this.f36570a = iBinder;
            }

            /* renamed from: a */
            public Bundle mo29243a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f36570a.transact(1, obtain, obtain2, 0)) {
                        int i = C8875a.f36569a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f36570a;
            }
        }
    }

    /* renamed from: a */
    Bundle mo29243a(Bundle bundle) throws RemoteException;
}
