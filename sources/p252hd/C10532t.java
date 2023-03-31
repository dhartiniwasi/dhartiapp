package p252hd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C11664f;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.t */
/* compiled from: Collections.kt */
public final class C10532t implements List, Serializable, RandomAccess {

    /* renamed from: a */
    public static final C10532t f41552a = new C10532t();

    private C10532t() {
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo33666b(Void voidR) {
        C11669k.m56787e(voidR, "element");
        return false;
    }

    /* renamed from: c */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo33666b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C11669k.m56787e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* renamed from: f */
    public int mo33672f() {
        return 0;
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public int mo33675i(Void voidR) {
        C11669k.m56787e(voidR, "element");
        return -1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo33675i((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C10531s.f41551a;
    }

    /* renamed from: j */
    public int mo33679j(Void voidR) {
        C11669k.m56787e(voidR, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo33679j((Void) obj);
    }

    public ListIterator listIterator() {
        return C10531s.f41551a;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo33672f();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C10531s.f41551a;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }
}
