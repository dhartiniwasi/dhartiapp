package com.onesignal;

import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.onesignal.w1 */
/* compiled from: OSNotificationIntentExtras.kt */
public final class C8641w1 {

    /* renamed from: a */
    private JSONArray f36099a;

    /* renamed from: b */
    private JSONObject f36100b;

    public C8641w1(JSONArray jSONArray, JSONObject jSONObject) {
        this.f36099a = jSONArray;
        this.f36100b = jSONObject;
    }

    /* renamed from: a */
    public final JSONArray mo28275a() {
        return this.f36099a;
    }

    /* renamed from: b */
    public final JSONObject mo28276b() {
        return this.f36100b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8641w1)) {
            return false;
        }
        C8641w1 w1Var = (C8641w1) obj;
        return C11669k.m56783a(this.f36099a, w1Var.f36099a) && C11669k.m56783a(this.f36100b, w1Var.f36100b);
    }

    public int hashCode() {
        JSONArray jSONArray = this.f36099a;
        int i = 0;
        int hashCode = (jSONArray != null ? jSONArray.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f36100b;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f36099a + ", jsonData=" + this.f36100b + ")";
    }
}
