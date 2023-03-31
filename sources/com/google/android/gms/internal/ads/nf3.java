package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nf3 implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f14008a;

    /* renamed from: b */
    final /* synthetic */ fd3 f14009b;

    nf3(Executor executor, fd3 fd3) {
        this.f14008a = executor;
        this.f14009b = fd3;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f14008a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f14009b.mo9806h(e);
        }
    }
}
