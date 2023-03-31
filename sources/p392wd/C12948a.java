package p392wd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C11669k;

/* renamed from: wd.a */
/* compiled from: SequencesJVM.kt */
public final class C12948a<T> implements C12949b<T> {

    /* renamed from: a */
    private final AtomicReference<C12949b<T>> f47198a;

    public C12948a(C12949b<? extends T> bVar) {
        C11669k.m56787e(bVar, "sequence");
        this.f47198a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        C12949b andSet = this.f47198a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
