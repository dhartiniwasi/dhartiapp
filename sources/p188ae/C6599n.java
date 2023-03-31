package p188ae;

import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11690e0;
import p243gd.C10349s;
import p344rd.C12439l;

/* renamed from: ae.n */
/* compiled from: LinkedListChannel.kt */
public class C6599n<E> extends C6576a<E> {
    public C6599n(C12439l<? super E, C10349s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo22214i(E e) {
        C6602q<?> k;
        do {
            Object i = super.mo22214i(e);
            C11690e0 e0Var = C6581b.f31033b;
            if (i == e0Var) {
                return e0Var;
            }
            if (i == C6581b.f31034c) {
                k = mo22216k(e);
                if (k == null) {
                    return e0Var;
                }
            } else if (i instanceof C6595j) {
                return i;
            } else {
                throw new IllegalStateException(C11669k.m56792j("Invalid offerInternal result ", i).toString());
            }
        } while (!(k instanceof C6595j));
        return k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo22192r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo22193s() {
        return true;
    }
}
