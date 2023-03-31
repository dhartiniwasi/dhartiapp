package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C11669k;
import p272jd.C11565d;
import p272jd.C11566e;
import p272jd.C11570g;

/* renamed from: kotlin.coroutines.jvm.internal.d */
/* compiled from: ContinuationImpl.kt */
public abstract class C11648d extends C11645a {
    private final C11570g _context;
    private transient C11565d<Object> intercepted;

    public C11648d(C11565d<Object> dVar, C11570g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public C11570g getContext() {
        C11570g gVar = this._context;
        C11669k.m56784b(gVar);
        return gVar;
    }

    public final C11565d<Object> intercepted() {
        C11565d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C11566e eVar = (C11566e) getContext().get(C11566e.f44046X);
            if (eVar == null || (dVar = eVar.mo35670w(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C11565d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C11570g.C11573b bVar = getContext().get(C11566e.f44046X);
            C11669k.m56784b(bVar);
            ((C11566e) bVar).mo35669p(dVar);
        }
        this.intercepted = C11647c.f44220a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11648d(C11565d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
