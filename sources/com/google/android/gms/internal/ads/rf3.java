package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rf3 extends of3 implements ScheduledExecutorService {

    /* renamed from: b */
    final ScheduledExecutorService f16936b;

    rf3(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f16936b = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        dg3 E = dg3.m11495E(runnable, (Object) null);
        return new pf3(E, this.f16936b.schedule(E, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        qf3 qf3 = new qf3(runnable);
        return new pf3(qf3, this.f16936b.scheduleAtFixedRate(qf3, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        qf3 qf3 = new qf3(runnable);
        return new pf3(qf3, this.f16936b.scheduleWithFixedDelay(qf3, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        dg3 dg3 = new dg3(callable);
        return new pf3(dg3, this.f16936b.schedule(dg3, j, timeUnit));
    }
}
