package com.google.android.gms.internal.ads;

import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ix1 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ kx1 f11134a;

    ix1(kx1 kx1) {
        this.f11134a = kx1;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        synchronized (this) {
            this.f11134a.f12325c = true;
            this.f11134a.m15660v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (C4409t.m29310b().mo18371b() - this.f11134a.f12326d));
            this.f11134a.f12327e.mo11173e(new Exception());
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.f11134a.f12325c = true;
            this.f11134a.m15660v("com.google.android.gms.ads.MobileAds", true, "", (int) (C4409t.m29310b().mo18371b() - this.f11134a.f12326d));
            this.f11134a.f12331i.execute(new hx1(this, str));
        }
    }
}
