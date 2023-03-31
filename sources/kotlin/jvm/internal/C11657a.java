package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.a */
/* compiled from: ArrayIterator.kt */
final class C11657a<T> implements Iterator<T> {

    /* renamed from: a */
    private final T[] f44227a;

    /* renamed from: b */
    private int f44228b;

    public C11657a(T[] tArr) {
        C11669k.m56787e(tArr, "array");
        this.f44227a = tArr;
    }

    public boolean hasNext() {
        return this.f44228b < this.f44227a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f44227a;
            int i = this.f44228b;
            this.f44228b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f44228b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
