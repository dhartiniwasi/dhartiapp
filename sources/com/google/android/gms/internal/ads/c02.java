package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c02 implements b44 {

    /* renamed from: a */
    private final o44 f7543a;

    /* renamed from: b */
    private final o44 f7544b;

    /* renamed from: c */
    private final o44 f7545c;

    /* renamed from: d */
    private final o44 f7546d;

    public c02(o44 o44, o44 o442, o44 o443, o44 o444) {
        this.f7543a = o44;
        this.f7544b = o442;
        this.f7545c = o443;
        this.f7546d = o444;
    }

    /* renamed from: a */
    public final b02 mo8155d() {
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new b02((ScheduledExecutorService) this.f7543a.mo8155d(), mf3, ((t02) this.f7545c).mo8155d(), a44.m9577a(this.f7546d));
    }
}
