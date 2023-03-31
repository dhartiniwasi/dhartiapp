package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sh */
/* compiled from: com.google.android.gms:play-services-ads-base@@21.3.0 */
public class C2847sh implements IInterface {

    /* renamed from: a */
    private final IBinder f17468a;

    /* renamed from: b */
    private final String f17469b;

    protected C2847sh(IBinder iBinder, String str) {
        this.f17468a = iBinder;
        this.f17469b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final Parcel mo14002B0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f17468a.transact(i, parcel, parcel, 0);
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
    public final void mo14003P0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f17468a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f17468a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o3 */
    public final void mo14005o3(int i, Parcel parcel) throws RemoteException {
        try {
            this.f17468a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Parcel mo14006p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17469b);
        return obtain;
    }
}
