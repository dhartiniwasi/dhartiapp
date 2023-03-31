package p418zc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;
import p343rc.C12271a;
import p343rc.C12335j1;
import p343rc.C12367p;
import p343rc.C12370q;
import p343rc.C12376r0;
import p343rc.C12406x;

/* renamed from: zc.h */
/* compiled from: RoundRobinLoadBalancer */
final class C13583h extends C12376r0 {

    /* renamed from: h */
    static final C12271a.C12274c<C13587d<C12370q>> f48153h = C12271a.C12274c.m58939a("state-info");

    /* renamed from: i */
    private static final C12335j1 f48154i = C12335j1.f45606f.mo37030q("no subchannels ready");

    /* renamed from: c */
    private final C12376r0.C12381d f48155c;

    /* renamed from: d */
    private final Map<C12406x, C12376r0.C12386h> f48156d = new HashMap();

    /* renamed from: e */
    private final Random f48157e;

    /* renamed from: f */
    private C12367p f48158f;

    /* renamed from: g */
    private C13588e f48159g = new C13585b(f48154i);

    /* renamed from: zc.h$a */
    /* compiled from: RoundRobinLoadBalancer */
    class C13584a implements C12376r0.C12388j {

        /* renamed from: a */
        final /* synthetic */ C12376r0.C12386h f48160a;

        C13584a(C12376r0.C12386h hVar) {
            this.f48160a = hVar;
        }

        /* renamed from: a */
        public void mo35316a(C12370q qVar) {
            C13583h.this.m62892l(this.f48160a, qVar);
        }
    }

