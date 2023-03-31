package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rl0 {

    /* renamed from: a */
    private final List f16998a = new ArrayList();

    /* renamed from: b */
    private final List f16999b = new ArrayList();

    /* renamed from: c */
    private final Map f17000c = new HashMap();

    /* renamed from: d */
    private String f17001d;

    /* renamed from: e */
    private String f17002e;

    /* renamed from: f */
    private long f17003f;

    /* renamed from: g */
    private JSONObject f17004g;

    /* renamed from: h */
    private boolean f17005h = false;

    /* renamed from: i */
    private final List f17006i = new ArrayList();

    /* renamed from: j */
    private boolean f17007j = false;

    public rl0(String str, long j) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        this.f17002e = str;
        this.f17003f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f17004g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f17005h = false;
                    pm0.m18667g("App settings could not be fetched successfully.");
                    return;
                }
                this.f17005h = true;
                this.f17001d = this.f17004g.optString("app_id");
                JSONArray optJSONArray2 = this.f17004g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f16999b.add(optString2);
                                } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject2 = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f17000c.put(optString2, new lb0(optJSONObject2));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f17004g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                        this.f16998a.add(optJSONArray3.optString(i2));
                    }
                }
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14476X5)).booleanValue()) {
                    JSONObject optJSONObject3 = this.f17004g.optJSONObject("common_settings");
                    if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("loeid")) == null)) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            this.f17006i.add(optJSONArray.get(i3).toString());
                        }
                    }
                }
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14683s5)).booleanValue() && (optJSONObject = this.f17004g.optJSONObject("common_settings")) != null) {
                    this.f17007j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                pm0.m18668h("Exception occurred while processing app setting json", e);
                C4409t.m29325q().mo15126t(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo13841a() {
        return this.f17003f;
    }

    /* renamed from: b */
    public final String mo13842b() {
        return this.f17001d;
    }

    /* renamed from: c */
    public final String mo13843c() {
        return this.f17002e;
    }

    /* renamed from: d */
    public final List mo13844d() {
        return this.f17006i;
    }

    /* renamed from: e */
    public final Map mo13845e() {
        return this.f17000c;
    }

    /* renamed from: f */
    public final JSONObject mo13846f() {
        return this.f17004g;
    }

    /* renamed from: g */
    public final void mo13847g(long j) {
        this.f17003f = j;
    }

    /* renamed from: h */
    public final boolean mo13848h() {
        return this.f17007j;
    }

    /* renamed from: i */
    public final boolean mo13849i() {
        return this.f17005h;
    }
}
