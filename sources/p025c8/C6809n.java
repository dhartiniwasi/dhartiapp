package p025c8;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p008a8.C6452b1;
import p211d8.C9885i;
import p211d8.C9886j;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9899s;
import p211d8.C9903u;
import p220e8.C10007d;
import p220e8.C10009f;
import p220e8.C10010g;
import p220e8.C10014k;
import p220e8.C10015l;
import p246h7.C10428q;
import p247h8.C10432b;
import p320p7.C12126c;

/* renamed from: c8.n */
/* compiled from: LocalDocumentsView */
class C6809n {

    /* renamed from: a */
    private final C6799i1 f31390a;

    /* renamed from: b */
    private final C6837z0 f31391b;

    /* renamed from: c */
    private final C6775b f31392c;

    /* renamed from: d */
    private final C6805l f31393d;

    C6809n(C6799i1 i1Var, C6837z0 z0Var, C6775b bVar, C6805l lVar) {
        this.f31390a = i1Var;
        this.f31391b = z0Var;
        this.f31392c = bVar;
        this.f31393d = lVar;
    }

    /* renamed from: a */
    private Map<C9888l, C6776b1> m39045a(Map<C9888l, C9899s> map, Map<C9888l, C10014k> map2, Set<C9888l> set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C9899s next : map.values()) {
            C10014k kVar = map2.get(next.getKey());
            if (set.contains(next.getKey()) && (kVar == null || (kVar.mo32577d() instanceof C10015l))) {
                hashMap.put(next.getKey(), next);
            } else if (kVar != null) {
                hashMap2.put(next.getKey(), kVar.mo32577d().mo32583e());
                kVar.mo32577d().mo32581a(next, kVar.mo32577d().mo32583e(), C10428q.m52634j());
            } else {
                hashMap2.put(next.getKey(), C10007d.f39958b);
            }
        }
        hashMap2.putAll(m39051m(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry next2 : map.entrySet()) {
            hashMap3.put((C9888l) next2.getKey(), new C6776b1((C9885i) next2.getValue(), (C10007d) hashMap2.get(next2.getKey())));
        }
        return hashMap3;
    }

    /* renamed from: b */
    private C9899s m39046b(C9888l lVar, C10014k kVar) {
        if (kVar == null || (kVar.mo32577d() instanceof C10015l)) {
            return this.f31390a.mo22775f(lVar);
        }
        return C9899s.m50750p(lVar);
    }

