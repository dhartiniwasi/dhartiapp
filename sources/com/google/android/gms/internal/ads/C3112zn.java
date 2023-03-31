package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C3112zn {

    /* renamed from: a */
    public final Uri f21169a;

    /* renamed from: b */
    public final String f21170b = null;

    /* renamed from: c */
    public final List f21171c;

    /* renamed from: d */
    public final String f21172d;

    /* renamed from: e */
    public final ua3 f21173e;
    @Deprecated

    /* renamed from: f */
    public final List f21174f;

    /* renamed from: g */
    public final Object f21175g;

    /* synthetic */ C3112zn(Uri uri, String str, C2884th thVar, C2503j7 j7Var, List list, String str2, ua3 ua3, Object obj, C3074ym ymVar) {
        this.f21169a = uri;
        this.f21171c = list;
        this.f21172d = null;
        this.f21173e = ua3;
        ra3 q = ua3.m21502q();
        if (ua3.size() <= 0) {
            this.f21174f = q.mo13703h();
            this.f21175g = null;
            return;
        }
        C2377fu fuVar = (C2377fu) ua3.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3112zn)) {
            return false;
        }
        C3112zn znVar = (C3112zn) obj;
        return this.f21169a.equals(znVar.f21169a) && gb2.m13186t((Object) null, (Object) null) && gb2.m13186t((Object) null, (Object) null) && gb2.m13186t((Object) null, (Object) null) && this.f21171c.equals(znVar.f21171c) && gb2.m13186t((Object) null, (Object) null) && this.f21173e.equals(znVar.f21173e) && gb2.m13186t((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((this.f21169a.hashCode() * 923521) + this.f21171c.hashCode()) * 961) + this.f21173e.hashCode()) * 31;
    }
}
