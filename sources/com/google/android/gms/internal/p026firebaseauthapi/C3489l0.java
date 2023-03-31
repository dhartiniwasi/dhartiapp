package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3489l0 implements C3320ft {

    /* renamed from: a */
    private final String f22317a;

    /* renamed from: b */
    private final String f22318b;

    public C3489l0(String str, String str2) {
        this.f22317a = C4141r.m28217g(str);
        this.f22318b = C4141r.m28217g(str2);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f22317a);
        jSONObject.put("mfaEnrollmentId", this.f22318b);
        return jSONObject.toString();
    }
}
