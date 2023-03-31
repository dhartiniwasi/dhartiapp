package p272jd;

import kotlin.jvm.internal.C11669k;
import p272jd.C11570g;

/* renamed from: jd.e */
/* compiled from: ContinuationInterceptor.kt */
public interface C11566e extends C11570g.C11573b {

    /* renamed from: X */
    public static final C11568b f44046X = C11568b.f44047a;

    /* renamed from: jd.e$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C11567a {
        /* renamed from: a */
        public static <E extends C11570g.C11573b> E m56503a(C11566e eVar, C11570g.C11575c<E> cVar) {
            C11669k.m56787e(cVar, "key");
            if (cVar instanceof C11562b) {
                C11562b bVar = (C11562b) cVar;
                if (!bVar.mo35663a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo35664b(eVar);
                if (b instanceof C11570g.C11573b) {
                    return b;
                }
                return null;
            } else if (C11566e.f44046X != cVar) {
                return null;
            } else {
                C11669k.m56785c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C11570g m56504b(C11566e eVar, C11570g.C11575c<?> cVar) {
            C11669k.m56787e(cVar, "key");
            if (!(cVar instanceof C11562b)) {
                return C11566e.f44046X == cVar ? C11576h.f44049a : eVar;
            }
            C11562b bVar = (C11562b) cVar;
            return (!bVar.mo35663a(eVar.getKey()) || bVar.mo35664b(eVar) == null) ? eVar : C11576h.f44049a;
        }
    }

    /* renamed from: jd.e$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C11568b implements C11570g.C11575c<C11566e> {

        /* renamed from: a */
        static final /* synthetic */ C11568b f44047a = new C11568b();

        private C11568b() {
        }
    }

    /* renamed from: p */
    void mo35669p(C11565d<?> dVar);

    /* renamed from: w */
    <T> C11565d<T> mo35670w(C11565d<? super T> dVar);
}
