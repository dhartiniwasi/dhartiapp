package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class i02 implements ie3 {

    /* renamed from: a */
    public final /* synthetic */ l02 f10573a;

    /* renamed from: b */
    public final /* synthetic */ String f10574b;

    /* renamed from: c */
    public final /* synthetic */ String f10575c;

    public /* synthetic */ i02(l02 l02, String str, String str2) {
        this.f10573a = l02;
        this.f10574b = str;
        this.f10575c = str2;
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) {
        String str = this.f10574b;
        String str2 = this.f10575c;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return cf3.m10911i(jSONObject);
        } catch (JSONException e) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
        }
    }
}
