package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f01 {

    /* renamed from: a */
    private final Map f9065a;

    /* renamed from: b */
    private final Map f9066b;

    f01(Map map, Map map2) {
        this.f9065a = map;
        this.f9066b = map2;
    }

    /* renamed from: a */
    public final void mo10054a(us2 us2) throws Exception {
        for (ss2 ss2 : us2.f18723b.f18245c) {
            if (this.f9065a.containsKey(ss2.f17641a)) {
                ((i01) this.f9065a.get(ss2.f17641a)).mo10984a(ss2.f17642b);
            } else if (this.f9066b.containsKey(ss2.f17641a)) {
                h01 h01 = (h01) this.f9066b.get(ss2.f17641a);
                JSONObject jSONObject = ss2.f17642b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                h01.mo8169a(hashMap);
            }
        }
    }
}
