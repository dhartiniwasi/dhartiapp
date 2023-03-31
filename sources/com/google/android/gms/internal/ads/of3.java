package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class of3 extends vd3 {

    /* renamed from: a */
    private final ExecutorService f15068a;

    of3(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f15068a = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f15068a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f15068a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f15068a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f15068a.isTerminated();
    }

    public final void shutdown() {
        this.f15068a.shutdown();
    }

    public final List shutdownNow() {
        return this.f15068a.shutdownNow();
    }

    public final String toString() {
        return super.toString() + "[" + this.f15068a + "]";
    }
}
