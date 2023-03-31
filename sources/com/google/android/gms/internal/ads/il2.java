package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class il2 implements sj2 {

    /* renamed from: a */
    private final JSONObject f10846a;

    public il2(JSONObject jSONObject) {
        this.f10846a = jSONObject;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f10846a);
        } catch (JSONException unused) {
            C4794n1.m30693k("Unable to get cache_state");
        }
    }
}
