package com.onesignal;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.f1 */
/* compiled from: OSInAppMessageOutcome */
public class C8418f1 {

    /* renamed from: a */
    private String f35591a;

    /* renamed from: b */
    private float f35592b;

    /* renamed from: c */
    private boolean f35593c;

    C8418f1(JSONObject jSONObject) throws JSONException {
        this.f35591a = jSONObject.getString(MediationMetaData.KEY_NAME);
        this.f35592b = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.f35593c = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    /* renamed from: a */
    public String mo27777a() {
        return this.f35591a;
    }

    /* renamed from: b */
    public float mo27778b() {
        return this.f35592b;
    }

    /* renamed from: c */
    public boolean mo27779c() {
        return this.f35593c;
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.f35591a + '\'' + ", weight=" + this.f35592b + ", unique=" + this.f35593c + '}';
    }
}
