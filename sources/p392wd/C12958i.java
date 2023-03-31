package p392wd;

import java.util.Iterator;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* renamed from: wd.i */
/* compiled from: Sequences.kt */
public final class C12958i<T, R> implements C12949b<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12949b<T> f47201a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12439l<T, R> f47202b;

    /* renamed from: wd.i$a */
    /* compiled from: Sequences.kt */
    public static final class C12959a implements Iterator<R> {

        /* renamed from: a */
        private final Iterator<T> f47203a;

        /* renamed from: b */
        final /* synthetic */ C12958i<T, R> f47204b;

        C12959a(C12958i<T, R> iVar) {
            this.f47204b = iVar;
            this.f47203a = iVar.f47201a.iterator();
        }

        public boolean hasNext() {
            return this.f47203a.hasNext();
        }

        public R next() {
            return this.f47204b.f47202b.invoke(this.f47203a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12958i(C12949b<? extends T> bVar, C12439l<? super T, ? extends R> lVar) {
        C11669k.m56787e(bVar, "sequence");
        C11669k.m56787e(lVar, "transformer");
        this.f47201a = bVar;
        this.f47202b = lVar;
    }

    public Iterator<R> iterator() {
        return new C12959a(this);
    }
}
