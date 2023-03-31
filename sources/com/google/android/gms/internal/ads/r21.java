package com.google.android.gms.internal.ads;

import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r21 {

    /* renamed from: a */
    private final ux2 f16784a;

    /* renamed from: b */
    private final gv1 f16785b;

    /* renamed from: c */
    private final us2 f16786c;

    public r21(gv1 gv1, us2 us2, ux2 ux2) {
        this.f16784a = ux2;
        this.f16785b = gv1;
        this.f16786c = us2;
    }

    /* renamed from: b */
    private static String m19531b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    /* renamed from: a */
    public final void mo13658a(long j, int i) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14685s7)).booleanValue()) {
            ux2 ux2 = this.f16784a;
            tx2 b = tx2.m21328b("ad_closed");
            b.mo14413g(this.f16786c.f18723b.f18244b);
            b.mo14409a("show_time", String.valueOf(j));
            b.mo14409a("ad_format", "app_open_ad");
            b.mo14409a("acr", m19531b(i));
            ux2.mo8622a(b);
            return;
        }
        fv1 a = this.f16785b.mo10653a();
        a.mo10306e(this.f16786c.f18723b.f18244b);
        a.mo10303b("action", "ad_closed");
        a.mo10303b("show_time", String.valueOf(j));
        a.mo10303b("ad_format", "app_open_ad");
        a.mo10303b("acr", m19531b(i));
        a.mo10308g();
    }
}
