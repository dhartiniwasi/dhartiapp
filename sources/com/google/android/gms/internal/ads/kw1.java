package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kw1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Long f12315a;

    /* renamed from: b */
    private final String f12316b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f12317c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Integer f12318d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f12319e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Integer f12320f;

    /* synthetic */ kw1(String str, jw1 jw1) {
        this.f12316b = str;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ String m15642a(kw1 kw1) {
        String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14586i8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", kw1.f12315a);
            jSONObject.put("eventCategory", kw1.f12316b);
            jSONObject.putOpt("event", kw1.f12317c);
            jSONObject.putOpt("errorCode", kw1.f12318d);
            jSONObject.putOpt("rewardType", kw1.f12319e);
            jSONObject.putOpt("rewardAmount", kw1.f12320f);
        } catch (JSONException unused) {
            pm0.m18667g("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
