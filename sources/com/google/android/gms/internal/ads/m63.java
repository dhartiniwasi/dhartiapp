package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class m63 extends C2921uh implements n63 {
    /* renamed from: I6 */
    public static n63 m16435I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof n63 ? (n63) queryLocalInterface : new l63(iBinder);
    }
}
