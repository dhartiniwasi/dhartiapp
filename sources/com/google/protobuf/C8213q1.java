package com.google.protobuf;

import com.google.protobuf.C8240v;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.q1 */
/* compiled from: SmallSortedMap */
class C8213q1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f35051a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C8213q1<K, V>.e> f35052b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f35053c;

    /* renamed from: d */
    private boolean f35054d;

    /* renamed from: e */
    private volatile C8213q1<K, V>.g f35055e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f35056f;

    /* renamed from: g */
    private volatile C8213q1<K, V>.c f35057g;

    /* renamed from: com.google.protobuf.q1$a */
    /* compiled from: SmallSortedMap */
    static class C8214a extends C8213q1<FieldDescriptorType, Object> {
        C8214a(int i) {
            super(i, (C8214a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C8213q1.super.put((C8240v.C8242b) obj, obj2);
        }

        /* renamed from: q */
        public void mo27244q() {
            if (!mo27242p()) {
                for (int i = 0; i < mo27239l(); i++) {
                    Map.Entry k = mo27238k(i);
                    if (((C8240v.C8242b) k.getKey()).mo27312g()) {
                        k.setValue(Collections.unmodifiableList((List) k.getValue()));
                    }
                }
                for (Map.Entry entry : mo27241n()) {
                    if (((C8240v.C8242b) entry.getKey()).mo27312g()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C8213q1.super.mo27244q();
        }
    }

    /* renamed from: com.google.protobuf.q1$c */
    /* compiled from: SmallSortedMap */
    private class C8216c extends C8213q1<K, V>.g {
        private C8216c() {
            super(C8213q1.this, (C8214a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C8215b(C8213q1.this, (C8214a) null);
        }

        /* synthetic */ C8216c(C8213q1 q1Var, C8214a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.q1$d */
    /* compiled from: SmallSortedMap */
    private static class C8217d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f35062a = new C8218a();

        /* renamed from: b */
        private static final Iterable<Object> f35063b = new C8219b();

        /* renamed from: com.google.protobuf.q1$d$a */
        /* compiled from: SmallSortedMap */
        static class C8218a implements Iterator<Object> {
            C8218a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.q1$d$b */
        /* compiled from: SmallSortedMap */
        static class C8219b implements Iterable<Object> {
            C8219b() {
            }

            public Iterator<Object> iterator() {
                return C8217d.f35062a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m45579b() {
            return f35063b;
        }
    }

    /* renamed from: com.google.protobuf.q1$e */
    /* compiled from: SmallSortedMap */
    private class C8220e implements Map.Entry<K, V>, Comparable<C8213q1<K, V>.e> {

        /* renamed from: a */
        private final K f35064a;

        /* renamed from: b */
        private V f35065b;

        C8220e(C8213q1 q1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m45580b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(C8213q1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: c */
        public K getKey() {
            return this.f35064a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m45580b(this.f35064a, entry.getKey()) || !m45580b(this.f35065b, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f35065b;
        }

        public int hashCode() {
            K k = this.f35064a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f35065b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C8213q1.this.m45562h();
            V v2 = this.f35065b;
            this.f35065b = v;
            return v2;
        }

        public String toString() {
            return this.f35064a + "=" + this.f35065b;
        }

        C8220e(K k, V v) {
            this.f35064a = k;
            this.f35065b = v;
        }
    }

    /* renamed from: com.google.protobuf.q1$g */
    /* compiled from: SmallSortedMap */
    private class C8222g extends AbstractSet<Map.Entry<K, V>> {
        private C8222g() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C8213q1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C8213q1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C8213q1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C8221f(C8213q1.this, (C8214a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C8213q1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C8213q1.this.size();
        }

        /* synthetic */ C8222g(C8213q1 q1Var, C8214a aVar) {
            this();
        }
    }

    /* synthetic */ C8213q1(int i, C8214a aVar) {
        this(i);
    }

    /* renamed from: g */
    private int m45561g(K k) {
        int size = this.f35052b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f35052b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f35052b.get(i2).getKey());
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
    /* renamed from: h */
    public void m45562h() {
        if (this.f35054d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m45563j() {
        m45562h();
        if (this.f35052b.isEmpty() && !(this.f35052b instanceof ArrayList)) {
            this.f35052b = new ArrayList(this.f35051a);
        }
    }

    /* renamed from: o */
    private SortedMap<K, V> m45564o() {
        m45562h();
        if (this.f35053c.isEmpty() && !(this.f35053c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f35053c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f35056f = treeMap.descendingMap();
        }
        return (SortedMap) this.f35053c;
    }

    /* renamed from: r */
    static <FieldDescriptorType extends C8240v.C8242b<FieldDescriptorType>> C8213q1<FieldDescriptorType, Object> m45565r(int i) {
        return new C8214a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public V m45566t(int i) {
        m45562h();
        V value = this.f35052b.remove(i).getValue();
        if (!this.f35053c.isEmpty()) {
            Iterator it = m45564o().entrySet().iterator();
            this.f35052b.add(new C8220e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m45562h();
        if (!this.f35052b.isEmpty()) {
            this.f35052b.clear();
        }
        if (!this.f35053c.isEmpty()) {
            this.f35053c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m45561g(comparable) >= 0 || this.f35053c.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f35055e == null) {
            this.f35055e = new C8222g(this, (C8214a) null);
        }
        return this.f35055e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8213q1)) {
            return super.equals(obj);
        }
        C8213q1 q1Var = (C8213q1) obj;
        int size = size();
        if (size != q1Var.size()) {
            return false;
        }
        int l = mo27239l();
        if (l != q1Var.mo27239l()) {
            return entrySet().equals(q1Var.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!mo27238k(i).equals(q1Var.mo27238k(i))) {
                return false;
            }
        }
        if (l != size) {
            return this.f35053c.equals(q1Var.f35053c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g = m45561g(comparable);
        if (g >= 0) {
            return this.f35052b.get(g).getValue();
        }
        return this.f35053c.get(comparable);
    }

    public int hashCode() {
        int l = mo27239l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.f35052b.get(i2).hashCode();
        }
        return mo27240m() > 0 ? i + this.f35053c.hashCode() : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<Map.Entry<K, V>> mo27237i() {
        if (this.f35057g == null) {
            this.f35057g = new C8216c(this, (C8214a) null);
        }
        return this.f35057g;
    }

    /* renamed from: k */
    public Map.Entry<K, V> mo27238k(int i) {
        return this.f35052b.get(i);
    }

    /* renamed from: l */
    public int mo27239l() {
        return this.f35052b.size();
    }

    /* renamed from: m */
    public int mo27240m() {
        return this.f35053c.size();
    }

    /* renamed from: n */
    public Iterable<Map.Entry<K, V>> mo27241n() {
        if (this.f35053c.isEmpty()) {
            return C8217d.m45579b();
        }
        return this.f35053c.entrySet();
    }

    /* renamed from: p */
    public boolean mo27242p() {
        return this.f35054d;
    }

    /* renamed from: q */
    public void mo27244q() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f35054d) {
            if (this.f35053c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f35053c);
            }
            this.f35053c = map;
            if (this.f35056f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f35056f);
            }
            this.f35056f = map2;
            this.f35054d = true;
        }
    }

    public V remove(Object obj) {
        m45562h();
        Comparable comparable = (Comparable) obj;
        int g = m45561g(comparable);
        if (g >= 0) {
            return m45566t(g);
        }
        if (this.f35053c.isEmpty()) {
            return null;
        }
        return this.f35053c.remove(comparable);
    }

    /* renamed from: s */
    public V put(K k, V v) {
        m45562h();
        int g = m45561g(k);
        if (g >= 0) {
            return this.f35052b.get(g).setValue(v);
        }
        m45563j();
        int i = -(g + 1);
        if (i >= this.f35051a) {
            return m45564o().put(k, v);
        }
        int size = this.f35052b.size();
        int i2 = this.f35051a;
        if (size == i2) {
            C8220e remove = this.f35052b.remove(i2 - 1);
            m45564o().put(remove.getKey(), remove.getValue());
        }
        this.f35052b.add(i, new C8220e(k, v));
        return null;
    }

    public int size() {
        return this.f35052b.size() + this.f35053c.size();
    }

    /* renamed from: com.google.protobuf.q1$b */
    /* compiled from: SmallSortedMap */
    private class C8215b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f35058a;

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> f35059b;

        private C8215b() {
            this.f35058a = C8213q1.this.f35052b.size();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m45576a() {
            if (this.f35059b == null) {
                this.f35059b = C8213q1.this.f35056f.entrySet().iterator();
            }
            return this.f35059b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (m45576a().hasNext()) {
                return (Map.Entry) m45576a().next();
            }
            List c = C8213q1.this.f35052b;
            int i = this.f35058a - 1;
            this.f35058a = i;
            return (Map.Entry) c.get(i);
        }

        public boolean hasNext() {
            int i = this.f35058a;
            return (i > 0 && i <= C8213q1.this.f35052b.size()) || m45576a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ C8215b(C8213q1 q1Var, C8214a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.q1$f */
    /* compiled from: SmallSortedMap */
    private class C8221f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f35067a;

        /* renamed from: b */
        private boolean f35068b;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f35069c;

        private C8221f() {
            this.f35067a = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m45583a() {
            if (this.f35069c == null) {
                this.f35069c = C8213q1.this.f35053c.entrySet().iterator();
            }
            return this.f35069c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f35068b = true;
            int i = this.f35067a + 1;
            this.f35067a = i;
            if (i < C8213q1.this.f35052b.size()) {
                return (Map.Entry) C8213q1.this.f35052b.get(this.f35067a);
            }
            return (Map.Entry) m45583a().next();
        }

        public boolean hasNext() {
            if (this.f35067a + 1 < C8213q1.this.f35052b.size()) {
                return true;
            }
            if (C8213q1.this.f35053c.isEmpty() || !m45583a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f35068b) {
                this.f35068b = false;
                C8213q1.this.m45562h();
                if (this.f35067a < C8213q1.this.f35052b.size()) {
                    C8213q1 q1Var = C8213q1.this;
                    int i = this.f35067a;
                    this.f35067a = i - 1;
                    Object unused = q1Var.m45566t(i);
                    return;
                }
                m45583a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C8221f(C8213q1 q1Var, C8214a aVar) {
            this();
        }
    }

    private C8213q1(int i) {
        this.f35051a = i;
        this.f35052b = Collections.emptyList();
        this.f35053c = Collections.emptyMap();
        this.f35056f = Collections.emptyMap();
    }
}
