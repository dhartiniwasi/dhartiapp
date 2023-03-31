package com.startapp.networkTest.threads;

import android.os.Build;
import com.startapp.C8984g9;
import com.startapp.C9028i9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ThreadManager {

    /* renamed from: d */
    private static final ThreadManager f37955d = new ThreadManager();

    /* renamed from: a */
    private final ScheduledExecutorService f37956a = new C9028i9(m49064a(1, 60, TimeUnit.SECONDS, true));

    /* renamed from: b */
    private final ExecutorService f37957b;

    /* renamed from: c */
    private final ExecutorService f37958c;

    /* renamed from: com.startapp.networkTest.threads.ThreadManager$a */
    /* compiled from: Sta */
    public class C9177a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f37959a = new AtomicInteger();

        /* renamed from: b */
        public final /* synthetic */ String f37960b;

        public C9177a(String str) {
            this.f37960b = str;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f37960b + "-" + this.f37959a.incrementAndGet());
        }
    }

    /* renamed from: com.startapp.networkTest.threads.ThreadManager$b */
    /* compiled from: Sta */
    public class C9178b implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private ThreadManager() {
        Class<ThreadManager> cls = ThreadManager.class;
        this.f37957b = new C8984g9(m49063a(0, 1, 30, cls.getSimpleName() + "-Single"));
        this.f37958c = new C8984g9(m49063a(0, 4, 30, cls.getSimpleName() + "-Cached"));
    }

    /* renamed from: b */
    public static ThreadManager m49065b() {
        return f37955d;
    }

    /* renamed from: a */
    public ExecutorService mo29768a() {
        return this.f37958c;
    }

    /* renamed from: c */
    public ExecutorService mo29769c() {
        return this.f37957b;
    }

    /* renamed from: d */
    public ScheduledExecutorService mo29770d() {
        return this.f37956a;
    }

    /* renamed from: a */
    private static ExecutorService m49063a(int i, int i2, long j, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                /* renamed from: a */
                public boolean offer(Runnable runnable) {
                    return tryTransfer(runnable);
                }
            }, new C9177a(str), new C9178b());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i2 < 2) {
            return Executors.newSingleThreadExecutor();
        } else {
            return Executors.newCachedThreadPool();
        }
    }

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m49064a(int i, long j, TimeUnit timeUnit, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i);
        scheduledThreadPoolExecutor.setKeepAliveTime(j, timeUnit);
        if (Build.VERSION.SDK_INT >= 9) {
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(z);
        }
        return scheduledThreadPoolExecutor;
    }
}
