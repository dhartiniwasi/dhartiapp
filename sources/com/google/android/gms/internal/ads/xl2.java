package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4584t;
import p073j4.C4794n1;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xl2 implements sj2 {

    /* renamed from: a */
    private final Bundle f20194a;

    public xl2(Bundle bundle) {
        this.f20194a = bundle;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f20194a != null) {
            try {
                C4820w0.m30816f(C4820w0.m30816f(jSONObject, "device"), "play_store").put("parental_controls", C4584t.m30036b().mo11159j(this.f20194a));
            } catch (JSONException unused) {
                C4794n1.m30693k("Failed putting parental controls bundle.");
            }
        }
    }
}
