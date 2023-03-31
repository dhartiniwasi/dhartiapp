package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bk1 implements y51 {

    /* renamed from: a */
    private final Map f7330a;

    /* renamed from: b */
    private final Map f7331b;

    /* renamed from: c */
    private final Map f7332c;

    /* renamed from: d */
    private final o44 f7333d;

    /* renamed from: e */
    private final jm1 f7334e;

    bk1(Map map, Map map2, Map map3, o44 o44, jm1 jm1) {
        this.f7330a = map;
        this.f7331b = map2;
        this.f7332c = map3;
        this.f7333d = o44;
        this.f7334e = jm1;
    }

    /* renamed from: a */
    public final d52 mo8849a(int i, String str) {
        d52 a;
        d52 d52 = (d52) this.f7330a.get(str);
        if (d52 != null) {
            return d52;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            s72 s72 = (s72) this.f7332c.get(str);
            if (s72 != null) {
                return new e52(s72, a61.f6431a);
            }
            d52 d522 = (d52) this.f7331b.get(str);
            if (d522 == null) {
                return null;
            }
            return c61.m10718a(d522);
        } else if (this.f7334e.mo11443e() == null || (a = ((y51) this.f7333d.mo8155d()).mo8849a(i, str)) == null) {
            return null;
        } else {
            return c61.m10718a(a);
        }
    }
}
