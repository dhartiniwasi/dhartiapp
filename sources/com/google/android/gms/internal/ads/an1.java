package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class an1 implements e60 {

    /* renamed from: a */
    public final /* synthetic */ bn1 f6682a;

    /* renamed from: b */
    public final /* synthetic */ j40 f6683b;

    public /* synthetic */ an1(bn1 bn1, j40 j40) {
        this.f6682a = bn1;
        this.f6683b = j40;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        bn1 bn1 = this.f6682a;
        j40 j40 = this.f6683b;
        try {
            bn1.f7377f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            pm0.m18664d("Failed to call parse unconfirmedClickTimestamp.");
        }
        bn1.f7376e = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (j40 == null) {
            pm0.m18662b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            j40.mo11016v(str);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
