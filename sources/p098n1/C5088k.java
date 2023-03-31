package p098n1;

import java.util.concurrent.Executor;
import p112p1.C5259b;
import p112p1.C5261d;

/* renamed from: n1.k */
/* compiled from: ExecutionModule_ExecutorFactory */
public final class C5088k implements C5259b<Executor> {

    /* renamed from: n1.k$a */
    /* compiled from: ExecutionModule_ExecutorFactory */
    private static final class C5089a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C5088k f26538a = new C5088k();
    }

    /* renamed from: a */
    public static C5088k m31870a() {
        return C5089a.f26538a;
    }

    /* renamed from: b */
    public static Executor m31871b() {
        return (Executor) C5261d.m32478c(C5087j.m31869a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m31871b();
    }
}
