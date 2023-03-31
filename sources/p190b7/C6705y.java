package p190b7;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p182a7.C6417f;
import p182a7.C6425j;
import p182a7.C6431n;
import p190b7.C6678p0;

/* renamed from: b7.y */
/* compiled from: Maps */
public final class C6705y {

    /* renamed from: b7.y$a */
    /* compiled from: Maps */
    class C6706a extends C6693r0<Map.Entry<K, V>, V> {
        C6706a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public V mo22575a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: b7.y$b */
    /* compiled from: Maps */
    private enum C6707b implements C6417f<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: b7.y$c */
    /* compiled from: Maps */
    static abstract class C6710c<K, V> extends C6678p0.C6683d<Map.Entry<K, V>> {
        C6710c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Map<K, V> mo22292b();

        public void clear() {
            mo22292b().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return mo22292b().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C6431n.m37561n(collection));
            } catch (UnsupportedOperationException unused) {
                return C6678p0.m38435j(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C6431n.m37561n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g = C6678p0.m38432g(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        g.add(((Map.Entry) next).getKey());
                    }
                }
                return mo22292b().keySet().retainAll(g);
            }
        }

        public int size() {
            return mo22292b().size();
        }
    }

    /* renamed from: b7.y$d */
    /* compiled from: Maps */
    static class C6711d<K, V> extends C6678p0.C6683d<K> {

        /* renamed from: a */
        final Map<K, V> f31205a;

        C6711d(Map<K, V> map) {
            this.f31205a = (Map) C6431n.m37561n(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map<K, V> mo22594b() {
            return this.f31205a;
        }

        public boolean contains(Object obj) {
            return mo22594b().containsKey(obj);
        }

        public boolean isEmpty() {
            return mo22594b().isEmpty();
        }

        public int size() {
            return mo22594b().size();
        }
    }

    /* renamed from: b7.y$e */
    /* compiled from: Maps */
    static class C6712e<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        final Map<K, V> f31206a;

        C6712e(Map<K, V> map) {
            this.f31206a = (Map) C6431n.m37561n(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final Map<K, V> mo22598b() {
            return this.f31206a;
        }

        public void clear() {
            mo22598b().clear();
        }

        public boolean contains(Object obj) {
            return mo22598b().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo22598b().isEmpty();
        }

        public Iterator<V> iterator() {
            return C6705y.m38550k(mo22598b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo22598b().entrySet()) {
                    if (C6425j.m37541a(obj, entry.getValue())) {
                        mo22598b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C6431n.m37561n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = C6678p0.m38431f();
                for (Map.Entry entry : mo22598b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return mo22598b().keySet().removeAll(f);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C6431n.m37561n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = C6678p0.m38431f();
                for (Map.Entry entry : mo22598b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return mo22598b().keySet().retainAll(f);
            }
        }

        public int size() {
            return mo22598b().size();
        }
    }

    /* renamed from: b7.y$f */
    /* compiled from: Maps */
    static abstract class C6713f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Map.Entry<K, V>> f31207a;

        /* renamed from: b */
        private transient Collection<V> f31208b;

        C6713f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Set<Map.Entry<K, V>> mo22279b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo22607c() {
            return new C6712e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f31207a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> b = mo22279b();
            this.f31207a = b;
            return b;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f31208b;
            if (collection != null) {
                return collection;
            }
            Collection<V> c = mo22607c();
            this.f31208b = c;
            return c;
        }
    }

    /* renamed from: a */
    static int m38540a(int i) {
        if (i < 3) {
            C6652h.m38335b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    static boolean m38541b(Map<?, ?> map, Object obj) {
        return C6698u.m38515d(m38550k(map.entrySet().iterator()), obj);
    }

    /* renamed from: c */
    static boolean m38542c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: d */
    public static <K, V> Map.Entry<K, V> m38543d(K k, V v) {
        return new C6677p(k, v);
    }

    /* renamed from: e */
    public static <K, V> IdentityHashMap<K, V> m38544e() {
        return new IdentityHashMap<>();
    }

    /* renamed from: f */
    static boolean m38545f(Map<?, ?> map, Object obj) {
        C6431n.m37561n(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: g */
    static <V> V m38546g(Map<?, V> map, Object obj) {
        C6431n.m37561n(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static <V> V m38547h(Map<?, V> map, Object obj) {
        C6431n.m37561n(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static String m38548i(Map<?, ?> map) {
        StringBuilder b = C6654i.m38342b(map.size());
        b.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                b.append(", ");
            }
            z = false;
            b.append(next.getKey());
            b.append('=');
            b.append(next.getValue());
        }
        b.append('}');
        return b.toString();
    }

    /* renamed from: j */
    static <V> C6417f<Map.Entry<?, V>, V> m38549j() {
        return C6707b.VALUE;
    }

    /* renamed from: k */
    static <K, V> Iterator<V> m38550k(Iterator<Map.Entry<K, V>> it) {
        return new C6706a(it);
    }
}
