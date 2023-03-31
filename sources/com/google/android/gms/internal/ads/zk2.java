package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zk2 implements b44 {

    /* renamed from: a */
    private final o44 f21133a;

    /* renamed from: b */
    private final o44 f21134b;

    /* renamed from: c */
    private final o44 f21135c;

    /* renamed from: d */
    private final o44 f21136d;

    /* renamed from: e */
    private final o44 f21137e;

    public zk2(o44 o44, o44 o442, o44 o443, o44 o444, o44 o445) {
        this.f21133a = o44;
        this.f21134b = o442;
        this.f21135c = o443;
        this.f21136d = o444;
        this.f21137e = o445;
    }

    /* renamed from: a */
    public static xk2 m24644a(String str, C3044xt xtVar, xl0 xl0, ScheduledExecutorService scheduledExecutorService, mf3 mf3) {
        return new xk2(str, xtVar, xl0, scheduledExecutorService, mf3, (byte[]) null);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new xk2(((am2) this.f21133a).mo8436a(), new C3044xt(), (xl0) this.f21135c.mo8155d(), (ScheduledExecutorService) this.f21136d.mo8155d(), mf3, (byte[]) null);
    }
}
