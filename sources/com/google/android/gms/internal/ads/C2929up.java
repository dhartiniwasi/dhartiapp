package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.up */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2929up {

    /* renamed from: a */
    private final Map f18660a = new HashMap();

    /* renamed from: b */
    private Map f18661b;

    /* renamed from: a */
    public final synchronized Map mo14563a() {
        if (this.f18661b == null) {
            this.f18661b = Collections.unmodifiableMap(new HashMap(this.f18660a));
        }
        return this.f18661b;
    }
}
