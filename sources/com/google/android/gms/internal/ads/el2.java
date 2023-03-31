package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class el2 implements sj2 {

    /* renamed from: a */
    private final String f8843a;

    public el2(String str) {
        this.f8843a = str;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            JSONObject f = C4820w0.m30816f((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f8843a)) {
                f.put("attok", this.f8843a);
            }
        } catch (JSONException e) {
            C4794n1.m30694l("Failed putting attestation token.", e);
        }
    }
}
