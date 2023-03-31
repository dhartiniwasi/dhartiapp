package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lx1 implements b44 {

    /* renamed from: a */
    private final o44 f13096a;

    /* renamed from: b */
    private final o44 f13097b;

    /* renamed from: c */
    private final o44 f13098c;

    /* renamed from: d */
    private final o44 f13099d;

    /* renamed from: e */
    private final o44 f13100e;

    /* renamed from: f */
    private final o44 f13101f;

    /* renamed from: g */
    private final o44 f13102g;

    /* renamed from: h */
    private final o44 f13103h;

    /* renamed from: i */
    private final o44 f13104i;

    /* renamed from: j */
    private final o44 f13105j;

    public lx1(o44 o44, o44 o442, o44 o443, o44 o444, o44 o445, o44 o446, o44 o447, o44 o448, o44 o449, o44 o4410) {
        this.f13096a = o44;
        this.f13097b = o442;
        this.f13098c = o443;
        this.f13099d = o444;
        this.f13100e = o445;
        this.f13101f = o446;
        this.f13102g = o447;
        this.f13103h = o448;
        this.f13104i = o449;
        this.f13105j = o4410;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Context a = ((yu0) this.f13097b).mo15509a();
        WeakReference a2 = ((zu0) this.f13098c).mo15666a();
        mf3 mf3 = dn0.f8325a;
        j44.m14699b(mf3);
        return new kx1((Executor) this.f13096a.mo8155d(), a, a2, mf3, (zs1) this.f13100e.mo8155d(), (ScheduledExecutorService) this.f13101f.mo8155d(), (pv1) this.f13102g.mo8155d(), ((jv0) this.f13103h).mo11523a(), ((ug1) this.f13104i).mo8155d(), (az2) this.f13105j.mo8155d());
    }
}
