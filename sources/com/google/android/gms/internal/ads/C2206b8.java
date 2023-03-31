package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.b8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2206b8 {

    /* renamed from: a */
    private final List f7149a;

    /* renamed from: b */
    private final C2792r[] f7150b;

    public C2206b8(List list) {
        this.f7149a = list;
        this.f7150b = new C2792r[list.size()];
    }

    /* renamed from: a */
    public final void mo8691a(long j, y22 y22) {
        if (y22.mo15296i() >= 9) {
            int m = y22.mo15300m();
            int m2 = y22.mo15300m();
            int s = y22.mo15306s();
            if (m == 434 && m2 == 1195456820 && s == 3) {
                cn4.m11018b(j, y22, this.f7150b);
            }
        }
    }

    /* renamed from: b */
    public final void mo8692b(tn4 tn4, C3059y7 y7Var) {
        for (int i = 0; i < this.f7150b.length; i++) {
            y7Var.mo15334c();
            C2792r n = tn4.mo10060n(y7Var.mo15332a(), 3);
            C2388g4 g4Var = (C2388g4) this.f7149a.get(i);
            String str = g4Var.f9673l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            v91.m22051e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9764h(y7Var.mo15333b());
            e2Var.mo9776s(str);
            e2Var.mo9778u(g4Var.f9665d);
            e2Var.mo9768k(g4Var.f9664c);
            e2Var.mo9755c0(g4Var.f9659D);
            e2Var.mo9766i(g4Var.f9675n);
            n.mo8823e(e2Var.mo9782y());
            this.f7150b[i] = n;
        }
    }
}
