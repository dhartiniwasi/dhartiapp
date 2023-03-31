package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7113p extends C7017j {

    /* renamed from: c */
    protected final List f31938c;

    /* renamed from: d */
    protected final List f31939d;

    /* renamed from: e */
    protected C7262y4 f31940e;

    private C7113p(C7113p pVar) {
        super(pVar.f31776a);
        ArrayList arrayList = new ArrayList(pVar.f31938c.size());
        this.f31938c = arrayList;
        arrayList.addAll(pVar.f31938c);
        ArrayList arrayList2 = new ArrayList(pVar.f31939d.size());
        this.f31939d = arrayList2;
        arrayList2.addAll(pVar.f31939d);
        this.f31940e = pVar.f31940e;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        C7262y4 a = this.f31940e.mo24006a();
        for (int i = 0; i < this.f31938c.size(); i++) {
            if (i < list.size()) {
                a.mo24010e((String) this.f31938c.get(i), y4Var.mo24007b((C7129q) list.get(i)));
            } else {
                a.mo24010e((String) this.f31938c.get(i), C7129q.f31955m);
            }
        }
        for (C7129q qVar : this.f31939d) {
            C7129q b = a.mo24007b(qVar);
            if (b instanceof C7145r) {
                b = a.mo24007b(qVar);
            }
            if (b instanceof C6985h) {
                return ((C6985h) b).mo23457a();
            }
        }
        return C7129q.f31955m;
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        return new C7113p(this);
    }

    public C7113p(String str, List list, List list2, C7262y4 y4Var) {
        super(str);
        this.f31938c = new ArrayList();
        this.f31940e = y4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f31938c.add(((C7129q) it.next()).mo23369V());
            }
        }
        this.f31939d = new ArrayList(list2);
    }
}
