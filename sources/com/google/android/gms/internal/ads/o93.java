package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class o93 extends r93 implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final transient Map f15008d;

    /* renamed from: e */
    private transient int f15009e;

    protected o93(Map map) {
        b83.m10241e(map.isEmpty());
        this.f15008d = map;
    }

    /* renamed from: l */
    static /* synthetic */ int m17637l(o93 o93) {
        int i = o93.f15009e;
        o93.f15009e = i + 1;
        return i;
    }

    /* renamed from: m */
    static /* synthetic */ int m17638m(o93 o93) {
        int i = o93.f15009e;
        o93.f15009e = i - 1;
        return i;
    }

    /* renamed from: n */
    static /* synthetic */ int m17639n(o93 o93, int i) {
        int i2 = o93.f15009e + i;
        o93.f15009e = i2;
        return i2;
    }

    /* renamed from: o */
    static /* synthetic */ int m17640o(o93 o93, int i) {
        int i2 = o93.f15009e - i;
        o93.f15009e = i2;
        return i2;
    }

    /* renamed from: t */
    static /* synthetic */ void m17642t(o93 o93, Object obj) {
        Object obj2;
        try {
            obj2 = o93.f15008d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            o93.f15009e -= size;
        }
    }

    /* renamed from: U */
    public final int mo12869U() {
        return this.f15009e;
    }

    /* renamed from: a */
    public final boolean mo12870a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f15008d.get(obj);
        if (collection == null) {
            Collection h = mo12874h();
            if (h.add(obj2)) {
                this.f15009e++;
                this.f15008d.put(obj, h);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f15009e++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection mo12871b() {
        return new q93(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Iterator mo12872c() {
        return new x83(this);
    }

    /* renamed from: e0 */
    public final void mo12873e0() {
        for (Collection clear : this.f15008d.values()) {
            clear.clear();
        }
        this.f15008d.clear();
        this.f15009e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection mo12874h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Collection mo12875i(Collection collection);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract Collection mo12876k(Object obj, Collection collection);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final List mo12877p(Object obj, List list, l93 l93) {
        if (list instanceof RandomAccess) {
            return new h93(this, obj, list, l93);
        }
        return new n93(this, obj, list, l93);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Map mo12878r() {
        Map map = this.f15008d;
        if (map instanceof NavigableMap) {
            return new e93(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new i93(this, (SortedMap) map);
        }
        return new a93(this, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Set mo12879s() {
        Map map = this.f15008d;
        if (map instanceof NavigableMap) {
            return new g93(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new j93(this, (SortedMap) map);
        }
        return new d93(this, map);
    }
}
