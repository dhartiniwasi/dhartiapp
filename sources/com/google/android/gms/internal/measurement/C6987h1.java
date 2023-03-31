package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C6987h1 extends C7114p0 implements C7003i1 {
    public C6987h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo23343p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C7130q0.m40614c(parcel);
        mo23037L2((Bundle) C7130q0.m40612a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
