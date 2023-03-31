package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ev */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3289ev implements C3353gt {

    /* renamed from: c */
    private static final String f22008c = "ev";

    /* renamed from: a */
    private String f22009a;

    /* renamed from: b */
    private String f22010b;

    /* renamed from: a */
    public final String mo16004a() {
        return this.f22009a;
    }

    /* renamed from: b */
    public final String mo16005b() {
        return this.f22010b;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22009a = jSONObject.optString("idToken", (String) null);
            this.f22010b = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22008c, str);
        }
    }
}
