package com.google.android.gms.internal.ads;

import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class t82 {

    /* renamed from: a */
    private final tt2 f17895a;

    /* renamed from: b */
    private final ws1 f17896b;

    /* renamed from: c */
    private final gv1 f17897c;

    /* renamed from: d */
    private final ux2 f17898d;

    public t82(tt2 tt2, ws1 ws1, gv1 gv1, ux2 ux2) {
        this.f17895a = tt2;
        this.f17896b = ws1;
        this.f17897c = gv1;
        this.f17898d = ux2;
    }

    /* renamed from: a */
    public final void mo14249a(ls2 ls2, is2 is2, int i, h52 h52, long j) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14685s7)).booleanValue()) {
            tx2 b = tx2.m21328b("adapter_status");
            b.mo14413g(ls2);
            b.mo14412f(is2);
            b.mo14409a("adapter_l", String.valueOf(j));
            b.mo14409a("sc", Integer.toString(i));
            if (h52 != null) {
                b.mo14409a("arec", Integer.toString(h52.mo10736b().f25062a));
                String a = this.f17895a.mo14382a(h52.getMessage());
                if (a != null) {
                    b.mo14409a("areec", a);
                }
            }
            vs1 b2 = this.f17896b.mo14985b(is2.f11004u);
            if (b2 != null) {
                b.mo14409a("ancn", b2.f19229a);
                wd0 wd0 = b2.f19230b;
                if (wd0 != null) {
                    b.mo14409a("adapter_v", wd0.toString());
                }
                wd0 wd02 = b2.f19231c;
                if (wd02 != null) {
                    b.mo14409a("adapter_sv", wd02.toString());
                }
            }
            this.f17898d.mo8622a(b);
            return;
        }
        fv1 a2 = this.f17897c.mo10653a();
        a2.mo10306e(ls2);
        a2.mo10305d(is2);
        a2.mo10303b("action", "adapter_status");
        a2.mo10303b("adapter_l", String.valueOf(j));
        a2.mo10303b("sc", Integer.toString(i));
        if (h52 != null) {
            a2.mo10303b("arec", Integer.toString(h52.mo10736b().f25062a));
            String a3 = this.f17895a.mo14382a(h52.getMessage());
            if (a3 != null) {
                a2.mo10303b("areec", a3);
            }
        }
        vs1 b3 = this.f17896b.mo14985b(is2.f11004u);
        if (b3 != null) {
            a2.mo10303b("ancn", b3.f19229a);
            wd0 wd03 = b3.f19230b;
            if (wd03 != null) {
                a2.mo10303b("adapter_v", wd03.toString());
            }
            wd0 wd04 = b3.f19231c;
            if (wd04 != null) {
                a2.mo10303b("adapter_sv", wd04.toString());
            }
        }
        a2.mo10308g();
    }
}
