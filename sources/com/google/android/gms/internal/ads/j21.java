package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j21 implements C2672ns {

    /* renamed from: a */
    private final ScheduledExecutorService f11180a;

    /* renamed from: b */
    private final C4691e f11181b;

    /* renamed from: c */
    private ScheduledFuture f11182c;

    /* renamed from: d */
    private long f11183d = -1;

    /* renamed from: e */
    private long f11184e = -1;

    /* renamed from: f */
    private Runnable f11185f = null;

    /* renamed from: g */
    private boolean f11186g = false;

    public j21(ScheduledExecutorService scheduledExecutorService, C4691e eVar) {
        this.f11180a = scheduledExecutorService;
        this.f11181b = eVar;
        C4409t.m29312d().mo13029c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11302a() {
        if (!this.f11186g) {
            ScheduledFuture scheduledFuture = this.f11182c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f11184e = -1;
            } else {
                this.f11182c.cancel(true);
                this.f11184e = this.f11183d - this.f11181b.mo18371b();
            }
            this.f11186g = true;
        }
    }

    /* renamed from: b */
    public final void mo9213b(boolean z) {
        if (z) {
            mo11303c();
        } else {
            mo11302a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo11303c() {
        ScheduledFuture scheduledFuture;
        if (this.f11186g) {
            if (this.f11184e > 0 && (scheduledFuture = this.f11182c) != null && scheduledFuture.isCancelled()) {
                this.f11182c = this.f11180a.schedule(this.f11185f, this.f11184e, TimeUnit.MILLISECONDS);
            }
            this.f11186g = false;
        }
    }

    /* renamed from: d */
    public final synchronized void mo11304d(int i, Runnable runnable) {
        this.f11185f = runnable;
        long j = (long) i;
        this.f11183d = this.f11181b.mo18371b() + j;
        this.f11182c = this.f11180a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
