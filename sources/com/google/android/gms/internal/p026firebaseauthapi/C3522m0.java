package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3522m0 implements C3353gt {

    /* renamed from: c */
    private static final String f22341c = "m0";

    /* renamed from: a */
    private String f22342a;

    /* renamed from: b */
    private String f22343b;

    /* renamed from: a */
    public final String mo16351a() {
        return this.f22342a;
    }

    /* renamed from: b */
    public final String mo16352b() {
        return this.f22343b;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22342a = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f22343b = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22341c, str);
        }
    }
}
