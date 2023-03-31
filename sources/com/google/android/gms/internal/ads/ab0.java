package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ab0 implements t60 {

    /* renamed from: a */
    private final in0 f6512a;

    /* renamed from: b */
    final /* synthetic */ bb0 f6513b;

    public ab0(bb0 bb0, in0 in0) {
        this.f6513b = bb0;
        this.f6512a = in0;
    }

    /* renamed from: a */
    public final void mo8297a(JSONObject jSONObject) {
        try {
            this.f6512a.mo11172d(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f6512a.mo11173e(e);
        }
    }

    /* renamed from: f */
    public final void mo8298f(String str) {
        if (str == null) {
            try {
                this.f6512a.mo11173e(new da0());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f6512a.mo11173e(new da0(str));
        }
    }
}
