package p124r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: r.a */
/* compiled from: ArrayMap */
public class C5413a<K, V> extends C5426g<K, V> implements Map<K, V> {

    /* renamed from: h */
    C5420f<K, V> f27635h;

    /* renamed from: r.a$a */
    /* compiled from: ArrayMap */
    class C5414a extends C5420f<K, V> {
        C5414a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19541a() {
            C5413a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo19542b(int i, int i2) {
            return C5413a.this.f27684b[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo19543c() {
            return C5413a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo19544d() {
            return C5413a.this.f27685c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo19545e(Object obj) {
            return C5413a.this.mo19661g(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo19546f(Object obj) {
            return C5413a.this.mo19666i(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo19547g(K k, V v) {
            C5413a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo19548h(int i) {
            C5413a.this.mo19670l(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo19549i(int i, V v) {
            return C5413a.this.mo19671m(i, v);
        }
    }

    public C5413a() {
    }

    /* renamed from: o */
    private C5420f<K, V> m33164o() {
        if (this.f27635h == null) {
            this.f27635h = new C5414a();
        }
        return this.f27635h;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m33164o().mo19593l();
    }

    public Set<K> keySet() {
        return m33164o().mo19594m();
    }

    /* renamed from: p */
    public boolean mo19538p(Collection<?> collection) {
        return C5420f.m33223p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo19658d(this.f27685c + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m33164o().mo19595n();
    }

    public C5413a(int i) {
        super(i);
    }

    public C5413a(C5426g gVar) {
        super(gVar);
    }
}
