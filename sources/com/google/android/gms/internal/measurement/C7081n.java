package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public class C7081n implements C7129q, C7065m {

    /* renamed from: a */
    final Map f31830a = new HashMap();

    /* renamed from: U */
    public final Double mo23368U() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: V */
    public final String mo23369V() {
        return "[object Object]";
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return C7033k.m40307b(this.f31830a);
    }

    /* renamed from: a */
    public final List mo23681a() {
        return new ArrayList(this.f31830a.keySet());
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        C7081n nVar = new C7081n();
        for (Map.Entry entry : this.f31830a.entrySet()) {
            if (entry.getValue() instanceof C7065m) {
                nVar.f31830a.put((String) entry.getKey(), (C7129q) entry.getValue());
            } else {
                nVar.f31830a.put((String) entry.getKey(), ((C7129q) entry.getValue()).mo23371b());
            }
        }
        return nVar;
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7081n)) {
            return false;
        }
        return this.f31830a.equals(((C7081n) obj).f31830a);
    }

    /* renamed from: f */
    public final boolean mo23374f(String str) {
        return this.f31830a.containsKey(str);
    }

    public final int hashCode() {
        return this.f31830a.hashCode();
    }

    /* renamed from: i */
    public final void mo23376i(String str, C7129q qVar) {
        if (qVar == null) {
            this.f31830a.remove(str);
        } else {
            this.f31830a.put(str, qVar);
        }
    }

    /* renamed from: j */
    public C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        if ("toString".equals(str)) {
            return new C7193u(toString());
        }
        return C7033k.m40306a(this, new C7193u(str), y4Var, list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f31830a.isEmpty()) {
            for (String str : this.f31830a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f31830a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    public final C7129q mo23387v(String str) {
        return this.f31830a.containsKey(str) ? (C7129q) this.f31830a.get(str) : C7129q.f31955m;
    }
}
