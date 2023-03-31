package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sf3 {
    /* renamed from: a */
    public static mf3 m20348a(ExecutorService executorService) {
        mf3 mf3;
        if (executorService instanceof mf3) {
            return (mf3) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            mf3 = new rf3((ScheduledExecutorService) executorService);
        } else {
            mf3 = new of3(executorService);
        }
        return mf3;
    }

    /* renamed from: b */
    public static Executor m20349b() {
        return pe3.INSTANCE;
    }

    /* renamed from: c */
    static Executor m20350c(Executor executor, fd3 fd3) {
        Objects.requireNonNull(executor);
        if (executor == pe3.INSTANCE) {
            return executor;
        }
        return new nf3(executor, fd3);
    }
}
