package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3881wu implements C3353gt {

    /* renamed from: b */
    private static final String f22896b = "com.google.android.gms.internal.firebase-auth-api.wu";

    /* renamed from: a */
    private String f22897a;

    /* renamed from: a */
    public final C3881wu mo17013a(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f22897a = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            String str2 = f22896b;
            String message = e.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new C3219cr("Failed to parse error for string [" + str + "]", e);
        }
    }

    /* renamed from: b */
    public final String mo17014b() {
        return this.f22897a;
    }

    /* renamed from: c */
    public final boolean mo17015c() {
        return !TextUtils.isEmpty(this.f22897a);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        mo17013a(str);
        return this;
    }
}
