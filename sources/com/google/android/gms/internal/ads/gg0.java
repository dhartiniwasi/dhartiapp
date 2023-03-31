package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class gg0 extends C2921uh implements hg0 {
    public gg0() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo10161d();
        parcel2.writeNoException();
        return true;
    }
}
