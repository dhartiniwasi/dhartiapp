package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3818v implements C3353gt {

    /* renamed from: b */
    private static final String f22794b = "v";

    /* renamed from: a */
    private String f22795a;

    /* renamed from: a */
    public final String mo16921a() {
        return this.f22795a;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.f22795a = C3296f5.m25549a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22794b, str);
        }
    }
}
