package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3686r implements C3353gt {

    /* renamed from: r */
    private static final String f22588r = "r";

    /* renamed from: a */
    private String f22589a;

    /* renamed from: b */
    private String f22590b;

    /* renamed from: c */
    private Boolean f22591c;

    /* renamed from: d */
    private String f22592d;

    /* renamed from: e */
    private String f22593e;

    /* renamed from: f */
    private C3389i f22594f;

    /* renamed from: g */
    private String f22595g;

    /* renamed from: h */
    private String f22596h;

    /* renamed from: i */
    private long f22597i;

    /* renamed from: a */
    public final long mo16658a() {
        return this.f22597i;
    }

    /* renamed from: b */
    public final String mo16659b() {
        return this.f22589a;
    }

    /* renamed from: c */
    public final String mo16660c() {
        return this.f22595g;
    }

    /* renamed from: d */
    public final String mo16661d() {
        return this.f22596h;
    }

    /* renamed from: e */
    public final List mo16662e() {
        C3389i iVar = this.f22594f;
        if (iVar != null) {
            return iVar.mo16115K1();
        }
        return null;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22589a = C4703q.m30425a(jSONObject.optString("email", (String) null));
            this.f22590b = C4703q.m30425a(jSONObject.optString("passwordHash", (String) null));
            this.f22591c = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.f22592d = C4703q.m30425a(jSONObject.optString("displayName", (String) null));
            this.f22593e = C4703q.m30425a(jSONObject.optString("photoUrl", (String) null));
            this.f22594f = C3389i.m25730I1(jSONObject.optJSONArray("providerUserInfo"));
            this.f22595g = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f22596h = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            this.f22597i = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22588r, str);
        }
    }
}
