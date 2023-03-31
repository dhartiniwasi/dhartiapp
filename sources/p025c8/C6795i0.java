package p025c8;

import android.util.SparseArray;
import com.google.protobuf.C8153i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p008a8.C6452b1;
import p008a8.C6469g1;
import p008a8.C6472h1;
import p025c8.C6812o0;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9899s;
import p211d8.C9902t;
import p211d8.C9903u;
import p211d8.C9905w;
import p220e8.C10009f;
import p220e8.C10010g;
import p220e8.C10011h;
import p220e8.C10015l;
import p220e8.C10016m;
import p238g8.C10247j0;
import p238g8.C10270r0;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10468v;
import p320p7.C12126c;
import p320p7.C12130e;
import p404y7.C13073j;
import p413z7.C13464a;
import p413z7.C13468e;
import p413z7.C13473j;

/* renamed from: c8.i0 */
/* compiled from: LocalStore */
public final class C6795i0 implements C13464a {

    /* renamed from: n */
    private static final long f31349n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a */
    private final C6778c1 f31350a;

    /* renamed from: b */
    private C6805l f31351b;

    /* renamed from: c */
    private C6837z0 f31352c;

    /* renamed from: d */
    private C6775b f31353d;

    /* renamed from: e */
    private final C6799i1 f31354e;

    /* renamed from: f */
    private C6809n f31355f;

    /* renamed from: g */
    private final C6783d1 f31356g;

    /* renamed from: h */
    private final C6794h1 f31357h;

    /* renamed from: i */
    private final C6788e4 f31358i;

    /* renamed from: j */
    private final C6773a f31359j;

    /* renamed from: k */
    private final SparseArray<C6792f4> f31360k = new SparseArray<>();

    /* renamed from: l */
    private final Map<C6469g1, Integer> f31361l = new HashMap();

    /* renamed from: m */
    private final C6472h1 f31362m;

    /* renamed from: c8.i0$b */
    /* compiled from: LocalStore */
    private static class C6797b {

        /* renamed from: a */
        C6792f4 f31363a;

        /* renamed from: b */
        int f31364b;

        private C6797b() {
        }
    }

    /* renamed from: c8.i0$c */
    /* compiled from: LocalStore */
    private static class C6798c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<C9888l, C9899s> f31365a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Set<C9888l> f31366b;

