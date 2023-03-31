package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3751sv implements C3353gt {

    /* renamed from: b */
    private static final String f22711b = "sv";

    /* renamed from: a */
    private List f22712a;

    /* renamed from: a */
    public final C3751sv mo16778a(String str) throws C3219cr {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22712a = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f22712a.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw C3555n0.m26257a(e, f22711b, str);
        }
    }

    /* renamed from: b */
    public final List mo16779b() {
        return this.f22712a;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3353gt mo15920f(String str) throws C3219cr {
        mo16778a(str);
        return this;
    }
}
