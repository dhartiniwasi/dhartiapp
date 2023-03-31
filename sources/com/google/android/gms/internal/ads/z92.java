package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z92 implements f52 {

    /* renamed from: a */
    private final eb2 f21029a;

    public z92(eb2 eb2) {
        this.f21029a = eb2;
    }

    /* renamed from: a */
    public final g52 mo10073a(String str, JSONObject jSONObject) throws jt2 {
        kd0 a = this.f21029a.mo9870a(str);
        if (a == null) {
            return null;
        }
        return new g52(a, new z62(), str);
    }
}
