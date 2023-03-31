package p190b7;

import java.util.NoSuchElementException;
import p182a7.C6431n;

/* renamed from: b7.a */
/* compiled from: AbstractIndexedListIterator */
abstract class C6613a<E> extends C6697t0<E> {

    /* renamed from: a */
    private final int f31079a;

    /* renamed from: b */
    private int f31080b;

    protected C6613a(int i, int i2) {
        C6431n.m37564q(i2, i);
        this.f31079a = i;
        this.f31080b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo22244a(int i);

    public final boolean hasNext() {
        return this.f31080b < this.f31079a;
    }

    public final boolean hasPrevious() {
        return this.f31080b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f31080b;
            this.f31080b = i + 1;
            return mo22244a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f31080b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f31080b - 1;
            this.f31080b = i;
            return mo22244a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f31080b - 1;
    }
}
