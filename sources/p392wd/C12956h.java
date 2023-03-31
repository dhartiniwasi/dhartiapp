package p392wd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* renamed from: wd.h */
/* compiled from: _Sequences.kt */
class C12956h extends C12955g {

    /* renamed from: wd.h$a */
    /* compiled from: Iterables.kt */
    public static final class C12957a implements Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ C12949b f47200a;

        public C12957a(C12949b bVar) {
            this.f47200a = bVar;
        }

        public Iterator<T> iterator() {
            return this.f47200a.iterator();
        }
    }

    /* renamed from: c */
    public static <T> Iterable<T> m61141c(C12949b<? extends T> bVar) {
        C11669k.m56787e(bVar, "<this>");
        return new C12957a(bVar);
    }

    /* renamed from: d */
    public static <T, R> C12949b<R> m61142d(C12949b<? extends T> bVar, C12439l<? super T, ? extends R> lVar) {
        C11669k.m56787e(bVar, "<this>");
        C11669k.m56787e(lVar, "transform");
        return new C12958i(bVar, lVar);
    }

    /* renamed from: e */
    public static final <T, C extends Collection<? super T>> C m61143e(C12949b<? extends T> bVar, C c) {
        C11669k.m56787e(bVar, "<this>");
        C11669k.m56787e(c, "destination");
        for (Object add : bVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: f */
    public static <T> List<T> m61144f(C12949b<? extends T> bVar) {
        C11669k.m56787e(bVar, "<this>");
        return C10522j.m52971g(m61145g(bVar));
    }

    /* renamed from: g */
    public static final <T> List<T> m61145g(C12949b<? extends T> bVar) {
        C11669k.m56787e(bVar, "<this>");
        return (List) m61143e(bVar, new ArrayList());
    }
}
