package p320p7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: p7.c */
/* compiled from: ImmutableSortedMap */
public abstract class C12126c<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: p7.c$a */
    /* compiled from: ImmutableSortedMap */
    public static class C12127a {

        /* renamed from: a */
        private static final C12128a f45178a = C12125b.f45177a;

        /* renamed from: p7.c$a$a */
        /* compiled from: ImmutableSortedMap */
        public interface C12128a<C, D> {
            /* renamed from: a */
            D mo36626a(C c);
        }

        /* renamed from: b */
        public static <A, B, C> C12126c<A, C> m58273b(List<A> list, Map<B, C> map, C12128a<A, B> aVar, Comparator<A> comparator) {
            if (list.size() < 25) {
                return C12123a.m58248t(list, map, aVar, comparator);
            }
            return C12138k.m58328q(list, map, aVar, comparator);
        }

        /* renamed from: c */
        public static <K, V> C12126c<K, V> m58274c(Comparator<K> comparator) {
            return new C12123a(comparator);
        }

        /* renamed from: d */
        public static <A> C12128a<A, A> m58275d() {
            return f45178a;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ Object m58276e(Object obj) {
            return obj;
        }
    }

    /* renamed from: b */
    public abstract boolean mo36610b(K k);

    /* renamed from: c */
    public abstract V mo36611c(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12126c)) {
            return false;
        }
        C12126c cVar = (C12126c) obj;
        if (!mo36612f().equals(cVar.mo36612f()) || size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Comparator<K> mo36612f();

    public int hashCode() {
        int hashCode = mo36612f().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    /* renamed from: i */
    public abstract K mo36613i();

    public abstract int indexOf(K k);

    public abstract boolean isEmpty();

    public abstract Iterator<Map.Entry<K, V>> iterator();

    /* renamed from: j */
    public abstract K mo36617j();

    /* renamed from: k */
    public abstract C12126c<K, V> mo36618k(K k, V v);

    /* renamed from: l */
    public abstract Iterator<Map.Entry<K, V>> mo36619l(K k);

    /* renamed from: o */
    public abstract C12126c<K, V> mo36620o(K k);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
