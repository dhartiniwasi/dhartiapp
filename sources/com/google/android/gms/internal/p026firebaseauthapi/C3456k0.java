package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3456k0 implements C3353gt {

    /* renamed from: h */
    private static final String f22254h = "k0";

    /* renamed from: a */
    private String f22255a;

    /* renamed from: b */
    private String f22256b;

    /* renamed from: c */
    private long f22257c;

    /* renamed from: d */
    private String f22258d;

    /* renamed from: e */
    private boolean f22259e;

    /* renamed from: f */
    private String f22260f;

    /* renamed from: g */
    private String f22261g;

    /* renamed from: a */
    public final long mo16235a() {
        return this.f22257c;
    }

    /* renamed from: b */
    public final String mo16236b() {
        return this.f22255a;
    }

    /* renamed from: c */
    public final String mo16237c() {
        return this.f22261g;
    }

    /* renamed from: d */
    public final String mo16238d() {
        return this.f22256b;
    }

    /* renamed from: e */
    public final String mo16239e() {
        return this.f22260f;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22255a = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f22256b = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            this.f22257c = jSONObject.optLong("expiresIn", 0);
            this.f22258d = C4703q.m30425a(jSONObject.optString("localId", (String) null));
            this.f22259e = jSONObject.optBoolean("isNewUser", false);
            this.f22260f = C4703q.m30425a(jSONObject.optString("temporaryProof", (String) null));
            this.f22261g = C4703q.m30425a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22254h, str);
        }
    }

    /* renamed from: g */
    public final boolean mo16240g() {
        return this.f22259e;
    }
}
