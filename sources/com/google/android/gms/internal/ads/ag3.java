package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ag3 extends re3 {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public lf3 f6556h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ScheduledFuture f6557i;

    private ag3(lf3 lf3) {
        Objects.requireNonNull(lf3);
        this.f6556h = lf3;
    }

    /* renamed from: F */
    static lf3 m9711F(lf3 lf3, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        ag3 ag3 = new ag3(lf3);
        yf3 yf3 = new yf3(ag3);
        ag3.f6557i = scheduledExecutorService.schedule(yf3, j, timeUnit);
        lf3.mo10135j(yf3, pe3.INSTANCE);
        return ag3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo8329e() {
        lf3 lf3 = this.f6556h;
        ScheduledFuture scheduledFuture = this.f6557i;
        if (lf3 == null) {
            return null;
        }
        String str = "inputFuture=[" + lf3 + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8330f() {
        mo10138v(this.f6556h);
        ScheduledFuture scheduledFuture = this.f6557i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f6556h = null;
        this.f6557i = null;
    }
}
