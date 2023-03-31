package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.dv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3256dv implements C3320ft {

    /* renamed from: a */
    private final String f21958a = C4141r.m28217g("phone");

    /* renamed from: b */
    private String f21959b;

    /* renamed from: c */
    private final String f21960c;

    /* renamed from: d */
    private final String f21961d;

    /* renamed from: e */
    private final String f21962e;

    C3256dv(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f21959b = C4141r.m28217g(str2);
        this.f21960c = str3;
        this.f21962e = str4;
        this.f21961d = str7;
    }

    /* renamed from: a */
    public static C3256dv m25449a(String str, String str2, String str3, String str4) {
        C4141r.m28217g(str3);
        C4141r.m28217g(str2);
        return new C3256dv("phone", str, str2, str3, (String) null, (String) null, str4);
    }

    /* renamed from: b */
    public final C3256dv mo15972b(String str) {
        this.f21959b = str;
        return this;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f21959b);
        this.f21958a.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.f21961d;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f21960c;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f21962e;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
