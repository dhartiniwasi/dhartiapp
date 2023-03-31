package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class g50 implements e60 {

    /* renamed from: a */
    public final /* synthetic */ qh1 f9701a;

    public /* synthetic */ g50(qh1 qh1) {
        this.f9701a = qh1;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        d60.m11327d(map, this.f9701a);
        String str = (String) map.get("u");
        if (str == null) {
            pm0.m18667g("URL missing from click GMSG.");
        } else {
            cf3.m10920r(d60.m11325b(vs0, str), new u50(vs0), dn0.f8325a);
        }
    }
}
