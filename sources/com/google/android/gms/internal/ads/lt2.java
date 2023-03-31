package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class lt2 implements e60 {

    /* renamed from: a */
    public final /* synthetic */ qh1 f12947a;

    /* renamed from: b */
    public final /* synthetic */ rz2 f12948b;

    /* renamed from: c */
    public final /* synthetic */ o42 f12949c;

    public /* synthetic */ lt2(qh1 qh1, rz2 rz2, o42 o42) {
        this.f12947a = qh1;
        this.f12948b = rz2;
        this.f12949c = o42;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        qh1 qh1 = this.f12947a;
        rz2 rz2 = this.f12948b;
        o42 o42 = this.f12949c;
        vs0 vs0 = (vs0) obj;
        d60.m11327d(map, qh1);
        String str = (String) map.get("u");
        if (str == null) {
            pm0.m18667g("URL missing from click GMSG.");
        } else {
            cf3.m10920r(d60.m11325b(vs0, str), new mt2(vs0, rz2, o42), dn0.f8325a);
        }
    }
}
