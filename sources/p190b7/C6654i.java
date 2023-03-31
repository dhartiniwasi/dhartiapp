package p190b7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p182a7.C6431n;
import p182a7.C6432o;

/* renamed from: b7.i */
/* compiled from: Collections2 */
public final class C6654i {

    /* renamed from: b7.i$a */
    /* compiled from: Collections2 */
    static class C6655a<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f31133a;

        /* renamed from: b */
        final C6432o<? super E> f31134b;

        C6655a(Collection<E> collection, C6432o<? super E> oVar) {
            this.f31133a = collection;
            this.f31134b = oVar;
        }

        public boolean add(E e) {
            C6431n.m37551d(this.f31134b.apply(e));
            return this.f31133a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                C6431n.m37551d(this.f31134b.apply(apply));
            }
            return this.f31133a.addAll(collection);
        }

        public void clear() {
            C6696t.m38509f(this.f31133a, this.f31134b);
        }

        public boolean contains(Object obj) {
            if (C6654i.m38343c(this.f31133a, obj)) {
                return this.f31134b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return C6654i.m38341a(this, collection);
        }

        public boolean isEmpty() {
            return !C6696t.m38504a(this.f31133a, this.f31134b);
        }

        public Iterator<E> iterator() {
            return C6698u.m38518g(this.f31133a.iterator(), this.f31134b);
        }

        public boolean remove(Object obj) {
            return contains(obj) && this.f31133a.remove(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f31133a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f31134b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f31133a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f31134b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            int i = 0;
            for (E apply : this.f31133a) {
                if (this.f31134b.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public Object[] toArray() {
            return C6703w.m38538i(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return C6703w.m38538i(iterator()).toArray(tArr);
        }
    }

    /* renamed from: a */
    static boolean m38341a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static StringBuilder m38342b(int i) {
        C6652h.m38335b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: c */
    static boolean m38343c(Collection<?> collection, Object obj) {
        C6431n.m37561n(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
