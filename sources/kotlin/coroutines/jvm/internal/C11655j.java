package kotlin.coroutines.jvm.internal;

import p272jd.C11565d;
import p272jd.C11570g;
import p272jd.C11576h;

/* renamed from: kotlin.coroutines.jvm.internal.j */
/* compiled from: ContinuationImpl.kt */
public abstract class C11655j extends C11645a {
    public C11655j(C11565d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C11576h.f44049a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C11570g getContext() {
        return C11576h.f44049a;
    }
}
