package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bj2 implements b44 {

    /* renamed from: a */
    private final o44 f7315a;

    /* renamed from: b */
    private final o44 f7316b;

    /* renamed from: c */
    private final o44 f7317c;

    /* renamed from: d */
    private final o44 f7318d;

    /* renamed from: e */
    private final o44 f7319e;

    /* renamed from: f */
    private final o44 f7320f;

    public bj2(o44 o44, o44 o442, o44 o443, o44 o444, o44 o445, o44 o446) {
        this.f7315a = o44;
        this.f7316b = o442;
        this.f7317c = o443;
        this.f7318d = o444;
        this.f7319e = o445;
        this.f7320f = o446;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new zi2(mf3, (ScheduledExecutorService) this.f7316b.mo8155d(), (String) this.f7317c.mo8155d(), (Context) this.f7318d.mo8155d(), ((m91) this.f7319e).mo12295a(), (su0) this.f7320f.mo8155d());
    }
}
