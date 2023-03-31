package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j61 {

    /* renamed from: a */
    private final Executor f11252a;

    /* renamed from: b */
    private final ScheduledExecutorService f11253b;

    /* renamed from: c */
    private final lf3 f11254c;

    /* renamed from: d */
    private volatile boolean f11255d = true;

    public j61(Executor executor, ScheduledExecutorService scheduledExecutorService, lf3 lf3) {
        this.f11252a = executor;
        this.f11253b = scheduledExecutorService;
        this.f11254c = lf3;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m14723b(j61 j61, List list, ye3 ye3) {
        if (list == null || list.isEmpty()) {
            j61.f11252a.execute(new d61(ye3));
            return;
        }
        lf3 i = cf3.m10911i((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i = cf3.m10916n(cf3.m10909g(i, Throwable.class, new e61(ye3), j61.f11252a), new f61(j61, ye3, (lf3) it.next()), j61.f11252a);
        }
        cf3.m10920r(i, new i61(j61, ye3), j61.f11252a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lf3 mo11328a(ye3 ye3, lf3 lf3, v51 v51) throws Exception {
        if (v51 != null) {
            ye3.mo8530c(v51);
        }
        return cf3.m10917o(lf3, ((Long) r10.f16776b.mo13438e()).longValue(), TimeUnit.MILLISECONDS, this.f11253b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo11329d() {
        this.f11255d = false;
    }

    /* renamed from: e */
    public final void mo11330e(ye3 ye3) {
        cf3.m10920r(this.f11254c, new h61(this, ye3), this.f11252a);
    }

    /* renamed from: f */
    public final boolean mo11331f() {
        return this.f11255d;
    }
}
