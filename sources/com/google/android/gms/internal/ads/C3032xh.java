package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.xh */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C3032xh extends C2921uh implements C3069yh {
    /* renamed from: I6 */
    public static C3069yh m23214I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof C3069yh ? (C3069yh) queryLocalInterface : new C2995wh(iBinder);
    }
}
