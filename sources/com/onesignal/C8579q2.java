package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.q2 */
/* compiled from: OSSubscriptionStateChanges */
public class C8579q2 {

    /* renamed from: a */
    private OSSubscriptionState f35980a;

    /* renamed from: b */
    private OSSubscriptionState f35981b;

    public C8579q2(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.f35980a = oSSubscriptionState;
        this.f35981b = oSSubscriptionState2;
    }

    /* renamed from: a */
    public OSSubscriptionState mo28180a() {
        return this.f35980a;
    }

    /* renamed from: b */
    public OSSubscriptionState mo28181b() {
        return this.f35981b;
    }

    /* renamed from: c */
    public JSONObject mo28182c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f35980a.mo27554l());
            jSONObject.put("to", this.f35981b.mo27554l());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo28182c().toString();
    }
}
