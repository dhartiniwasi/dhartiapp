package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ue3 extends la3 implements Future {
    protected ue3() {
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return mo14501k().get();
    }

    public final boolean isCancelled() {
        return mo14501k().isCancelled();
    }

    public final boolean isDone() {
        return mo14501k().isDone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Future mo14501k();

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo14501k().get(j, timeUnit);
    }
}
