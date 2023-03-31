package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zx3 extends AbstractList {

    /* renamed from: a */
    private final List f21713a;

    /* renamed from: b */
    private final yx3 f21714b;

    public zx3(List list, yx3 yx3) {
        this.f21713a = list;
        this.f21714b = yx3;
    }

    public final Object get(int i) {
        C2935uv a = C2935uv.m21865a(((Integer) this.f21713a.get(i)).intValue());
        return a == null ? C2935uv.AD_FORMAT_TYPE_UNSPECIFIED : a;
    }

    public final int size() {
        return this.f21713a.size();
    }
}
