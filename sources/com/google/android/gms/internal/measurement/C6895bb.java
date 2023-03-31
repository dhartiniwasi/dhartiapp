package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.bb */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C6895bb extends C7017j {

    /* renamed from: c */
    final /* synthetic */ C6931dd f31591c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6895bb(C6913cc ccVar, String str, C6931dd ddVar) {
        super("getValue");
        this.f31591c = ddVar;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        C7279z5.m41182h("getValue", 2, list);
        C7129q b = y4Var.mo24007b((C7129q) list.get(0));
        C7129q b2 = y4Var.mo24007b((C7129q) list.get(1));
        String f = this.f31591c.mo23340f(b.mo23369V());
        return f != null ? new C7193u(f) : b2;
    }
}
