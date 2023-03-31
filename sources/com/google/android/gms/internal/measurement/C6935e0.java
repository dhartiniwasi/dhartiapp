package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6935e0 extends C7241x {
    protected C6935e0() {
        this.f32175a.add(C7082n0.AND);
        this.f32175a.add(C7082n0.NOT);
        this.f32175a.add(C7082n0.OR);
    }

    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        C7082n0 n0Var = C7082n0.ADD;
        int ordinal = C7279z5.m41179e(str).ordinal();
        if (ordinal == 1) {
            C7279z5.m41182h(C7082n0.AND.name(), 2, list);
            C7129q b = y4Var.mo24007b((C7129q) list.get(0));
            if (!b.mo23372c().booleanValue()) {
                return b;
            }
            return y4Var.mo24007b((C7129q) list.get(1));
        } else if (ordinal == 47) {
            C7279z5.m41182h(C7082n0.NOT.name(), 1, list);
            return new C6968g(Boolean.valueOf(!y4Var.mo24007b((C7129q) list.get(0)).mo23372c().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo23977b(str);
        } else {
            C7279z5.m41182h(C7082n0.OR.name(), 2, list);
            C7129q b2 = y4Var.mo24007b((C7129q) list.get(0));
            if (b2.mo23372c().booleanValue()) {
                return b2;
            }
            return y4Var.mo24007b((C7129q) list.get(1));
        }
    }
}
