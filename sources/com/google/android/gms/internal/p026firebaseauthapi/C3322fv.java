package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3322fv implements C3320ft {

    /* renamed from: a */
    private final String f22045a = C4141r.m28217g("phone");

    /* renamed from: b */
    private final String f22046b;

    /* renamed from: c */
    private final String f22047c;

    /* renamed from: d */
    private final String f22048d;

    C3322fv(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f22046b = C4141r.m28217g(str2);
        this.f22047c = str3;
        this.f22048d = str4;
    }

    /* renamed from: a */
    public static C3322fv m25603a(String str, String str2, String str3) {
        C4141r.m28217g(str3);
        C4141r.m28217g(str2);
        return new C3322fv("phone", str, str2, str3, (String) null, (String) null);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f22045a.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f22046b);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f22047c;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f22048d;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
