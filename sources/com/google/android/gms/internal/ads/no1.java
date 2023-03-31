package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class no1 {

    /* renamed from: a */
    private final mf3 f14150a;

    /* renamed from: b */
    private final ap1 f14151b;

    /* renamed from: c */
    private final fp1 f14152c;

    public no1(mf3 mf3, ap1 ap1, fp1 fp1) {
        this.f14150a = mf3;
        this.f14151b = ap1;
        this.f14152c = fp1;
    }

    /* renamed from: a */
    public final lf3 mo12681a(us2 us2, is2 is2, JSONObject jSONObject) {
        lf3 n;
        us2 us22 = us2;
        is2 is22 = is2;
        JSONObject jSONObject2 = jSONObject;
        lf3 a = this.f14150a.mo12324a(new lo1(this, us22, is22, jSONObject2));
        lf3 f = this.f14151b.mo8483f(jSONObject2, "images");
        lf3 g = this.f14151b.mo8484g(jSONObject2, "images", is22, us22.f18723b.f18244b);
        lf3 e = this.f14151b.mo8482e(jSONObject2, "secondary_image");
        lf3 e2 = this.f14151b.mo8482e(jSONObject2, "app_icon");
        lf3 d = this.f14151b.mo8481d(jSONObject2, "attribution");
        lf3 h = this.f14151b.mo8485h(jSONObject2, is22, us22.f18723b.f18244b);
        ap1 ap1 = this.f14151b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            n = cf3.m10911i((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                n = cf3.m10911i((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    n = cf3.m10911i((Object) null);
                } else {
                    n = cf3.m10916n(cf3.m10911i((Object) null), new po1(ap1, optString), dn0.f8329e);
                }
            }
        }
        lf3 lf3 = n;
        lf3 a2 = this.f14152c.mo10245a(jSONObject2, "custom_assets");
        return cf3.m10904b(a, f, g, e, e2, d, h, lf3, a2).mo8777a(new mo1(this, a, f, e2, e, d, jSONObject, h, g, lf3, a2), this.f14150a);
    }
}
