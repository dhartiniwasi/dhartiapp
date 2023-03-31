package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bh0 {

    /* renamed from: a */
    private final List f7253a;

    /* renamed from: b */
    private final String f7254b;

    /* renamed from: c */
    private final String f7255c;

    /* renamed from: d */
    private final String f7256d;

    /* renamed from: e */
    private final boolean f7257e;

    /* renamed from: f */
    private final boolean f7258f;

    /* renamed from: g */
    private final String f7259g;

    /* renamed from: h */
    private final String f7260h;

    /* renamed from: i */
    private final String f7261i;

    /* renamed from: j */
    private final int f7262j;

    /* renamed from: k */
    private final JSONObject f7263k;

    /* renamed from: l */
    private final String f7264l;

    /* renamed from: m */
    private final String f7265m;

    public bh0(JSONObject jSONObject) {
        List list;
        this.f7261i = jSONObject.optString("url");
        this.f7254b = jSONObject.optString("base_uri");
        this.f7255c = jSONObject.optString("post_parameters");
        this.f7257e = m10374j(jSONObject.optString("drt_include"));
        this.f7258f = m10374j(jSONObject.optString("cookies_include", "true"));
        this.f7259g = jSONObject.optString("request_id");
        this.f7256d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            list = null;
        } else {
            list = Arrays.asList(optString.split(","));
        }
        this.f7253a = list;
        this.f7262j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f7260h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f7263k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f7264l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f7265m = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    private static boolean m10374j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: a */
    public final int mo8796a() {
        return this.f7262j;
    }

    /* renamed from: b */
    public final String mo8797b() {
        return this.f7254b;
    }

    /* renamed from: c */
    public final String mo8798c() {
        return this.f7265m;
    }

    /* renamed from: d */
    public final String mo8799d() {
        return this.f7255c;
    }

    /* renamed from: e */
    public final String mo8800e() {
        return this.f7261i;
    }

    /* renamed from: f */
    public final List mo8801f() {
        return this.f7253a;
    }

    /* renamed from: g */
    public final JSONObject mo8802g() {
        return this.f7263k;
    }

    /* renamed from: h */
    public final boolean mo8803h() {
        return this.f7258f;
    }

    /* renamed from: i */
    public final boolean mo8804i() {
        return this.f7257e;
    }
}
