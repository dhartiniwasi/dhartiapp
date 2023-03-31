package com.google.android.gms.internal.ads;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class le0 {

    /* renamed from: a */
    private final vs0 f12752a;

    /* renamed from: b */
    private final String f12753b;

    public le0(vs0 vs0, String str) {
        this.f12752a = vs0;
        this.f12753b = str;
    }

    /* renamed from: b */
    public final void mo11983b(int i, int i2, int i3, int i4) {
        try {
            this.f12752a.mo9084a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo11984c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f12753b);
            vs0 vs0 = this.f12752a;
            if (vs0 != null) {
                vs0.mo9084a("onError", put);
            }
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: d */
    public final void mo11985d(String str) {
        try {
            this.f12752a.mo9084a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while dispatching ready Event.", e);
        }
    }

    /* renamed from: e */
    public final void mo11986e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f12752a.mo9084a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while obtaining screen information.", e);
        }
    }

    /* renamed from: f */
    public final void mo11987f(int i, int i2, int i3, int i4) {
        try {
            this.f12752a.mo9084a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while dispatching size change.", e);
        }
    }

    /* renamed from: g */
    public final void mo11988g(String str) {
        try {
            this.f12752a.mo9084a("onStateChanged", new JSONObject().put(AdOperationMetric.INIT_STATE, str));
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while dispatching state change.", e);
        }
    }
}
