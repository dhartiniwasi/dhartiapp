package p320p7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p320p7.C12126c;
import p320p7.C12134h;

/* renamed from: p7.k */
/* compiled from: RBTreeSortedMap */
public class C12138k<K, V> extends C12126c<K, V> {

    /* renamed from: a */
    private C12134h<K, V> f45192a;

    /* renamed from: b */
    private Comparator<K> f45193b;

    /* renamed from: p7.k$b */
    /* compiled from: RBTreeSortedMap */
    private static class C12140b<A, B, C> {

        /* renamed from: a */
        private final List<A> f45194a;

        /* renamed from: b */
        private final Map<B, C> f45195b;

        /* renamed from: c */
        private final C12126c.C12127a.C12128a<A, B> f45196c;

        /* renamed from: d */
        private C12137j<A, C> f45197d;

        /* renamed from: e */
        private C12137j<A, C> f45198e;

        /* renamed from: p7.k$b$a */
        /* compiled from: RBTreeSortedMap */
        static class C12141a implements Iterable<C12143b> {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public long f45199a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final int f45200b;

            /* renamed from: p7.k$b$a$a */
            /* compiled from: RBTreeSortedMap */
            class C12142a implements Iterator<C12143b> {

                /* renamed from: a */
                private int f45201a;

                C12142a() {
                    this.f45201a = C12141a.this.f45200b - 1;
                }

                /* renamed from: a */
                public C12143b next() {
                    C12143b bVar = new C12143b();
                    bVar.f45203a = (C12141a.this.f45199a & ((long) (1 << this.f45201a))) == 0;
                    bVar.f45204b = (int) Math.pow(2.0d, (double) this.f45201a);
                    this.f45201a--;
                    return bVar;
                }

                public boolean hasNext() {
                    return this.f45201a >= 0;
                }

                public void remove() {
                }
            }

            public C12141a(int i) {
                int i2 = i + 1;
                int floor = (int) Math.floor(Math.log((double) i2) / Math.log(2.0d));
                this.f45200b = floor;
                this.f45199a = (((long) Math.pow(2.0d, (double) floor)) - 1) & ((long) i2);
            }

            public Iterator<C12143b> iterator() {
                return new C12142a();
            }
        }

        /* renamed from: p7.k$b$b */
        /* compiled from: RBTreeSortedMap */
        static class C12143b {

            /* renamed from: a */
            public boolean f45203a;

            /* renamed from: b */
            public int f45204b;

            C12143b() {
            }
        }

        private C12140b(List<A> list, Map<B, C> map, C12126c.C12127a.C12128a<A, B> aVar) {
            this.f45194a = list;
            this.f45195b = map;
            this.f45196c = aVar;
        }

        /* renamed from: a */
        private C12134h<A, C> m58339a(int i, int i2) {
            if (i2 == 0) {
                return C12133g.m58289i();
            }
            if (i2 == 1) {
                A a = this.f45194a.get(i);
                return new C12132f(a, m58342d(a), (C12134h) null, (C12134h) null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            C12134h a2 = m58339a(i, i3);
            C12134h a3 = m58339a(i4 + 1, i3);
            A a4 = this.f45194a.get(i4);
            return new C12132f(a4, m58342d(a4), a2, a3);
        }

        /* renamed from: b */
        public static <A, B, C> C12138k<A, C> m58340b(List<A> list, Map<B, C> map, C12126c.C12127a.C12128a<A, B> aVar, Comparator<A> comparator) {
            C12140b bVar = new C12140b(list, map, aVar);
            Collections.sort(list, comparator);
            Iterator<C12143b> it = new C12141a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C12143b next = it.next();
                int i = next.f45204b;
                size -= i;
                if (next.f45203a) {
                    bVar.m58341c(C12134h.C12135a.BLACK, i, size);
                } else {
                    bVar.m58341c(C12134h.C12135a.BLACK, i, size);
                    int i2 = next.f45204b;
                    size -= i2;
                    bVar.m58341c(C12134h.C12135a.RED, i2, size);
                }
            }
            C12134h hVar = bVar.f45197d;
            if (hVar == null) {
                hVar = C12133g.m58289i();
            }
            return new C12138k<>(hVar, comparator);
        }

        /* renamed from: c */
        private void m58341c(C12134h.C12135a aVar, int i, int i2) {
            C12137j<A, C> jVar;
            C12134h a = m58339a(i2 + 1, i - 1);
            A a2 = this.f45194a.get(i2);
            if (aVar == C12134h.C12135a.RED) {
                jVar = new C12136i<>(a2, m58342d(a2), (C12134h) null, a);
            } else {
                jVar = new C12132f<>(a2, m58342d(a2), (C12134h) null, a);
            }
            if (this.f45197d == null) {
                this.f45197d = jVar;
                this.f45198e = jVar;
                return;
            }
            this.f45198e.mo36654t(jVar);
            this.f45198e = jVar;
        }

        /* renamed from: d */
        private C m58342d(A a) {
            return this.f45195b.get(this.f45196c.mo36626a(a));
        }
    }

