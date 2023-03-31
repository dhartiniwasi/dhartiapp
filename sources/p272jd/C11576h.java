package p272jd;

import java.io.Serializable;
import kotlin.jvm.internal.C11669k;
import p272jd.C11570g;
import p344rd.C12443p;

/* renamed from: jd.h */
/* compiled from: CoroutineContextImpl.kt */
public final class C11576h implements C11570g, Serializable {

    /* renamed from: a */
    public static final C11576h f44049a = new C11576h();

    private C11576h() {
    }

    public <R> R fold(R r, C12443p<? super R, ? super C11570g.C11573b, ? extends R> pVar) {
        C11669k.m56787e(pVar, "operation");
        return r;
    }

    public <E extends C11570g.C11573b> E get(C11570g.C11575c<E> cVar) {
        C11669k.m56787e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C11570g minusKey(C11570g.C11575c<?> cVar) {
        C11669k.m56787e(cVar, "key");
        return this;
    }

    public C11570g plus(C11570g gVar) {
        C11669k.m56787e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
