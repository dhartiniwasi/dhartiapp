package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pl2 implements sj2 {

    /* renamed from: a */
    private final String f15900a;

    /* renamed from: b */
    private final String f15901b;

    public pl2(String str, String str2) {
        this.f15900a = str;
        this.f15901b = str2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            JSONObject f = C4820w0.m30816f((JSONObject) obj, "pii");
            f.put("doritos", this.f15900a);
            f.put("doritos_v2", this.f15901b);
        } catch (JSONException unused) {
            C4794n1.m30693k("Failed putting doritos string.");
        }
    }
}
