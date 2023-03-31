package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ze */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7288ze extends C7017j {

    /* renamed from: c */
    final boolean f32290c;

    /* renamed from: d */
    final boolean f32291d;

    /* renamed from: e */
    final /* synthetic */ C6882af f32292e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7288ze(C6882af afVar, boolean z, boolean z2) {
        super("log");
        this.f32292e = afVar;
        this.f32290c = z;
        this.f32291d = z2;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        C7279z5.m41183i("log", 1, list);
        if (list.size() == 1) {
            this.f32292e.f31574c.mo24029a(3, y4Var.mo24007b((C7129q) list.get(0)).mo23369V(), Collections.emptyList(), this.f32290c, this.f32291d);
            return C7129q.f31955m;
        }
        int b = C7279z5.m41176b(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue());
        int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
        String V = y4Var.mo24007b((C7129q) list.get(1)).mo23369V();
        if (list.size() == 2) {
            this.f32292e.f31574c.mo24029a(i, V, Collections.emptyList(), this.f32290c, this.f32291d);
            return C7129q.f31955m;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(y4Var.mo24007b((C7129q) list.get(i2)).mo23369V());
        }
        this.f32292e.f31574c.mo24029a(i, V, arrayList, this.f32290c, this.f32291d);
        return C7129q.f31955m;
    }
}
