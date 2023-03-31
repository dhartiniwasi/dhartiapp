package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f44 extends x34 {

    /* renamed from: b */
    private static final o44 f9113b = c44.m10704a(Collections.emptyMap());

    /* synthetic */ f44(Map map, d44 d44) {
        super(map);
    }

    /* renamed from: b */
    public static e44 m12418b(int i) {
        return new e44(i, (d44) null);
    }

    /* renamed from: c */
    public final Map mo8155d() {
        LinkedHashMap b = y34.m23754b(mo15049a().size());
        for (Map.Entry entry : mo15049a().entrySet()) {
            b.put(entry.getKey(), ((o44) entry.getValue()).mo8155d());
        }
        return Collections.unmodifiableMap(b);
    }
}
