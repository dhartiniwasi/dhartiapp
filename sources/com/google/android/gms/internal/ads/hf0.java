package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hf0 {

    /* renamed from: a */
    public final boolean f10312a;

    /* renamed from: b */
    public final String f10313b;

    public hf0(boolean z, String str) {
        this.f10312a = z;
        this.f10313b = str;
    }

    /* renamed from: a */
    public static hf0 m13827a(JSONObject jSONObject) {
        return new hf0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
