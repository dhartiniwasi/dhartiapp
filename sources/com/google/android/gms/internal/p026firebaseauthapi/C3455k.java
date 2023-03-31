package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3455k implements C3320ft {

    /* renamed from: a */
    private final String f22251a;

    /* renamed from: b */
    private final String f22252b;

    /* renamed from: c */
    private final String f22253c;

    public C3455k(String str, String str2, String str3) {
        this.f22251a = C4141r.m28217g(str);
        this.f22252b = str2;
        this.f22253c = str3;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f22251a);
        String str = this.f22252b;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f22253c;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
