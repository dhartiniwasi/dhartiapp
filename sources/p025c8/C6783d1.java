package p025c8;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p008a8.C6452b1;
import p008a8.C6469g1;
import p025c8.C6805l;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9905w;
import p247h8.C10432b;
import p247h8.C10468v;
import p320p7.C12126c;
import p320p7.C12130e;

/* renamed from: c8.d1 */
/* compiled from: QueryEngine */
public class C6783d1 {

    /* renamed from: a */
    private C6809n f31319a;

    /* renamed from: b */
    private C6805l f31320b;

    /* renamed from: c */
    private boolean f31321c;

    /* renamed from: a */
    private C12126c<C9888l, C9885i> m38819a(Iterable<C9885i> iterable, C6452b1 b1Var, C9893q.C9894a aVar) {
        C12126c<C9888l, C9885i> h = this.f31319a.mo22856h(b1Var, aVar);
        for (C9885i next : iterable) {
            h = h.mo36618k(next.getKey(), next);
        }
        return h;
    }

    /* renamed from: b */
    private C12130e<C9885i> m38820b(C6452b1 b1Var, C12126c<C9888l, C9885i> cVar) {
        C12130e<C9885i> eVar = new C12130e<>(Collections.emptyList(), b1Var.mo21874c());
        Iterator<Map.Entry<C9888l, C9885i>> it = cVar.iterator();
        while (it.hasNext()) {
            C9885i iVar = (C9885i) it.next().getValue();
            if (b1Var.mo21896v(iVar)) {
                eVar = eVar.mo36638f(iVar);
            }
        }
        return eVar;
    }

    /* renamed from: c */
    private C12126c<C9888l, C9885i> m38821c(C6452b1 b1Var) {
        if (C10468v.m52769c()) {
            C10468v.m52767a("QueryEngine", "Using full collection scan to execute query: %s", b1Var.toString());
        }
        return this.f31319a.mo22856h(b1Var, C9893q.C9894a.f39725a);
    }

    /* renamed from: f */
    private boolean m38822f(C6452b1 b1Var, int i, C12130e<C9885i> eVar, C9905w wVar) {
        C9885i iVar;
        if (!b1Var.mo21889p()) {
            return false;
        }
        if (i != eVar.size()) {
            return true;
        }
        if (b1Var.mo21885l() == C6452b1.C6453a.LIMIT_TO_FIRST) {
            iVar = eVar.mo36634b();
        } else {
            iVar = eVar.mo36635c();
        }
        if (iVar == null) {
            return false;
        }
        if (iVar.mo32374e() || iVar.mo32381j().compareTo(wVar) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private C12126c<C9888l, C9885i> m38823g(C6452b1 b1Var) {
        if (b1Var.mo21897w()) {
            return null;
        }
        C6469g1 D = b1Var.mo21872D();
        C6805l.C6806a h = this.f31320b.mo22734h(D);
        if (h.equals(C6805l.C6806a.NONE)) {
            return null;
        }
        if (b1Var.mo21889p() && h.equals(C6805l.C6806a.PARTIAL)) {
            return m38823g(b1Var.mo21893t(-1));
        }
        List<C9888l> c = this.f31320b.mo22729c(D);
        C10432b.m52648d(c != null, "index manager must return results for partial and full indexes.", new Object[0]);
        C12126c<C9888l, C9885i> d = this.f31319a.mo22855d(c);
        C9893q.C9894a l = this.f31320b.mo22738l(D);
        C12130e<C9885i> b = m38820b(b1Var, d);
        if (m38822f(b1Var, c.size(), b, l.mo32334p())) {
            return m38823g(b1Var.mo21893t(-1));
        }
        return m38819a(b, b1Var, l);
    }

    /* renamed from: h */
    private C12126c<C9888l, C9885i> m38824h(C6452b1 b1Var, C12130e<C9888l> eVar, C9905w wVar) {
        if (b1Var.mo21897w() || wVar.equals(C9905w.f39751b)) {
            return null;
        }
        C12130e<C9885i> b = m38820b(b1Var, this.f31319a.mo22855d(eVar));
        if (m38822f(b1Var, eVar.size(), b, wVar)) {
            return null;
        }
        if (C10468v.m52769c()) {
            C10468v.m52767a("QueryEngine", "Re-using previous result from %s to execute query: %s", wVar.toString(), b1Var.toString());
        }
        return m38819a(b, b1Var, C9893q.C9894a.m50726j(wVar, -1));
    }

    /* renamed from: d */
    public C12126c<C9888l, C9885i> mo22768d(C6452b1 b1Var, C9905w wVar, C12130e<C9888l> eVar) {
        C10432b.m52648d(this.f31321c, "initialize() not called", new Object[0]);
        C12126c<C9888l, C9885i> g = m38823g(b1Var);
        if (g != null) {
            return g;
        }
        C12126c<C9888l, C9885i> h = m38824h(b1Var, eVar, wVar);
        if (h != null) {
            return h;
        }
        return m38821c(b1Var);
    }

    /* renamed from: e */
    public void mo22769e(C6809n nVar, C6805l lVar) {
        this.f31319a = nVar;
        this.f31320b = lVar;
        this.f31321c = true;
    }
}
