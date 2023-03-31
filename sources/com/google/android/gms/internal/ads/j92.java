package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j92 implements f52 {

    /* renamed from: a */
    private final Map f11278a = new HashMap();

    /* renamed from: b */
    private final zs1 f11279b;

    public j92(zs1 zs1) {
        this.f11279b = zs1;
    }

    /* renamed from: a */
    public final g52 mo10073a(String str, JSONObject jSONObject) throws jt2 {
        g52 g52;
        synchronized (this) {
            g52 = (g52) this.f11278a.get(str);
            if (g52 == null) {
                g52 = new g52(this.f11279b.mo15657c(str, jSONObject), new a72(), str);
                this.f11278a.put(str, g52);
            }
        }
        return g52;
    }
}
