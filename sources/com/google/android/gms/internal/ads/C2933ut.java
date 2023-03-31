package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p060h4.C4623z2;

/* renamed from: com.google.android.gms.internal.ads.ut */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C2933ut extends C2921uh implements C2970vt {
    public C2933ut() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo12082T();
        } else if (i == 2) {
            mo12085e();
        } else if (i == 3) {
            C2958vh.m22234c(parcel);
            mo12081Q0((C4623z2) C2958vh.m22232a(parcel, C4623z2.CREATOR));
        } else if (i == 4) {
            mo12083a();
        } else if (i != 5) {
            return false;
        } else {
            mo12084d();
        }
        parcel2.writeNoException();
        return true;
    }
}
