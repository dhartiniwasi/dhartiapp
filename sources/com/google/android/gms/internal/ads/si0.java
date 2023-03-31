package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p129r4.C5455b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class si0 implements C5455b {

    /* renamed from: a */
    private final fi0 f17473a;

    public si0(fi0 fi0) {
        this.f17473a = fi0;
    }

    /* renamed from: a */
    public final int mo14016a() {
        fi0 fi0 = this.f17473a;
        if (fi0 != null) {
            try {
                return fi0.mo9602a();
            } catch (RemoteException e) {
                pm0.m18668h("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    public final String getType() {
        fi0 fi0 = this.f17473a;
        if (fi0 != null) {
            try {
                return fi0.mo9601T();
            } catch (RemoteException e) {
                pm0.m18668h("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
