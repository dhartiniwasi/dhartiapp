package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4596v;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bm1 extends cm1 {

    /* renamed from: b */
    private final JSONObject f7359b;

    /* renamed from: c */
    private final boolean f7360c;

    /* renamed from: d */
    private final boolean f7361d;

    /* renamed from: e */
    private final boolean f7362e;

    /* renamed from: f */
    private final boolean f7363f;

    /* renamed from: g */
    private final String f7364g;

    /* renamed from: h */
    private final JSONObject f7365h;

    public bm1(is2 is2, JSONObject jSONObject) {
        super(is2);
        this.f7359b = C4820w0.m30817g(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f7360c = C4820w0.m30821k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f7361d = C4820w0.m30821k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f7362e = C4820w0.m30821k(false, jSONObject, "enable_omid");
        this.f7364g = C4820w0.m30812b("", jSONObject, "watermark_overlay_png_base64");
        this.f7363f = jSONObject.optJSONObject("overlay") != null ? true : z;
        this.f7365h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14602k4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    /* renamed from: a */
    public final ht2 mo8870a() {
        JSONObject jSONObject = this.f7365h;
        return jSONObject != null ? new ht2(jSONObject) : this.f7834a.f10964W;
    }

    /* renamed from: b */
    public final String mo8871b() {
        return this.f7364g;
    }

    /* renamed from: c */
    public final JSONObject mo8872c() {
        JSONObject jSONObject = this.f7359b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f7834a.f10942A);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean mo8873d() {
        return this.f7362e;
    }

    /* renamed from: e */
    public final boolean mo8874e() {
        return this.f7360c;
    }

    /* renamed from: f */
    public final boolean mo8875f() {
        return this.f7361d;
    }

    /* renamed from: g */
    public final boolean mo8876g() {
        return this.f7363f;
    }
}
