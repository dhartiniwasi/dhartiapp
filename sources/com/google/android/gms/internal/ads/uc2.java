package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class uc2 implements cd2 {

    /* renamed from: a */
    final /* synthetic */ vc2 f18494a;

    uc2(vc2 vc2) {
        this.f18494a = vc2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9127c(Object obj) {
        ki1 ki1 = (ki1) obj;
        synchronized (this.f18494a) {
            this.f18494a.f19013h = ki1;
            this.f18494a.f19013h.mo8205b();
        }
    }

    public final void zza() {
        synchronized (this.f18494a) {
            this.f18494a.f19013h = null;
        }
    }
}
