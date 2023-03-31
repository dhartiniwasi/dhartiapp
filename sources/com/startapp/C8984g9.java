package com.startapp;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.startapp.g9 */
/* compiled from: Sta */
public class C8984g9 implements ExecutorService {

    /* renamed from: a */
    private final ExecutorService f36858a;

    public C8984g9(ExecutorService executorService) {
        this.f36858a = executorService;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36858a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f36858a.execute(new C9006h9(runnable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f36858a.invokeAll(C8952f9.m48583a(collection));
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f36858a.invokeAny(C8952f9.m48583a(collection));
    }

    public boolean isShutdown() {
        return this.f36858a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f36858a.isTerminated();
    }

    public void shutdown() {
        this.f36858a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f36858a.shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f36858a.submit(new C8952f9(callable));
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36858a.invokeAll(C8952f9.m48583a(collection), j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f36858a.invokeAny(C8952f9.m48583a(collection), j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f36858a.submit(new C9006h9(runnable), t);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f36858a.submit(new C9006h9(runnable));
    }
}
