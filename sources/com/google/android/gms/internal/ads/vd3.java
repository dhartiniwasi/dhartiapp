package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class vd3 extends AbstractExecutorService implements mf3 {
    /* renamed from: G */
    public final lf3 mo12323G(Runnable runnable) {
        return (lf3) super.submit(runnable);
    }

    /* renamed from: a */
    public final lf3 mo12324a(Callable callable) {
        return (lf3) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return dg3.m11495E(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (lf3) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new dg3(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (lf3) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (lf3) super.submit(callable);
    }
}
