package p025c8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p211d8.C9888l;

/* renamed from: c8.s0 */
/* compiled from: MemoryEagerReferenceDelegate */
class C6821s0 implements C6793g1 {

    /* renamed from: a */
    private C6794h1 f31428a;

    /* renamed from: b */
    private final C6828w0 f31429b;

    /* renamed from: c */
    private Set<C9888l> f31430c;

    C6821s0(C6828w0 w0Var) {
        this.f31429b = w0Var;
    }

    /* renamed from: a */
    private boolean m39150a(C9888l lVar) {
        if (this.f31429b.mo22747h().mo22934k(lVar) || m39151c(lVar)) {
            return true;
        }
        C6794h1 h1Var = this.f31428a;
        if (h1Var == null || !h1Var.mo22815c(lVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m39151c(C9888l lVar) {
        for (C6825u0 l : this.f31429b.mo22904p()) {
            if (l.mo22900l(lVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo22784b() {
        C6830x0 q = this.f31429b.mo22746g();
        ArrayList arrayList = new ArrayList();
        for (C9888l next : this.f31430c) {
            if (!m39150a(next)) {
                arrayList.add(next);
            }
        }
        q.removeAll(arrayList);
        this.f31430c = null;
    }

    /* renamed from: d */
    public void mo22786d() {
        this.f31430c = new HashSet();
    }

    /* renamed from: e */
    public long mo22787e() {
        return -1;
    }

    /* renamed from: f */
    public void mo22788f(C6794h1 h1Var) {
        this.f31428a = h1Var;
    }

    /* renamed from: j */
    public void mo22792j(C9888l lVar) {
        if (m39150a(lVar)) {
            this.f31430c.remove(lVar);
        } else {
            this.f31430c.add(lVar);
        }
    }

    /* renamed from: l */
    public void mo22794l(C9888l lVar) {
        this.f31430c.remove(lVar);
    }

    /* renamed from: m */
    public void mo22795m(C9888l lVar) {
        this.f31430c.add(lVar);
    }

    /* renamed from: n */
    public void mo22796n(C9888l lVar) {
        this.f31430c.add(lVar);
    }

    /* renamed from: p */
    public void mo22798p(C6792f4 f4Var) {
        C6836y0 r = this.f31429b.mo22747h();
        Iterator<C9888l> it = r.mo22758e(f4Var.mo22807g()).iterator();
        while (it.hasNext()) {
            this.f31430c.add(it.next());
        }
        r.mo22935l(f4Var);
    }
}
