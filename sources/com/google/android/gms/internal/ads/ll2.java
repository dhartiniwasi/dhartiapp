package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ll2 implements tj2 {

    /* renamed from: a */
    private final JSONObject f12837a;

    ll2(Context context) {
        this.f12837a = ih0.m14325c(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12043a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f12837a);
        } catch (JSONException unused) {
            C4794n1.m30693k("Failed putting version constants.");
        }
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10911i(new kl2(this));
    }

    public final int zza() {
        return 46;
    }
}
