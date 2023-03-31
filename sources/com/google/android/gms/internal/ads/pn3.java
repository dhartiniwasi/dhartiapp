package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pn3 {

    /* renamed from: a */
    private HashMap f15933a = new HashMap();

    /* renamed from: a */
    public final rn3 mo13312a() {
        if (this.f15933a != null) {
            rn3 rn3 = new rn3(Collections.unmodifiableMap(this.f15933a), (qn3) null);
            this.f15933a = null;
            return rn3;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
