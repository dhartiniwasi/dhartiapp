package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.u0 */
/* compiled from: OSEmailSubscriptionStateChanges */
public class C8622u0 {

    /* renamed from: a */
    private C8609t0 f36062a;

    /* renamed from: b */
    private C8609t0 f36063b;

    public C8622u0(C8609t0 t0Var, C8609t0 t0Var2) {
        this.f36062a = t0Var;
        this.f36063b = t0Var2;
    }

    /* renamed from: a */
    public C8609t0 mo28234a() {
        return this.f36062a;
    }

    /* renamed from: b */
    public C8609t0 mo28235b() {
        return this.f36063b;
    }

    /* renamed from: c */
    public JSONObject mo28236c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f36062a.mo28218j());
            jSONObject.put("to", this.f36063b.mo28218j());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo28236c().toString();
    }
}
