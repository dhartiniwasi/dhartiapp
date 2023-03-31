package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2651n7 {

    /* renamed from: a */
    private final List f13884a;

    /* renamed from: b */
    private final C2792r[] f13885b;

    public C2651n7(List list) {
        this.f13884a = list;
        this.f13885b = new C2792r[list.size()];
    }

    /* renamed from: a */
    public final void mo12538a(long j, y22 y22) {
        cn4.m11017a(j, y22, this.f13885b);
    }

    /* renamed from: b */
    public final void mo12539b(tn4 tn4, C3059y7 y7Var) {
        for (int i = 0; i < this.f13885b.length; i++) {
            y7Var.mo15334c();
            C2792r n = tn4.mo10060n(y7Var.mo15332a(), 3);
            C2388g4 g4Var = (C2388g4) this.f13884a.get(i);
            String str = g4Var.f9673l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            v91.m22051e(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = g4Var.f9662a;
            if (str2 == null) {
                str2 = y7Var.mo15333b();
            }
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9764h(str2);
            e2Var.mo9776s(str);
            e2Var.mo9778u(g4Var.f9665d);
            e2Var.mo9768k(g4Var.f9664c);
            e2Var.mo9755c0(g4Var.f9659D);
            e2Var.mo9766i(g4Var.f9675n);
            n.mo8823e(e2Var.mo9782y());
            this.f13885b[i] = n;
        }
    }
}
