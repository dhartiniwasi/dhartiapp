package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.n1 */
/* compiled from: OSInAppMessageTag */
public class C8506n1 {

    /* renamed from: a */
    private JSONObject f35740a;

    /* renamed from: b */
    private JSONArray f35741b;

    C8506n1(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = null;
        this.f35740a = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f35741b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : jSONArray;
    }

    /* renamed from: a */
    public JSONObject mo27973a() {
        return this.f35740a;
    }

    /* renamed from: b */
    public JSONArray mo27974b() {
        return this.f35741b;
    }

    public String toString() {
        return "OSInAppMessageTag{adds=" + this.f35740a + ", removes=" + this.f35741b + '}';
    }
}
