package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qk2 implements sj2 {

    /* renamed from: a */
    private final String f16427a;

    public qk2(String str) {
        this.f16427a = str;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f16427a);
        } catch (JSONException e) {
            C4794n1.m30694l("Failed putting Ad ID.", e);
        }
    }
}