    /* renamed from: e */
    private C12126c<C9888l, C9885i> m39047e(C6452b1 b1Var, C9893q.C9894a aVar) {
        C10432b.m52648d(b1Var.mo21887n().mo32356p(), "Currently we only support collection group queries at the root.", new Object[0]);
        String f = b1Var.mo21878f();
        C12126c<C9888l, C9885i> a = C9886j.m50690a();
        for (C9903u b : this.f31393d.mo22733g(f)) {
            Iterator<Map.Entry<C9888l, C9885i>> it = m39048f(b1Var.mo21873a((C9903u) b.mo32347b(f)), aVar).iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                a = a.mo36618k((C9888l) next.getKey(), (C9885i) next.getValue());
            }
        }
        return a;
    }

    /* renamed from: f */
    private C12126c<C9888l, C9885i> m39048f(C6452b1 b1Var, C9893q.C9894a aVar) {
        Map<C9888l, C10014k> f = this.f31392c.mo22723f(b1Var.mo21887n(), aVar.mo32333o());
        Map<C9888l, C9899s> a = this.f31390a.mo22770a(b1Var, aVar, f.keySet());
        for (Map.Entry next : f.entrySet()) {
            if (!a.containsKey(next.getKey())) {
                a.put((C9888l) next.getKey(), C9899s.m50750p((C9888l) next.getKey()));
            }
        }
        C12126c<C9888l, C9885i> a2 = C9886j.m50690a();
        for (Map.Entry next2 : a.entrySet()) {
            C10014k kVar = f.get(next2.getKey());
            if (kVar != null) {
                kVar.mo32577d().mo32581a((C9899s) next2.getValue(), C10007d.f39958b, C10428q.m52634j());
            }
            if (b1Var.mo21896v((C9885i) next2.getValue())) {
                a2 = a2.mo36618k((C9888l) next2.getKey(), (C9885i) next2.getValue());
            }
        }
        return a2;
    }

    /* renamed from: g */
    private C12126c<C9888l, C9885i> m39049g(C9903u uVar) {
        C12126c<C9888l, C9885i> a = C9886j.m50690a();
        C9885i c = mo22854c(C9888l.m50697n(uVar));
        return c.mo32371b() ? a.mo36618k(c.getKey(), c) : a;
    }

    /* renamed from: l */
    private void m39050l(Map<C9888l, C10014k> map, Set<C9888l> set) {
        TreeSet treeSet = new TreeSet();
        for (C9888l next : set) {
            if (!map.containsKey(next)) {
                treeSet.add(next);
            }
        }
        map.putAll(this.f31392c.mo22718a(treeSet));
    }

    /* renamed from: m */
    private Map<C9888l, C10007d> m39051m(Map<C9888l, C9899s> map) {
        List<C10010g> d = this.f31391b.mo22885d(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (C10010g next : d) {
            for (C9888l next2 : next.mo32612f()) {
                C9899s sVar = map.get(next2);
                if (sVar != null) {
                    hashMap.put(next2, next.mo32607b(sVar, hashMap.containsKey(next2) ? (C10007d) hashMap.get(next2) : C10007d.f39958b));
                    int e = next.mo32610e();
                    if (!treeMap.containsKey(Integer.valueOf(e))) {
                        treeMap.put(Integer.valueOf(e), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(e))).add(next2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (C9888l lVar : (Set) entry.getValue()) {
                if (!hashSet.contains(lVar)) {
                    C10009f c = C10009f.m51101c(map.get(lVar), (C10007d) hashMap.get(lVar));
                    if (c != null) {
                        hashMap2.put(lVar, c);
                    }
                    hashSet.add(lVar);
                }
            }
            this.f31392c.mo22721d(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9885i mo22854c(C9888l lVar) {
        C10014k c = this.f31392c.mo22720c(lVar);
        C9899s b = m39046b(lVar, c);
        if (c != null) {
            c.mo32577d().mo32581a(b, C10007d.f39958b, C10428q.m52634j());
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12126c<C9888l, C9885i> mo22855d(Iterable<C9888l> iterable) {
        return mo22857i(this.f31390a.mo22772c(iterable), new HashSet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C12126c<C9888l, C9885i> mo22856h(C6452b1 b1Var, C9893q.C9894a aVar) {
        C9903u n = b1Var.mo21887n();
        if (b1Var.mo21892s()) {
            return m39049g(n);
        }
        if (b1Var.mo21891r()) {
            return m39047e(b1Var, aVar);
        }
        return m39048f(b1Var, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C12126c<C9888l, C9885i> mo22857i(Map<C9888l, C9899s> map, Set<C9888l> set) {
        HashMap hashMap = new HashMap();
        m39050l(hashMap, map.keySet());
        C12126c<C9888l, C9885i> a = C9886j.m50690a();
        for (Map.Entry next : m39045a(map, hashMap, set).entrySet()) {
            a = a.mo36618k((C9888l) next.getKey(), ((C6776b1) next.getValue()).mo22724a());
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C6808m mo22858j(String str, C9893q.C9894a aVar, int i) {
        Map<C9888l, C10014k> map;
        Map<C9888l, C9899s> d = this.f31390a.mo22773d(str, aVar, i);
        if (i - d.size() > 0) {
            map = this.f31392c.mo22722e(str, aVar.mo32333o(), i - d.size());
        } else {
            map = Collections.emptyMap();
        }
        int i2 = -1;
        for (C10014k next : map.values()) {
            if (!d.containsKey(next.mo32625b())) {
                d.put(next.mo32625b(), m39046b(next.mo32625b(), next));
            }
            i2 = Math.max(i2, next.mo32576c());
        }
        m39050l(map, d.keySet());
        return C6808m.m39042a(i2, m39045a(d, map, Collections.emptySet()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Map<C9888l, C6776b1> mo22859k(Map<C9888l, C9899s> map) {
        HashMap hashMap = new HashMap();
        m39050l(hashMap, map.keySet());
        return m39045a(map, hashMap, new HashSet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo22860n(Set<C9888l> set) {
        m39051m(this.f31390a.mo22772c(set));
    }
}
