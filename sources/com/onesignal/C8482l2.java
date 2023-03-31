package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.l2 */
/* compiled from: OSSMSSubscriptionStateChanges */
public class C8482l2 {

    /* renamed from: a */
    private C8474k2 f35688a;

    /* renamed from: b */
    private C8474k2 f35689b;

    public C8482l2(C8474k2 k2Var, C8474k2 k2Var2) {
        this.f35688a = k2Var;
        this.f35689b = k2Var2;
    }

    /* renamed from: a */
    public JSONObject mo27932a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f35688a.mo27899j());
            jSONObject.put("to", this.f35689b.mo27899j());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo27932a().toString();
    }
}
