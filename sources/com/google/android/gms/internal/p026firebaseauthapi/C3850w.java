package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3850w implements C3320ft {

    /* renamed from: a */
    private final String f22844a = C4141r.m28217g("phone");

    /* renamed from: b */
    private final String f22845b;

    /* renamed from: c */
    private final String f22846c;

    /* renamed from: d */
    private final String f22847d;

    /* renamed from: e */
    private final String f22848e;

    /* renamed from: f */
    private final String f22849f;

    /* renamed from: g */
    private final String f22850g;

    /* renamed from: h */
    private C3849vu f22851h;

    private C3850w(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22845b = C4141r.m28217g(str2);
        this.f22846c = C4141r.m28217g(str3);
        this.f22848e = str4;
        this.f22847d = str5;
        this.f22849f = str6;
        this.f22850g = str7;
    }

    /* renamed from: a */
    public static C3850w m27263a(String str, String str2, String str3, String str4, String str5, String str6) {
        C4141r.m28217g(str3);
        return new C3850w("phone", str, str2, str3, str4, str5, str6);
    }

    /* renamed from: b */
    public final String mo16972b() {
        return this.f22847d;
    }

    /* renamed from: c */
    public final void mo16973c(C3849vu vuVar) {
        this.f22851h = vuVar;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f22845b);
        jSONObject.put("mfaEnrollmentId", this.f22846c);
        this.f22844a.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f22848e != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f22848e);
            if (!TextUtils.isEmpty(this.f22849f)) {
                jSONObject2.put("recaptchaToken", this.f22849f);
            }
            if (!TextUtils.isEmpty(this.f22850g)) {
                jSONObject2.put("safetyNetToken", this.f22850g);
            }
            C3849vu vuVar = this.f22851h;
            if (vuVar != null) {
                jSONObject2.put("autoRetrievalInfo", vuVar.mo16971a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
