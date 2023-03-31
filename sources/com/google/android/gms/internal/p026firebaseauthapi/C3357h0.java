package com.google.android.gms.internal.p026firebaseauthapi;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3357h0 implements C3320ft {

    /* renamed from: a */
    private final String f22082a;

    /* renamed from: b */
    private final String f22083b;

    /* renamed from: c */
    private final String f22084c;

    public C3357h0(String str, String str2, String str3) {
        this.f22082a = C4141r.m28217g(str);
        this.f22083b = C4141r.m28217g(str2);
        this.f22084c = str3;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f22082a);
        jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.f22083b);
        jSONObject.put("returnSecureToken", true);
        String str = this.f22084c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
