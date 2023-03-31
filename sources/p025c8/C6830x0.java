package p025c8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p008a8.C6452b1;
import p211d8.C9885i;
import p211d8.C9886j;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9899s;
import p211d8.C9903u;
import p211d8.C9905w;
import p247h8.C10432b;
import p320p7.C12126c;

/* renamed from: c8.x0 */
/* compiled from: MemoryRemoteDocumentCache */
final class C6830x0 implements C6799i1 {

    /* renamed from: a */
    private C12126c<C9888l, C9885i> f31453a = C9886j.m50690a();

    /* renamed from: b */
    private C6805l f31454b;

    C6830x0() {
    }

    /* renamed from: a */
    public Map<C9888l, C9899s> mo22770a(C6452b1 b1Var, C9893q.C9894a aVar, Set<C9888l> set) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C9888l, C9885i>> l = this.f31453a.mo36619l(C9888l.m50697n((C9903u) b1Var.mo21887n().mo32347b("")));
        while (l.hasNext()) {
            Map.Entry next = l.next();
            C9885i iVar = (C9885i) next.getValue();
            C9888l lVar = (C9888l) next.getKey();
            if (!b1Var.mo21887n().mo32357q(lVar.mo32390s())) {
                break;
            } else if (lVar.mo32390s().mo32358r() <= b1Var.mo21887n().mo32358r() + 1 && C9893q.C9894a.m50727k(iVar).compareTo(aVar) > 0) {
                if (set.contains(iVar.getKey()) || b1Var.mo21896v(iVar)) {
                    hashMap.put(iVar.getKey(), iVar.mo32370a());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public void mo22771b(C9899s sVar, C9905w wVar) {
        C10432b.m52648d(this.f31454b != null, "setIndexManager() not called", new Object[0]);
        C10432b.m52648d(!wVar.equals(C9905w.f39751b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f31453a = this.f31453a.mo36618k(sVar.getKey(), sVar.mo32370a().mo32425u(wVar));
        this.f31454b.mo22735i(sVar.getKey().mo32388q());
    }

    /* renamed from: c */
    public Map<C9888l, C9899s> mo22772c(Iterable<C9888l> iterable) {
        HashMap hashMap = new HashMap();
        for (C9888l next : iterable) {
            hashMap.put(next, mo22775f(next));
        }
        return hashMap;
    }

    /* renamed from: d */
    public Map<C9888l, C9899s> mo22773d(String str, C9893q.C9894a aVar, int i) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    /* renamed from: e */
    public void mo22774e(C6805l lVar) {
        this.f31454b = lVar;
    }

    /* renamed from: f */
    public C9899s mo22775f(C9888l lVar) {
        C9885i c = this.f31453a.mo36611c(lVar);
        return c != null ? c.mo32370a() : C9899s.m50750p(lVar);
    }

    public void removeAll(Collection<C9888l> collection) {
        C10432b.m52648d(this.f31454b != null, "setIndexManager() not called", new Object[0]);
        C12126c<C9888l, C9885i> a = C9886j.m50690a();
        for (C9888l next : collection) {
            this.f31453a = this.f31453a.mo36620o(next);
            a = a.mo36618k(next, C9899s.m50751q(next, C9905w.f39751b));
        }
        this.f31454b.mo22728b(a);
    }
}
