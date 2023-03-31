package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h02 implements b44 {

    /* renamed from: a */
    private final o44 f10139a;

    /* renamed from: b */
    private final o44 f10140b;

    /* renamed from: c */
    private final o44 f10141c;

    /* renamed from: d */
    private final o44 f10142d;

    /* renamed from: e */
    private final o44 f10143e;

    /* renamed from: f */
    private final o44 f10144f;

    /* renamed from: g */
    private final o44 f10145g;

    public h02(o44 o44, o44 o442, o44 o443, o44 o444, o44 o445, o44 o446, o44 o447) {
        this.f10139a = o44;
        this.f10140b = o442;
        this.f10141c = o443;
        this.f10142d = o444;
        this.f10143e = o445;
        this.f10144f = o446;
        this.f10145g = o447;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Context a = ((yu0) this.f10139a).mo15509a();
        et2 a2 = ((m91) this.f10140b).mo12295a();
        gz1 a3 = ((hz1) this.f10141c).mo8155d();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new g02(a, a2, a3, mf3, (ScheduledExecutorService) this.f10143e.mo8155d(), (n32) this.f10144f.mo8155d(), (yy2) this.f10145g.mo8155d());
    }
}
