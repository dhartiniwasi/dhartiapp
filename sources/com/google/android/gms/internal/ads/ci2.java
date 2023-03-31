package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ci2 implements tj2 {

    /* renamed from: a */
    private final tj2 f7759a;

    /* renamed from: b */
    private final long f7760b;

    /* renamed from: c */
    private final ScheduledExecutorService f7761c;

    public ci2(tj2 tj2, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f7759a = tj2;
        this.f7760b = j;
        this.f7761c = scheduledExecutorService;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        lf3 d = this.f7759a.mo8340d();
        long j = this.f7760b;
        if (j > 0) {
            d = cf3.m10917o(d, j, TimeUnit.MILLISECONDS, this.f7761c);
        }
        return cf3.m10909g(d, Throwable.class, bi2.f7279a, dn0.f8330f);
    }

    public final int zza() {
        return this.f7759a.zza();
    }
}
