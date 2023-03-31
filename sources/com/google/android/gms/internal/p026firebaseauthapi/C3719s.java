package com.google.android.gms.internal.p026firebaseauthapi;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3719s implements C3320ft {

    /* renamed from: a */
    private String f22643a;

    /* renamed from: b */
    private String f22644b;

    /* renamed from: c */
    private final String f22645c;

    public C3719s(String str) {
        this.f22645c = str;
    }

    public C3719s(String str, String str2, String str3, String str4) {
        this.f22643a = C4141r.m28217g(str);
        this.f22644b = C4141r.m28217g(str2);
        this.f22645c = str4;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f22643a;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.f22644b;
        if (str2 != null) {
            jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, str2);
        }
        String str3 = this.f22645c;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
