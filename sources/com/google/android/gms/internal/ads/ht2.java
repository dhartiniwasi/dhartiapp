package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ht2 {

    /* renamed from: a */
    private final JSONObject f10484a;

    public ht2(JSONObject jSONObject) {
        this.f10484a = jSONObject;
    }

    /* renamed from: a */
    public final String mo10946a() {
        if (mo10947b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int mo10947b() {
        int optInt = this.f10484a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
