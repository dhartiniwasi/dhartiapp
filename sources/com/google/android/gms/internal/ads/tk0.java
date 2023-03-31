package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class tk0 {

    /* renamed from: a */
    static tk0 f18027a;

    /* renamed from: d */
    public static synchronized tk0 m21053d(Context context) {
        synchronized (tk0.class) {
            tk0 tk0 = f18027a;
            if (tk0 != null) {
                return tk0;
            }
            Context applicationContext = context.getApplicationContext();
            C2679nz.m17343c(applicationContext);
            C4800p1 h = C4409t.m29325q().mo15117h();
            h.mo18516u(applicationContext);
            wj0 wj0 = new wj0((vj0) null);
            wj0.mo14935b(applicationContext);
            wj0.mo14936c(C4409t.m29310b());
            wj0.mo14934a(h);
            wj0.mo14937d(C4409t.m29324p());
            tk0 e = wj0.mo14938e();
            f18027a = e;
            e.mo14317a().mo13285a();
            f18027a.mo14318b().mo14313c();
            xk0 c = f18027a.mo14319c();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14638o0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) C4596v.m30088c().mo12227b(C2679nz.f14658q0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String c2 : hashMap.keySet()) {
                        c.mo15105c(c2);
                    }
                    c.mo15106d(new vk0(c, hashMap));
                } catch (JSONException e2) {
                    pm0.m18663c("Failed to parse listening list", e2);
                }
            }
            tk0 tk02 = f18027a;
            return tk02;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract pj0 mo14317a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract tj0 mo14318b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract xk0 mo14319c();
}
