package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.iv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3421iv implements C3320ft {

    /* renamed from: a */
    private final String f22184a = C3388hv.REFRESH_TOKEN.toString();

    /* renamed from: b */
    private final String f22185b;

    public C3421iv(String str) {
        this.f22185b = C4141r.m28217g(str);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f22184a);
        jSONObject.put("refreshToken", this.f22185b);
        return jSONObject.toString();
    }
}
