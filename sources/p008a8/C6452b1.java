package p008a8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p008a8.C6450a1;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9903u;
import p247h8.C10432b;

/* renamed from: a8.b1 */
/* compiled from: Query */
public final class C6452b1 {

    /* renamed from: k */
    private static final C6450a1 f30706k;

    /* renamed from: l */
    private static final C6450a1 f30707l;

    /* renamed from: a */
    private final List<C6450a1> f30708a;

    /* renamed from: b */
    private List<C6450a1> f30709b;

    /* renamed from: c */
    private C6469g1 f30710c;

    /* renamed from: d */
    private final List<C6494r> f30711d;

    /* renamed from: e */
    private final C9903u f30712e;

    /* renamed from: f */
    private final String f30713f;

    /* renamed from: g */
    private final long f30714g;

    /* renamed from: h */
    private final C6453a f30715h;

    /* renamed from: i */
    private final C6473i f30716i;

    /* renamed from: j */
    private final C6473i f30717j;

    /* renamed from: a8.b1$a */
    /* compiled from: Query */
    public enum C6453a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* renamed from: a8.b1$b */
    /* compiled from: Query */
    private static class C6454b implements Comparator<C9885i> {

        /* renamed from: a */
        private final List<C6450a1> f30721a;

        C6454b(List<C6450a1> list) {
            boolean z;
            Iterator<C6450a1> it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    C6450a1 next = it.next();
                    if (z || next.mo21865c().equals(C9898r.f39731b)) {
                        z = true;
                    }
                }
            }
            if (z) {
                this.f30721a = list;
                return;
            }
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }

        /* renamed from: a */
        public int compare(C9885i iVar, C9885i iVar2) {
            for (C6450a1 a : this.f30721a) {
                int a2 = a.mo21863a(iVar, iVar2);
                if (a2 != 0) {
                    return a2;
                }
            }
            return 0;
        }
    }

    static {
        C6450a1.C6451a aVar = C6450a1.C6451a.ASCENDING;
        C9898r rVar = C9898r.f39731b;
        f30706k = C6450a1.m37613d(aVar, rVar);
        f30707l = C6450a1.m37613d(C6450a1.C6451a.DESCENDING, rVar);
    }

    public C6452b1(C9903u uVar, String str, List<C6494r> list, List<C6450a1> list2, long j, C6453a aVar, C6473i iVar, C6473i iVar2) {
        this.f30712e = uVar;
        this.f30713f = str;
        this.f30708a = list2;
        this.f30711d = list;
        this.f30714g = j;
        this.f30715h = aVar;
        this.f30716i = iVar;
        this.f30717j = iVar2;
    }

    /* renamed from: A */
    private boolean m37618A(C9885i iVar) {
        C9903u s = iVar.getKey().mo32390s();
        if (this.f30713f != null) {
            if (!iVar.getKey().mo32391t(this.f30713f) || !this.f30712e.mo32357q(s)) {
                return false;
            }
            return true;
        } else if (C9888l.m50699u(this.f30712e)) {
            return this.f30712e.equals(s);
        } else {
            if (!this.f30712e.mo32357q(s) || this.f30712e.mo32358r() != s.mo32358r() - 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    public static C6452b1 m37619b(C9903u uVar) {
        return new C6452b1(uVar, (String) null);
    }

    /* renamed from: x */
    private boolean m37620x(C9885i iVar) {
        C6473i iVar2 = this.f30716i;
        if (iVar2 != null && !iVar2.mo21959f(mo21886m(), iVar)) {
            return false;
        }
        C6473i iVar3 = this.f30717j;
        if (iVar3 == null || iVar3.mo21957e(mo21886m(), iVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private boolean m37621y(C9885i iVar) {
        for (C6494r e : this.f30711d) {
            if (!e.mo21910e(iVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private boolean m37622z(C9885i iVar) {
        for (C6450a1 next : mo21886m()) {
            if (!next.mo21865c().equals(C9898r.f39731b) && iVar.mo32376g(next.f30701b) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public C6452b1 mo21870B(C6450a1 a1Var) {
        C9898r q;
        C10432b.m52648d(!mo21892s(), "No ordering is allowed for document query", new Object[0]);
        if (!this.f30708a.isEmpty() || (q = mo21890q()) == null || q.equals(a1Var.f30701b)) {
            ArrayList arrayList = new ArrayList(this.f30708a);
            arrayList.add(a1Var);
            return new C6452b1(this.f30712e, this.f30713f, this.f30711d, arrayList, this.f30714g, this.f30715h, this.f30716i, this.f30717j);
        }
        throw C10432b.m52645a("First orderBy must match inequality field", new Object[0]);
    }

    /* renamed from: C */
    public C6452b1 mo21871C(C6473i iVar) {
        return new C6452b1(this.f30712e, this.f30713f, this.f30711d, this.f30708a, this.f30714g, this.f30715h, iVar, this.f30717j);
    }

    /* renamed from: D */
    public C6469g1 mo21872D() {
        if (this.f30710c == null) {
            if (this.f30715h == C6453a.LIMIT_TO_FIRST) {
                this.f30710c = new C6469g1(mo21887n(), mo21878f(), mo21882i(), mo21886m(), this.f30714g, mo21888o(), mo21879g());
            } else {
                ArrayList arrayList = new ArrayList();
                for (C6450a1 next : mo21886m()) {
                    C6450a1.C6451a b = next.mo21864b();
                    C6450a1.C6451a aVar = C6450a1.C6451a.DESCENDING;
                    if (b == aVar) {
                        aVar = C6450a1.C6451a.ASCENDING;
                    }
                    arrayList.add(C6450a1.m37613d(aVar, next.mo21865c()));
                }
                C6473i iVar = this.f30717j;
                C6473i iVar2 = null;
                C6473i iVar3 = iVar != null ? new C6473i(iVar.mo21954b(), this.f30717j.mo21955c()) : null;
                C6473i iVar4 = this.f30716i;
                if (iVar4 != null) {
                    iVar2 = new C6473i(iVar4.mo21954b(), this.f30716i.mo21955c());
                }
                this.f30710c = new C6469g1(mo21887n(), mo21878f(), mo21882i(), arrayList, this.f30714g, iVar3, iVar2);
            }
        }
        return this.f30710c;
    }

    /* renamed from: a */
    public C6452b1 mo21873a(C9903u uVar) {
        return new C6452b1(uVar, (String) null, this.f30711d, this.f30708a, this.f30714g, this.f30715h, this.f30716i, this.f30717j);
    }

    /* renamed from: c */
    public Comparator<C9885i> mo21874c() {
        return new C6454b(mo21886m());
    }

    /* renamed from: d */
    public C6452b1 mo21875d(C6473i iVar) {
        return new C6452b1(this.f30712e, this.f30713f, this.f30711d, this.f30708a, this.f30714g, this.f30715h, this.f30716i, iVar);
    }

    /* renamed from: e */
    public C6452b1 mo21876e(C6494r rVar) {
        boolean z = true;
        C10432b.m52648d(!mo21892s(), "No filter is allowed for document query", new Object[0]);
        C9898r c = rVar.mo21990c();
        C9898r q = mo21890q();
        C10432b.m52648d(q == null || c == null || q.equals(c), "Query must only have one inequality field", new Object[0]);
        if (!this.f30708a.isEmpty() && c != null && !this.f30708a.get(0).f30701b.equals(c)) {
            z = false;
        }
        C10432b.m52648d(z, "First orderBy must match inequality field", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f30711d);
        arrayList.add(rVar);
        return new C6452b1(this.f30712e, this.f30713f, arrayList, this.f30708a, this.f30714g, this.f30715h, this.f30716i, this.f30717j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6452b1.class != obj.getClass()) {
            return false;
        }
        C6452b1 b1Var = (C6452b1) obj;
        if (this.f30715h != b1Var.f30715h) {
            return false;
        }
        return mo21872D().equals(b1Var.mo21872D());
    }

    /* renamed from: f */
    public String mo21878f() {
        return this.f30713f;
    }

    /* renamed from: g */
    public C6473i mo21879g() {
        return this.f30717j;
    }

    /* renamed from: h */
    public List<C6450a1> mo21880h() {
        return this.f30708a;
    }

    public int hashCode() {
        return (mo21872D().hashCode() * 31) + this.f30715h.hashCode();
    }

    /* renamed from: i */
    public List<C6494r> mo21882i() {
        return this.f30711d;
    }

    /* renamed from: j */
    public C9898r mo21883j() {
        if (this.f30708a.isEmpty()) {
            return null;
        }
        return this.f30708a.get(0).mo21865c();
    }

    /* renamed from: k */
    public long mo21884k() {
        return this.f30714g;
    }

    /* renamed from: l */
    public C6453a mo21885l() {
        return this.f30715h;
    }

    /* renamed from: m */
    public List<C6450a1> mo21886m() {
        C6450a1.C6451a aVar;
        if (this.f30709b == null) {
            C9898r q = mo21890q();
            C9898r j = mo21883j();
            boolean z = false;
            if (q == null || j != null) {
                ArrayList arrayList = new ArrayList();
                for (C6450a1 next : this.f30708a) {
                    arrayList.add(next);
                    if (next.mo21865c().equals(C9898r.f39731b)) {
                        z = true;
                    }
                }
                if (!z) {
                    if (this.f30708a.size() > 0) {
                        List<C6450a1> list = this.f30708a;
                        aVar = list.get(list.size() - 1).mo21864b();
                    } else {
                        aVar = C6450a1.C6451a.ASCENDING;
                    }
                    arrayList.add(aVar.equals(C6450a1.C6451a.ASCENDING) ? f30706k : f30707l);
                }
                this.f30709b = arrayList;
            } else if (q.mo32415y()) {
                this.f30709b = Collections.singletonList(f30706k);
            } else {
                this.f30709b = Arrays.asList(new C6450a1[]{C6450a1.m37613d(C6450a1.C6451a.ASCENDING, q), f30706k});
            }
        }
        return this.f30709b;
    }

    /* renamed from: n */
    public C9903u mo21887n() {
        return this.f30712e;
    }

    /* renamed from: o */
    public C6473i mo21888o() {
        return this.f30716i;
    }

    /* renamed from: p */
    public boolean mo21889p() {
        return this.f30714g != -1;
    }

    /* renamed from: q */
    public C9898r mo21890q() {
        for (C6494r c : this.f30711d) {
            C9898r c2 = c.mo21990c();
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    /* renamed from: r */
    public boolean mo21891r() {
        return this.f30713f != null;
    }

    /* renamed from: s */
    public boolean mo21892s() {
        return C9888l.m50699u(this.f30712e) && this.f30713f == null && this.f30711d.isEmpty();
    }

    /* renamed from: t */
    public C6452b1 mo21893t(long j) {
        return new C6452b1(this.f30712e, this.f30713f, this.f30711d, this.f30708a, j, C6453a.LIMIT_TO_FIRST, this.f30716i, this.f30717j);
    }

    public String toString() {
        return "Query(target=" + mo21872D().toString() + ";limitType=" + this.f30715h.toString() + ")";
    }

    /* renamed from: u */
    public C6452b1 mo21895u(long j) {
        return new C6452b1(this.f30712e, this.f30713f, this.f30711d, this.f30708a, j, C6453a.LIMIT_TO_LAST, this.f30716i, this.f30717j);
    }

    /* renamed from: v */
    public boolean mo21896v(C9885i iVar) {
        return iVar.mo32371b() && m37618A(iVar) && m37622z(iVar) && m37621y(iVar) && m37620x(iVar);
    }

    /* renamed from: w */
    public boolean mo21897w() {
        if (this.f30711d.isEmpty() && this.f30714g == -1 && this.f30716i == null && this.f30717j == null) {
            if (mo21880h().isEmpty()) {
                return true;
            }
            if (mo21880h().size() != 1 || !mo21883j().mo32415y()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C6452b1(C9903u uVar, String str) {
        this(uVar, str, Collections.emptyList(), Collections.emptyList(), -1, C6453a.LIMIT_TO_FIRST, (C6473i) null, (C6473i) null);
    }
}
