package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pf3 extends we3 implements ScheduledFuture {

    /* renamed from: b */
    private final ScheduledFuture f15849b;

    public pf3(lf3 lf3, ScheduledFuture scheduledFuture) {
        super(lf3);
        this.f15849b = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = mo14501k().cancel(z);
        if (cancel) {
            this.f15849b.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15849b.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f15849b.getDelay(timeUnit);
    }
}
