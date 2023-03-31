package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.cv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3223cv implements C3353gt {

    /* renamed from: i */
    private static final String f21894i = "cv";

    /* renamed from: a */
    private String f21895a;

    /* renamed from: b */
    private String f21896b;

    /* renamed from: c */
    private String f21897c;

    /* renamed from: d */
    private String f21898d;

    /* renamed from: e */
    private boolean f21899e;

    /* renamed from: f */
    private long f21900f;

    /* renamed from: g */
    private List f21901g;

    /* renamed from: h */
    private String f21902h;

    /* renamed from: a */
    public final long mo15915a() {
        return this.f21900f;
    }

    /* renamed from: b */
    public final String mo15916b() {
        return this.f21897c;
    }

    /* renamed from: c */
    public final String mo15917c() {
        return this.f21902h;
    }

    /* renamed from: d */
    public final String mo15918d() {
        return this.f21898d;
    }

    /* renamed from: e */
    public final List mo15919e() {
        return this.f21901g;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f21895a = jSONObject.optString("localId", (String) null);
            this.f21896b = jSONObject.optString("email", (String) null);
            this.f21897c = jSONObject.optString("idToken", (String) null);
            this.f21898d = jSONObject.optString("refreshToken", (String) null);
            this.f21899e = jSONObject.optBoolean("isNewUser", false);
            this.f21900f = jSONObject.optLong("expiresIn", 0);
            this.f21901g = C3257e.m25452N1(jSONObject.optJSONArray("mfaInfo"));
            this.f21902h = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f21894i, str);
        }
    }

    /* renamed from: g */
    public final boolean mo15921g() {
        return !TextUtils.isEmpty(this.f21902h);
    }

    /* renamed from: h */
    public final boolean mo15922h() {
        return this.f21899e;
    }
}
