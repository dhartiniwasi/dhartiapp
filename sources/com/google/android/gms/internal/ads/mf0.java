package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class mf0 extends C2921uh implements nf0 {
    /* renamed from: I6 */
    public static nf0 m16498I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof nf0 ? (nf0) queryLocalInterface : new lf0(iBinder);
    }
}
