package p357t8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: t8.b */
/* compiled from: PoolableExecutors */
public class C12549b {

    /* renamed from: a */
    private static final C12548a f46050a;

    /* renamed from: b */
    private static volatile C12548a f46051b;

    /* renamed from: t8.b$b */
    /* compiled from: PoolableExecutors */
    private static class C12551b implements C12548a {
        private C12551b() {
        }

        /* renamed from: a */
        public ExecutorService mo37373a(ThreadFactory threadFactory, C12552c cVar) {
            return mo37374b(1, threadFactory, cVar);
        }

        /* renamed from: b */
        public ExecutorService mo37374b(int i, ThreadFactory threadFactory, C12552c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C12551b bVar = new C12551b();
        f46050a = bVar;
        f46051b = bVar;
    }

    /* renamed from: a */
    public static C12548a m59745a() {
        return f46051b;
    }
}
