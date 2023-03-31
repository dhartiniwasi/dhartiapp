package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ja1 extends kf1 implements aa1 {

    /* renamed from: b */
    private final ScheduledExecutorService f11285b;

    /* renamed from: c */
    private ScheduledFuture f11286c;

    /* renamed from: d */
    private boolean f11287d = false;

    public ja1(ia1 ia1, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f11285b = scheduledExecutorService;
        mo11669m0(ia1, executor);
    }

    /* renamed from: T */
    public final void mo11349T() {
        this.f11286c = this.f11285b.schedule(new da1(this), (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14696t8)).intValue(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final synchronized void mo11350a() {
        ScheduledFuture scheduledFuture = this.f11286c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo11351b() {
        synchronized (this) {
            pm0.m18664d("Timeout waiting for show call succeed to be called.");
            mo8288e0(new tj1("Timeout for show call succeed."));
            this.f11287d = true;
        }
    }

    /* renamed from: d */
    public final void mo8287d() {
        mo11671o0(ea1.f8716a);
    }

    /* renamed from: e0 */
    public final void mo8288e0(tj1 tj1) {
        if (!this.f11287d) {
            ScheduledFuture scheduledFuture = this.f11286c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            mo11671o0(new ba1(tj1));
        }
    }

    /* renamed from: g */
    public final void mo8289g(C4623z2 z2Var) {
        mo11671o0(new ca1(z2Var));
    }
}
