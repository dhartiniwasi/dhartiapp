package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ow2 implements lf3 {

    /* renamed from: a */
    private final Object f15384a;

    /* renamed from: b */
    private final String f15385b;

    /* renamed from: c */
    private final lf3 f15386c;

    public ow2(Object obj, String str, lf3 lf3) {
        this.f15384a = obj;
        this.f15385b = str;
        this.f15386c = lf3;
    }

    /* renamed from: a */
    public final Object mo13044a() {
        return this.f15384a;
    }

    /* renamed from: b */
    public final String mo13045b() {
        return this.f15385b;
    }

    public final boolean cancel(boolean z) {
        return this.f15386c.cancel(z);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.f15386c.get();
    }

    public final boolean isCancelled() {
        return this.f15386c.isCancelled();
    }

    public final boolean isDone() {
        return this.f15386c.isDone();
    }

    /* renamed from: j */
    public final void mo10135j(Runnable runnable, Executor executor) {
        this.f15386c.mo10135j(runnable, executor);
    }

    public final String toString() {
        String str = this.f15385b;
        int identityHashCode = System.identityHashCode(this);
        return str + "@" + identityHashCode;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f15386c.get(j, timeUnit);
    }
}
