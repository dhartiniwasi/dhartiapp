package p190b7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b7.f */
/* compiled from: AbstractMultimap */
abstract class C6647f<K, V> implements C6714z<K, V> {

    /* renamed from: a */
    private transient Set<K> f31127a;

    /* renamed from: b */
    private transient Collection<V> f31128b;

    /* renamed from: c */
    private transient Map<K, Collection<V>> f31129c;

    /* renamed from: b7.f$a */
    /* compiled from: AbstractMultimap */
    class C6648a extends AbstractCollection<V> {
        C6648a() {
        }

        public void clear() {
            C6647f.this.clear();
        }

        public boolean contains(Object obj) {
            return C6647f.this.mo22419b(obj);
        }

        public Iterator<V> iterator() {
            return C6647f.this.mo22271g();
        }

        public int size() {
            return C6647f.this.size();
        }
    }

    C6647f() {
    }

    /* renamed from: a */
    public Map<K, Collection<V>> mo22260a() {
        Map<K, Collection<V>> map = this.f31129c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo22265c();
        this.f31129c = c;
        return c;
    }

    /* renamed from: b */
    public boolean mo22419b(Object obj) {
        for (Collection contains : mo22260a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo22265c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo22266d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Collection<V> mo22270e();

    public boolean equals(Object obj) {
        return C6625c0.m38258a(this, obj);
    }

    /* renamed from: f */
    public Set<K> mo22420f() {
        Set<K> set = this.f31127a;
        if (set != null) {
            return set;
        }
        Set<K> d = mo22266d();
        this.f31127a = d;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Iterator<V> mo22271g();

    public int hashCode() {
        return mo22260a().hashCode();
    }

    public String toString() {
        return mo22260a().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f31128b;
        if (collection != null) {
            return collection;
        }
        Collection<V> e = mo22270e();
        this.f31128b = e;
        return e;
    }
}
