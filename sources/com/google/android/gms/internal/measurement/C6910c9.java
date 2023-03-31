package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6910c9 extends C7017j {

    /* renamed from: c */
    private final C6900c f31629c;

    public C6910c9(C6900c cVar) {
        super("internal.eventLogger");
        this.f31629c = cVar;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        Map map;
        C7279z5.m41182h(this.f31776a, 3, list);
        String V = y4Var.mo24007b((C7129q) list.get(0)).mo23369V();
        long a = (long) C7279z5.m41175a(y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue());
        C7129q b = y4Var.mo24007b((C7129q) list.get(2));
        if (b instanceof C7081n) {
            map = C7279z5.m41181g((C7081n) b);
        } else {
            map = new HashMap();
        }
        this.f31629c.mo23137e(V, a, map);
        return C7129q.f31955m;
    }
}
