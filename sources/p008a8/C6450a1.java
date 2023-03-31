package p008a8;

import p211d8.C9885i;
import p211d8.C9898r;
import p211d8.C9907y;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: a8.a1 */
/* compiled from: OrderBy */
public class C6450a1 {

    /* renamed from: a */
    private final C6451a f30700a;

    /* renamed from: b */
    final C9898r f30701b;

    /* renamed from: a8.a1$a */
    /* compiled from: OrderBy */
    public enum C6451a {
        ASCENDING(1),
        DESCENDING(-1);
        

        /* renamed from: a */
        private final int f30705a;

        private C6451a(int i) {
            this.f30705a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo21869a() {
            return this.f30705a;
        }
    }

    private C6450a1(C6451a aVar, C9898r rVar) {
        this.f30700a = aVar;
        this.f30701b = rVar;
    }

    /* renamed from: d */
    public static C6450a1 m37613d(C6451a aVar, C9898r rVar) {
        return new C6450a1(aVar, rVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo21863a(C9885i iVar, C9885i iVar2) {
        int a;
        int i;
        if (this.f30701b.equals(C9898r.f39731b)) {
            a = this.f30700a.mo21869a();
            i = iVar.getKey().compareTo(iVar2.getKey());
        } else {
            C13088b0 g = iVar.mo32376g(this.f30701b);
            C13088b0 g2 = iVar2.mo32376g(this.f30701b);
            C10432b.m52648d((g == null || g2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            a = this.f30700a.mo21869a();
            i = C9907y.m50814i(g, g2);
        }
        return a * i;
    }

    /* renamed from: b */
    public C6451a mo21864b() {
        return this.f30700a;
    }

    /* renamed from: c */
    public C9898r mo21865c() {
        return this.f30701b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6450a1)) {
            return false;
        }
        C6450a1 a1Var = (C6450a1) obj;
        if (this.f30700a != a1Var.f30700a || !this.f30701b.equals(a1Var.f30701b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((899 + this.f30700a.hashCode()) * 31) + this.f30701b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30700a == C6451a.ASCENDING ? "" : "-");
        sb.append(this.f30701b.mo32348c());
        return sb.toString();
    }
}
