package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3882x implements C3353gt {

    /* renamed from: b */
    private static final String f22898b = "x";

    /* renamed from: a */
    private String f22899a;

    /* renamed from: a */
    public final String mo17016a() {
        return this.f22899a;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.f22899a = C4703q.m30425a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22898b, str);
        }
    }
}
