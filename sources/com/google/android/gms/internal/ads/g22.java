package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4584t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class g22 implements ia0 {
    g22() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ JSONObject mo10378c(Object obj) throws JSONException {
        h22 h22 = (h22) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14478X7)).booleanValue()) {
            jSONObject2.put("ad_request_url", h22.f10163c.mo8800e());
            jSONObject2.put("ad_request_post_body", h22.f10163c.mo8799d());
        }
        jSONObject2.put("base_url", h22.f10163c.mo8797b());
        jSONObject2.put("signals", h22.f10162b);
        jSONObject3.put("body", h22.f10161a.f12624c);
        jSONObject3.put("headers", C4584t.m30036b().mo11160k(h22.f10161a.f12623b));
        jSONObject3.put("response_code", h22.f10161a.f12622a);
        jSONObject3.put("latency", h22.f10161a.f12625d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", h22.f10163c.mo8802g());
        return jSONObject;
    }
}
