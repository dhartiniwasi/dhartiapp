package p320p7;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p320p7.C12126c;

/* renamed from: p7.a */
/* compiled from: ArraySortedMap */
public class C12123a<K, V> extends C12126c<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final K[] f45170a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final V[] f45171b;

    /* renamed from: c */
    private final Comparator<K> f45172c;

    /* renamed from: p7.a$a */
    /* compiled from: ArraySortedMap */
    class C12124a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        int f45173a;

        /* renamed from: b */
        final /* synthetic */ int f45174b;

        /* renamed from: c */
        final /* synthetic */ boolean f45175c;

        C12124a(int i, boolean z) {
            this.f45174b = i;
            this.f45175c = z;
            this.f45173a = i;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Object obj = C12123a.this.f45170a[this.f45173a];
            Object[] r = C12123a.this.f45171b;
            int i = this.f45173a;
            Object obj2 = r[i];
            this.f45173a = this.f45175c ? i - 1 : i + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        public boolean hasNext() {
            if (this.f45175c) {
                if (this.f45173a >= 0) {
                    return true;
                }
            } else if (this.f45173a < C12123a.this.f45170a.length) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C12123a(Comparator<K> comparator) {
        this.f45170a = new Object[0];
        this.f45171b = new Object[0];
        this.f45172c = comparator;
    }

    /* renamed from: s */
    private static <T> T[] m58247s(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (length - i) - 1);
        return tArr2;
    }

    /* renamed from: t */
    public static <A, B, C> C12123a<A, C> m58248t(List<A> list, Map<B, C> map, C12126c.C12127a.C12128a<A, B> aVar, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A next : list) {
            objArr[i] = next;
            objArr2[i] = map.get(aVar.mo36626a(next));
            i++;
        }
        return new C12123a<>(comparator, objArr, objArr2);
    }

    /* renamed from: u */
    private int m58249u(K k) {
        int i = 0;
        for (K compare : this.f45170a) {
            if (this.f45172c.compare(k, compare) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: v */
    private int m58250v(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.f45170a;
            if (i >= kArr.length || this.f45172c.compare(kArr[i], k) >= 0) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: w */
    private Iterator<Map.Entry<K, V>> m58251w(int i, boolean z) {
        return new C12124a(i, z);
    }

    /* renamed from: x */
    private static <T> T[] m58252x(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    /* renamed from: y */
    private static <T> T[] m58253y(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    /* renamed from: b */
    public boolean mo36610b(K k) {
        return m58249u(k) != -1;
    }

    /* renamed from: c */
    public V mo36611c(K k) {
        int u = m58249u(k);
        if (u != -1) {
            return this.f45171b[u];
        }
        return null;
    }

    /* renamed from: f */
    public Comparator<K> mo36612f() {
        return this.f45172c;
    }

    /* renamed from: i */
    public K mo36613i() {
        K[] kArr = this.f45170a;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    public int indexOf(K k) {
        return m58249u(k);
    }

    public boolean isEmpty() {
        return this.f45170a.length == 0;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return m58251w(0, false);
    }

    /* renamed from: j */
    public K mo36617j() {
        K[] kArr = this.f45170a;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    /* renamed from: k */
    public C12126c<K, V> mo36618k(K k, V v) {
        int u = m58249u(k);
        if (u != -1) {
            K[] kArr = this.f45170a;
            if (kArr[u] == k && this.f45171b[u] == v) {
                return this;
            }
            return new C12123a(this.f45172c, m58253y(kArr, u, k), m58253y(this.f45171b, u, v));
        } else if (this.f45170a.length > 25) {
            HashMap hashMap = new HashMap(this.f45170a.length + 1);
            int i = 0;
            while (true) {
                K[] kArr2 = this.f45170a;
                if (i < kArr2.length) {
                    hashMap.put(kArr2[i], this.f45171b[i]);
                    i++;
                } else {
                    hashMap.put(k, v);
                    return C12138k.m58329r(hashMap, this.f45172c);
                }
            }
        } else {
            int v2 = m58250v(k);
            return new C12123a(this.f45172c, m58247s(this.f45170a, v2, k), m58247s(this.f45171b, v2, v));
        }
    }

    /* renamed from: l */
    public Iterator<Map.Entry<K, V>> mo36619l(K k) {
        return m58251w(m58250v(k), false);
    }

    /* renamed from: o */
    public C12126c<K, V> mo36620o(K k) {
        int u = m58249u(k);
        if (u == -1) {
            return this;
        }
        return new C12123a(this.f45172c, m58252x(this.f45170a, u), m58252x(this.f45171b, u));
    }

    public int size() {
        return this.f45170a.length;
    }

    private C12123a(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f45170a = kArr;
        this.f45171b = vArr;
        this.f45172c = comparator;
    }
}