        private C6798c(Map<C9888l, C9899s> map, Set<C9888l> set) {
            this.f31365a = map;
            this.f31366b = set;
        }
    }

    public C6795i0(C6778c1 c1Var, C6783d1 d1Var, C13073j jVar) {
        C10432b.m52648d(c1Var.mo22748i(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f31350a = c1Var;
        this.f31356g = d1Var;
        C6788e4 h = c1Var.mo22747h();
        this.f31358i = h;
        this.f31359j = c1Var.mo22740a();
        this.f31362m = C6472h1.m37734b(h.mo22756c());
        this.f31354e = c1Var.mo22746g();
        C6794h1 h1Var = new C6794h1();
        this.f31357h = h1Var;
        c1Var.mo22745f().mo22788f(h1Var);
        m38923M(jVar);
    }

    /* renamed from: D */
    private Set<C9888l> m38922D(C10011h hVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < hVar.mo32620e().size(); i++) {
            if (!hVar.mo32620e().get(i).mo32622a().isEmpty()) {
                hashSet.add(hVar.mo32617b().mo32614h().get(i).mo32598g());
            }
        }
        return hashSet;
    }

    /* renamed from: M */
    private void m38923M(C13073j jVar) {
        C6805l c = this.f31350a.mo22742c(jVar);
        this.f31351b = c;
        this.f31352c = this.f31350a.mo22743d(jVar, c);
        C6775b b = this.f31350a.mo22741b(jVar);
        this.f31353d = b;
        this.f31355f = new C6809n(this.f31354e, this.f31352c, b, this.f31351b);
        this.f31354e.mo22774e(this.f31351b);
        this.f31356g.mo22769e(this.f31355f, this.f31351b);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ C12126c m38924N(C10011h hVar) {
        C10010g b = hVar.mo32617b();
        this.f31352c.mo22882a(b, hVar.mo32621f());
        m38963x(hVar);
        this.f31352c.mo22883b();
        this.f31353d.mo22719b(hVar.mo32617b().mo32610e());
        this.f31355f.mo22860n(m38922D(hVar));
        return this.f31355f.mo22855d(b.mo32612f());
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m38925O(C6797b bVar, C6469g1 g1Var) {
        int c = this.f31362m.mo21953c();
        bVar.f31364b = c;
        C6792f4 f4Var = new C6792f4(g1Var, c, this.f31350a.mo22745f().mo22787e(), C6787e1.LISTEN);
        bVar.f31363a = f4Var;
        this.f31358i.mo22757d(f4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ C12126c m38926P(C12126c cVar, C6792f4 f4Var) {
        C12130e<C9888l> j = C9888l.m50695j();
        HashMap hashMap = new HashMap();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C9888l lVar = (C9888l) entry.getKey();
            C9899s sVar = (C9899s) entry.getValue();
            if (sVar.mo32371b()) {
                j = j.mo36638f(lVar);
            }
            hashMap.put(lVar, sVar);
        }
        this.f31358i.mo22760g(f4Var.mo22807g());
        this.f31358i.mo22763j(j, f4Var.mo22807g());
        C6798c g0 = m38946g0(hashMap);
        return this.f31355f.mo22857i(g0.f31365a, g0.f31366b);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ C12126c m38927Q(C10247j0 j0Var, C9905w wVar) {
        Map<Integer, C10270r0> d = j0Var.mo32967d();
        long e = this.f31350a.mo22745f().mo22787e();
        for (Map.Entry next : d.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            C10270r0 r0Var = (C10270r0) next.getValue();
            C6792f4 f4Var = this.f31360k.get(intValue);
            if (f4Var != null) {
                this.f31358i.mo22755b(r0Var.mo33034d(), intValue);
                this.f31358i.mo22763j(r0Var.mo33032b(), intValue);
                C6792f4 j = f4Var.mo22811j(e);
                if (j0Var.mo32968e().contains(Integer.valueOf(intValue))) {
                    C8153i iVar = C8153i.f34908b;
                    C9905w wVar2 = C9905w.f39751b;
                    j = j.mo22810i(iVar, wVar2).mo22808h(wVar2);
                } else if (!r0Var.mo33035e().isEmpty()) {
                    j = j.mo22810i(r0Var.mo33035e(), j0Var.mo32966c());
                }
                this.f31360k.put(intValue, j);
                if (m38952l0(f4Var, j, r0Var)) {
                    this.f31358i.mo22754a(j);
                }
            }
        }
        Map<C9888l, C9899s> a = j0Var.mo32964a();
        Set<C9888l> b = j0Var.mo32965b();
        for (C9888l next2 : a.keySet()) {
            if (b.contains(next2)) {
                this.f31350a.mo22745f().mo22792j(next2);
            }
        }
        C6798c g0 = m38946g0(a);
        Map a2 = g0.f31365a;
        C9905w f = this.f31358i.mo22759f();
        if (!wVar.equals(C9905w.f39751b)) {
            C10432b.m52648d(wVar.compareTo(f) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", wVar, f);
            this.f31358i.mo22762i(wVar);
        }
        return this.f31355f.mo22857i(a2, g0.f31366b);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ C6812o0.C6815c m38928R(C6812o0 o0Var) {
        return o0Var.mo22874f(this.f31360k);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m38929S(List list) {
        Collection<C9893q> d = this.f31351b.mo22730d();
        Comparator<C9893q> comparator = C9893q.f39724b;
        C6805l lVar = this.f31351b;
        Objects.requireNonNull(lVar);
        C1929p pVar = new C1929p(lVar);
        C6805l lVar2 = this.f31351b;
        Objects.requireNonNull(lVar2);
        C10449g0.m52717q(d, list, comparator, pVar, new C1965z(lVar2));
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ C13473j m38930T(String str) {
        return this.f31359j.mo22716d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ Boolean m38931U(C13468e eVar) {
        C13468e b = this.f31359j.mo22714b(eVar.mo38564a());
        return Boolean.valueOf(b != null && b.mo38565b().compareTo(eVar.mo38565b()) >= 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m38932V(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6800j0 j0Var = (C6800j0) it.next();
            int d = j0Var.mo22848d();
            this.f31357h.mo22814b(j0Var.mo22846b(), d);
            C12130e<C9888l> c = j0Var.mo22847c();
            Iterator<C9888l> it2 = c.iterator();
            while (it2.hasNext()) {
                this.f31350a.mo22745f().mo22795m(it2.next());
            }
            this.f31357h.mo22818g(c, d);
            if (!j0Var.mo22849e()) {
                C6792f4 f4Var = this.f31360k.get(d);
                C10432b.m52648d(f4Var != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(d));
                this.f31360k.put(d, f4Var.mo22808h(f4Var.mo22804e()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ C12126c m38933W(int i) {
        C10010g i2 = this.f31352c.mo22890i(i);
        C10432b.m52648d(i2 != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f31352c.mo22884c(i2);
        this.f31352c.mo22883b();
        this.f31353d.mo22719b(i);
        this.f31355f.mo22860n(i2.mo32612f());
        return this.f31355f.mo22855d(i2.mo32612f());
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m38934X(int i) {
        C6792f4 f4Var = this.f31360k.get(i);
        C10432b.m52648d(f4Var != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
        Iterator<C9888l> it = this.f31357h.mo22819h(i).iterator();
        while (it.hasNext()) {
            this.f31350a.mo22745f().mo22795m(it.next());
        }
        this.f31350a.mo22745f().mo22798p(f4Var);
        this.f31360k.remove(i);
        this.f31361l.remove(f4Var.mo22806f());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m38935Y(C13468e eVar) {
        this.f31359j.mo22713a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m38936Z(C13473j jVar, C6792f4 f4Var, int i, C12130e eVar) {
        if (jVar.mo38591c().compareTo(f4Var.mo22804e()) > 0) {
            C6792f4 i2 = f4Var.mo22810i(C8153i.f34908b, jVar.mo38591c());
            this.f31360k.append(i, i2);
            this.f31358i.mo22754a(i2);
            this.f31358i.mo22760g(i);
            this.f31358i.mo22763j(eVar, i);
        }
        this.f31359j.mo22715c(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m38937a0(C8153i iVar) {
        this.f31352c.mo22887f(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m38938b0() {
        this.f31351b.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m38939c0() {
        this.f31352c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ C6808m m38941d0(Set set, List list, C10428q qVar) {
        Map<C9888l, C9899s> c = this.f31354e.mo22772c(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry next : c.entrySet()) {
            if (!((C9899s) next.getValue()).mo32421n()) {
                hashSet.add((C9888l) next.getKey());
            }
        }
        Map<C9888l, C6776b1> k = this.f31355f.mo22859k(c);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10009f fVar = (C10009f) it.next();
            C9902t d = fVar.mo32596d(k.get(fVar.mo32598g()).mo22724a());
            if (d != null) {
                arrayList.add(new C10015l(fVar.mo32598g(), d, d.mo32432i(), C10016m.m51148a(true)));
            }
        }
        C10010g e = this.f31352c.mo22886e(qVar, arrayList, list);
        this.f31353d.mo22721d(e.mo32610e(), e.mo32606a(k, hashSet));
        return C6808m.m39042a(e.mo32610e(), k);
    }

    /* renamed from: e0 */
    private static C6469g1 m38943e0(String str) {
        return C6452b1.m37619b(C9903u.m50784w("__bundle__/docs/" + str)).mo21872D();
    }

    /* renamed from: g0 */
    private C6798c m38946g0(Map<C9888l, C9899s> map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<C9888l, C9899s> c = this.f31354e.mo22772c(map.keySet());
        for (Map.Entry next : map.entrySet()) {
            C9888l lVar = (C9888l) next.getKey();
            C9899s sVar = (C9899s) next.getValue();
            C9899s sVar2 = c.get(lVar);
            if (sVar.mo32371b() != sVar2.mo32371b()) {
                hashSet.add(lVar);
            }
            if (sVar.mo32379h() && sVar.mo32381j().equals(C9905w.f39751b)) {
                arrayList.add(sVar.getKey());
                hashMap.put(lVar, sVar);
            } else if (!sVar2.mo32421n() || sVar.mo32381j().compareTo(sVar2.mo32381j()) > 0 || (sVar.mo32381j().compareTo(sVar2.mo32381j()) == 0 && sVar2.mo32374e())) {
                C10432b.m52648d(!C9905w.f39751b.equals(sVar.mo32375f()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f31354e.mo22771b(sVar, sVar.mo32375f());
                hashMap.put(lVar, sVar);
            } else {
                C10468v.m52767a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", lVar, sVar2.mo32381j(), sVar.mo32381j());
            }
        }
        this.f31354e.removeAll(arrayList);
        return new C6798c(hashMap, hashSet);
    }

    /* renamed from: l0 */
    private static boolean m38952l0(C6792f4 f4Var, C6792f4 f4Var2, C10270r0 r0Var) {
        if (!f4Var.mo22802c().isEmpty() && f4Var2.mo22804e().mo32439b().mo33499c() - f4Var.mo22804e().mo32439b().mo33499c() < f31349n && r0Var.mo33032b().size() + r0Var.mo33033c().size() + r0Var.mo33034d().size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    private void m38955n0() {
        this.f31350a.mo22750k("Start IndexManager", new C1937r(this));
    }

    /* renamed from: o0 */
    private void m38957o0() {
        this.f31350a.mo22750k("Start MutationQueue", new C1934q(this));
    }

    /* renamed from: x */
    private void m38963x(C10011h hVar) {
        C10010g b = hVar.mo32617b();
        for (C9888l next : b.mo32612f()) {
            C9899s f = this.f31354e.mo22775f(next);
            C9905w c = hVar.mo32619d().mo36611c(next);
            C10432b.m52648d(c != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (f.mo32381j().compareTo(c) < 0) {
                b.mo32608c(f, hVar);
                if (f.mo32421n()) {
                    this.f31354e.mo22771b(f, hVar.mo32618c());
                }
            }
        }
        this.f31352c.mo22884c(b);
    }

    /* renamed from: A */
    public C6790f1 mo22820A(C6452b1 b1Var, boolean z) {
        C9905w wVar;
        C12130e<C9888l> eVar;
        C6792f4 J = mo22828J(b1Var.mo21872D());
        C9905w wVar2 = C9905w.f39751b;
        C12130e<C9888l> j = C9888l.m50695j();
        if (J != null) {
            wVar = J.mo22800a();
            eVar = this.f31358i.mo22758e(J.mo22807g());
        } else {
            eVar = j;
            wVar = wVar2;
        }
        C6783d1 d1Var = this.f31356g;
        if (z) {
            wVar2 = wVar;
        }
        return new C6790f1(d1Var.mo22768d(b1Var, wVar2, eVar), eVar);
    }

    /* renamed from: B */
    public int mo22821B() {
        return this.f31352c.mo22889h();
    }

    /* renamed from: C */
    public C6805l mo22822C() {
        return this.f31351b;
    }

    /* renamed from: E */
    public C9905w mo22823E() {
        return this.f31358i.mo22759f();
    }

    /* renamed from: F */
    public C8153i mo22824F() {
        return this.f31352c.mo22891j();
    }

    /* renamed from: G */
    public C6809n mo22825G() {
        return this.f31355f;
    }

    /* renamed from: H */
    public C13473j mo22826H(String str) {
        return (C13473j) this.f31350a.mo22749j("Get named query", new C1892e0(this, str));
    }

    /* renamed from: I */
    public C10010g mo22827I(int i) {
        return this.f31352c.mo22888g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C6792f4 mo22828J(C6469g1 g1Var) {
        Integer num = this.f31361l.get(g1Var);
        if (num != null) {
            return this.f31360k.get(num.intValue());
        }
        return this.f31358i.mo22761h(g1Var);
    }

    /* renamed from: K */
    public C12126c<C9888l, C9885i> mo22829K(C13073j jVar) {
        List<C10010g> k = this.f31352c.mo22892k();
        m38923M(jVar);
        m38955n0();
        m38957o0();
        List<C10010g> k2 = this.f31352c.mo22892k();
        C12130e<C9888l> j = C9888l.m50695j();
        for (List<C10010g> it : Arrays.asList(new List[]{k, k2})) {
            for (C10010g h : it) {
                for (C10009f g : h.mo32614h()) {
                    j = j.mo36638f(g.mo32598g());
                }
            }
        }
        return this.f31355f.mo22855d(j);
    }

    /* renamed from: L */
    public boolean mo22830L(C13468e eVar) {
        return ((Boolean) this.f31350a.mo22749j("Has newer bundle", new C1902h0(this, eVar))).booleanValue();
    }

    /* renamed from: a */
    public C12126c<C9888l, C9885i> mo22831a(C12126c<C9888l, C9899s> cVar, String str) {
        return (C12126c) this.f31350a.mo22749j("Apply bundle documents", new C1898g0(this, cVar, mo22842v(m38943e0(str))));
    }

    /* renamed from: b */
    public void mo22832b(C13473j jVar, C12130e<C9888l> eVar) {
        C6792f4 v = mo22842v(jVar.mo38589a().mo38586b());
        this.f31350a.mo22750k("Saved named query", new C1961y(this, jVar, v, v.mo22807g(), eVar));
    }

    /* renamed from: c */
    public void mo22833c(C13468e eVar) {
        this.f31350a.mo22750k("Save bundle", new C1958x(this, eVar));
    }

    /* renamed from: f0 */
    public void mo22834f0(List<C6800j0> list) {
        this.f31350a.mo22750k("notifyLocalViewChanges", new C1955w(this, list));
    }

    /* renamed from: h0 */
    public C9885i mo22835h0(C9888l lVar) {
        return this.f31355f.mo22854c(lVar);
    }

    /* renamed from: i0 */
    public C12126c<C9888l, C9885i> mo22836i0(int i) {
        return (C12126c) this.f31350a.mo22749j("Reject batch", new C1878a0(this, i));
    }

    /* renamed from: j0 */
    public void mo22837j0(int i) {
        this.f31350a.mo22750k("Release target", new C1941s(this, i));
    }

    /* renamed from: k0 */
    public void mo22838k0(C8153i iVar) {
        this.f31350a.mo22750k("Set stream token", new C1948u(this, iVar));
    }

    /* renamed from: m0 */
    public void mo22839m0() {
        this.f31350a.mo22744e().run();
        m38955n0();
        m38957o0();
    }

    /* renamed from: p0 */
    public C6808m mo22840p0(List<C10009f> list) {
        C10428q j = C10428q.m52634j();
        HashSet hashSet = new HashSet();
        for (C10009f g : list) {
            hashSet.add(g.mo32598g());
        }
        return (C6808m) this.f31350a.mo22749j("Locally write mutations", new C1895f0(this, hashSet, list, j));
    }

    /* renamed from: u */
    public C12126c<C9888l, C9885i> mo22841u(C10011h hVar) {
        return (C12126c) this.f31350a.mo22749j("Acknowledge batch", new C1886c0(this, hVar));
    }

    /* renamed from: v */
    public C6792f4 mo22842v(C6469g1 g1Var) {
        int i;
        C6792f4 h = this.f31358i.mo22761h(g1Var);
        if (h != null) {
            i = h.mo22807g();
        } else {
            C6797b bVar = new C6797b();
            this.f31350a.mo22750k("Allocate target", new C1944t(this, bVar, g1Var));
            i = bVar.f31364b;
            h = bVar.f31363a;
        }
        if (this.f31360k.get(i) == null) {
            this.f31360k.put(i, h);
            this.f31361l.put(g1Var, Integer.valueOf(i));
        }
        return h;
    }

    /* renamed from: w */
    public C12126c<C9888l, C9885i> mo22843w(C10247j0 j0Var) {
        return (C12126c) this.f31350a.mo22749j("Apply remote event", new C1890d0(this, j0Var, j0Var.mo32966c()));
    }

    /* renamed from: y */
    public C6812o0.C6815c mo22844y(C6812o0 o0Var) {
        return (C6812o0.C6815c) this.f31350a.mo22749j("Collect garbage", new C1882b0(this, o0Var));
    }

    /* renamed from: z */
    public void mo22845z(List<C9893q> list) {
        this.f31350a.mo22750k("Configure indexes", new C1951v(this, list));
    }
}
