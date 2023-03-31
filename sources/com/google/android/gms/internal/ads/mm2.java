package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mm2 implements b44 {

    /* renamed from: a */
    private final o44 f13408a;

    /* renamed from: b */
    private final o44 f13409b;

    /* renamed from: c */
    private final o44 f13410c;

    /* renamed from: d */
    private final o44 f13411d;

    /* renamed from: e */
    private final o44 f13412e;

    /* renamed from: f */
    private final o44 f13413f;

    /* renamed from: g */
    private final o44 f13414g;

    public mm2(o44 o44, o44 o442, o44 o443, o44 o444, o44 o445, o44 o446, o44 o447) {
        this.f13408a = o44;
        this.f13409b = o442;
        this.f13410c = o443;
        this.f13411d = o444;
        this.f13412e = o445;
        this.f13413f = o446;
        this.f13414g = o447;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        boolean booleanValue = ((cm2) this.f13409b).mo8155d().booleanValue();
        boolean booleanValue2 = ((dm2) this.f13410c).mo8155d().booleanValue();
        ml0 ml0 = new ml0();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new km2((xl0) this.f13408a.mo8155d(), booleanValue, booleanValue2, ml0, mf3, ((am2) this.f13413f).mo8436a(), (ScheduledExecutorService) this.f13414g.mo8155d(), (byte[]) null);
    }
}
