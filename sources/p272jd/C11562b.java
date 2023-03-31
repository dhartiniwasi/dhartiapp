package p272jd;

import kotlin.jvm.internal.C11669k;
import p272jd.C11570g;
import p272jd.C11570g.C11573b;
import p344rd.C12439l;

/* renamed from: jd.b */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C11562b<B extends C11570g.C11573b, E extends B> implements C11570g.C11575c<E> {

    /* renamed from: a */
    private final C12439l<C11570g.C11573b, E> f44041a;

    /* renamed from: b */
    private final C11570g.C11575c<?> f44042b;

    public C11562b(C11570g.C11575c<B> cVar, C12439l<? super C11570g.C11573b, ? extends E> lVar) {
        C11669k.m56787e(cVar, "baseKey");
        C11669k.m56787e(lVar, "safeCast");
        this.f44041a = lVar;
        this.f44042b = cVar instanceof C11562b ? ((C11562b) cVar).f44042b : cVar;
    }

    /* renamed from: a */
    public final boolean mo35663a(C11570g.C11575c<?> cVar) {
        C11669k.m56787e(cVar, "key");
        return cVar == this || this.f44042b == cVar;
    }

    /* renamed from: b */
    public final E mo35664b(C11570g.C11573b bVar) {
        C11669k.m56787e(bVar, "element");
        return (C11570g.C11573b) this.f44041a.invoke(bVar);
    }
}
