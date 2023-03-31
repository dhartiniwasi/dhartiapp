package p190b7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import p190b7.C6673o;

/* renamed from: b7.r */
/* compiled from: ImmutableMap */
public abstract class C6690r<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d */
    static final Map.Entry<?, ?>[] f31182d = new Map.Entry[0];

    /* renamed from: a */
    private transient C6694s<Map.Entry<K, V>> f31183a;

    /* renamed from: b */
    private transient C6694s<K> f31184b;

    /* renamed from: c */
    private transient C6673o<V> f31185c;

    /* renamed from: b7.r$a */
    /* compiled from: ImmutableMap */
    public static class C6691a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f31186a;

        /* renamed from: b */
        Object[] f31187b;

        /* renamed from: c */
        int f31188c;

        /* renamed from: d */
        boolean f31189d;

        /* renamed from: e */
        C6692a f31190e;

        /* renamed from: b7.r$a$a */
        /* compiled from: ImmutableMap */
        static final class C6692a {

            /* renamed from: a */
            private final Object f31191a;

            /* renamed from: b */
            private final Object f31192b;

            /* renamed from: c */
            private final Object f31193c;

            C6692a(Object obj, Object obj2, Object obj3) {
                this.f31191a = obj;
                this.f31192b = obj2;
                this.f31193c = obj3;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public IllegalArgumentException mo22574a() {
                String valueOf = String.valueOf(this.f31191a);
                String valueOf2 = String.valueOf(this.f31192b);
                String valueOf3 = String.valueOf(this.f31191a);
                String valueOf4 = String.valueOf(this.f31193c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public C6691a() {
            this(4);
        }

        /* renamed from: b */
        private C6690r<K, V> m38480b(boolean z) {
            Object[] objArr;
            C6692a aVar;
            C6692a aVar2;
            if (!z || (aVar2 = this.f31190e) == null) {
                int i = this.f31188c;
                if (this.f31186a == null) {
                    objArr = this.f31187b;
                } else {
                    if (this.f31189d) {
                        this.f31187b = Arrays.copyOf(this.f31187b, i * 2);
                    }
                    objArr = this.f31187b;
                    if (!z) {
                        objArr = m38482e(objArr, this.f31188c);
                        if (objArr.length < this.f31187b.length) {
                            i = objArr.length >>> 1;
                        }
                    }
                    m38483i(objArr, i, this.f31186a);
                }
                this.f31189d = true;
                C6662k0 m = C6662k0.m38374m(i, objArr, this);
                if (!z || (aVar = this.f31190e) == null) {
                    return m;
                }
                throw aVar.mo22574a();
            }
            throw aVar2.mo22574a();
        }

        /* renamed from: d */
        private void m38481d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f31187b;
            if (i2 > objArr.length) {
                this.f31187b = Arrays.copyOf(objArr, C6673o.C6675b.m38423c(objArr.length, i2));
                this.f31189d = false;
            }
        }

        /* renamed from: e */
        private Object[] m38482e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i - bitSet.cardinality()) * 2)];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 = i5 + 1;
                    i3 = i6 + 1;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        /* renamed from: i */
        static <V> void m38483i(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, C6653h0.m38337a(comparator).mo22430c(C6705y.m38549j()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* renamed from: a */
        public C6690r<K, V> mo22569a() {
            return mo22570c();
        }

        /* renamed from: c */
        public C6690r<K, V> mo22570c() {
            return m38480b(true);
        }

        /* renamed from: f */
        public C6691a<K, V> mo22571f(K k, V v) {
            m38481d(this.f31188c + 1);
            C6652h.m38334a(k, v);
            Object[] objArr = this.f31187b;
            int i = this.f31188c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f31188c = i + 1;
            return this;
        }

        /* renamed from: g */
        public C6691a<K, V> mo22572g(Map.Entry<? extends K, ? extends V> entry) {
            return mo22571f(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        public C6691a<K, V> mo22573h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m38481d(this.f31188c + ((Collection) iterable).size());
            }
            for (Map.Entry g : iterable) {
                mo22572g(g);
            }
            return this;
        }

        C6691a(int i) {
            this.f31187b = new Object[(i * 2)];
            this.f31188c = 0;
            this.f31189d = false;
        }
    }

    C6690r() {
    }

    /* renamed from: b */
    public static <K, V> C6691a<K, V> m38469b() {
        return new C6691a<>();
    }

    /* renamed from: c */
    public static <K, V> C6690r<K, V> m38470c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C6691a aVar = new C6691a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo22573h(iterable);
        return aVar.mo22569a();
    }

    /* renamed from: d */
    public static <K, V> C6690r<K, V> m38471d(Map<? extends K, ? extends V> map) {
        if ((map instanceof C6690r) && !(map instanceof SortedMap)) {
            C6690r<K, V> rVar = (C6690r) map;
            if (!rVar.mo22465i()) {
                return rVar;
            }
        }
        return m38470c(map.entrySet());
    }

    /* renamed from: k */
    public static <K, V> C6690r<K, V> m38472k() {
        return C6662k0.f31143h;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C6694s<Map.Entry<K, V>> mo22461e();

    public boolean equals(Object obj) {
        return C6705y.m38542c(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C6694s<K> mo22462f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C6673o<V> mo22463g();

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public C6694s<Map.Entry<K, V>> entrySet() {
        C6694s<Map.Entry<K, V>> sVar = this.f31183a;
        if (sVar != null) {
            return sVar;
        }
        C6694s<Map.Entry<K, V>> e = mo22461e();
        this.f31183a = e;
        return e;
    }

    public int hashCode() {
        return C6678p0.m38429d(entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo22465i();

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public C6694s<K> keySet() {
        C6694s<K> sVar = this.f31184b;
        if (sVar != null) {
            return sVar;
        }
        C6694s<K> f = mo22462f();
        this.f31184b = f;
        return f;
    }

    /* renamed from: l */
    public C6673o<V> values() {
        C6673o<V> oVar = this.f31185c;
        if (oVar != null) {
            return oVar;
        }
        C6673o<V> g = mo22463g();
        this.f31185c = g;
        return g;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C6705y.m38548i(this);
    }
}
