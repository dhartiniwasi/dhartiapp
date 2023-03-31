package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.df */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6933df extends C7017j {

    /* renamed from: c */
    private final C6892b8 f31660c;

    /* renamed from: d */
    final Map f31661d = new HashMap();

    public C6933df(C6892b8 b8Var) {
        super("require");
        this.f31660c = b8Var;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        C7129q qVar;
        C7279z5.m41182h("require", 1, list);
        String V = y4Var.mo24007b((C7129q) list.get(0)).mo23369V();
        if (this.f31661d.containsKey(V)) {
            return (C7129q) this.f31661d.get(V);
        }
        C6892b8 b8Var = this.f31660c;
        if (b8Var.f31586a.containsKey(V)) {
            try {
                qVar = (C7129q) ((Callable) b8Var.f31586a.get(V)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(V)));
            }
        } else {
            qVar = C7129q.f31955m;
        }
        if (qVar instanceof C7017j) {
            this.f31661d.put(V, (C7017j) qVar);
        }
        return qVar;
    }
}
