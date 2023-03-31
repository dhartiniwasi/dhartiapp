package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mx2 implements b44 {

    /* renamed from: a */
    private final o44 f13710a;

    /* renamed from: b */
    private final o44 f13711b;

    /* renamed from: c */
    private final o44 f13712c;

    public mx2(o44 o44, o44 o442, o44 o443) {
        this.f13710a = o44;
        this.f13711b = o442;
        this.f13712c = o443;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new kx2(mf3, (ScheduledExecutorService) this.f13711b.mo8155d(), ((nx2) this.f13712c).mo8155d());
    }
}
