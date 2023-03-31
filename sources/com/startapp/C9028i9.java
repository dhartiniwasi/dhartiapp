package com.startapp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.startapp.i9 */
/* compiled from: Sta */
public class C9028i9 implements ScheduledExecutorService {

    /* renamed from: a */
    private final ScheduledExecutorService f36967a;

    public C9028i9(ScheduledExecutorService scheduledExecutorService) {
        this.f36967a = scheduledExecutorService;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36967a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f36967a.execute(new C9006h9(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f36967a.invokeAll(C8952f9.m48583a(collection));
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f36967a.invokeAny(C8952f9.m48583a(collection));
    }

    public boolean isShutdown() {
        return this.f36967a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f36967a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f36967a.schedule(new C9006h9(runnable), j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f36967a.scheduleAtFixedRate(new C9006h9(runnable), j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f36967a.scheduleWithFixedDelay(new C9006h9(runnable), j, j2, timeUnit);
    }

    public void shutdown() {
        this.f36967a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f36967a.shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f36967a.submit(new C8952f9(callable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36967a.invokeAll(C8952f9.m48583a(collection), j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f36967a.invokeAny(C8952f9.m48583a(collection), j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.f36967a.schedule(new C8952f9(callable), j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f36967a.submit(new C9006h9(runnable), t);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f36967a.submit(new C9006h9(runnable));
    }
}