    /* renamed from: zc.h$b */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C13585b extends C13588e {

        /* renamed from: a */
        private final C12335j1 f48162a;

        C13585b(C12335j1 j1Var) {
            super((C13584a) null);
            this.f48162a = (C12335j1) C6431n.m37562o(j1Var, "status");
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return this.f48162a.mo37028o() ? C12376r0.C12382e.m59230g() : C12376r0.C12382e.m59229f(this.f48162a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo38732c(C13588e eVar) {
            if (eVar instanceof C13585b) {
                C13585b bVar = (C13585b) eVar;
                if (C6425j.m37541a(this.f48162a, bVar.f48162a) || (this.f48162a.mo37028o() && bVar.f48162a.mo37028o())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return C6419h.m37527b(C13585b.class).mo21842d("status", this.f48162a).toString();
        }
    }

    /* renamed from: zc.h$c */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C13586c extends C13588e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater<C13586c> f48163c = AtomicIntegerFieldUpdater.newUpdater(C13586c.class, "b");

        /* renamed from: a */
        private final List<C12376r0.C12386h> f48164a;

        /* renamed from: b */
        private volatile int f48165b;

        C13586c(List<C12376r0.C12386h> list, int i) {
            super((C13584a) null);
            C6431n.m37552e(!list.isEmpty(), "empty list");
            this.f48164a = list;
            this.f48165b = i - 1;
        }

        /* renamed from: d */
        private C12376r0.C12386h m62906d() {
            int size = this.f48164a.size();
            AtomicIntegerFieldUpdater<C13586c> atomicIntegerFieldUpdater = f48163c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i);
                incrementAndGet = i;
            }
            return this.f48164a.get(incrementAndGet);
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            return C12376r0.C12382e.m59231h(m62906d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo38732c(C13588e eVar) {
            if (!(eVar instanceof C13586c)) {
                return false;
            }
            C13586c cVar = (C13586c) eVar;
            if (cVar == this || (this.f48164a.size() == cVar.f48164a.size() && new HashSet(this.f48164a).containsAll(cVar.f48164a))) {
                return true;
            }
            return false;
        }

        public String toString() {
            return C6419h.m37527b(C13586c.class).mo21842d("list", this.f48164a).toString();
        }
    }

    /* renamed from: zc.h$d */
    /* compiled from: RoundRobinLoadBalancer */
    static final class C13587d<T> {

        /* renamed from: a */
        T f48166a;

        C13587d(T t) {
            this.f48166a = t;
        }
    }

    /* renamed from: zc.h$e */
    /* compiled from: RoundRobinLoadBalancer */
    private static abstract class C13588e extends C12376r0.C12387i {
        private C13588e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo38732c(C13588e eVar);

        /* synthetic */ C13588e(C13584a aVar) {
            this();
        }
    }

    C13583h(C12376r0.C12381d dVar) {
        this.f48155c = (C12376r0.C12381d) C6431n.m37562o(dVar, "helper");
        this.f48157e = new Random();
    }

    /* renamed from: h */
    private static List<C12376r0.C12386h> m62889h(Collection<C12376r0.C12386h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C12376r0.C12386h next : collection) {
            if (m62891k(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private static C13587d<C12370q> m62890i(C12376r0.C12386h hVar) {
        return (C13587d) C6431n.m37562o((C13587d) hVar.mo35164c().mo36915b(f48153h), "STATE_INFO");
    }

    /* renamed from: k */
    static boolean m62891k(C12376r0.C12386h hVar) {
        return ((C12370q) m62890i(hVar).f48166a).mo37080c() == C12367p.READY;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m62892l(C12376r0.C12386h hVar, C12370q qVar) {
        if (this.f48156d.get(m62896p(hVar.mo37120a())) == hVar) {
            C12367p c = qVar.mo37080c();
            C12367p pVar = C12367p.TRANSIENT_FAILURE;
            if (c == pVar || qVar.mo37080c() == C12367p.IDLE) {
                this.f48155c.mo35125e();
            }
            C12367p c2 = qVar.mo37080c();
            C12367p pVar2 = C12367p.IDLE;
            if (c2 == pVar2) {
                hVar.mo35166e();
            }
            C13587d<C12370q> i = m62890i(hVar);
            if (!((C12370q) i.f48166a).mo37080c().equals(pVar) || (!qVar.mo37080c().equals(C12367p.CONNECTING) && !qVar.mo37080c().equals(pVar2))) {
                i.f48166a = qVar;
                m62897q();
            }
        }
    }

    /* renamed from: m */
    private static <T> Set<T> m62893m(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* renamed from: n */
    private void m62894n(C12376r0.C12386h hVar) {
        hVar.mo35167f();
        m62890i(hVar).f48166a = C12370q.m59185a(C12367p.SHUTDOWN);
    }

    /* renamed from: o */
    private static Map<C12406x, C12406x> m62895o(List<C12406x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (C12406x next : list) {
            hashMap.put(m62896p(next), next);
        }
        return hashMap;
    }

    /* renamed from: p */
    private static C12406x m62896p(C12406x xVar) {
        return new C12406x(xVar.mo37149a());
    }

    /* renamed from: q */
    private void m62897q() {
        List<C12376r0.C12386h> h = m62889h(mo38731j());
        if (h.isEmpty()) {
            boolean z = false;
            C12335j1 j1Var = f48154i;
            for (C12376r0.C12386h i : mo38731j()) {
                C12370q qVar = (C12370q) m62890i(i).f48166a;
                if (qVar.mo37080c() == C12367p.CONNECTING || qVar.mo37080c() == C12367p.IDLE) {
                    z = true;
                }
                if (j1Var == f48154i || !j1Var.mo37028o()) {
                    j1Var = qVar.mo37081d();
                }
            }
            m62898r(z ? C12367p.CONNECTING : C12367p.TRANSIENT_FAILURE, new C13585b(j1Var));
            return;
        }
        m62898r(C12367p.READY, new C13586c(h, this.f48157e.nextInt(h.size())));
    }

    /* renamed from: r */
    private void m62898r(C12367p pVar, C13588e eVar) {
        if (pVar != this.f48158f || !eVar.mo38732c(this.f48159g)) {
            this.f48155c.mo35126f(pVar, eVar);
            this.f48158f = pVar;
            this.f48159g = eVar;
        }
    }

    /* renamed from: c */
    public void mo35214c(C12335j1 j1Var) {
        if (this.f48158f != C12367p.READY) {
            m62898r(C12367p.TRANSIENT_FAILURE, new C13585b(j1Var));
        }
    }

    /* renamed from: d */
    public void mo35215d(C12376r0.C12384g gVar) {
        List<C12406x> a = gVar.mo37109a();
        Set<C12406x> keySet = this.f48156d.keySet();
        Map<C12406x, C12406x> o = m62895o(a);
        Set<T> m = m62893m(keySet, o.keySet());
        for (Map.Entry next : o.entrySet()) {
            C12406x xVar = (C12406x) next.getKey();
            C12406x xVar2 = (C12406x) next.getValue();
            C12376r0.C12386h hVar = this.f48156d.get(xVar);
            if (hVar != null) {
                hVar.mo35169h(Collections.singletonList(xVar2));
            } else {
                C12376r0.C12386h hVar2 = (C12376r0.C12386h) C6431n.m37562o(this.f48155c.mo35121a(C12376r0.C12378b.m59211c().mo37100e(xVar2).mo37101f(C12271a.m58932c().mo36922d(f48153h, new C13587d(C12370q.m59185a(C12367p.IDLE))).mo36920a()).mo37098b()), "subchannel");
                hVar2.mo35168g(new C13584a(hVar2));
                this.f48156d.put(xVar, hVar2);
                hVar2.mo35166e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T remove : m) {
            arrayList.add(this.f48156d.remove(remove));
        }
        m62897q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m62894n((C12376r0.C12386h) it.next());
        }
    }

    /* renamed from: f */
    public void mo35216f() {
        for (C12376r0.C12386h n : mo38731j()) {
            m62894n(n);
        }
        this.f48156d.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<C12376r0.C12386h> mo38731j() {
        return this.f48156d.values();
    }
}
