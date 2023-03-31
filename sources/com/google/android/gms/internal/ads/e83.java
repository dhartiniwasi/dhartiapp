package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e83 {

    /* renamed from: a */
    private final Map f8699a = new HashMap();

    /* renamed from: b */
    private Map f8700b;

    /* renamed from: a */
    public final synchronized Map mo9825a() {
        if (this.f8700b == null) {
            this.f8700b = Collections.unmodifiableMap(new HashMap(this.f8699a));
        }
        return this.f8700b;
    }
}
