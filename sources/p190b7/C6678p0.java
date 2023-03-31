package p190b7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p182a7.C6431n;
import p182a7.C6432o;
import p182a7.C6433p;
import p190b7.C6654i;

/* renamed from: b7.p0 */
/* compiled from: Sets */
public final class C6678p0 {

    /* renamed from: b7.p0$a */
    /* compiled from: Sets */
    class C6679a extends C6684e<E> {

        /* renamed from: a */
        final /* synthetic */ Set f31172a;

        /* renamed from: b */
        final /* synthetic */ Set f31173b;

        /* renamed from: b7.p0$a$a */
        /* compiled from: Sets */
        class C6680a extends C6615b<E> {

            /* renamed from: c */
            final Iterator<E> f31174c;

            C6680a() {
                this.f31174c = C6679a.this.f31172a.iterator();
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public E mo22251a() {
                while (this.f31174c.hasNext()) {
                    E next = this.f31174c.next();
                    if (C6679a.this.f31173b.contains(next)) {
                        return next;
                    }
                }
                return mo22252c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6679a(Set set, Set set2) {
            super((C6676o0) null);
            this.f31172a = set;
            this.f31173b = set2;
        }

        /* renamed from: b */
        public C6695s0<E> iterator() {
            return new C6680a();
        }

        public boolean contains(Object obj) {
            return this.f31172a.contains(obj) && this.f31173b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f31172a.containsAll(collection) && this.f31173b.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f31173b, this.f31172a);
        }

        public int size() {
            int i = 0;
            for (Object contains : this.f31172a) {
                if (this.f31173b.contains(contains)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: b7.p0$b */
    /* compiled from: Sets */
    private static class C6681b<E> extends C6654i.C6655a<E> implements Set<E> {
        C6681b(Set<E> set, C6432o<? super E> oVar) {
            super(set, oVar);
        }

        public boolean equals(Object obj) {
            return C6678p0.m38426a(this, obj);
        }

        public int hashCode() {
            return C6678p0.m38429d(this);
        }
    }

    /* renamed from: b7.p0$c */
    /* compiled from: Sets */
    private static class C6682c<E> extends C6681b<E> implements SortedSet<E> {
        C6682c(SortedSet<E> sortedSet, C6432o<? super E> oVar) {
            super(sortedSet, oVar);
        }

        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f31133a).comparator();
        }

        public E first() {
            return C6698u.m38519h(this.f31133a.iterator(), this.f31134b);
        }

        public SortedSet<E> headSet(E e) {
            return new C6682c(((SortedSet) this.f31133a).headSet(e), this.f31134b);
        }

        public E last() {
            SortedSet sortedSet = (SortedSet) this.f31133a;
            while (true) {
                E last = sortedSet.last();
                if (this.f31134b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet<E> subSet(E e, E e2) {
            return new C6682c(((SortedSet) this.f31133a).subSet(e, e2), this.f31134b);
        }

        public SortedSet<E> tailSet(E e) {
            return new C6682c(((SortedSet) this.f31133a).tailSet(e), this.f31134b);
        }
    }

    /* renamed from: b7.p0$d */
    /* compiled from: Sets */
    static abstract class C6683d<E> extends AbstractSet<E> {
        C6683d() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C6678p0.m38434i(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C6431n.m37561n(collection));
        }
    }

    /* renamed from: b7.p0$e */
    /* compiled from: Sets */
    public static abstract class C6684e<E> extends AbstractSet<E> {
        /* synthetic */ C6684e(C6676o0 o0Var) {
            this();
        }

        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private C6684e() {
        }
    }

    /* renamed from: a */
    static boolean m38426a(Set<?> set, Object obj) {
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

    /* renamed from: b */
    public static <E> Set<E> m38427b(Set<E> set, C6432o<? super E> oVar) {
        if (set instanceof SortedSet) {
            return m38428c((SortedSet) set, oVar);
        }
        if (!(set instanceof C6681b)) {
            return new C6681b((Set) C6431n.m37561n(set), (C6432o) C6431n.m37561n(oVar));
        }
        C6681b bVar = (C6681b) set;
        return new C6681b((Set) bVar.f31133a, C6433p.m37572b(bVar.f31134b, oVar));
    }

    /* renamed from: c */
    public static <E> SortedSet<E> m38428c(SortedSet<E> sortedSet, C6432o<? super E> oVar) {
        if (!(sortedSet instanceof C6681b)) {
            return new C6682c((SortedSet) C6431n.m37561n(sortedSet), (C6432o) C6431n.m37561n(oVar));
        }
        C6681b bVar = (C6681b) sortedSet;
        return new C6682c((SortedSet) bVar.f31133a, C6433p.m37572b(bVar.f31134b, oVar));
    }

    /* renamed from: d */
    static int m38429d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: e */
    public static <E> C6684e<E> m38430e(Set<E> set, Set<?> set2) {
        C6431n.m37562o(set, "set1");
        C6431n.m37562o(set2, "set2");
        return new C6679a(set, set2);
    }

    /* renamed from: f */
    public static <E> HashSet<E> m38431f() {
        return new HashSet<>();
    }

    /* renamed from: g */
    public static <E> HashSet<E> m38432g(int i) {
        return new HashSet<>(C6705y.m38540a(i));
    }

    /* renamed from: h */
    public static <E> Set<E> m38433h() {
        return Collections.newSetFromMap(C6705y.m38544e());
    }

    /* renamed from: i */
    static boolean m38434i(Set<?> set, Collection<?> collection) {
        C6431n.m37561n(collection);
        if (collection instanceof C6644d0) {
            collection = ((C6644d0) collection).mo22409I();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m38435j(set, collection.iterator());
        }
        return C6698u.m38525n(set.iterator(), collection);
    }

    /* renamed from: j */
    static boolean m38435j(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
