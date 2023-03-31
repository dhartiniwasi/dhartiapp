package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yx1 {

    /* renamed from: a */
    private final String f20832a;

    /* renamed from: b */
    private final String f20833b;

    /* renamed from: c */
    private final String f20834c;

    /* renamed from: d */
    private final int f20835d;

    /* renamed from: e */
    private final String f20836e;

    /* renamed from: f */
    private final int f20837f;

    /* renamed from: g */
    private final boolean f20838g;

    public yx1(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.f20832a = str;
        this.f20833b = str2;
        this.f20834c = str3;
        this.f20835d = i;
        this.f20836e = str4;
        this.f20837f = i2;
        this.f20838g = z;
    }

    /* renamed from: a */
    public final JSONObject mo15512a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f20832a);
        jSONObject.put(MediationMetaData.KEY_VERSION, this.f20834c);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14487Y7)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f20833b);
        }
        jSONObject.put("status", this.f20835d);
        jSONObject.put("description", this.f20836e);
        jSONObject.put("initializationLatencyMillis", this.f20837f);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14496Z7)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f20838g);
        }
        return jSONObject;
    }
}
