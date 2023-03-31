package p320p7;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p320p7.C12126c;

/* renamed from: p7.e */
/* compiled from: ImmutableSortedSet */
public class C12130e<T> implements Iterable<T> {

    /* renamed from: a */
    private final C12126c<T, Void> f45181a;

    /* renamed from: p7.e$a */
    /* compiled from: ImmutableSortedSet */
    private static class C12131a<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Map.Entry<T, Void>> f45182a;

        public C12131a(Iterator<Map.Entry<T, Void>> it) {
            this.f45182a = it;
        }

        public boolean hasNext() {
            return this.f45182a.hasNext();
        }

        public T next() {
            return this.f45182a.next().getKey();
        }

        public void remove() {
            this.f45182a.remove();
        }
    }

    public C12130e(List<T> list, Comparator<T> comparator) {
        this.f45181a = C12126c.C12127a.m58273b(list, Collections.emptyMap(), C12126c.C12127a.m58275d(), comparator);
    }

    /* renamed from: b */
    public T mo36634b() {
        return this.f45181a.mo36613i();
    }

    /* renamed from: c */
    public T mo36635c() {
        return this.f45181a.mo36617j();
    }

    public boolean contains(T t) {
        return this.f45181a.mo36610b(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12130e)) {
            return false;
        }
        return this.f45181a.equals(((C12130e) obj).f45181a);
    }

    /* renamed from: f */
    public C12130e<T> mo36638f(T t) {
        return new C12130e<>(this.f45181a.mo36618k(t, null));
    }

    public int hashCode() {
        return this.f45181a.hashCode();
    }

    /* renamed from: i */
    public Iterator<T> mo36640i(T t) {
        return new C12131a(this.f45181a.mo36619l(t));
    }

    public int indexOf(T t) {
        return this.f45181a.indexOf(t);
    }

    public boolean isEmpty() {
        return this.f45181a.isEmpty();
    }

    public Iterator<T> iterator() {
        return new C12131a(this.f45181a.iterator());
    }

    /* renamed from: j */
    public C12130e<T> mo36644j(T t) {
        C12126c<T, Void> o = this.f45181a.mo36620o(t);
        return o == this.f45181a ? this : new C12130e<>(o);
    }

    /* renamed from: k */
    public C12130e<T> mo36645k(C12130e<T> eVar) {
        C12130e<T> eVar2;
        C12130e<T> eVar3;
        if (size() < eVar.size()) {
            eVar3 = eVar;
            eVar2 = this;
        } else {
            eVar3 = this;
            eVar2 = eVar;
        }
        Iterator it = eVar2.iterator();
        while (it.hasNext()) {
            eVar3 = eVar3.mo36638f(it.next());
        }
        return eVar3;
    }

    public int size() {
        return this.f45181a.size();
    }

    private C12130e(C12126c<T, Void> cVar) {
        this.f45181a = cVar;
    }
}
