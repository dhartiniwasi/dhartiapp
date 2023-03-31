package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class w01 implements i01 {

    /* renamed from: a */
    private final tj0 f19404a;

    w01(tj0 tj0) {
        this.f19404a = tj0;
    }

    /* renamed from: a */
    public final void mo10984a(JSONObject jSONObject) {
        int i;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i = -1;
        } else {
            i = jSONObject.optBoolean("npa");
        }
        this.f19404a.mo14312b(i, optLong);
    }
}
