package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7225w extends C7241x {
    public C7225w() {
        this.f32175a.add(C7082n0.BITWISE_AND);
        this.f32175a.add(C7082n0.BITWISE_LEFT_SHIFT);
        this.f32175a.add(C7082n0.BITWISE_NOT);
        this.f32175a.add(C7082n0.BITWISE_OR);
        this.f32175a.add(C7082n0.BITWISE_RIGHT_SHIFT);
        this.f32175a.add(C7082n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f32175a.add(C7082n0.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        C7082n0 n0Var = C7082n0.ADD;
        switch (C7279z5.m41179e(str).ordinal()) {
            case 4:
                C7279z5.m41182h(C7082n0.BITWISE_AND.name(), 2, list);
                return new C7001i(Double.valueOf((double) (C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()) & C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()))));
            case 5:
                C7279z5.m41182h(C7082n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C7001i(Double.valueOf((double) (C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()) << ((int) (C7279z5.m41178d(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()) & 31)))));
            case 6:
                C7279z5.m41182h(C7082n0.BITWISE_NOT.name(), 1, list);
                return new C7001i(Double.valueOf((double) (~C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()))));
            case 7:
                C7279z5.m41182h(C7082n0.BITWISE_OR.name(), 2, list);
                return new C7001i(Double.valueOf((double) (C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()) | C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()))));
            case 8:
                C7279z5.m41182h(C7082n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C7001i(Double.valueOf((double) (C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()) >> ((int) (C7279z5.m41178d(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()) & 31)))));
            case 9:
                C7279z5.m41182h(C7082n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C7001i(Double.valueOf((double) (C7279z5.m41178d(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()) >>> ((int) (C7279z5.m41178d(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()) & 31)))));
            case 10:
                C7279z5.m41182h(C7082n0.BITWISE_XOR.name(), 2, list);
                return new C7001i(Double.valueOf((double) (C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()) ^ C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()))));
            default:
                return super.mo23977b(str);
        }
    }
}
