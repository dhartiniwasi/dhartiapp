package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.vu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3849vu {

    /* renamed from: a */
    private final String f22843a;

    public C3849vu(String str) {
        this.f22843a = C4141r.m28217g(str);
    }

    /* renamed from: a */
    public final JSONObject mo16971a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.f22843a);
        return jSONObject;
    }
}
