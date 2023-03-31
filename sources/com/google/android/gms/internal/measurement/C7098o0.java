package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C7098o0 implements IInterface {

    /* renamed from: a */
    private final IBinder f31917a;

    /* renamed from: b */
    private final String f31918b;

    protected C7098o0(IBinder iBinder, String str) {
        this.f31917a = iBinder;
        this.f31918b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final Parcel mo23705B0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f31917a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo23706P0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f31917a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f31917a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo23708p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31918b);
        return obtain;
    }
}
