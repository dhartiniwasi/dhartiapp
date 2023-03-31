package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C7033k {
    /* renamed from: a */
    public static C7129q m40306a(C7065m mVar, C7129q qVar, C7262y4 y4Var, List list) {
        if (mVar.mo23374f(qVar.mo23369V())) {
            C7129q v = mVar.mo23387v(qVar.mo23369V());
            if (v instanceof C7017j) {
                return ((C7017j) v).mo23023a(y4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo23369V()}));
        } else if ("hasOwnProperty".equals(qVar.mo23369V())) {
            C7279z5.m41182h("hasOwnProperty", 1, list);
            if (mVar.mo23374f(y4Var.mo24007b((C7129q) list.get(0)).mo23369V())) {
                return C7129q.f31952T;
            }
            return C7129q.f31953U;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo23369V()}));
        }
    }

    /* renamed from: b */
    public static Iterator m40307b(Map map) {
        return new C7049l(map.keySet().iterator());
    }
}
