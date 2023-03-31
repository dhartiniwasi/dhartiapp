package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class et1 {

    /* renamed from: a */
    private final Map f8925a = new ConcurrentHashMap();

    /* renamed from: b */
    private JSONObject f8926b;

    /* renamed from: c */
    private final Executor f8927c;

    /* renamed from: d */
    private boolean f8928d;

    /* renamed from: e */
    private JSONObject f8929e;

    public et1(Executor executor) {
        this.f8927c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final synchronized void mo10011f() {
        Map map;
        this.f8928d = true;
        rl0 U = C4409t.m29325q().mo15117h().mo18486U();
        if (U != null) {
            JSONObject f = U.mo13846f();
            if (f != null) {
                this.f8926b = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14561g3)).booleanValue() ? f.optJSONObject("common_settings") : null;
                this.f8929e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f8925a.containsKey(optString2)) {
                                    map = (Map) this.f8925a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f8925a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo10006a() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14561g3)).booleanValue()) {
            return null;
        }
        return this.f8926b;
    }

    /* renamed from: b */
    public final JSONObject mo10007b(String str, String str2) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14551f3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f8928d) {
            mo10011f();
        }
        Map map = (Map) this.f8925a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = gt1.m13524a(this.f8929e, str, str2);
        if (a == null) {
            return null;
        }
        return (JSONObject) map.get(a);
    }

    /* renamed from: c */
    public final void mo10008c() {
        C4409t.m29325q().mo15117h().mo18503h(new bt1(this));
        this.f8927c.execute(new ct1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo10010e() {
        this.f8927c.execute(new dt1(this));
    }
}
