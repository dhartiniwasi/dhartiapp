package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.av */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3157av implements C3320ft {

    /* renamed from: a */
    private final String f21765a;

    public C3157av(String str) {
        this.f21765a = C4141r.m28217g(str);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f21765a);
        return jSONObject.toString();
    }
}
