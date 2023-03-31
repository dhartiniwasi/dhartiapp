package com.google.android.gms.internal.ads;

import java.util.Map;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class d12 implements f12 {

    /* renamed from: a */
    private final Map f8029a;

    /* renamed from: b */
    private final mf3 f8030b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final rc1 f8031c;

    public d12(Map map, mf3 mf3, rc1 rc1) {
        this.f8029a = map;
        this.f8030b = mf3;
        this.f8031c = rc1;
    }

    /* renamed from: a */
    public final lf3 mo9421a(yg0 yg0) {
        this.f8031c.mo10021v(yg0);
        lf3 h = cf3.m10910h(new cz1(3));
        for (String trim : ((String) C4596v.m30088c().mo12227b(C2679nz.f14515b7)).split(",")) {
            o44 o44 = (o44) this.f8029a.get(trim.trim());
            if (o44 != null) {
                h = cf3.m10909g(h, cz1.class, new b12(o44, yg0), this.f8030b);
            }
        }
        cf3.m10920r(h, new c12(this), dn0.f8330f);
        return h;
    }
}
