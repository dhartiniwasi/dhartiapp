package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3355gv implements C3353gt {

    /* renamed from: c */
    private static final String f22079c = "gv";

    /* renamed from: a */
    private String f22080a;

    /* renamed from: b */
    private String f22081b;

    /* renamed from: a */
    public final String mo16091a() {
        return this.f22080a;
    }

    /* renamed from: b */
    public final String mo16092b() {
        return this.f22081b;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22080a = jSONObject.optString("idToken", (String) null);
            this.f22081b = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22079c, str);
        }
    }
}
