package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vx2 implements b44 {

    /* renamed from: a */
    private final o44 f19371a;

    /* renamed from: b */
    private final o44 f19372b;

    /* renamed from: c */
    private final o44 f19373c;

    public vx2(o44 o44, o44 o442, o44 o443) {
        this.f19371a = o44;
        this.f19372b = o442;
        this.f19373c = o443;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        Object obj;
        v34 a = a44.m9577a(this.f19371a);
        v34 a2 = a44.m9577a(this.f19372b);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f19373c.mo8155d();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14695t7)).booleanValue()) {
            obj = new xx2((ux2) a.mo8155d(), scheduledExecutorService);
        } else {
            obj = (ux2) a2.mo8155d();
        }
        j44.m14699b(obj);
        return obj;
    }
}
