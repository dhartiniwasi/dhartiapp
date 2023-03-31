package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.l */
/* compiled from: Lambda.kt */
public abstract class C11670l<R> implements C11666h<R>, Serializable {
    private final int arity;

    public C11670l(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String f = C11677s.m56805f(this);
        C11669k.m56786d(f, "renderLambdaToString(this)");
        return f;
    }
}
