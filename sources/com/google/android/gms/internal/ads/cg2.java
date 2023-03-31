package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cg2 implements sj2 {

    /* renamed from: a */
    private final JSONObject f7711a;

    /* renamed from: b */
    private final JSONObject f7712b;

    public cg2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f7711a = jSONObject;
        this.f7712b = jSONObject2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f7711a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f7712b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
