package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.x */
/* compiled from: ImmutableJSONObject */
class C8645x {

    /* renamed from: a */
    private final JSONObject f36106a;

    public C8645x() {
        this.f36106a = new JSONObject();
    }

    /* renamed from: a */
    public boolean mo28283a(String str) {
        return this.f36106a.has(str);
    }

    /* renamed from: b */
    public boolean mo28284b(String str) {
        return this.f36106a.optBoolean(str);
    }

    /* renamed from: c */
    public boolean mo28285c(String str, boolean z) {
        return this.f36106a.optBoolean(str, z);
    }

    /* renamed from: d */
    public int mo28286d(String str, int i) {
        return this.f36106a.optInt(str, i);
    }

    /* renamed from: e */
    public JSONObject mo28287e(String str) {
        return this.f36106a.optJSONObject(str);
    }

    /* renamed from: f */
    public String mo28288f(String str) {
        return this.f36106a.optString(str);
    }

    /* renamed from: g */
    public String mo28289g(String str, String str2) {
        return this.f36106a.optString(str, str2);
    }

    public String toString() {
        return "ImmutableJSONObject{jsonObject=" + this.f36106a + '}';
    }

    public C8645x(JSONObject jSONObject) {
        this.f36106a = jSONObject;
    }
}
