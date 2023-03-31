package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class in0 implements lf3 {

    /* renamed from: a */
    private final uf3 f10874a = uf3.m21609D();

    /* renamed from: a */
    private static final boolean m14431a(boolean z) {
        if (!z) {
            C4409t.m29325q().mo15125s(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public boolean cancel(boolean z) {
        return this.f10874a.cancel(z);
    }

    /* renamed from: d */
    public final boolean mo11172d(Object obj) {
        boolean g = this.f10874a.mo9805g(obj);
        m14431a(g);
        return g;
    }

    /* renamed from: e */
    public final boolean mo11173e(Throwable th) {
        boolean h = this.f10874a.mo9806h(th);
        m14431a(h);
        return h;
    }

    public final Object get() throws ExecutionException, InterruptedException {
        return this.f10874a.get();
    }

    public final boolean isCancelled() {
        return this.f10874a.isCancelled();
    }

    public final boolean isDone() {
        return this.f10874a.isDone();
    }

    /* renamed from: j */
    public final void mo10135j(Runnable runnable, Executor executor) {
        this.f10874a.mo10135j(runnable, executor);
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f10874a.get(j, timeUnit);
    }
}
