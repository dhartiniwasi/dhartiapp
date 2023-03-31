package p098n1;

import java.util.concurrent.Executor;
import p126r1.C5431a;

/* renamed from: n1.m */
/* compiled from: SafeLoggingExecutor */
class C5091m implements Executor {

    /* renamed from: a */
    private final Executor f26540a;

    /* renamed from: n1.m$a */
    /* compiled from: SafeLoggingExecutor */
    static class C5092a implements Runnable {

        /* renamed from: a */
        private final Runnable f26541a;

        C5092a(Runnable runnable) {
            this.f26541a = runnable;
        }

        public void run() {
            try {
                this.f26541a.run();
            } catch (Exception e) {
                C5431a.m33269d("Executor", "Background execution failure.", e);
            }
        }
    }

    C5091m(Executor executor) {
        this.f26540a = executor;
    }

    public void execute(Runnable runnable) {
        this.f26540a.execute(new C5092a(runnable));
    }
}
