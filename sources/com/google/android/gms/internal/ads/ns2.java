package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ns2 {

    /* renamed from: a */
    public final String f14183a;

    /* renamed from: b */
    public final String f14184b;

    /* renamed from: c */
    public final JSONObject f14185c;

    /* renamed from: d */
    public final JSONObject f14186d;

    ns2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject h = C4820w0.m30818h(jsonReader);
        this.f14186d = h;
        this.f14183a = h.optString("ad_html", (String) null);
        this.f14184b = h.optString("ad_base_url", (String) null);
        this.f14185c = h.optJSONObject("ad_json");
    }
}
