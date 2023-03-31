package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kz3 {

    /* renamed from: c */
    private static final kz3 f12532c = new kz3();

    /* renamed from: a */
    private final xz3 f12533a = new uy3();

    /* renamed from: b */
    private final ConcurrentMap f12534b = new ConcurrentHashMap();

    private kz3() {
    }

    /* renamed from: a */
    public static kz3 m15715a() {
        return f12532c;
    }

    /* renamed from: b */
    public final wz3 mo11837b(Class cls) {
        cy3.m11234f(cls, "messageType");
        wz3 wz3 = (wz3) this.f12534b.get(cls);
        if (wz3 == null) {
            wz3 = this.f12533a.mo14639c(cls);
            cy3.m11234f(cls, "messageType");
            cy3.m11234f(wz3, "schema");
            wz3 wz32 = (wz3) this.f12534b.putIfAbsent(cls, wz3);
            return wz32 == null ? wz3 : wz32;
        }
    }
}
