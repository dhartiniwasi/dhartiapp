package p124r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: r.f */
/* compiled from: MapCollections */
abstract class C5420f<K, V> {

    /* renamed from: a */
    C5420f<K, V>.C1583b f27664a;

    /* renamed from: b */
    C5420f<K, V>.c f27665b;

    /* renamed from: c */
    C5420f<K, V>.e f27666c;

    /* renamed from: r.f$a */
    /* compiled from: MapCollections */
    final class C5421a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f27667a;

        /* renamed from: b */
        int f27668b;

        /* renamed from: c */
        int f27669c;

        /* renamed from: d */
        boolean f27670d = false;

        C5421a(int i) {
            this.f27667a = i;
            this.f27668b = C5420f.this.mo19544d();
        }

        public boolean hasNext() {
            return this.f27669c < this.f27668b;
        }

        public T next() {
            if (hasNext()) {
                T b = C5420f.this.mo19542b(this.f27669c, this.f27667a);
                this.f27669c++;
                this.f27670d = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f27670d) {
                int i = this.f27669c - 1;
                this.f27669c = i;
                this.f27668b--;
                this.f27670d = false;
                C5420f.this.mo19548h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: r.f$b */
    /* compiled from: MapCollections */
    final class C5422b implements Set<Map.Entry<K, V>> {
        C5422b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C5420f.this.mo19544d();
            for (Map.Entry entry : collection) {
                C5420f.this.mo19547g(entry.getKey(), entry.getValue());
            }
            return d != C5420f.this.mo19544d();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C5420f.this.mo19541a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C5420f.this.mo19545e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C5417c.m33194c(C5420f.this.mo19542b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C5420f.m33221k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = C5420f.this.mo19544d() - 1; d >= 0; d--) {
                Object b = C5420f.this.mo19542b(d, 0);
                Object b2 = C5420f.this.mo19542b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C5420f.this.mo19544d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5424d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C5420f.this.mo19544d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: r.f$c */
    /* compiled from: MapCollections */
    final class C5423c implements Set<K> {
        C5423c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C5420f.this.mo19541a();
        }

        public boolean contains(Object obj) {
            return C5420f.this.mo19545e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C5420f.m33220j(C5420f.this.mo19543c(), collection);
        }

        public boolean equals(Object obj) {
            return C5420f.m33221k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = C5420f.this.mo19544d() - 1; d >= 0; d--) {
                Object b = C5420f.this.mo19542b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C5420f.this.mo19544d() == 0;
        }

        public Iterator<K> iterator() {
            return new C5421a(0);
        }

        public boolean remove(Object obj) {
            int e = C5420f.this.mo19545e(obj);
            if (e < 0) {
                return false;
            }
            C5420f.this.mo19548h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C5420f.m33222o(C5420f.this.mo19543c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C5420f.m33223p(C5420f.this.mo19543c(), collection);
        }

        public int size() {
            return C5420f.this.mo19544d();
        }

        public Object[] toArray() {
            return C5420f.this.mo19596q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C5420f.this.mo19597r(tArr, 0);
        }
    }

    /* renamed from: r.f$d */
    /* compiled from: MapCollections */
    final class C5424d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f27674a;

        /* renamed from: b */
        int f27675b;

        /* renamed from: c */
        boolean f27676c = false;

        C5424d() {
            this.f27674a = C5420f.this.mo19544d() - 1;
            this.f27675b = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f27675b++;
                this.f27676c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f27676c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C5417c.m33194c(entry.getKey(), C5420f.this.mo19542b(this.f27675b, 0)) || !C5417c.m33194c(entry.getValue(), C5420f.this.mo19542b(this.f27675b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f27676c) {
                return C5420f.this.mo19542b(this.f27675b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f27676c) {
                return C5420f.this.mo19542b(this.f27675b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f27675b < this.f27674a;
        }

        public int hashCode() {
            int i;
            if (this.f27676c) {
                int i2 = 0;
                Object b = C5420f.this.mo19542b(this.f27675b, 0);
                Object b2 = C5420f.this.mo19542b(this.f27675b, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f27676c) {
                C5420f.this.mo19548h(this.f27675b);
                this.f27675b--;
                this.f27674a--;
                this.f27676c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f27676c) {
                return C5420f.this.mo19549i(this.f27675b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: r.f$e */
    /* compiled from: MapCollections */
    final class C5425e implements Collection<V> {
        C5425e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C5420f.this.mo19541a();
        }

        public boolean contains(Object obj) {
            return C5420f.this.mo19546f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C5420f.this.mo19544d() == 0;
        }

        public Iterator<V> iterator() {
            return new C5421a(1);
        }

        public boolean remove(Object obj) {
            int f = C5420f.this.mo19546f(obj);
            if (f < 0) {
                return false;
            }
            C5420f.this.mo19548h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C5420f.this.mo19544d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C5420f.this.mo19542b(i, 1))) {
                    C5420f.this.mo19548h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C5420f.this.mo19544d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C5420f.this.mo19542b(i, 1))) {
                    C5420f.this.mo19548h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C5420f.this.mo19544d();
        }

        public Object[] toArray() {
            return C5420f.this.mo19596q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C5420f.this.mo19597r(tArr, 1);
        }
    }

    C5420f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m33220j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m33221k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m33222o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m33223p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19541a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo19542b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo19543c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo19544d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo19545e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo19546f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo19547g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo19548h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo19549i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo19593l() {
        if (this.f27664a == null) {
            this.f27664a = new C5422b();
        }
        return this.f27664a;
    }

    /* renamed from: m */
    public Set<K> mo19594m() {
        if (this.f27665b == null) {
            this.f27665b = new C5423c();
        }
        return this.f27665b;
    }

    /* renamed from: n */
    public Collection<V> mo19595n() {
        if (this.f27666c == null) {
            this.f27666c = new C5425e();
        }
        return this.f27666c;
    }

    /* renamed from: q */
    public Object[] mo19596q(int i) {
        int d = mo19544d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo19542b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo19597r(T[] tArr, int i) {
        int d = mo19544d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo19542b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
