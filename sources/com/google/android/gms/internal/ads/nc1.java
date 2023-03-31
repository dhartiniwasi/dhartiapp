package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nc1 extends kf1 {

    /* renamed from: b */
    private final ScheduledExecutorService f13943b;

    /* renamed from: c */
    private final C4691e f13944c;

    /* renamed from: d */
    private long f13945d = -1;

    /* renamed from: e */
    private long f13946e = -1;

    /* renamed from: f */
    private boolean f13947f = false;

    /* renamed from: g */
    private ScheduledFuture f13948g;

    public nc1(ScheduledExecutorService scheduledExecutorService, C4691e eVar) {
        super(Collections.emptySet());
        this.f13943b = scheduledExecutorService;
        this.f13944c = eVar;
    }

    /* renamed from: q0 */
    private final synchronized void m17013q0(long j) {
        ScheduledFuture scheduledFuture = this.f13948g;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f13948g.cancel(true);
        }
        this.f13945d = this.f13944c.mo18371b() + j;
        this.f13948g = this.f13943b.schedule(new mc1(this, (lc1) null), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public final synchronized void mo12576d() {
        if (!this.f13947f) {
            ScheduledFuture scheduledFuture = this.f13948g;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f13946e = -1;
            } else {
                this.f13948g.cancel(true);
                this.f13946e = this.f13945d - this.f13944c.mo18371b();
            }
            this.f13947f = true;
        }
    }

    /* renamed from: e */
    public final synchronized void mo12577e() {
        if (this.f13947f) {
            if (this.f13946e > 0 && this.f13948g.isCancelled()) {
                m17013q0(this.f13946e);
            }
            this.f13947f = false;
        }
    }

    /* renamed from: p0 */
    public final synchronized void mo12578p0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.f13947f) {
                long j = this.f13946e;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f13946e = millis;
                return;
            }
            long b = this.f13944c.mo18371b();
            long j2 = this.f13945d;
            if (b > j2 || j2 - this.f13944c.mo18371b() > millis) {
                m17013q0(millis);
            }
        }
    }

    public final synchronized void zza() {
        this.f13947f = false;
        m17013q0(0);
    }
}
