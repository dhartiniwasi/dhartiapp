package com.google.android.gms.internal.ads;

import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yr2 implements cd2 {

    /* renamed from: a */
    final /* synthetic */ zr2 f20795a;

    yr2(zr2 zr2) {
        this.f20795a = zr2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9127c(Object obj) {
        pr1 pr1 = (pr1) obj;
        synchronized (this.f20795a) {
            this.f20795a.f21259g = pr1;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14335J2)).booleanValue()) {
                pr1.mo13345j().f19769a = this.f20795a.f21256d;
            }
            this.f20795a.f21259g.mo8205b();
        }
    }

    public final void zza() {
        synchronized (this.f20795a) {
            this.f20795a.f21259g = null;
        }
    }
}
