package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class mb3 extends pc3 {

    /* renamed from: a */
    final Map f13297a;

    mb3(Map map) {
        Objects.requireNonNull(map);
        this.f13297a = map;
    }

    public final boolean contains(Object obj) {
        return this.f13297a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f13297a.isEmpty();
    }

    public Iterator iterator() {
        throw null;
    }

    public final int size() {
        return this.f13297a.size();
    }
}
