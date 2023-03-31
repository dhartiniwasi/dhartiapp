package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3390i0 implements C3353gt {

    /* renamed from: r */
    private static final String f22116r = "i0";

    /* renamed from: a */
    private String f22117a;

    /* renamed from: b */
    private String f22118b;

    /* renamed from: c */
    private String f22119c;

    /* renamed from: d */
    private String f22120d;

    /* renamed from: e */
    private String f22121e;

    /* renamed from: f */
    private String f22122f;

    /* renamed from: g */
    private long f22123g;

    /* renamed from: h */
    private List f22124h;

    /* renamed from: i */
    private String f22125i;

    /* renamed from: a */
    public final long mo16117a() {
        return this.f22123g;
    }

    /* renamed from: b */
    public final String mo16118b() {
        return this.f22120d;
    }

    /* renamed from: c */
    public final String mo16119c() {
        return this.f22125i;
    }

    /* renamed from: d */
    public final String mo16120d() {
        return this.f22122f;
    }

    /* renamed from: e */
    public final List mo16121e() {
        return this.f22124h;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22117a = C4703q.m30425a(jSONObject.optString("localId", (String) null));
            this.f22118b = C4703q.m30425a(jSONObject.optString("email", (String) null));
            this.f22119c = C4703q.m30425a(jSONObject.optString("displayName", (String) null));
            this.f22120d = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f22121e = C4703q.m30425a(jSONObject.optString("photoUrl", (String) null));
            this.f22122f = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            this.f22123g = jSONObject.optLong("expiresIn", 0);
            this.f22124h = C3257e.m25452N1(jSONObject.optJSONArray("mfaInfo"));
            this.f22125i = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22116r, str);
        }
    }

    /* renamed from: g */
    public final boolean mo16122g() {
        return !TextUtils.isEmpty(this.f22125i);
    }
}