    /* renamed from: q */
    public static <A, B, C> C12138k<A, C> m58328q(List<A> list, Map<B, C> map, C12126c.C12127a.C12128a<A, B> aVar, Comparator<A> comparator) {
        return C12140b.m58340b(list, map, aVar, comparator);
    }

    /* renamed from: r */
    public static <A, B> C12138k<A, B> m58329r(Map<A, B> map, Comparator<A> comparator) {
        return C12140b.m58340b(new ArrayList(map.keySet()), map, C12126c.C12127a.m58275d(), comparator);
    }

    /* renamed from: s */
    private C12134h<K, V> m58330s(K k) {
        C12134h<K, V> hVar = this.f45192a;
        while (!hVar.isEmpty()) {
            int compare = this.f45193b.compare(k, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.mo36655a();
            } else if (compare == 0) {
                return hVar;
            } else {
                hVar = hVar.mo36659f();
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo36610b(K k) {
        return m58330s(k) != null;
    }

    /* renamed from: c */
    public V mo36611c(K k) {
        C12134h s = m58330s(k);
        if (s != null) {
            return s.getValue();
        }
        return null;
    }

    /* renamed from: f */
    public Comparator<K> mo36612f() {
        return this.f45193b;
    }

    /* renamed from: i */
    public K mo36613i() {
        return this.f45192a.mo36663h().getKey();
    }

    public int indexOf(K k) {
        C12134h<K, V> hVar = this.f45192a;
        int i = 0;
        while (!hVar.isEmpty()) {
            int compare = this.f45193b.compare(k, hVar.getKey());
            if (compare == 0) {
                return i + hVar.mo36655a().size();
            }
            if (compare < 0) {
                hVar = hVar.mo36655a();
            } else {
                i += hVar.mo36655a().size() + 1;
                hVar = hVar.mo36659f();
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f45192a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C12129d(this.f45192a, null, this.f45193b, false);
    }

    /* renamed from: j */
    public K mo36617j() {
        return this.f45192a.mo36660g().getKey();
    }

    /* renamed from: k */
    public C12126c<K, V> mo36618k(K k, V v) {
        return new C12138k(this.f45192a.mo36656b(k, v, this.f45193b).mo36658d(null, null, C12134h.C12135a.BLACK, (C12134h) null, (C12134h) null), this.f45193b);
    }

    /* renamed from: l */
    public Iterator<Map.Entry<K, V>> mo36619l(K k) {
        return new C12129d(this.f45192a, k, this.f45193b, false);
    }

    /* renamed from: o */
    public C12126c<K, V> mo36620o(K k) {
        if (!mo36610b(k)) {
            return this;
        }
        return new C12138k(this.f45192a.mo36657c(k, this.f45193b).mo36658d(null, null, C12134h.C12135a.BLACK, (C12134h) null, (C12134h) null), this.f45193b);
    }

    public int size() {
        return this.f45192a.size();
    }

    private C12138k(C12134h<K, V> hVar, Comparator<K> comparator) {
        this.f45192a = hVar;
        this.f45193b = comparator;
    }
}
