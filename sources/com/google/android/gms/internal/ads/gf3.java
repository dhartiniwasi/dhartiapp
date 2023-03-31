package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class gf3 implements lf3 {

    /* renamed from: b */
    static final lf3 f9893b = new gf3((Object) null);

    /* renamed from: c */
    private static final Logger f9894c = Logger.getLogger(gf3.class.getName());

    /* renamed from: a */
    private final Object f9895a;

    gf3(Object obj) {
        this.f9895a = obj;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return this.f9895a;
    }

    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.f9895a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    /* renamed from: j */
    public final void mo10135j(Runnable runnable, Executor executor) {
        b83.m10239c(runnable, "Runnable was null.");
        b83.m10239c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f9894c;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f9895a + "]]";
    }
}
