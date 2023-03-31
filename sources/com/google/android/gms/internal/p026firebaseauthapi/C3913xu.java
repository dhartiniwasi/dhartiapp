package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3913xu implements C3320ft {

    /* renamed from: a */
    private final String f22939a;

    /* renamed from: b */
    private final String f22940b = "http://localhost";

    /* renamed from: c */
    private final String f22941c;

    public C3913xu(String str, String str2) {
        this.f22939a = C4141r.m28217g(str);
        this.f22941c = str2;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f22939a);
        jSONObject.put("continueUri", this.f22940b);
        String str = this.f22941c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
