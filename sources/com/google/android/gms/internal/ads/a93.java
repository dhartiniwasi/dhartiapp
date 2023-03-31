package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class a93 extends ob3 {

    /* renamed from: c */
    final transient Map f6490c;

    /* renamed from: d */
    final /* synthetic */ o93 f6491d;

    a93(o93 o93, Map map) {
        this.f6491d = o93;
        this.f6490c = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Set mo8268b() {
        return new y83(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map.Entry mo8269c(Map.Entry entry) {
        Object key = entry.getKey();
        return new qa3(key, this.f6491d.mo12876k(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        Map map = this.f6490c;
        o93 o93 = this.f6491d;
        if (map == o93.f15008d) {
            o93.mo12873e0();
        } else {
            eb3.m12009b(new z83(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.f6490c;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f6490c.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) pb3.m18450a(this.f6490c, obj);
        if (collection == null) {
            return null;
        }
        return this.f6491d.mo12876k(obj, collection);
    }

    public final int hashCode() {
        return this.f6490c.hashCode();
    }

    public Set keySet() {
        return this.f6491d.mo13698f();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f6490c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection h = this.f6491d.mo12874h();
        h.addAll(collection);
        o93.m17640o(this.f6491d, collection.size());
        collection.clear();
        return h;
    }

    public final int size() {
        return this.f6490c.size();
    }

    public final String toString() {
        return this.f6490c.toString();
    }
}
