package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class ne3 extends kf3 {

    /* renamed from: c */
    private final Executor f13985c;

    /* renamed from: d */
    final /* synthetic */ oe3 f13986d;

    ne3(oe3 oe3, Executor executor) {
        this.f13986d = oe3;
        Objects.requireNonNull(executor);
        this.f13985c = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8787d(Throwable th) {
        ne3 unused = this.f13986d.f15060x = null;
        if (th instanceof ExecutionException) {
            this.f13986d.mo9806h(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f13986d.cancel(false);
        } else {
            this.f13986d.mo9806h(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8788e(Object obj) {
        ne3 unused = this.f13986d.f15060x = null;
        mo12322h(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo8789f() {
        return this.f13986d.isDone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo12322h(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12601i() {
        try {
            this.f13985c.execute(this);
        } catch (RejectedExecutionException e) {
            this.f13986d.mo9806h(e);
        }
    }
}
