package p238g8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p008a8.C6469g1;
import p008a8.C6480n;
import p025c8.C6787e1;
import p025c8.C6792f4;
import p211d8.C9888l;
import p211d8.C9899s;
import p211d8.C9905w;
import p238g8.C10275t0;
import p247h8.C10432b;
import p320p7.C12130e;

/* renamed from: g8.u0 */
/* compiled from: WatchChangeAggregator */
public class C10282u0 {

    /* renamed from: a */
    private final C10284b f40852a;

    /* renamed from: b */
    private final Map<Integer, C10272s0> f40853b = new HashMap();

    /* renamed from: c */
    private Map<C9888l, C9899s> f40854c = new HashMap();

    /* renamed from: d */
    private Map<C9888l, Set<Integer>> f40855d = new HashMap();

    /* renamed from: e */
    private Set<Integer> f40856e = new HashSet();

    /* renamed from: g8.u0$a */
    /* compiled from: WatchChangeAggregator */
    static /* synthetic */ class C10283a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40857a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                g8.t0$e[] r0 = p238g8.C10275t0.C10280e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40857a = r0
                g8.t0$e r1 = p238g8.C10275t0.C10280e.NoChange     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40857a     // Catch:{ NoSuchFieldError -> 0x001d }
                g8.t0$e r1 = p238g8.C10275t0.C10280e.Added     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40857a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g8.t0$e r1 = p238g8.C10275t0.C10280e.Removed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40857a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g8.t0$e r1 = p238g8.C10275t0.C10280e.Current     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40857a     // Catch:{ NoSuchFieldError -> 0x003e }
                g8.t0$e r1 = p238g8.C10275t0.C10280e.Reset     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p238g8.C10282u0.C10283a.<clinit>():void");
        }
    }

    /* renamed from: g8.u0$b */
    /* compiled from: WatchChangeAggregator */
    public interface C10284b {
        /* renamed from: a */
        C6792f4 mo33018a(int i);

        /* renamed from: b */
        C12130e<C9888l> mo33019b(int i);
    }

    public C10282u0(C10284b bVar) {
        this.f40852a = bVar;
    }

    /* renamed from: a */
    private void m52008a(int i, C9899s sVar) {
        C6480n.C6481a aVar;
        if (m52013j(i)) {
            if (m52017p(i, sVar.getKey())) {
                aVar = C6480n.C6481a.MODIFIED;
            } else {
                aVar = C6480n.C6481a.ADDED;
            }
            m52010d(i).mo33039a(sVar.getKey(), aVar);
            this.f40854c.put(sVar.getKey(), sVar);
            m52009c(sVar.getKey()).add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private Set<Integer> m52009c(C9888l lVar) {
        Set<Integer> set = this.f40855d.get(lVar);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f40855d.put(lVar, hashSet);
        return hashSet;
    }

    /* renamed from: d */
    private C10272s0 m52010d(int i) {
        C10272s0 s0Var = this.f40853b.get(Integer.valueOf(i));
        if (s0Var != null) {
            return s0Var;
        }
        C10272s0 s0Var2 = new C10272s0();
        this.f40853b.put(Integer.valueOf(i), s0Var2);
        return s0Var2;
    }

    /* renamed from: e */
    private int m52011e(int i) {
        C10270r0 j = m52010d(i).mo33048j();
        return (this.f40852a.mo33019b(i).size() + j.mo33032b().size()) - j.mo33034d().size();
    }

    /* renamed from: f */
    private Collection<Integer> m52012f(C10275t0.C10279d dVar) {
        List<Integer> d = dVar.mo33063d();
        if (!d.isEmpty()) {
            return d;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.f40853b.keySet()) {
            if (m52013j(next.intValue())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private boolean m52013j(int i) {
        return m52014k(i) != null;
    }

    /* renamed from: k */
    private C6792f4 m52014k(int i) {
        C10272s0 s0Var = this.f40853b.get(Integer.valueOf(i));
        if (s0Var == null || !s0Var.mo33043e()) {
            return this.f40852a.mo33018a(i);
        }
        return null;
    }

    /* renamed from: m */
    private void m52015m(int i, C9888l lVar, C9899s sVar) {
        if (m52013j(i)) {
            C10272s0 d = m52010d(i);
            if (m52017p(i, lVar)) {
                d.mo33039a(lVar, C6480n.C6481a.REMOVED);
            } else {
                d.mo33047i(lVar);
            }
            m52009c(lVar).add(Integer.valueOf(i));
            if (sVar != null) {
                this.f40854c.put(lVar, sVar);
            }
        }
    }

    /* renamed from: o */
    private void m52016o(int i) {
        C10432b.m52648d(this.f40853b.get(Integer.valueOf(i)) != null && !this.f40853b.get(Integer.valueOf(i)).mo33043e(), "Should only reset active targets", new Object[0]);
        this.f40853b.put(Integer.valueOf(i), new C10272s0());
        Iterator<C9888l> it = this.f40852a.mo33019b(i).iterator();
        while (it.hasNext()) {
            m52015m(i, it.next(), (C9899s) null);
        }
    }

    /* renamed from: p */
    private boolean m52017p(int i, C9888l lVar) {
        return this.f40852a.mo33019b(i).contains(lVar);
    }

    /* renamed from: b */
    public C10247j0 mo33067b(C9905w wVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f40853b.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            C10272s0 s0Var = (C10272s0) next.getValue();
            C6792f4 k = m52014k(intValue);
            if (k != null) {
                if (s0Var.mo33042d() && k.mo22806f().mo21949s()) {
                    C9888l n = C9888l.m50697n(k.mo22806f().mo21944n());
                    if (this.f40854c.get(n) == null && !m52017p(intValue, n)) {
                        m52015m(intValue, n, C9899s.m50751q(n, wVar));
                    }
                }
                if (s0Var.mo33041c()) {
                    hashMap.put(Integer.valueOf(intValue), s0Var.mo33048j());
                    s0Var.mo33040b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry next2 : this.f40855d.entrySet()) {
            C9888l lVar = (C9888l) next2.getKey();
            boolean z = true;
            Iterator it = ((Set) next2.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    C6792f4 k2 = m52014k(((Integer) it.next()).intValue());
                    if (k2 != null && !k2.mo22801b().equals(C6787e1.LIMBO_RESOLUTION)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                hashSet.add(lVar);
            }
        }
        for (C9899s u : this.f40854c.values()) {
            u.mo32425u(wVar);
        }
        C10247j0 j0Var = new C10247j0(wVar, Collections.unmodifiableMap(hashMap), Collections.unmodifiableSet(this.f40856e), Collections.unmodifiableMap(this.f40854c), Collections.unmodifiableSet(hashSet));
        this.f40854c = new HashMap();
        this.f40855d = new HashMap();
        this.f40856e = new HashSet();
        return j0Var;
    }

    /* renamed from: g */
    public void mo33068g(C10275t0.C10277b bVar) {
        C9899s b = bVar.mo33051b();
        C9888l a = bVar.mo33050a();
        for (Integer intValue : bVar.mo33053d()) {
            int intValue2 = intValue.intValue();
            if (b == null || !b.mo32371b()) {
                m52015m(intValue2, a, b);
            } else {
                m52008a(intValue2, b);
            }
        }
        for (Integer intValue3 : bVar.mo33052c()) {
            m52015m(intValue3.intValue(), a, bVar.mo33051b());
        }
    }

    /* renamed from: h */
    public void mo33069h(C10275t0.C10278c cVar) {
        int b = cVar.mo33058b();
        int a = cVar.mo33057a().mo33011a();
        C6792f4 k = m52014k(b);
        if (k != null) {
            C6469g1 f = k.mo22806f();
            if (f.mo21949s()) {
                if (a == 0) {
                    C9888l n = C9888l.m50697n(f.mo21944n());
                    m52015m(b, n, C9899s.m50751q(n, C9905w.f39751b));
                    return;
                }
                C10432b.m52648d(a == 1, "Single document existence filter with count: %d", Integer.valueOf(a));
            } else if (((long) m52011e(b)) != ((long) a)) {
                m52016o(b);
                this.f40856e.add(Integer.valueOf(b));
            }
        }
    }

    /* renamed from: i */
    public void mo33070i(C10275t0.C10279d dVar) {
        for (Integer intValue : m52012f(dVar)) {
            int intValue2 = intValue.intValue();
            C10272s0 d = m52010d(intValue2);
            int i = C10283a.f40857a[dVar.mo33061b().ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    d.mo33046h();
                    if (!d.mo33043e()) {
                        d.mo33040b();
                    }
                    d.mo33049k(dVar.mo33062c());
                } else if (i == 3) {
                    d.mo33046h();
                    if (!d.mo33043e()) {
                        mo33072n(intValue2);
                    }
                    if (dVar.mo33060a() != null) {
                        z = false;
                    }
                    C10432b.m52648d(z, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i != 4) {
                    if (i != 5) {
                        throw C10432b.m52645a("Unknown target watch change state: %s", dVar.mo33061b());
                    } else if (m52013j(intValue2)) {
                        m52016o(intValue2);
                        d.mo33049k(dVar.mo33062c());
                    }
                } else if (m52013j(intValue2)) {
                    d.mo33044f();
                    d.mo33049k(dVar.mo33062c());
                }
            } else if (m52013j(intValue2)) {
                d.mo33049k(dVar.mo33062c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo33071l(int i) {
        m52010d(i).mo33045g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo33072n(int i) {
        this.f40853b.remove(Integer.valueOf(i));
    }
}
