package p190b7;

import java.util.Iterator;
import p182a7.C6431n;

/* renamed from: b7.r0 */
/* compiled from: TransformedIterator */
abstract class C6693r0<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f31194a;

    C6693r0(Iterator<? extends F> it) {
        this.f31194a = (Iterator) C6431n.m37561n(it);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo22575a(F f);

    public final boolean hasNext() {
        return this.f31194a.hasNext();
    }

    public final T next() {
        return mo22575a(this.f31194a.next());
    }

    public final void remove() {
        this.f31194a.remove();
    }
}
