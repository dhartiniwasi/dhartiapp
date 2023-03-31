package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.gf */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6984gf {

    /* renamed from: a */
    final TreeMap f31712a = new TreeMap();

    /* renamed from: b */
    final TreeMap f31713b = new TreeMap();

    /* renamed from: c */
    private static final int m40085c(C7262y4 y4Var, C7113p pVar, C7129q qVar) {
        C7129q a = pVar.mo23023a(y4Var, Collections.singletonList(qVar));
        if (a instanceof C7001i) {
            return C7279z5.m41176b(a.mo23368U().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo23455a(String str, int i, C7113p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f31713b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f31712a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo23456b(C7262y4 y4Var, C6900c cVar) {
        C6877aa aaVar = new C6877aa(cVar);
        for (Integer num : this.f31712a.keySet()) {
            C6883b b = cVar.mo23133b().clone();
            int c = m40085c(y4Var, (C7113p) this.f31712a.get(num), aaVar);
            if (c == 2 || c == -1) {
                cVar.mo23138f(b);
            }
        }
        for (Integer num2 : this.f31713b.keySet()) {
            m40085c(y4Var, (C7113p) this.f31713b.get(num2), aaVar);
        }
    }
}
