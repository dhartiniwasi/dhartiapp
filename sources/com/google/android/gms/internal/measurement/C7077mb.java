package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.mb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
class C7077mb extends AbstractMap {

    /* renamed from: a */
    private final int f31821a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List f31822b = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map f31823c = Collections.emptyMap();

    /* renamed from: d */
    private boolean f31824d;

    /* renamed from: e */
    private volatile C7045kb f31825e;

    /* renamed from: f */
    private Map f31826f = Collections.emptyMap();

    /* synthetic */ C7077mb(int i, C7061lb lbVar) {
        this.f31821a = i;
    }

    /* renamed from: l */
    private final int m40402l(Comparable comparable) {
        int size = this.f31822b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C6980gb) this.f31822b.get(size)).mo23444a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C6980gb) this.f31822b.get(i2)).mo23444a());
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
    public final Object m40403m(int i) {
        m40405o();
        Object value = ((C6980gb) this.f31822b.remove(i)).getValue();
        if (!this.f31823c.isEmpty()) {
            Iterator it = m40404n().entrySet().iterator();
            List list = this.f31822b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C6980gb(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    private final SortedMap m40404n() {
        m40405o();
        if (this.f31823c.isEmpty() && !(this.f31823c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f31823c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f31826f = treeMap.descendingMap();
        }
        return (SortedMap) this.f31823c;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m40405o() {
        if (this.f31824d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public void mo23262b() {
        Map map;
        Map map2;
        if (!this.f31824d) {
            if (this.f31823c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f31823c);
            }
            this.f31823c = map;
            if (this.f31826f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f31826f);
            }
            this.f31826f = map2;
            this.f31824d = true;
        }
    }

    /* renamed from: c */
    public final int mo23665c() {
        return this.f31822b.size();
    }

    public final void clear() {
        m40405o();
        if (!this.f31822b.isEmpty()) {
            this.f31822b.clear();
        }
        if (!this.f31823c.isEmpty()) {
            this.f31823c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m40402l(comparable) >= 0 || this.f31823c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable mo23668d() {
        if (this.f31823c.isEmpty()) {
            return C6963fb.m40026a();
        }
        return this.f31823c.entrySet();
    }

    public final Set entrySet() {
        if (this.f31825e == null) {
            this.f31825e = new C7045kb(this, (C7029jb) null);
        }
        return this.f31825e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7077mb)) {
            return super.equals(obj);
        }
        C7077mb mbVar = (C7077mb) obj;
        int size = size();
        if (size != mbVar.size()) {
            return false;
        }
        int c = mo23665c();
        if (c != mbVar.mo23665c()) {
            return entrySet().equals(mbVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo23673h(i).equals(mbVar.mo23673h(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f31823c.equals(mbVar.f31823c);
        }
        return true;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m40405o();
        int l = m40402l(comparable);
        if (l >= 0) {
            return ((C6980gb) this.f31822b.get(l)).setValue(obj);
        }
        m40405o();
        if (this.f31822b.isEmpty() && !(this.f31822b instanceof ArrayList)) {
            this.f31822b = new ArrayList(this.f31821a);
        }
        int i = -(l + 1);
        if (i >= this.f31821a) {
            return m40404n().put(comparable, obj);
        }
        int size = this.f31822b.size();
        int i2 = this.f31821a;
        if (size == i2) {
            C6980gb gbVar = (C6980gb) this.f31822b.remove(i2 - 1);
            m40404n().put(gbVar.mo23444a(), gbVar.getValue());
        }
        this.f31822b.add(i, new C6980gb(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m40402l(comparable);
        if (l >= 0) {
            return ((C6980gb) this.f31822b.get(l)).getValue();
        }
        return this.f31823c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry mo23673h(int i) {
        return (Map.Entry) this.f31822b.get(i);
    }

    public final int hashCode() {
        int c = mo23665c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += ((C6980gb) this.f31822b.get(i2)).hashCode();
        }
        return this.f31823c.size() > 0 ? i + this.f31823c.hashCode() : i;
    }

    /* renamed from: k */
    public final boolean mo23675k() {
        return this.f31824d;
    }

    public final Object remove(Object obj) {
        m40405o();
        Comparable comparable = (Comparable) obj;
        int l = m40402l(comparable);
        if (l >= 0) {
            return m40403m(l);
        }
        if (this.f31823c.isEmpty()) {
            return null;
        }
        return this.f31823c.remove(comparable);
    }

    public final int size() {
        return this.f31822b.size() + this.f31823c.size();
    }
}
