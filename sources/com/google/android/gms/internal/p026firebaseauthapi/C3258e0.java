package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3258e0 implements C3320ft {

    /* renamed from: a */
    private final String f21968a;

    /* renamed from: b */
    private final String f21969b;

    public C3258e0(String str, String str2) {
        this.f21968a = C4141r.m28217g(str);
        this.f21969b = str2;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f21968a);
        jSONObject.put("returnSecureToken", true);
        String str = this.f21969b;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
