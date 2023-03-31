package p144t5;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: t5.f1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5549f1 implements Executor {

    /* renamed from: a */
    private final AtomicInteger f28087a = new AtomicInteger(1);

    /* renamed from: b */
    private final ThreadPoolExecutor f28088b;

    /* renamed from: c */
    private WeakReference<Thread> f28089c = new WeakReference<>((Object) null);

    C5549f1(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C5545e1(this, "Google consent worker"));
        this.f28088b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: b */
    public final /* synthetic */ Thread mo19850b(String str, Runnable runnable) {
        int andIncrement = this.f28087a.getAndIncrement();
        StringBuilder sb = new StringBuilder(34);
        sb.append("Google consent worker #");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        this.f28089c = new WeakReference<>(thread);
        return thread;
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f28089c.get()) {
            runnable.run();
        } else {
            this.f28088b.execute(runnable);
        }
    }
}
