package p272jd;

import kotlin.jvm.internal.C11669k;
import p272jd.C11570g;
import p344rd.C12443p;

/* renamed from: jd.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C11561a implements C11570g.C11573b {
    private final C11570g.C11575c<?> key;

    public C11561a(C11570g.C11575c<?> cVar) {
        C11669k.m56787e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C12443p<? super R, ? super C11570g.C11573b, ? extends R> pVar) {
        return C11570g.C11573b.C11574a.m56508a(this, r, pVar);
    }

    public <E extends C11570g.C11573b> E get(C11570g.C11575c<E> cVar) {
        return C11570g.C11573b.C11574a.m56509b(this, cVar);
    }

    public C11570g.C11575c<?> getKey() {
        return this.key;
    }

    public C11570g minusKey(C11570g.C11575c<?> cVar) {
        return C11570g.C11573b.C11574a.m56510c(this, cVar);
    }

    public C11570g plus(C11570g gVar) {
        return C11570g.C11573b.C11574a.m56511d(this, gVar);
    }
}
