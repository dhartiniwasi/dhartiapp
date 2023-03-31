package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.C0823a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* compiled from: RequestExecutor */
class C0799h {

    /* renamed from: androidx.core.provider.h$a */
    /* compiled from: RequestExecutor */
    private static class C0800a implements ThreadFactory {

        /* renamed from: a */
        private String f2384a;

        /* renamed from: b */
        private int f2385b;

        /* renamed from: androidx.core.provider.h$a$a */
        /* compiled from: RequestExecutor */
        private static class C0801a extends Thread {

            /* renamed from: a */
            private final int f2386a;

            C0801a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f2386a = i;
            }

            public void run() {
                Process.setThreadPriority(this.f2386a);
                super.run();
            }
        }

        C0800a(String str, int i) {
            this.f2384a = str;
            this.f2385b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C0801a(runnable, this.f2384a, this.f2385b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    /* compiled from: RequestExecutor */
    private static class C0802b<T> implements Runnable {

        /* renamed from: a */
        private Callable<T> f2387a;

        /* renamed from: b */
        private C0823a<T> f2388b;

        /* renamed from: c */
        private Handler f2389c;

        /* renamed from: androidx.core.provider.h$b$a */
        /* compiled from: RequestExecutor */
        class C0803a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0823a f2390a;

            /* renamed from: b */
            final /* synthetic */ Object f2391b;

            C0803a(C0823a aVar, Object obj) {
                this.f2390a = aVar;
                this.f2391b = obj;
            }

            public void run() {
                this.f2390a.accept(this.f2391b);
            }
        }

        C0802b(Handler handler, Callable<T> callable, C0823a<T> aVar) {
            this.f2387a = callable;
            this.f2388b = aVar;
            this.f2389c = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f2387a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f2389c.post(new C0803a(this.f2388b, t));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m3585a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0800a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m3586b(Executor executor, Callable<T> callable, C0823a<T> aVar) {
        executor.execute(new C0802b(C0784b.m3544a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m3587c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
