package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C2083e {

    /* renamed from: a */
    private final Set<C2079d<?>> f6148a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo8054a() {
        for (C2079d<?> a : this.f6148a) {
            a.mo8049a();
        }
        this.f6148a.clear();
    }
}
