package p392wd;

import java.util.Iterator;
import kotlin.jvm.internal.C11669k;

/* renamed from: wd.f */
/* compiled from: Sequences.kt */
class C12953f extends C12952e {

    /* renamed from: wd.f$a */
    /* compiled from: Sequences.kt */
    public static final class C12954a implements C12949b<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f47199a;

        public C12954a(Iterator it) {
            this.f47199a = it;
        }

        public Iterator<T> iterator() {
            return this.f47199a;
        }
    }

    /* renamed from: a */
    public static <T> C12949b<T> m61139a(Iterator<? extends T> it) {
        C11669k.m56787e(it, "<this>");
        return m61140b(new C12954a(it));
    }

    /* renamed from: b */
    public static final <T> C12949b<T> m61140b(C12949b<? extends T> bVar) {
        C11669k.m56787e(bVar, "<this>");
        return bVar instanceof C12948a ? bVar : new C12948a(bVar);
    }
}
