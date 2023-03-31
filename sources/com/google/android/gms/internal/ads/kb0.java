package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kb0 {

    /* renamed from: a */
    public final String f11987a;

    /* renamed from: b */
    public final String f11988b;

    /* renamed from: c */
    public final List f11989c;

    /* renamed from: d */
    public final String f11990d;

    /* renamed from: e */
    public final String f11991e;

    /* renamed from: f */
    public final List f11992f;

    /* renamed from: g */
    public final List f11993g;

    /* renamed from: h */
    public final List f11994h;

    /* renamed from: i */
    public final List f11995i;

    /* renamed from: j */
    public final List f11996j;

    /* renamed from: k */
    public final String f11997k;

    /* renamed from: l */
    public final List f11998l;

    /* renamed from: m */
    public final List f11999m;

    /* renamed from: n */
    public final List f12000n;

    /* renamed from: o */
    public final String f12001o;

    /* renamed from: p */
    public final String f12002p;

    /* renamed from: q */
    public final String f12003q;

    /* renamed from: r */
    public final String f12004r;

    /* renamed from: s */
    public final String f12005s;

    /* renamed from: t */
    public final List f12006t;

    /* renamed from: u */
    public final String f12007u;

    /* renamed from: v */
    public final String f12008v;

    public kb0(JSONObject jSONObject) throws JSONException {
        List list;
        this.f11988b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f11989c = Collections.unmodifiableList(arrayList);
        this.f11990d = jSONObject.optString("allocation_id", (String) null);
        C4409t.m29317i();
        this.f11992f = mb0.m16464a(jSONObject, "clickurl");
        C4409t.m29317i();
        this.f11993g = mb0.m16464a(jSONObject, "imp_urls");
        C4409t.m29317i();
        this.f11994h = mb0.m16464a(jSONObject, "downloaded_imp_urls");
        C4409t.m29317i();
        this.f11996j = mb0.m16464a(jSONObject, "fill_urls");
        C4409t.m29317i();
        this.f11998l = mb0.m16464a(jSONObject, "video_start_urls");
        C4409t.m29317i();
        this.f12000n = mb0.m16464a(jSONObject, "video_complete_urls");
        C4409t.m29317i();
        this.f11999m = mb0.m16464a(jSONObject, "video_reward_urls");
        this.f12001o = jSONObject.optString("transaction_id");
        this.f12002p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C4409t.m29317i();
            list = mb0.m16464a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f11995i = list;
        this.f11987a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY);
        this.f11997k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f11991e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f12003q = jSONObject.optString("html_template", (String) null);
        this.f12004r = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f12005s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        C4409t.m29317i();
        this.f12006t = mb0.m16464a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f12007u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f12008v = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
