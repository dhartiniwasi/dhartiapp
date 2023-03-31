package p272jd;

import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p272jd.C11566e;
import p344rd.C12443p;

/* renamed from: jd.g */
/* compiled from: CoroutineContext.kt */
public interface C11570g {

    /* renamed from: jd.g$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C11571a {

        /* renamed from: jd.g$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C11572a extends C11670l implements C12443p<C11570g, C11573b, C11570g> {

            /* renamed from: a */
            public static final C11572a f44048a = new C11572a();

            C11572a() {
                super(2);
            }

            /* renamed from: a */
            public final C11570g invoke(C11570g gVar, C11573b bVar) {
                C11563c cVar;
                C11669k.m56787e(gVar, "acc");
                C11669k.m56787e(bVar, "element");
                C11570g minusKey = gVar.minusKey(bVar.getKey());
                C11576h hVar = C11576h.f44049a;
                if (minusKey == hVar) {
                    return bVar;
                }
                C11566e.C11568b bVar2 = C11566e.f44046X;
                C11566e eVar = (C11566e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C11563c(minusKey, bVar);
                } else {
                    C11570g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C11563c(bVar, eVar);
                    }
                    cVar = new C11563c(new C11563c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C11570g m56506a(C11570g gVar, C11570g gVar2) {
            C11669k.m56787e(gVar2, "context");
            return gVar2 == C11576h.f44049a ? gVar : (C11570g) gVar2.fold(gVar, C11572a.f44048a);
        }
    }

    /* renamed from: jd.g$b */
    /* compiled from: CoroutineContext.kt */
    public interface C11573b extends C11570g {

        /* renamed from: jd.g$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C11574a {
            /* renamed from: a */
            public static <R> R m56508a(C11573b bVar, R r, C12443p<? super R, ? super C11573b, ? extends R> pVar) {
                C11669k.m56787e(pVar, "operation");
                return pVar.invoke(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C11573b> E m56509b(C11573b bVar, C11575c<E> cVar) {
                C11669k.m56787e(cVar, "key");
                if (!C11669k.m56783a(bVar.getKey(), cVar)) {
                    return null;
                }
                C11669k.m56785c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static C11570g m56510c(C11573b bVar, C11575c<?> cVar) {
                C11669k.m56787e(cVar, "key");
                return C11669k.m56783a(bVar.getKey(), cVar) ? C11576h.f44049a : bVar;
            }

            /* renamed from: d */
            public static C11570g m56511d(C11573b bVar, C11570g gVar) {
                C11669k.m56787e(gVar, "context");
                return C11571a.m56506a(bVar, gVar);
            }
        }

        <E extends C11573b> E get(C11575c<E> cVar);

        C11575c<?> getKey();
    }

    /* renamed from: jd.g$c */
    /* compiled from: CoroutineContext.kt */
    public interface C11575c<E extends C11573b> {
    }

    <R> R fold(R r, C12443p<? super R, ? super C11573b, ? extends R> pVar);

    <E extends C11573b> E get(C11575c<E> cVar);

    C11570g minusKey(C11575c<?> cVar);

    C11570g plus(C11570g gVar);
}
