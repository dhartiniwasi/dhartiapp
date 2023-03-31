package com.google.android.gms.internal.ads;

import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a42 implements lx2 {

    /* renamed from: a */
    private final n32 f6405a;

    /* renamed from: b */
    private final r32 f6406b;

    a42(n32 n32, r32 r32) {
        this.f6405a = n32;
        this.f6406b = r32;
    }

    /* renamed from: a */
    public final void mo8191a(ex2 ex2, String str) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue()) {
            if (ex2.RENDERER == ex2) {
                this.f6405a.mo12518g(C4409t.m29310b().mo18371b());
            } else if (ex2.PRELOADED_LOADER == ex2 || ex2.SERVER_TRANSACTION == ex2) {
                this.f6405a.mo12519h(C4409t.m29310b().mo18371b());
                r32 r32 = this.f6406b;
                r32.f19455b.mo11310a(new q32(r32, this.f6405a.mo12515d()));
            }
        }
    }

    /* renamed from: d */
    public final void mo8192d(ex2 ex2, String str) {
    }

    /* renamed from: h */
    public final void mo8193h(ex2 ex2, String str) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue() && ex2.RENDERER == ex2 && this.f6405a.mo12514c() != 0) {
            this.f6405a.mo12517f(C4409t.m29310b().mo18371b() - this.f6405a.mo12514c());
        }
    }

    /* renamed from: k */
    public final void mo8194k(ex2 ex2, String str, Throwable th) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue() && ex2.RENDERER == ex2 && this.f6405a.mo12514c() != 0) {
            this.f6405a.mo12517f(C4409t.m29310b().mo18371b() - this.f6405a.mo12514c());
        }
    }
}
