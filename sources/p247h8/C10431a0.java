package p247h8;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* renamed from: h8.a0 */
/* compiled from: ThrottledForwardingExecutor */
class C10431a0 implements Executor {

    /* renamed from: a */
    private final Executor f41369a;

    /* renamed from: b */
    private final Semaphore f41370b;

    C10431a0(int i, Executor executor) {
        this.f41370b = new Semaphore(i);
        this.f41369a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m52644c(Runnable runnable) {
        runnable.run();
        this.f41370b.release();
    }

    public void execute(Runnable runnable) {
        if (this.f41370b.tryAcquire()) {
            try {
                this.f41369a.execute(new C10474z(this, runnable));
            } catch (RejectedExecutionException unused) {
                runnable.run();
            }
        } else {
            runnable.run();
        }
    }
}
