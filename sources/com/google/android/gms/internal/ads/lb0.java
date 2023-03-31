package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lb0 {

    /* renamed from: a */
    public final List f12718a;

    /* renamed from: b */
    public final List f12719b;

    /* renamed from: c */
    public final List f12720c;

    /* renamed from: d */
    public final List f12721d;

    /* renamed from: e */
    public final List f12722e;

    /* renamed from: f */
    public final List f12723f;

    /* renamed from: g */
    public final String f12724g;

    /* renamed from: h */
    public final String f12725h;

    public lb0(JSONObject jSONObject) throws JSONException {
        if (pm0.m18670j(2)) {
            C4794n1.m30693k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                kb0 kb0 = new kb0(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(kb0.f12008v);
                arrayList.add(kb0);
                if (i < 0) {
                    Iterator it = kb0.f11989c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f12718a = Collections.unmodifiableList(arrayList);
        this.f12724g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            C4409t.m29317i();
            this.f12719b = mb0.m16464a(optJSONObject, "click_urls");
            C4409t.m29317i();
            this.f12720c = mb0.m16464a(optJSONObject, "imp_urls");
            C4409t.m29317i();
            this.f12721d = mb0.m16464a(optJSONObject, "downloaded_imp_urls");
            C4409t.m29317i();
            this.f12722e = mb0.m16464a(optJSONObject, "nofill_urls");
            C4409t.m29317i();
            this.f12723f = mb0.m16464a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1);
            bi0 I1 = bi0.m10388I1(optJSONObject.optJSONArray("rewards"));
            if (I1 == null) {
                this.f12725h = null;
            } else {
                this.f12725h = I1.f7277a;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f12719b = null;
        this.f12720c = null;
        this.f12721d = null;
        this.f12722e = null;
        this.f12723f = null;
        this.f12725h = null;
    }
}
