package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class z43 implements x43 {
    /* synthetic */ z43(y43 y43) {
    }

    /* renamed from: a */
    public final ExecutorService mo15051a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo15052b(ThreadFactory threadFactory, int i) {
        return mo15051a(1, threadFactory, 1);
    }

    /* renamed from: g */
    public final ExecutorService mo15053g(int i) {
        return mo15051a(1, Executors.defaultThreadFactory(), 2);
    }
}
