package p252hd;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C11658b;
import kotlin.jvm.internal.C11664f;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.a */
/* compiled from: Collections.kt */
final class C10505a<T> implements Collection<T> {

    /* renamed from: a */
    private final T[] f41549a;

    /* renamed from: b */
    private final boolean f41550b;

    public C10505a(T[] tArr, boolean z) {
        C11669k.m56787e(tArr, "values");
        this.f41549a = tArr;
        this.f41550b = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo33639b() {
        return this.f41549a.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C10515f.m52931g(this.f41549a, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C11669k.m56787e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f41549a.length == 0;
    }

    public Iterator<T> iterator() {
        return C11658b.m56774a(this.f41549a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo33639b();
    }

    public final Object[] toArray() {
        return C10521i.m52965a(this.f41549a, this.f41550b);
    }

    public <T> T[] toArray(T[] tArr) {
        C11669k.m56787e(tArr, "array");
        return C11664f.m56782b(this, tArr);
    }
}
