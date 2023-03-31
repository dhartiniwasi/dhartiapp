package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.C11669k;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;

/* renamed from: kotlin.coroutines.jvm.internal.a */
/* compiled from: ContinuationImpl.kt */
public abstract class C11645a implements C11565d<Object>, C11649e, Serializable {
    private final C11565d<Object> completion;

    public C11645a(C11565d<Object> dVar) {
        this.completion = dVar;
    }

    public C11565d<C10349s> create(C11565d<?> dVar) {
        C11669k.m56787e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C11649e getCallerFrame() {
        C11565d<Object> dVar = this.completion;
        if (dVar instanceof C11649e) {
            return (C11649e) dVar;
        }
        return null;
    }

    public final C11565d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C11651g.m56768d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C11565d dVar = this;
        while (true) {
            C11652h.m56770b(dVar);
            C11645a aVar = (C11645a) dVar;
            C11565d dVar2 = aVar.completion;
            C11669k.m56784b(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C11632d.m56711c()) {
                    C10341m.C10342a aVar2 = C10341m.f40958a;
                    obj = C10341m.m52240a(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof C11645a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C10341m.C10342a aVar3 = C10341m.f40958a;
                obj = C10341m.m52240a(C10344n.m52244a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C11565d<C10349s> create(Object obj, C11565d<?> dVar) {
        C11669k.m56787e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
