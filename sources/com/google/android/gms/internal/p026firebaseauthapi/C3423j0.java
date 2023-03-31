package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3423j0 implements C3320ft {

    /* renamed from: a */
    private String f22186a;

    /* renamed from: b */
    private String f22187b;

    /* renamed from: c */
    private String f22188c;

    /* renamed from: d */
    private String f22189d;

    /* renamed from: e */
    private String f22190e;

    /* renamed from: f */
    private boolean f22191f;

    private C3423j0() {
    }

    /* renamed from: a */
    public static C3423j0 m25856a(String str, String str2, boolean z) {
        C3423j0 j0Var = new C3423j0();
        j0Var.f22187b = C4141r.m28217g(str);
        j0Var.f22188c = C4141r.m28217g(str2);
        j0Var.f22191f = z;
        return j0Var;
    }

    /* renamed from: b */
    public static C3423j0 m25857b(String str, String str2, boolean z) {
        C3423j0 j0Var = new C3423j0();
        j0Var.f22186a = C4141r.m28217g(str);
        j0Var.f22189d = C4141r.m28217g(str2);
        j0Var.f22191f = z;
        return j0Var;
    }

    /* renamed from: c */
    public final void mo16197c(String str) {
        this.f22190e = str;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f22189d)) {
            jSONObject.put("phoneNumber", this.f22186a);
            jSONObject.put("temporaryProof", this.f22189d);
        } else {
            jSONObject.put("sessionInfo", this.f22187b);
            jSONObject.put("code", this.f22188c);
        }
        String str = this.f22190e;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f22191f) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
