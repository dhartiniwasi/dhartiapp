package p008a8;

import java.util.List;
import p008a8.C6450a1;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9907y;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: a8.i */
/* compiled from: Bound */
public final class C6473i {

    /* renamed from: a */
    private final boolean f30766a;

    /* renamed from: b */
    private final List<C13088b0> f30767b;

    public C6473i(List<C13088b0> list, boolean z) {
        this.f30767b = list;
        this.f30766a = z;
    }

    /* renamed from: a */
    private int m37737a(List<C6450a1> list, C9885i iVar) {
        int i;
        C10432b.m52648d(this.f30767b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f30767b.size(); i3++) {
            C6450a1 a1Var = list.get(i3);
            C13088b0 b0Var = this.f30767b.get(i3);
            if (a1Var.f30701b.equals(C9898r.f39731b)) {
                C10432b.m52648d(C9907y.m50799B(b0Var), "Bound has a non-key value where the key path is being used %s", b0Var);
                i = C9888l.m50696k(b0Var.mo38119u0()).compareTo(iVar.getKey());
            } else {
                C13088b0 g = iVar.mo32376g(a1Var.mo21865c());
                C10432b.m52648d(g != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i = C9907y.m50814i(b0Var, g);
            }
            if (a1Var.mo21864b().equals(C6450a1.C6451a.DESCENDING)) {
                i *= -1;
            }
            i2 = i;
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public List<C13088b0> mo21954b() {
        return this.f30767b;
    }

    /* renamed from: c */
    public boolean mo21955c() {
        return this.f30766a;
    }

    /* renamed from: d */
    public String mo21956d() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C13088b0 next : this.f30767b) {
            if (!z) {
                sb.append(",");
            }
            z = false;
            sb.append(C9907y.m50807b(next));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public boolean mo21957e(List<C6450a1> list, C9885i iVar) {
        int a = m37737a(list, iVar);
        if (this.f30766a) {
            if (a >= 0) {
                return true;
            }
        } else if (a > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6473i.class != obj.getClass()) {
            return false;
        }
        C6473i iVar = (C6473i) obj;
        if (this.f30766a != iVar.f30766a || !this.f30767b.equals(iVar.f30767b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo21959f(List<C6450a1> list, C9885i iVar) {
        int a = m37737a(list, iVar);
        if (this.f30766a) {
            if (a <= 0) {
                return true;
            }
        } else if (a < 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30766a ? 1 : 0) * true) + this.f30767b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f30766a);
        sb.append(", position=");
        for (int i = 0; i < this.f30767b.size(); i++) {
            if (i > 0) {
                sb.append(" and ");
            }
            sb.append(C9907y.m50807b(this.f30767b.get(i)));
        }
        sb.append(")");
        return sb.toString();
    }
}
