package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class f02 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ g02 f9067a;

    f02(g02 g02) {
        this.f9067a = g02;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue()) {
            Matcher matcher = g02.f9627h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f9067a.f9632e.mo12520i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        us2 us2 = (us2) obj;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue()) {
            this.f9067a.f9632e.mo12520i(us2.f18723b.f18244b.f12933e);
            this.f9067a.f9632e.mo12521j(us2.f18723b.f18244b.f12934f);
        }
    }
}
