package p190b7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p068j.C4708a;
import p182a7.C6431n;
import p190b7.C6647f;
import p190b7.C6705y;

/* renamed from: b7.d */
/* compiled from: AbstractMapBasedMultimap */
abstract class C6627d<K, V> extends C6647f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public transient Map<K, Collection<V>> f31094d;

    /* renamed from: e */
    private transient int f31095e;

    /* renamed from: b7.d$a */
    /* compiled from: AbstractMapBasedMultimap */
    class C6628a extends C6627d<K, V>.c<V> {
        C6628a(C6627d dVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo22278a(K k, V v) {
            return v;
        }
    }

    /* renamed from: b7.d$b */
    /* compiled from: AbstractMapBasedMultimap */
    private class C6629b extends C6705y.C6713f<K, Collection<V>> {

        /* renamed from: c */
        final transient Map<K, Collection<V>> f31096c;

        /* renamed from: b7.d$b$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C6630a extends C6705y.C6710c<K, Collection<V>> {
            C6630a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map<K, Collection<V>> mo22292b() {
                return C6629b.this;
            }

            public boolean contains(Object obj) {
                return C6654i.m38343c(C6629b.this.f31096c.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C6631b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                C6627d.this.m38272t(entry.getKey());
                return true;
            }
        }

        /* renamed from: b7.d$b$b */
        /* compiled from: AbstractMapBasedMultimap */
        class C6631b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Map.Entry<K, Collection<V>>> f31099a;

            /* renamed from: b */
            Collection<V> f31100b;

            C6631b() {
                this.f31099a = C6629b.this.f31096c.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f31099a.next();
                this.f31100b = (Collection) next.getValue();
                return C6629b.this.mo22285f(next);
            }

            public boolean hasNext() {
                return this.f31099a.hasNext();
            }

            public void remove() {
                C6431n.m37568u(this.f31100b != null, "no calls to next() since the last call to remove()");
                this.f31099a.remove();
                C6627d.m38269m(C6627d.this, this.f31100b.size());
                this.f31100b.clear();
                this.f31100b = null;
            }
        }

        C6629b(Map<K, Collection<V>> map) {
            this.f31096c = map;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Set<Map.Entry<K, Collection<V>>> mo22279b() {
            return new C6630a();
        }

        public void clear() {
            if (this.f31096c == C6627d.this.f31094d) {
                C6627d.this.clear();
            } else {
                C6698u.m38514c(new C6631b());
            }
        }

        public boolean containsKey(Object obj) {
            return C6705y.m38545f(this.f31096c, obj);
        }

        /* renamed from: d */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C6705y.m38546g(this.f31096c, obj);
            if (collection == null) {
                return null;
            }
            return C6627d.this.mo22264v(obj, collection);
        }

        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f31096c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o = C6627d.this.mo22267o();
            o.addAll(remove);
            C6627d.m38269m(C6627d.this, remove.size());
            remove.clear();
            return o;
        }

        public boolean equals(Object obj) {
            return this == obj || this.f31096c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Map.Entry<K, Collection<V>> mo22285f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C6705y.m38543d(key, C6627d.this.mo22264v(key, entry.getValue()));
        }

        public int hashCode() {
            return this.f31096c.hashCode();
        }

        public Set<K> keySet() {
            return C6627d.this.mo22420f();
        }

        public int size() {
            return this.f31096c.size();
        }

        public String toString() {
            return this.f31096c.toString();
        }
    }

    /* renamed from: b7.d$c */
    /* compiled from: AbstractMapBasedMultimap */
    private abstract class C6632c<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Map.Entry<K, Collection<V>>> f31102a;

        /* renamed from: b */
        K f31103b = null;

        /* renamed from: c */
        Collection<V> f31104c = null;

        /* renamed from: d */
        Iterator<V> f31105d = C6698u.m38517f();

        C6632c() {
            this.f31102a = C6627d.this.f31094d.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo22278a(K k, V v);

        public boolean hasNext() {
            return this.f31102a.hasNext() || this.f31105d.hasNext();
        }

        public T next() {
            if (!this.f31105d.hasNext()) {
                Map.Entry next = this.f31102a.next();
                this.f31103b = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f31104c = collection;
                this.f31105d = collection.iterator();
            }
            return mo22278a(C6649f0.m38329a(this.f31103b), this.f31105d.next());
        }

        public void remove() {
            this.f31105d.remove();
            Collection<V> collection = this.f31104c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f31102a.remove();
            }
            C6627d.m38267k(C6627d.this);
        }
    }

    /* renamed from: b7.d$d */
    /* compiled from: AbstractMapBasedMultimap */
    private class C6633d extends C6705y.C6711d<K, Collection<V>> {

        /* renamed from: b7.d$d$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C6634a implements Iterator<K> {

            /* renamed from: a */
            Map.Entry<K, Collection<V>> f31108a;

            /* renamed from: b */
            final /* synthetic */ Iterator f31109b;

            C6634a(Iterator it) {
                this.f31109b = it;
            }

            public boolean hasNext() {
                return this.f31109b.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f31109b.next();
                this.f31108a = entry;
                return entry.getKey();
            }

            public void remove() {
                C6431n.m37568u(this.f31108a != null, "no calls to next() since the last call to remove()");
                Collection value = this.f31108a.getValue();
                this.f31109b.remove();
                C6627d.m38269m(C6627d.this, value.size());
                value.clear();
                this.f31108a = null;
            }
        }

        C6633d(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C6698u.m38514c(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo22594b().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || mo22594b().keySet().equals(obj);
        }

        public int hashCode() {
            return mo22594b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C6634a(mo22594b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo22594b().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C6627d.m38269m(C6627d.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b7.d$e */
    /* compiled from: AbstractMapBasedMultimap */
    class C6635e extends C6627d<K, V>.h implements NavigableMap<K, Collection<V>> {
        C6635e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo22325i().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo22285f(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo22325i().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C6635e(mo22325i().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo22325i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo22285f(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo22325i().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo22285f(floorEntry);
        }

        public K floorKey(K k) {
            return mo22325i().floorKey(k);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo22325i().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo22285f(higherEntry);
        }

        public K higherKey(K k) {
            return mo22325i().higherKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public NavigableSet<K> mo22319g() {
            return new C6636f(mo22325i());
        }

        /* renamed from: k */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: l */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo22325i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo22285f(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo22325i().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo22285f(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo22325i().lowerKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public Map.Entry<K, Collection<V>> mo22332m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection o = C6627d.this.mo22267o();
            o.addAll((Collection) next.getValue());
            it.remove();
            return C6705y.m38543d(next.getKey(), C6627d.this.mo22263u(o));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> mo22325i() {
            return (NavigableMap) super.mo22325i();
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        /* renamed from: p */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo22332m(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo22332m(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C6635e(mo22325i().headMap(k, z));
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C6635e(mo22325i().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C6635e(mo22325i().tailMap(k, z));
        }
    }

    /* renamed from: b7.d$f */
    /* compiled from: AbstractMapBasedMultimap */
    class C6636f extends C6627d<K, V>.i implements NavigableSet<K> {
        C6636f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo22343c().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C6636f(mo22343c().descendingMap());
        }

        /* renamed from: f */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public K floor(K k) {
            return mo22343c().floorKey(k);
        }

        public K higher(K k) {
            return mo22343c().higherKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public NavigableMap<K, Collection<V>> mo22343c() {
            return (NavigableMap) super.mo22343c();
        }

        /* renamed from: j */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        /* renamed from: k */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public K lower(K k) {
            return mo22343c().lowerKey(k);
        }

        public K pollFirst() {
            return C6698u.m38524m(iterator());
        }

        public K pollLast() {
            return C6698u.m38524m(descendingIterator());
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C6636f(mo22343c().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C6636f(mo22343c().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C6636f(mo22343c().tailMap(k, z));
        }
    }

    /* renamed from: b7.d$g */
    /* compiled from: AbstractMapBasedMultimap */
    private class C6637g extends C6627d<K, V>.k implements RandomAccess {
        C6637g(C6627d dVar, K k, List<V> list, C6627d<K, V>.j jVar) {
            super(k, list, jVar);
        }
    }

    /* renamed from: b7.d$h */
    /* compiled from: AbstractMapBasedMultimap */
    private class C6638h extends C6627d<K, V>.C1583b implements SortedMap<K, Collection<V>> {

        /* renamed from: e */
        SortedSet<K> f31113e;

        C6638h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo22325i().comparator();
        }

        public K firstKey() {
            return mo22325i().firstKey();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public SortedSet<K> mo22319g() {
            return new C6639i(mo22325i());
        }

        /* renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f31113e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> g = mo22319g();
            this.f31113e = g;
            return g;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C6638h(mo22325i().headMap(k));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public SortedMap<K, Collection<V>> mo22325i() {
            return (SortedMap) this.f31096c;
        }

        public K lastKey() {
            return mo22325i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C6638h(mo22325i().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C6638h(mo22325i().tailMap(k));
        }
    }

    /* renamed from: b7.d$i */
    /* compiled from: AbstractMapBasedMultimap */
    private class C6639i extends C6627d<K, V>.d implements SortedSet<K> {
        C6639i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public SortedMap<K, Collection<V>> mo22343c() {
            return (SortedMap) super.mo22594b();
        }

        public Comparator<? super K> comparator() {
            return mo22343c().comparator();
        }

        public K first() {
            return mo22343c().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C6639i(mo22343c().headMap(k));
        }

        public K last() {
            return mo22343c().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C6639i(mo22343c().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C6639i(mo22343c().tailMap(k));
        }
    }

    protected C6627d(Map<K, Collection<V>> map) {
        C6431n.m37551d(map.isEmpty());
        this.f31094d = map;
    }

    /* renamed from: j */
    static /* synthetic */ int m38266j(C6627d dVar) {
        int i = dVar.f31095e;
        dVar.f31095e = i + 1;
        return i;
    }

    /* renamed from: k */
    static /* synthetic */ int m38267k(C6627d dVar) {
        int i = dVar.f31095e;
        dVar.f31095e = i - 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m38268l(C6627d dVar, int i) {
        int i2 = dVar.f31095e + i;
        dVar.f31095e = i2;
        return i2;
    }

    /* renamed from: m */
    static /* synthetic */ int m38269m(C6627d dVar, int i) {
        int i2 = dVar.f31095e - i;
        dVar.f31095e = i2;
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static <E> Iterator<E> m38271s(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m38272t(Object obj) {
        Collection collection = (Collection) C6705y.m38547h(this.f31094d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f31095e -= size;
        }
    }

    public void clear() {
        for (Collection<V> clear : this.f31094d.values()) {
            clear.clear();
        }
        this.f31094d.clear();
        this.f31095e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Collection<V> mo22270e() {
        return new C6647f.C6648a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<V> mo22271g() {
        return new C6628a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract Collection<V> mo22267o();

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Collection<V> mo22272p(K k) {
        return mo22267o();
    }

    public boolean put(K k, V v) {
        Collection collection = this.f31094d.get(k);
        if (collection == null) {
            Collection p = mo22272p(k);
            if (p.add(v)) {
                this.f31095e++;
                this.f31094d.put(k, p);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f31095e++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Map<K, Collection<V>> mo22273q() {
        Map<K, Collection<V>> map = this.f31094d;
        if (map instanceof NavigableMap) {
            return new C6635e((NavigableMap) this.f31094d);
        }
        if (map instanceof SortedMap) {
            return new C6638h((SortedMap) this.f31094d);
        }
        return new C6629b(this.f31094d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Set<K> mo22274r() {
        Map<K, Collection<V>> map = this.f31094d;
        if (map instanceof NavigableMap) {
            return new C6636f((NavigableMap) this.f31094d);
        }
        if (map instanceof SortedMap) {
            return new C6639i((SortedMap) this.f31094d);
        }
        return new C6633d(this.f31094d);
    }

    public int size() {
        return this.f31095e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract <E> Collection<E> mo22263u(Collection<E> collection);

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public abstract Collection<V> mo22264v(K k, Collection<V> collection);

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final List<V> mo22277w(K k, List<V> list, C6627d<K, V>.j jVar) {
        if (list instanceof RandomAccess) {
            return new C6637g(this, k, list, jVar);
        }
        return new C6642k(k, list, jVar);
    }

    /* renamed from: b7.d$j */
    /* compiled from: AbstractMapBasedMultimap */
    class C6640j extends AbstractCollection<V> {

        /* renamed from: a */
        final K f31116a;

        /* renamed from: b */
        Collection<V> f31117b;

        /* renamed from: c */
        final C6627d<K, V>.j f31118c;

        /* renamed from: d */
        final Collection<V> f31119d;

        C6640j(K k, Collection<V> collection, C6627d<K, V>.j jVar) {
            Collection<V> collection2;
            this.f31116a = k;
            this.f31117b = collection;
            this.f31118c = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.mo22376f();
            }
            this.f31119d = collection2;
        }

        public boolean add(V v) {
            mo22380j();
            boolean isEmpty = this.f31117b.isEmpty();
            boolean add = this.f31117b.add(v);
            if (add) {
                C6627d.m38266j(C6627d.this);
                if (isEmpty) {
                    mo22370b();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f31117b.addAll(collection);
            if (addAll) {
                C6627d.m38268l(C6627d.this, this.f31117b.size() - size);
                if (size == 0) {
                    mo22370b();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo22370b() {
            C6627d<K, V>.j jVar = this.f31118c;
            if (jVar != null) {
                jVar.mo22370b();
            } else {
                C6627d.this.f31094d.put(this.f31116a, this.f31117b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6627d<K, V>.j mo22371c() {
            return this.f31118c;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f31117b.clear();
                C6627d.m38269m(C6627d.this, size);
                mo22381k();
            }
        }

        public boolean contains(Object obj) {
            mo22380j();
            return this.f31117b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo22380j();
            return this.f31117b.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo22380j();
            return this.f31117b.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Collection<V> mo22376f() {
            return this.f31117b;
        }

        public int hashCode() {
            mo22380j();
            return this.f31117b.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public K mo22378i() {
            return this.f31116a;
        }

        public Iterator<V> iterator() {
            mo22380j();
            return new C6641a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo22380j() {
            Collection<V> collection;
            C6627d<K, V>.j jVar = this.f31118c;
            if (jVar != null) {
                jVar.mo22380j();
                if (this.f31118c.mo22376f() != this.f31119d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f31117b.isEmpty() && (collection = (Collection) C6627d.this.f31094d.get(this.f31116a)) != null) {
                this.f31117b = collection;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo22381k() {
            C6627d<K, V>.j jVar = this.f31118c;
            if (jVar != null) {
                jVar.mo22381k();
            } else if (this.f31117b.isEmpty()) {
                C6627d.this.f31094d.remove(this.f31116a);
            }
        }

        public boolean remove(Object obj) {
            mo22380j();
            boolean remove = this.f31117b.remove(obj);
            if (remove) {
                C6627d.m38267k(C6627d.this);
                mo22381k();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f31117b.removeAll(collection);
            if (removeAll) {
                C6627d.m38268l(C6627d.this, this.f31117b.size() - size);
                mo22381k();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C6431n.m37561n(collection);
            int size = size();
            boolean retainAll = this.f31117b.retainAll(collection);
            if (retainAll) {
                C6627d.m38268l(C6627d.this, this.f31117b.size() - size);
                mo22381k();
            }
            return retainAll;
        }

        public int size() {
            mo22380j();
            return this.f31117b.size();
        }

        public String toString() {
            mo22380j();
            return this.f31117b.toString();
        }

        /* renamed from: b7.d$j$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C6641a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f31121a;

            /* renamed from: b */
            final Collection<V> f31122b;

            C6641a() {
                Collection<V> collection = C6640j.this.f31117b;
                this.f31122b = collection;
                this.f31121a = C6627d.m38271s(collection);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Iterator<V> mo22387a() {
                mo22388c();
                return this.f31121a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo22388c() {
                C6640j.this.mo22380j();
                if (C6640j.this.f31117b != this.f31122b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo22388c();
                return this.f31121a.hasNext();
            }

            public V next() {
                mo22388c();
                return this.f31121a.next();
            }

            public void remove() {
                this.f31121a.remove();
                C6627d.m38267k(C6627d.this);
                C6640j.this.mo22381k();
            }

            C6641a(Iterator<V> it) {
                this.f31122b = C6640j.this.f31117b;
                this.f31121a = it;
            }
        }
    }

    /* renamed from: b7.d$k */
    /* compiled from: AbstractMapBasedMultimap */
    class C6642k extends C6627d<K, V>.j implements List<V> {

        /* renamed from: b7.d$k$a */
        /* compiled from: AbstractMapBasedMultimap */
        private class C6643a extends C6627d<K, V>.C4708a implements ListIterator<V> {
            C6643a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [b7.d$k$a, b7.d$j$a] */
            /* renamed from: d */
            private ListIterator<V> m38318d() {
                return (ListIterator) mo22387a();
            }

            public void add(V v) {
                boolean isEmpty = C6642k.this.isEmpty();
                m38318d().add(v);
                C6627d.m38266j(C6627d.this);
                if (isEmpty) {
                    C6642k.this.mo22370b();
                }
            }

            public boolean hasPrevious() {
                return m38318d().hasPrevious();
            }

            public int nextIndex() {
                return m38318d().nextIndex();
            }

            public V previous() {
                return m38318d().previous();
            }

            public int previousIndex() {
                return m38318d().previousIndex();
            }

            public void set(V v) {
                m38318d().set(v);
            }

            public C6643a(int i) {
                super(C6642k.this.mo22396l().listIterator(i));
            }
        }

        C6642k(K k, List<V> list, C6627d<K, V>.j jVar) {
            super(k, list, jVar);
        }

        public void add(int i, V v) {
            mo22380j();
            boolean isEmpty = mo22376f().isEmpty();
            mo22396l().add(i, v);
            C6627d.m38266j(C6627d.this);
            if (isEmpty) {
                mo22370b();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo22396l().addAll(i, collection);
            if (addAll) {
                C6627d.m38268l(C6627d.this, mo22376f().size() - size);
                if (size == 0) {
                    mo22370b();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo22380j();
            return mo22396l().get(i);
        }

        public int indexOf(Object obj) {
            mo22380j();
            return mo22396l().indexOf(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public List<V> mo22396l() {
            return (List) mo22376f();
        }

        public int lastIndexOf(Object obj) {
            mo22380j();
            return mo22396l().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo22380j();
            return new C6643a();
        }

        public V remove(int i) {
            mo22380j();
            V remove = mo22396l().remove(i);
            C6627d.m38267k(C6627d.this);
            mo22381k();
            return remove;
        }

        public V set(int i, V v) {
            mo22380j();
            return mo22396l().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo22380j();
            return C6627d.this.mo22277w(mo22378i(), mo22396l().subList(i, i2), mo22371c() == null ? this : mo22371c());
        }

        public ListIterator<V> listIterator(int i) {
            mo22380j();
            return new C6643a(i);
        }
    }
}
