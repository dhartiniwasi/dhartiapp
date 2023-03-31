package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lm2 implements sj2 {

    /* renamed from: a */
    private final String f12849a;

    public lm2(String str) {
        this.f12849a = str;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.f12849a)) {
                C4820w0.m30816f(jSONObject, "pii").put("adsid", this.f12849a);
            }
        } catch (JSONException e) {
            pm0.m18668h("Failed putting trustless token.", e);
        }
    }
}
