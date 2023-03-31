package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.g2 */
/* compiled from: OSPermissionStateChanges */
public class C8449g2 {

    /* renamed from: a */
    private C8419f2 f35649a;

    /* renamed from: b */
    private C8419f2 f35650b;

    public C8449g2(C8419f2 f2Var, C8419f2 f2Var2) {
        this.f35649a = f2Var;
        this.f35650b = f2Var2;
    }

    /* renamed from: a */
    public C8419f2 mo27808a() {
        return this.f35649a;
    }

    /* renamed from: b */
    public C8419f2 mo27809b() {
        return this.f35650b;
    }

    /* renamed from: c */
    public JSONObject mo27810c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f35649a.mo27787g());
            jSONObject.put("to", this.f35650b.mo27787g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo27810c().toString();
    }
}
