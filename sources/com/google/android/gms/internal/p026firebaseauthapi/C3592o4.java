package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class C3592o4 extends AbstractMap {

    /* renamed from: a */
    private final int f22434a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List f22435b = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map f22436c = Collections.emptyMap();

    /* renamed from: d */
    private boolean f22437d;

    /* renamed from: e */
    private volatile C3526m4 f22438e;

    /* renamed from: f */
    private Map f22439f = Collections.emptyMap();

    /* synthetic */ C3592o4(int i, C3559n4 n4Var) {
        this.f22434a = i;
    }

    /* renamed from: l */
    private final int m26336l(Comparable comparable) {
        int size = this.f22435b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C3394i4) this.f22435b.get(size)).mo16152a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C3394i4) this.f22435b.get(i2)).mo16152a());
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
    public final Object m26337m(int i) {
        m26339o();
        Object value = ((C3394i4) this.f22435b.remove(i)).getValue();
        if (!this.f22436c.isEmpty()) {
            Iterator it = m26338n().entrySet().iterator();
            List list = this.f22435b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C3394i4(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    private final SortedMap m26338n() {
        m26339o();
        if (this.f22436c.isEmpty() && !(this.f22436c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22436c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f22439f = treeMap.descendingMap();
        }
        return (SortedMap) this.f22436c;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m26339o() {
        if (this.f22437d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public void mo15948b() {
        Map map;
        Map map2;
        if (!this.f22437d) {
            if (this.f22436c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f22436c);
            }
            this.f22436c = map;
            if (this.f22439f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f22439f);
            }
            this.f22439f = map2;
            this.f22437d = true;
        }
    }

    /* renamed from: c */
    public final int mo16479c() {
        return this.f22435b.size();
    }

    public final void clear() {
        m26339o();
        if (!this.f22435b.isEmpty()) {
            this.f22435b.clear();
        }
        if (!this.f22436c.isEmpty()) {
            this.f22436c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m26336l(comparable) >= 0 || this.f22436c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable mo16482d() {
        if (this.f22436c.isEmpty()) {
            return C3361h4.m25689a();
        }
        return this.f22436c.entrySet();
    }

    public final Set entrySet() {
        if (this.f22438e == null) {
            this.f22438e = new C3526m4(this, (C3493l4) null);
        }
        return this.f22438e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3592o4)) {
            return super.equals(obj);
        }
        C3592o4 o4Var = (C3592o4) obj;
        int size = size();
        if (size != o4Var.size()) {
            return false;
        }
        int c = mo16479c();
        if (c != o4Var.mo16479c()) {
            return entrySet().equals(o4Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo16487h(i).equals(o4Var.mo16487h(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f22436c.equals(o4Var.f22436c);
        }
        return true;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m26339o();
        int l = m26336l(comparable);
        if (l >= 0) {
            return ((C3394i4) this.f22435b.get(l)).setValue(obj);
        }
        m26339o();
        if (this.f22435b.isEmpty() && !(this.f22435b instanceof ArrayList)) {
            this.f22435b = new ArrayList(this.f22434a);
        }
        int i = -(l + 1);
        if (i >= this.f22434a) {
            return m26338n().put(comparable, obj);
        }
        int size = this.f22435b.size();
        int i2 = this.f22434a;
        if (size == i2) {
            C3394i4 i4Var = (C3394i4) this.f22435b.remove(i2 - 1);
            m26338n().put(i4Var.mo16152a(), i4Var.getValue());
        }
        this.f22435b.add(i, new C3394i4(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = m26336l(comparable);
        if (l >= 0) {
            return ((C3394i4) this.f22435b.get(l)).getValue();
        }
        return this.f22436c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry mo16487h(int i) {
        return (Map.Entry) this.f22435b.get(i);
    }

    public final int hashCode() {
        int c = mo16479c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += ((C3394i4) this.f22435b.get(i2)).hashCode();
        }
        return this.f22436c.size() > 0 ? i + this.f22436c.hashCode() : i;
    }

    /* renamed from: k */
    public final boolean mo16489k() {
        return this.f22437d;
    }

    public final Object remove(Object obj) {
        m26339o();
        Comparable comparable = (Comparable) obj;
        int l = m26336l(comparable);
        if (l >= 0) {
            return m26337m(l);
        }
        if (this.f22436c.isEmpty()) {
            return null;
        }
        return this.f22436c.remove(comparable);
    }

    public final int size() {
        return this.f22435b.size() + this.f22436c.size();
    }
}
