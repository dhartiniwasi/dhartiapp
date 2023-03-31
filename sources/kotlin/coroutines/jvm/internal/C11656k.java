package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C11666h;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11677s;
import p272jd.C11565d;

/* renamed from: kotlin.coroutines.jvm.internal.k */
/* compiled from: ContinuationImpl.kt */
public abstract class C11656k extends C11648d implements C11666h<Object> {
    private final int arity;

    public C11656k(int i, C11565d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String e = C11677s.m56804e(this);
        C11669k.m56786d(e, "renderLambdaToString(this)");
        return e;
    }

    public C11656k(int i) {
        this(i, (C11565d<Object>) null);
    }
}
