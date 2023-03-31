package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class d93 extends mb3 {

    /* renamed from: b */
    final /* synthetic */ o93 f8148b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d93(o93 o93, Map map) {
        super(map);
        this.f8148b = o93;
    }

    public final void clear() {
        eb3.m12009b(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.f13297a.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f13297a.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f13297a.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new c93(this, this.f13297a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f13297a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        o93.m17640o(this.f8148b, size);
        return size > 0;
    }
}
