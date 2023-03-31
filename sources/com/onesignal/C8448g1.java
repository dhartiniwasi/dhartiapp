package com.onesignal;

import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;

/* renamed from: com.onesignal.g1 */
/* compiled from: OSInAppMessagePage.kt */
public class C8448g1 {

    /* renamed from: a */
    private String f35647a;

    /* renamed from: b */
    private String f35648b;

    public C8448g1(JSONObject jSONObject) {
        C11669k.m56787e(jSONObject, "jsonObject");
        this.f35647a = jSONObject.optString("pageId", (String) null);
        this.f35648b = jSONObject.optString("pageIndex", (String) null);
    }

    /* renamed from: a */
    public final String mo27807a() {
        return this.f35647a;
    }
}
