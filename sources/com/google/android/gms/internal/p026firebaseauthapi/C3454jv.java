package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3454jv implements C3320ft {

    /* renamed from: a */
    private final String f22250a;

    public C3454jv(String str) {
        this.f22250a = C4141r.m28217g(str);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f22250a);
        return jSONObject.toString();
    }
}
