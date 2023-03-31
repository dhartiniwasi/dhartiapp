package p228f7;

import java.util.concurrent.Executor;

/* renamed from: f7.b */
/* compiled from: DirectExecutor */
enum C10138b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
