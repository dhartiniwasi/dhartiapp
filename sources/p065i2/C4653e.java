package p065i2;

import p037e2.C4200e0;
import p161w3.C5918a0;
import p177z1.C6249m2;

/* renamed from: i2.e */
/* compiled from: TagPayloadReader */
abstract class C4653e {

    /* renamed from: a */
    protected final C4200e0 f25181a;

    /* renamed from: i2.e$a */
    /* compiled from: TagPayloadReader */
    public static final class C4654a extends C6249m2 {
        public C4654a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected C4653e(C4200e0 e0Var) {
        this.f25181a = e0Var;
    }

    /* renamed from: a */
    public final boolean mo18331a(C5918a0 a0Var, long j) throws C6249m2 {
        return mo18326b(a0Var) && mo18327c(a0Var, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo18326b(C5918a0 a0Var) throws C6249m2;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo18327c(C5918a0 a0Var, long j) throws C6249m2;
}
