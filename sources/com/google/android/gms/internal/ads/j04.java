package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class j04 extends AbstractMap {

    /* renamed from: a */
    private final int f11156a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List f11157b = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map f11158c = Collections.emptyMap();

    /* renamed from: d */
    private boolean f11159d;

    /* renamed from: e */
    private volatile h04 f11160e;

    /* renamed from: f */
    private Map f11161f = Collections.emptyMap();

    /* synthetic */ j04(int i, i04 i04) {
        this.f11156a = i;
    }

    /* renamed from: l */
    private final int m14622l(Comparable comparable) {
        int size = this.f11157b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((d04) this.f11157b.get(size)).mo9412a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((d04) this.f11157b.get(i2)).mo9412a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final Object m14623m(int i) {
        m14625o();
        Object value = ((d04) this.f11157b.remove(i)).getValue();
        if (!this.f11158c.isEmpty()) {
            Iterator it = m14624n().entrySet().iterator();
            List list = this.f11157b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new d04(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    private final SortedMap m14624n() {
        m14625o();
        if (this.f11158c.isEmpty() && !(this.f11158c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11158c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f11161f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11158c;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m14625o() {
        if (this.f11159d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public void mo11274b() {
        Map map;
        Map map2;
        if (!this.f11159d) {
            if (this.f11158c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f11158c);
            }
            this.f11158c = map;
            if (this.f11161f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f11161f);
            }
            this.f11161f = map2;
            this.f11159d = true;
        }
    }

    /* renamed from: c */
    public final int mo11275c() {
        return this.f11157b.size();
    }

    public final void clear() {
        m14625o();
        if (!this.f11157b.isEmpty()) {
            this.f11157b.clear();
        }
        if (!this.f11158c.isEmpty()) {
            this.f11158c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m14622l(comparable) >= 0 || this.f11158c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable mo11278d() {
        if (this.f11158c.isEmpty()) {
            return c04.m10663a();
        }
        return this.f11158c.entrySet();
    }

    public final Set entrySet() {
        if (this.f11160e == null) {
            this.f11160e = new h04(this, (g04) null);
        }
        return this.f11160e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j04)) {
            return super.equals(obj);
        }
        j04 j04 = (j04) obj;
        int size = size();
        if (size != j04.size()) {
            return false;
        }
        int c = mo11275c();
        if (c != j04.mo11275c()) {
            return entrySet().equals(j04.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo11283h(i).equals(j04.mo11283h(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f11158c.equals(j04.f11158c);
        }
        return true;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m14625o();
        int l = m14622l(comparable);
        if (l >= 0) {
            return ((d04) this.f11157b.get(l)).setValue(obj);
        }
        m14625o();
        if (this.f11157b.isEmpty() && !(this.f11157b instanceof ArrayList)) {
            this.f11157b = new ArrayList(this.f11156a);
        }
        int i = -(l + 1);
        if (i >= this.f11156a) {
            return m14624n().put(comparable, obj);
        }
        int size = this.f11157b.size();
        int i2 = this.f11156a;
        if (size == i2) {
            d04 d04 = (d04) this.f11157b.remove(i2 - 1);
            m14624n().put(d04.mo9412a(), d04.getValue());
        }
        this.f11157b.add(i, new d04(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m14622l(comparable);
        if (l >= 0) {
            return ((d04) this.f11157b.get(l)).getValue();
        }
        return this.f11158c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry mo11283h(int i) {
        return (Map.Entry) this.f11157b.get(i);
    }

    public final int hashCode() {
        int c = mo11275c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += ((d04) this.f11157b.get(i2)).hashCode();
        }
        return this.f11158c.size() > 0 ? i + this.f11158c.hashCode() : i;
    }

    /* renamed from: k */
    public final boolean mo11285k() {
        return this.f11159d;
    }

    public final Object remove(Object obj) {
        m14625o();
        Comparable comparable = (Comparable) obj;
        int l = m14622l(comparable);
        if (l >= 0) {
            return m14623m(l);
        }
        if (this.f11158c.isEmpty()) {
            return null;
        }
        return this.f11158c.remove(comparable);
    }

    public final int size() {
        return this.f11157b.size() + this.f11158c.size();
    }
}
