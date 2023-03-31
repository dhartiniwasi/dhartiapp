package p410yd;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.internal.C11689e;
import p272jd.C11570g;

/* renamed from: yd.h1 */
/* compiled from: Executors.kt */
public final class C13305h1 extends C13298g1 implements C13344r0 {

    /* renamed from: c */
    private final Executor f47626c;

    public C13305h1(Executor executor) {
        this.f47626c = executor;
        C11689e.m56851a(mo38431Q());
    }

    /* renamed from: L */
    private final void m62214L(C11570g gVar, RejectedExecutionException rejectedExecutionException) {
        C13351t1.m62328c(gVar, C13294f1.m62196a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: H */
    public void mo35925H(C11570g gVar, Runnable runnable) {
        try {
            Executor Q = mo38431Q();
            C13274c.m62170a();
            Q.execute(runnable);
        } catch (RejectedExecutionException e) {
            C13274c.m62170a();
            m62214L(gVar, e);
            C13365x0.m62434b().mo35925H(gVar, runnable);
        }
    }

    /* renamed from: Q */
    public Executor mo38431Q() {
        return this.f47626c;
    }

    public void close() {
        Executor Q = mo38431Q();
        ExecutorService executorService = Q instanceof ExecutorService ? (ExecutorService) Q : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13305h1) && ((C13305h1) obj).mo38431Q() == mo38431Q();
    }

    public int hashCode() {
        return System.identityHashCode(mo38431Q());
    }

    public String toString() {
        return mo38431Q().toString();
    }
}
