package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7798f;
import com.google.firebase.auth.C7814j;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p054g5.C4410a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3190bv implements C3320ft {

    /* renamed from: d */
    private static final C4410a f21792d = new C4410a(C3190bv.class.getSimpleName(), new String[0]);

    /* renamed from: a */
    private final String f21793a;

    /* renamed from: b */
    private final String f21794b;

    /* renamed from: c */
    private final String f21795c;

    public C3190bv(C7814j jVar, String str) {
        this.f21793a = C4141r.m28217g(jVar.mo26118N1());
        this.f21794b = C4141r.m28217g(jVar.mo26120P1());
        this.f21795c = str;
    }

    public final String zza() throws JSONException {
        C7798f c = C7798f.m43367c(this.f21794b);
        String str = null;
        String a = c != null ? c.mo26092a() : null;
        if (c != null) {
            str = c.mo26094d();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f21793a);
        if (a != null) {
            jSONObject.put("oobCode", a);
        }
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f21795c;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        return jSONObject.toString();
    }
}
