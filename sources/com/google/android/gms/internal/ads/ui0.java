package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ui0 {
    /* renamed from: a */
    public static final ii0 m21652a(Context context, String str, qb0 qb0) {
        try {
            IBinder i5 = ((mi0) tm0.m21079b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", ti0.f18014a)).mo12358i5(C4956b.m31385o3(context), str, qb0, 223104000);
            if (i5 == null) {
                return null;
            }
            IInterface queryLocalInterface = i5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof ii0 ? (ii0) queryLocalInterface : new gi0(i5);
        } catch (RemoteException | sm0 e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
