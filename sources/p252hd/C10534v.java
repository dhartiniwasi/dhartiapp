package p252hd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C11664f;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.v */
/* compiled from: Sets.kt */
public final class C10534v implements Set, Serializable {

    /* renamed from: a */
    public static final C10534v f41554a = new C10534v();

    private C10534v() {
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo33717b(Void voidR) {
        C11669k.m56787e(voidR, "element");
        return false;
    }

    /* renamed from: c */
    public int mo33718c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo33717b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C11669k.m56787e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C10531s.f41551a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo33718c();
    }

    public Object[] toArray() {
        return C11664f.m56781a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C11669k.m56787e(tArr, "array");
        return C11664f.m56782b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
