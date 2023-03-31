package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cf3 extends ef3 {
    /* renamed from: a */
    public static bf3 m10903a(Iterable iterable) {
        return new bf3(false, ua3.m21505t(iterable), (ze3) null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static bf3 m10904b(lf3... lf3Arr) {
        return new bf3(false, ua3.m21507v(lf3Arr), (ze3) null);
    }

    /* renamed from: c */
    public static bf3 m10905c(Iterable iterable) {
        return new bf3(true, ua3.m21505t(iterable), (ze3) null);
    }

    @SafeVarargs
    /* renamed from: d */
    public static bf3 m10906d(lf3... lf3Arr) {
        return new bf3(true, ua3.m21507v(lf3Arr), (ze3) null);
    }

    /* renamed from: e */
    public static lf3 m10907e(Iterable iterable) {
        return new je3(ua3.m21505t(iterable), true);
    }

    /* renamed from: f */
    public static lf3 m10908f(lf3 lf3, Class cls, q73 q73, Executor executor) {
        dd3 dd3 = new dd3(lf3, cls, q73);
        lf3.mo10135j(dd3, sf3.m20350c(executor, dd3));
        return dd3;
    }

    /* renamed from: g */
    public static lf3 m10909g(lf3 lf3, Class cls, ie3 ie3, Executor executor) {
        cd3 cd3 = new cd3(lf3, cls, ie3);
        lf3.mo10135j(cd3, sf3.m20350c(executor, cd3));
        return cd3;
    }

    /* renamed from: h */
    public static lf3 m10910h(Throwable th) {
        Objects.requireNonNull(th);
        return new ff3(th);
    }

    /* renamed from: i */
    public static lf3 m10911i(Object obj) {
        if (obj == null) {
            return gf3.f9893b;
        }
        return new gf3(obj);
    }

    /* renamed from: j */
    public static lf3 m10912j() {
        return gf3.f9893b;
    }

    /* renamed from: k */
    public static lf3 m10913k(Callable callable, Executor executor) {
        dg3 dg3 = new dg3(callable);
        executor.execute(dg3);
        return dg3;
    }

    /* renamed from: l */
    public static lf3 m10914l(he3 he3, Executor executor) {
        dg3 dg3 = new dg3(he3);
        executor.execute(dg3);
        return dg3;
    }

    /* renamed from: m */
    public static lf3 m10915m(lf3 lf3, q73 q73, Executor executor) {
        int i = yd3.f20563r;
        Objects.requireNonNull(q73);
        xd3 xd3 = new xd3(lf3, q73);
        lf3.mo10135j(xd3, sf3.m20350c(executor, xd3));
        return xd3;
    }

    /* renamed from: n */
    public static lf3 m10916n(lf3 lf3, ie3 ie3, Executor executor) {
        int i = yd3.f20563r;
        Objects.requireNonNull(executor);
        wd3 wd3 = new wd3(lf3, ie3);
        lf3.mo10135j(wd3, sf3.m20350c(executor, wd3));
        return wd3;
    }

    /* renamed from: o */
    public static lf3 m10917o(lf3 lf3, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (lf3.isDone()) {
            return lf3;
        }
        return ag3.m9711F(lf3, j, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static Object m10918p(Future future) throws ExecutionException {
        if (future.isDone()) {
            return fg3.m12604a(future);
        }
        throw new IllegalStateException(r83.m19613b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static Object m10919q(Future future) {
        try {
            return fg3.m12604a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new qe3((Error) cause);
            }
            throw new eg3(cause);
        }
    }

    /* renamed from: r */
    public static void m10920r(lf3 lf3, ye3 ye3, Executor executor) {
        Objects.requireNonNull(ye3);
        lf3.mo10135j(new af3(lf3, ye3), executor);
    }
}
