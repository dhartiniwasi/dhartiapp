package com.google.android.gms.internal.p026firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3224d {

    /* renamed from: a */
    private String f21903a;

    /* renamed from: b */
    private String f21904b;

    /* renamed from: c */
    private String f21905c;

    /* renamed from: d */
    private Long f21906d;

    /* renamed from: e */
    private Long f21907e;

    /* renamed from: a */
    public static C3224d m25369a(String str) throws UnsupportedEncodingException {
        try {
            C3224d dVar = new C3224d();
            JSONObject jSONObject = new JSONObject(str);
            dVar.f21903a = jSONObject.optString("iss");
            dVar.f21904b = jSONObject.optString("aud");
            dVar.f21905c = jSONObject.optString("sub");
            dVar.f21906d = Long.valueOf(jSONObject.optLong("iat"));
            dVar.f21907e = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return dVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(e.toString()));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e.toString()));
        }
    }

    /* renamed from: b */
    public final Long mo15923b() {
        return this.f21907e;
    }

    /* renamed from: c */
    public final Long mo15924c() {
        return this.f21906d;
    }
}
