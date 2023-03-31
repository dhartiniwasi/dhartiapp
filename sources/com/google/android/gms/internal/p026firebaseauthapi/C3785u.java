package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3785u implements C3320ft {

    /* renamed from: a */
    private final String f22751a;

    /* renamed from: b */
    private final String f22752b = C4141r.m28217g("phone");

    /* renamed from: c */
    private final String f22753c;

    /* renamed from: d */
    private final String f22754d;

    /* renamed from: e */
    private final String f22755e;

    /* renamed from: f */
    private final String f22756f;

    /* renamed from: g */
    private C3849vu f22757g;

    private C3785u(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f22751a = C4141r.m28217g(str);
        this.f22753c = str3;
        this.f22754d = str4;
        this.f22755e = str5;
        this.f22756f = str6;
    }

    /* renamed from: a */
    public static C3785u m27069a(String str, String str2, String str3, String str4, String str5) {
        C4141r.m28217g(str2);
        return new C3785u(str, "phone", str2, str3, str4, str5);
    }

    /* renamed from: b */
    public final String mo16843b() {
        return this.f22754d;
    }

    /* renamed from: c */
    public final void mo16844c(C3849vu vuVar) {
        this.f22757g = vuVar;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f22751a);
        this.f22752b.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f22753c != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f22753c);
            if (!TextUtils.isEmpty(this.f22755e)) {
                jSONObject2.put("recaptchaToken", this.f22755e);
            }
            if (!TextUtils.isEmpty(this.f22756f)) {
                jSONObject2.put("safetyNetToken", this.f22756f);
            }
            C3849vu vuVar = this.f22757g;
            if (vuVar != null) {
                jSONObject2.put("autoRetrievalInfo", vuVar.mo16971a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
