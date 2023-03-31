package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C7017j implements C7129q, C7065m {

    /* renamed from: a */
    protected final String f31776a;

    /* renamed from: b */
    protected final Map f31777b = new HashMap();

    public C7017j(String str) {
        this.f31776a = str;
    }

    /* renamed from: U */
    public final Double mo23368U() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: V */
    public final String mo23369V() {
        return this.f31776a;
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return C7033k.m40307b(this.f31777b);
    }

    /* renamed from: a */
    public abstract C7129q mo23023a(C7262y4 y4Var, List list);

    /* renamed from: b */
    public C7129q mo23371b() {
        return this;
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public final String mo23540d() {
        return this.f31776a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7017j)) {
            return false;
        }
        C7017j jVar = (C7017j) obj;
        String str = this.f31776a;
        if (str != null) {
            return str.equals(jVar.f31776a);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo23374f(String str) {
        return this.f31777b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f31776a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo23376i(String str, C7129q qVar) {
        if (qVar == null) {
            this.f31777b.remove(str);
        } else {
            this.f31777b.put(str, qVar);
        }
    }

    /* renamed from: j */
    public final C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        if ("toString".equals(str)) {
            return new C7193u(this.f31776a);
        }
        return C7033k.m40306a(this, new C7193u(str), y4Var, list);
    }

    /* renamed from: v */
    public final C7129q mo23387v(String str) {
        return this.f31777b.containsKey(str) ? (C7129q) this.f31777b.get(str) : C7129q.f31955m;
    }
}
