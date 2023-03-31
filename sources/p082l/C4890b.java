package p082l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.b */
/* compiled from: SafeIterableMap */
public class C4890b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    C4893c<K, V> f25834a;

    /* renamed from: b */
    private C4893c<K, V> f25835b;

    /* renamed from: c */
    private WeakHashMap<C4896f<K, V>, Boolean> f25836c = new WeakHashMap<>();

    /* renamed from: d */
    private int f25837d = 0;

    /* renamed from: l.b$a */
    /* compiled from: SafeIterableMap */
    static class C4891a<K, V> extends C4895e<K, V> {
        C4891a(C4893c<K, V> cVar, C4893c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4893c<K, V> mo18692c(C4893c<K, V> cVar) {
            return cVar.f25841d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C4893c<K, V> mo18693d(C4893c<K, V> cVar) {
            return cVar.f25840c;
        }
    }

    /* renamed from: l.b$b */
    /* compiled from: SafeIterableMap */
    private static class C4892b<K, V> extends C4895e<K, V> {
        C4892b(C4893c<K, V> cVar, C4893c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4893c<K, V> mo18692c(C4893c<K, V> cVar) {
            return cVar.f25840c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C4893c<K, V> mo18693d(C4893c<K, V> cVar) {
            return cVar.f25841d;
        }
    }

    /* renamed from: l.b$c */
    /* compiled from: SafeIterableMap */
    static class C4893c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f25838a;

        /* renamed from: b */
        final V f25839b;

        /* renamed from: c */
        C4893c<K, V> f25840c;

        /* renamed from: d */
        C4893c<K, V> f25841d;

        C4893c(K k, V v) {
            this.f25838a = k;
            this.f25839b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4893c)) {
                return false;
            }
            C4893c cVar = (C4893c) obj;
            if (!this.f25838a.equals(cVar.f25838a) || !this.f25839b.equals(cVar.f25839b)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f25838a;
        }

        public V getValue() {
            return this.f25839b;
        }

        public int hashCode() {
            return this.f25838a.hashCode() ^ this.f25839b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f25838a + "=" + this.f25839b;
        }
    }

    /* renamed from: l.b$d */
    /* compiled from: SafeIterableMap */
    private class C4894d implements Iterator<Map.Entry<K, V>>, C4896f<K, V> {

        /* renamed from: a */
        private C4893c<K, V> f25842a;

        /* renamed from: b */
        private boolean f25843b = true;

        C4894d() {
        }

        /* renamed from: a */
        public void mo18700a(C4893c<K, V> cVar) {
            C4893c<K, V> cVar2 = this.f25842a;
            if (cVar == cVar2) {
                C4893c<K, V> cVar3 = cVar2.f25841d;
                this.f25842a = cVar3;
                this.f25843b = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (this.f25843b) {
                this.f25843b = false;
                this.f25842a = C4890b.this.f25834a;
            } else {
                C4893c<K, V> cVar = this.f25842a;
                this.f25842a = cVar != null ? cVar.f25840c : null;
            }
            return this.f25842a;
        }

        public boolean hasNext() {
            if (!this.f25843b) {
                C4893c<K, V> cVar = this.f25842a;
                if (cVar == null || cVar.f25840c == null) {
                    return false;
                }
                return true;
            } else if (C4890b.this.f25834a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: l.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C4895e<K, V> implements Iterator<Map.Entry<K, V>>, C4896f<K, V> {

        /* renamed from: a */
        C4893c<K, V> f25845a;

        /* renamed from: b */
        C4893c<K, V> f25846b;

        C4895e(C4893c<K, V> cVar, C4893c<K, V> cVar2) {
            this.f25845a = cVar2;
            this.f25846b = cVar;
        }

        /* renamed from: f */
        private C4893c<K, V> m31094f() {
            C4893c<K, V> cVar = this.f25846b;
            C4893c<K, V> cVar2 = this.f25845a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo18693d(cVar);
        }

        /* renamed from: a */
        public void mo18700a(C4893c<K, V> cVar) {
            if (this.f25845a == cVar && cVar == this.f25846b) {
                this.f25846b = null;
                this.f25845a = null;
            }
            C4893c<K, V> cVar2 = this.f25845a;
            if (cVar2 == cVar) {
                this.f25845a = mo18692c(cVar2);
            }
            if (this.f25846b == cVar) {
                this.f25846b = m31094f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C4893c<K, V> mo18692c(C4893c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C4893c<K, V> mo18693d(C4893c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C4893c<K, V> cVar = this.f25846b;
            this.f25846b = m31094f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f25846b != null;
        }
    }

    /* renamed from: l.b$f */
    /* compiled from: SafeIterableMap */
    interface C4896f<K, V> {
        /* renamed from: a */
        void mo18700a(C4893c<K, V> cVar);
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo18682b() {
        return this.f25834a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4893c<K, V> mo18677c(K k) {
        C4893c<K, V> cVar = this.f25834a;
        while (cVar != null && !cVar.f25838a.equals(k)) {
            cVar = cVar.f25840c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C4892b bVar = new C4892b(this.f25835b, this.f25834a);
        this.f25836c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4890b)) {
            return false;
        }
        C4890b bVar = (C4890b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C4890b<K, V>.d mo18685f() {
        C4890b<K, V>.d dVar = new C4894d();
        this.f25836c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Map.Entry<K, V> mo18687i() {
        return this.f25835b;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C4891a aVar = new C4891a(this.f25834a, this.f25835b);
        this.f25836c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C4893c<K, V> mo18689j(K k, V v) {
        C4893c<K, V> cVar = new C4893c<>(k, v);
        this.f25837d++;
        C4893c<K, V> cVar2 = this.f25835b;
        if (cVar2 == null) {
            this.f25834a = cVar;
            this.f25835b = cVar;
            return cVar;
        }
        cVar2.f25840c = cVar;
        cVar.f25841d = cVar2;
        this.f25835b = cVar;
        return cVar;
    }

    /* renamed from: k */
    public V mo18679k(K k, V v) {
        C4893c c = mo18677c(k);
        if (c != null) {
            return c.f25839b;
        }
        mo18689j(k, v);
        return null;
    }

    /* renamed from: l */
    public V mo18680l(K k) {
        C4893c c = mo18677c(k);
        if (c == null) {
            return null;
        }
        this.f25837d--;
        if (!this.f25836c.isEmpty()) {
            for (C4896f<K, V> a : this.f25836c.keySet()) {
                a.mo18700a(c);
            }
        }
        C4893c<K, V> cVar = c.f25841d;
        if (cVar != null) {
            cVar.f25840c = c.f25840c;
        } else {
            this.f25834a = c.f25840c;
        }
        C4893c<K, V> cVar2 = c.f25840c;
        if (cVar2 != null) {
            cVar2.f25841d = cVar;
        } else {
            this.f25835b = cVar;
        }
        c.f25840c = null;
        c.f25841d = null;
        return c.f25839b;
    }

    public int size() {
        return this.f25837d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
