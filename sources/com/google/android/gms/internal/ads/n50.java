package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class n50 implements e60 {
    n50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        JSONObject zza;
        vs0 vs0 = (vs0) obj;
        e20 y = vs0.mo12146y();
        if (y == null || (zza = y.zza()) == null) {
            vs0.mo9084a("nativeAdViewSignalsReady", new JSONObject());
        } else {
            vs0.mo9084a("nativeAdViewSignalsReady", zza);
        }
    }
}
