package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C7887p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.concurrent.o */
/* compiled from: DelegatingScheduledExecutorService */
class C7886o implements ScheduledExecutorService {

    /* renamed from: a */
    private final ExecutorService f34287a;

    /* renamed from: b */
    private final ScheduledExecutorService f34288b;

    C7886o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f34287a = executorService;
        this.f34288b = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m43614n(Runnable runnable, C7887p.C7889b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.mo26285a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m43615o(Runnable runnable, C7887p.C7889b bVar) {
        this.f34287a.execute(new C7883l(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ ScheduledFuture m43616p(Runnable runnable, long j, TimeUnit timeUnit, C7887p.C7889b bVar) {
        return this.f34288b.schedule(new C7880i(this, runnable, bVar), j, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m43617q(Callable callable, C7887p.C7889b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.mo26285a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Future m43618r(Callable callable, C7887p.C7889b bVar) throws Exception {
        return this.f34287a.submit(new C7875d(callable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ ScheduledFuture m43619s(Callable callable, long j, TimeUnit timeUnit, C7887p.C7889b bVar) {
        return this.f34288b.schedule(new C7876e(this, callable, bVar), j, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m43620t(Runnable runnable, C7887p.C7889b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo26285a(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m43621u(Runnable runnable, C7887p.C7889b bVar) {
        this.f34287a.execute(new C7884m(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ ScheduledFuture m43622v(Runnable runnable, long j, long j2, TimeUnit timeUnit, C7887p.C7889b bVar) {
        return this.f34288b.scheduleAtFixedRate(new C7881j(this, runnable, bVar), j, j2, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m43623w(Runnable runnable, C7887p.C7889b bVar) {
        this.f34287a.execute(new C7885n(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ ScheduledFuture m43624x(Runnable runnable, long j, long j2, TimeUnit timeUnit, C7887p.C7889b bVar) {
        return this.f34288b.scheduleWithFixedDelay(new C7882k(this, runnable, bVar), j, j2, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ void m43625y(Runnable runnable, C7887p.C7889b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo26285a(e);
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f34287a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f34287a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f34287a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f34287a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f34287a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f34287a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new C7887p(new C7878g(this, runnable, j, timeUnit));
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new C7887p(new C7874c(this, runnable, j, j2, timeUnit));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new C7887p(new C7877f(this, runnable, j, j2, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f34287a.submit(callable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f34287a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f34287a.invokeAny(collection, j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return new C7887p(new C7879h(this, callable, j, timeUnit));
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f34287a.submit(runnable, t);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f34287a.submit(runnable);
    }
}
