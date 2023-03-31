package p205ce;

import p272jd.C11570g;
import p344rd.C12443p;

/* renamed from: ce.a */
/* compiled from: SafeCollector.kt */
public final class C6858a implements C11570g {

    /* renamed from: a */
    public final Throwable f31526a;

    /* renamed from: b */
    private final /* synthetic */ C11570g f31527b;

    public C6858a(Throwable th, C11570g gVar) {
        this.f31526a = th;
        this.f31527b = gVar;
    }

    public <R> R fold(R r, C12443p<? super R, ? super C11570g.C11573b, ? extends R> pVar) {
        return this.f31527b.fold(r, pVar);
    }

    public <E extends C11570g.C11573b> E get(C11570g.C11575c<E> cVar) {
        return this.f31527b.get(cVar);
    }

    public C11570g minusKey(C11570g.C11575c<?> cVar) {
        return this.f31527b.minusKey(cVar);
    }

    public C11570g plus(C11570g gVar) {
        return this.f31527b.plus(gVar);
    }
}
