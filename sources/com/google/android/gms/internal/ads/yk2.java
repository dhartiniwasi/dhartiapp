package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yk2 implements sj2 {

    /* renamed from: a */
    final String f20664a;

    /* renamed from: b */
    final int f20665b;

    public yk2(String str, int i) {
        this.f20664a = str;
        this.f20665b = i;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.f20664a) && this.f20665b != -1) {
            try {
                JSONObject f = C4820w0.m30816f(jSONObject, "pii");
                f.put("pvid", this.f20664a);
                f.put("pvid_s", this.f20665b);
            } catch (JSONException e) {
                C4794n1.m30694l("Failed putting gms core app set ID info.", e);
            }
        }
    }
}
