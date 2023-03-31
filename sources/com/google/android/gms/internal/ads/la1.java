package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class la1 implements b44 {

    /* renamed from: a */
    private final o44 f12709a;

    /* renamed from: b */
    private final o44 f12710b;

    /* renamed from: c */
    private final o44 f12711c;

    /* renamed from: d */
    private final o44 f12712d;

    public la1(o44 o44, o44 o442, o44 o443, o44 o444) {
        this.f12709a = o44;
        this.f12710b = o442;
        this.f12711c = o443;
        this.f12712d = o444;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        ia1 a = ((ka1) this.f12709a).mo8155d();
        Set b = ((m44) this.f12710b).mo8155d();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new ja1(a, b, mf3, (ScheduledExecutorService) this.f12712d.mo8155d());
    }
}
