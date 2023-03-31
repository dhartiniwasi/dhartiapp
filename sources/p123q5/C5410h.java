package p123q5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: q5.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C5410h implements C5408f {
    /* synthetic */ C5410h(C5409g gVar) {
    }

    /* renamed from: a */
    public final ExecutorService mo19534a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo19535b(ThreadFactory threadFactory, int i) {
        return mo19534a(1, threadFactory, 1);
    }
}
