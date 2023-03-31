package com.google.android.gms.internal.ads;

import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ds2 implements cd2 {

    /* renamed from: a */
    final /* synthetic */ fs2 f8405a;

    ds2(fs2 fs2) {
        this.f8405a = fs2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9127c(Object obj) {
        pr1 pr1 = (pr1) obj;
        synchronized (this.f8405a) {
            this.f8405a.f9444d = pr1;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14335J2)).booleanValue()) {
                pr1.mo13345j().f19769a = this.f8405a.f9443c;
            }
            this.f8405a.f9444d.mo8205b();
        }
    }

    public final void zza() {
        synchronized (this.f8405a) {
            this.f8405a.f9444d = null;
        }
    }
}
