package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class y10 {

    /* renamed from: a */
    private final Context f20428a;

    public y10(Context context) {
        this.f20428a = context;
    }

    /* renamed from: a */
    public final void mo15273a(hg0 hg0) {
        try {
            ((z10) tm0.m21079b(this.f20428a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", x10.f19931a)).mo15533i5(hg0);
        } catch (sm0 e) {
            pm0.m18667g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e.getMessage())));
        } catch (RemoteException e2) {
            pm0.m18667g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
