package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3752t implements C3353gt {

    /* renamed from: f */
    private static final String f22713f = "t";

    /* renamed from: a */
    private String f22714a;

    /* renamed from: b */
    private String f22715b;

    /* renamed from: c */
    private String f22716c;

    /* renamed from: d */
    private String f22717d;

    /* renamed from: e */
    private long f22718e;

    /* renamed from: a */
    public final long mo16780a() {
        return this.f22718e;
    }

    /* renamed from: b */
    public final String mo16781b() {
        return this.f22714a;
    }

    /* renamed from: c */
    public final String mo16782c() {
        return this.f22717d;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22714a = C4703q.m30425a(jSONObject.optString("idToken", (String) null));
            this.f22715b = C4703q.m30425a(jSONObject.optString("displayName", (String) null));
            this.f22716c = C4703q.m30425a(jSONObject.optString("email", (String) null));
            this.f22717d = C4703q.m30425a(jSONObject.optString("refreshToken", (String) null));
            this.f22718e = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22713f, str);
        }
    }
}
