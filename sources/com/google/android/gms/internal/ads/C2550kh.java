package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.kh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2550kh {

    /* renamed from: a */
    private final Map f12082a = new HashMap();

    /* renamed from: a */
    public final AtomicReference mo11700a(String str) {
        synchronized (this) {
            if (!this.f12082a.containsKey(str)) {
                this.f12082a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f12082a.get(str);
    }
}
