package com.google.android.gms.internal.p026firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3620p implements C3353gt {

    /* renamed from: b */
    private static final String f22492b = "p";

    /* renamed from: a */
    private String f22493a;

    /* renamed from: a */
    public final String mo16523a() {
        return this.f22493a;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        try {
            this.f22493a = C4703q.m30425a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C3555n0.m26257a(e, f22492b, str);
        }
    }
}
