package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x62 implements d52 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final o41 f20006a;

    /* renamed from: b */
    private final e62 f20007b;

    /* renamed from: c */
    private final mf3 f20008c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final y91 f20009d;

    /* renamed from: e */
    private final ScheduledExecutorService f20010e;

    public x62(o41 o41, e62 e62, y91 y91, ScheduledExecutorService scheduledExecutorService, mf3 mf3) {
        this.f20006a = o41;
        this.f20007b = e62;
        this.f20009d = y91;
        this.f20010e = scheduledExecutorService;
        this.f20008c = mf3;
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        return us2.f18722a.f17091a.mo10012a() != null && this.f20007b.mo9436a(us2, is2);
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        return this.f20008c.mo12324a(new u62(this, us2, is2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ r31 mo15054c(us2 us2, is2 is2) throws Exception {
        return this.f20006a.mo8571b(new k61(us2, is2, (String) null), new c51(us2.f18722a.f17091a.mo10012a(), new v62(this, us2, is2))).zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo15055f(us2 us2, is2 is2) {
        cf3.m10920r(cf3.m10917o(this.f20007b.mo9437b(us2, is2), (long) is2.f10960S, TimeUnit.SECONDS, this.f20010e), new w62(this), this.f20008c);
    }
}
