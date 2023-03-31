package p247h8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p008a8.C6477l;
import p008a8.C6489q;
import p008a8.C6492q0;
import p008a8.C6494r;
import p405y8.C13088b0;

/* renamed from: h8.w */
/* compiled from: LogicUtils */
public class C10471w {
    /* renamed from: a */
    protected static C6494r m52771a(C6494r rVar) {
        m52776f(rVar);
        if (m52783m(rVar)) {
            return rVar;
        }
        C6477l lVar = (C6477l) rVar;
        List<C6494r> b = lVar.mo21989b();
        if (b.size() == 1) {
            return m52771a(b.get(0));
        }
        if (lVar.mo21997k()) {
            return lVar;
        }
        ArrayList<C6494r> arrayList = new ArrayList<>();
        for (C6494r a : b) {
            arrayList.add(m52771a(a));
        }
        ArrayList arrayList2 = new ArrayList();
        for (C6494r rVar2 : arrayList) {
            if (rVar2 instanceof C6489q) {
                arrayList2.add(rVar2);
            } else if (rVar2 instanceof C6477l) {
                C6477l lVar2 = (C6477l) rVar2;
                if (lVar2.mo21993h().equals(lVar.mo21993h())) {
                    arrayList2.addAll(lVar2.mo21989b());
                } else {
                    arrayList2.add(lVar2);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (C6494r) arrayList2.get(0);
        }
        return new C6477l(arrayList2, lVar.mo21993h());
    }

    /* renamed from: b */
    private static C6494r m52772b(C6477l lVar, C6477l lVar2) {
        C10432b.m52648d(!lVar.mo21989b().isEmpty() && !lVar2.mo21989b().isEmpty(), "Found an empty composite filter", new Object[0]);
        if (lVar.mo21995i() && lVar2.mo21995i()) {
            return lVar.mo21999n(lVar2.mo21989b());
        }
        C6477l lVar3 = lVar.mo21996j() ? lVar : lVar2;
        if (lVar.mo21996j()) {
            lVar = lVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (C6494r e : lVar3.mo21989b()) {
            arrayList.add(m52775e(e, lVar));
        }
        return new C6477l(arrayList, C6477l.C6478a.OR);
    }

    /* renamed from: c */
    private static C6494r m52773c(C6489q qVar, C6477l lVar) {
        if (lVar.mo21995i()) {
            return lVar.mo21999n(Collections.singletonList(qVar));
        }
        ArrayList arrayList = new ArrayList();
        for (C6494r e : lVar.mo21989b()) {
            arrayList.add(m52775e(qVar, e));
        }
        return new C6477l(arrayList, C6477l.C6478a.OR);
    }

    /* renamed from: d */
    private static C6494r m52774d(C6489q qVar, C6489q qVar2) {
        return new C6477l(Arrays.asList(new C6494r[]{qVar, qVar2}), C6477l.C6478a.AND);
    }

    /* renamed from: e */
    protected static C6494r m52775e(C6494r rVar, C6494r rVar2) {
        C6494r rVar3;
        m52776f(rVar);
        m52776f(rVar2);
        boolean z = rVar instanceof C6489q;
        if (z && (rVar2 instanceof C6489q)) {
            rVar3 = m52774d((C6489q) rVar, (C6489q) rVar2);
        } else if (z && (rVar2 instanceof C6477l)) {
            rVar3 = m52773c((C6489q) rVar, (C6477l) rVar2);
        } else if (!(rVar instanceof C6477l) || !(rVar2 instanceof C6489q)) {
            rVar3 = m52772b((C6477l) rVar, (C6477l) rVar2);
        } else {
            rVar3 = m52773c((C6489q) rVar2, (C6477l) rVar);
        }
        return m52771a(rVar3);
    }

    /* renamed from: f */
    private static void m52776f(C6494r rVar) {
        C10432b.m52648d((rVar instanceof C6489q) || (rVar instanceof C6477l), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    /* renamed from: g */
    protected static C6494r m52777g(C6494r rVar) {
        m52776f(rVar);
        if (rVar instanceof C6489q) {
            return rVar;
        }
        C6477l lVar = (C6477l) rVar;
        if (lVar.mo21989b().size() == 1) {
            return m52777g(rVar.mo21989b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        for (C6494r g : lVar.mo21989b()) {
            arrayList.add(m52777g(g));
        }
        C6494r a = m52771a(new C6477l(arrayList, lVar.mo21993h()));
        if (m52781k(a)) {
            return a;
        }
        C10432b.m52648d(a instanceof C6477l, "field filters are already in DNF form.", new Object[0]);
        C6477l lVar2 = (C6477l) a;
        C10432b.m52648d(lVar2.mo21995i(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        C10432b.m52648d(lVar2.mo21989b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        C6494r rVar2 = lVar2.mo21989b().get(0);
        for (int i = 1; i < lVar2.mo21989b().size(); i++) {
            rVar2 = m52775e(rVar2, lVar2.mo21989b().get(i));
        }
        return rVar2;
    }

    /* renamed from: h */
    protected static C6494r m52778h(C6494r rVar) {
        m52776f(rVar);
        ArrayList arrayList = new ArrayList();
        if (!(rVar instanceof C6489q)) {
            C6477l lVar = (C6477l) rVar;
            for (C6494r h : lVar.mo21989b()) {
                arrayList.add(m52778h(h));
            }
            return new C6477l(arrayList, lVar.mo21993h());
        } else if (!(rVar instanceof C6492q0)) {
            return rVar;
        } else {
            C6492q0 q0Var = (C6492q0) rVar;
            for (C13088b0 f : q0Var.mo22040i().mo38112m0().mo38104g()) {
                arrayList.add(C6489q.m37894f(q0Var.mo22037g(), C6489q.C6491b.EQUAL, f));
            }
            return new C6477l(arrayList, C6477l.C6478a.OR);
        }
    }

    /* renamed from: i */
    public static List<C6494r> m52779i(C6477l lVar) {
        if (lVar.mo21989b().isEmpty()) {
            return Collections.emptyList();
        }
        C6494r g = m52777g(m52778h(lVar));
        C10432b.m52648d(m52781k(g), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        if (m52783m(g) || m52782l(g)) {
            return Collections.singletonList(g);
        }
        return g.mo21989b();
    }

    /* renamed from: j */
    private static boolean m52780j(C6494r rVar) {
        if (rVar instanceof C6477l) {
            C6477l lVar = (C6477l) rVar;
            if (lVar.mo21996j()) {
                for (C6494r next : lVar.mo21989b()) {
                    if (!m52783m(next) && !m52782l(next)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m52781k(C6494r rVar) {
        return m52783m(rVar) || m52782l(rVar) || m52780j(rVar);
    }

    /* renamed from: l */
    private static boolean m52782l(C6494r rVar) {
        return (rVar instanceof C6477l) && ((C6477l) rVar).mo21998l();
    }

    /* renamed from: m */
    private static boolean m52783m(C6494r rVar) {
        return rVar instanceof C6489q;
    }
}
