package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class te3 extends se3 {

    /* renamed from: h */
    private final lf3 f17972h;

    te3(lf3 lf3) {
        Objects.requireNonNull(lf3);
        this.f17972h = lf3;
    }

    public final boolean cancel(boolean z) {
        return this.f17972h.cancel(z);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.f17972h.get();
    }

    public final boolean isCancelled() {
        return this.f17972h.isCancelled();
    }

    public final boolean isDone() {
        return this.f17972h.isDone();
    }

    /* renamed from: j */
    public final void mo10135j(Runnable runnable, Executor executor) {
        this.f17972h.mo10135j(runnable, executor);
    }

    public final String toString() {
        return this.f17972h.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f17972h.get(j, timeUnit);
    }
}
