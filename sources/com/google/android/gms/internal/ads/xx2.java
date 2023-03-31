package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xx2 implements ux2 {

    /* renamed from: a */
    private final ux2 f20386a;

    /* renamed from: b */
    private final Queue f20387b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final int f20388c = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14715v7)).intValue();

    /* renamed from: d */
    private final AtomicBoolean f20389d = new AtomicBoolean(false);

    public xx2(ux2 ux2, ScheduledExecutorService scheduledExecutorService) {
        this.f20386a = ux2;
        long intValue = (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14705u7)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new wx2(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m23601c(xx2 xx2) {
        while (!xx2.f20387b.isEmpty()) {
            xx2.f20386a.mo8622a((tx2) xx2.f20387b.remove());
        }
    }

    /* renamed from: a */
    public final void mo8622a(tx2 tx2) {
        if (this.f20387b.size() < this.f20388c) {
            this.f20387b.offer(tx2);
        } else if (!this.f20389d.getAndSet(true)) {
            Queue queue = this.f20387b;
            tx2 b = tx2.m21328b("dropped_event");
            Map j = tx2.mo14416j();
            if (j.containsKey("action")) {
                b.mo14409a("dropped_action", (String) j.get("action"));
            }
            queue.offer(b);
        }
    }

    /* renamed from: b */
    public final String mo8623b(tx2 tx2) {
        return this.f20386a.mo8623b(tx2);
    }
}
