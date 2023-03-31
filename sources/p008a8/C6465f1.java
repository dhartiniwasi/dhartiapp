package p008a8;

import com.google.firebase.firestore.C7910g0;
import com.google.firebase.firestore.C7913h0;
import com.google.firebase.firestore.C7959y;
import com.google.firebase.firestore.C7961y0;
import com.google.protobuf.C8153i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p008a8.C6506w1;
import p008a8.C6514y1;
import p025c8.C6787e1;
import p025c8.C6790f1;
import p025c8.C6792f4;
import p025c8.C6794h1;
import p025c8.C6795i0;
import p025c8.C6800j0;
import p025c8.C6808m;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9899s;
import p211d8.C9905w;
import p218e6.C9975i;
import p218e6.C9977j;
import p220e8.C10009f;
import p220e8.C10011h;
import p238g8.C10247j0;
import p238g8.C10261o0;
import p238g8.C10270r0;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10449g0;
import p247h8.C10466t;
import p247h8.C10468v;
import p320p7.C12126c;
import p320p7.C12130e;
import p343rc.C12335j1;
import p404y7.C13073j;
import p413z7.C13466c;
import p413z7.C13467d;
import p413z7.C13468e;
import p413z7.C13469f;

/* renamed from: a8.f1 */
/* compiled from: SyncEngine */
public class C6465f1 implements C10261o0.C10264c {

    /* renamed from: o */
    private static final String f30734o = "f1";

    /* renamed from: a */
    private final C6795i0 f30735a;

    /* renamed from: b */
    private final C10261o0 f30736b;

    /* renamed from: c */
    private final Map<C6452b1, C6461d1> f30737c = new HashMap();

    /* renamed from: d */
    private final Map<Integer, List<C6452b1>> f30738d = new HashMap();

    /* renamed from: e */
    private final int f30739e;

    /* renamed from: f */
    private final LinkedHashSet<C9888l> f30740f = new LinkedHashSet<>();

    /* renamed from: g */
    private final Map<C9888l, Integer> f30741g = new HashMap();

    /* renamed from: h */
    private final Map<Integer, C6467b> f30742h = new HashMap();

    /* renamed from: i */
    private final C6794h1 f30743i = new C6794h1();

    /* renamed from: j */
    private final Map<C13073j, Map<Integer, C9977j<Void>>> f30744j = new HashMap();

    /* renamed from: k */
    private final Map<Integer, List<C9977j<Void>>> f30745k;

    /* renamed from: l */
    private final C6472h1 f30746l = C6472h1.m37733a();

    /* renamed from: m */
    private C13073j f30747m;

    /* renamed from: n */
    private C6468c f30748n;

    /* renamed from: a8.f1$a */
    /* compiled from: SyncEngine */
    static /* synthetic */ class C6466a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30749a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                a8.u0$a[] r0 = p008a8.C6501u0.C6502a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30749a = r0
                a8.u0$a r1 = p008a8.C6501u0.C6502a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30749a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.u0$a r1 = p008a8.C6501u0.C6502a.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008a8.C6465f1.C6466a.<clinit>():void");
        }
    }

    /* renamed from: a8.f1$b */
    /* compiled from: SyncEngine */
    private static class C6467b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C9888l f30750a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f30751b;

        C6467b(C9888l lVar) {
            this.f30750a = lVar;
        }
    }

    /* renamed from: a8.f1$c */
    /* compiled from: SyncEngine */
    interface C6468c {
        /* renamed from: a */
        void mo21929a(C6516z0 z0Var);

        /* renamed from: b */
        void mo21930b(List<C6514y1> list);

        /* renamed from: c */
        void mo21931c(C6452b1 b1Var, C12335j1 j1Var);
    }

    public C6465f1(C6795i0 i0Var, C10261o0 o0Var, C13073j jVar, int i) {
        this.f30735a = i0Var;
        this.f30736b = o0Var;
        this.f30739e = i;
        this.f30747m = jVar;
        this.f30745k = new HashMap();
    }

    /* renamed from: B */
    private void m37675B(List<C6501u0> list, int i) {
        for (C6501u0 next : list) {
            int i2 = C6466a.f30749a[next.mo22067b().ordinal()];
            if (i2 == 1) {
                this.f30743i.mo22813a(next.mo22066a(), i);
                m37688z(next);
            } else if (i2 == 2) {
                C10468v.m52767a(f30734o, "Document no longer in limbo: %s", next.mo22066a());
                C9888l a = next.mo22066a();
                this.f30743i.mo22817f(a, i);
                if (!this.f30743i.mo22815c(a)) {
                    m37686u(a);
                }
            } else {
                throw C10432b.m52645a("Unknown limbo change type: %s", next.mo22067b());
            }
        }
    }

    /* renamed from: g */
    private void m37676g(int i, C9977j<Void> jVar) {
        Map map = this.f30744j.get(this.f30747m);
        if (map == null) {
            map = new HashMap();
            this.f30744j.put(this.f30747m, map);
        }
        map.put(Integer.valueOf(i), jVar);
    }

    /* renamed from: h */
    private void m37677h(String str) {
        C10432b.m52648d(this.f30748n != null, "Trying to call %s before setting callback", str);
    }

    /* renamed from: i */
    private void m37678i(C12126c<C9888l, C9885i> cVar, C10247j0 j0Var) {
        C10270r0 r0Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<C6452b1, C6461d1> value : this.f30737c.entrySet()) {
            C6461d1 d1Var = (C6461d1) value.getValue();
            C6506w1 c = d1Var.mo21909c();
            C6506w1.C6508b g = c.mo22075g(cVar);
            if (g.mo22079b()) {
                g = c.mo22076h(this.f30735a.mo22820A(d1Var.mo21907a(), false).mo22781a(), g);
            }
            if (j0Var == null) {
                r0Var = null;
            } else {
                r0Var = j0Var.mo32967d().get(Integer.valueOf(d1Var.mo21908b()));
            }
            C6512x1 c2 = d1Var.mo21909c().mo22073c(g, r0Var);
            m37675B(c2.mo22081a(), d1Var.mo21908b());
            if (c2.mo22082b() != null) {
                arrayList.add(c2.mo22082b());
                arrayList2.add(C6800j0.m38998a(d1Var.mo21908b(), c2.mo22082b()));
            }
        }
        this.f30748n.mo21930b(arrayList);
        this.f30735a.mo22834f0(arrayList2);
    }

    /* renamed from: j */
    private boolean m37679j(C12335j1 j1Var) {
        C12335j1.C12337b m = j1Var.mo37026m();
        String n = j1Var.mo37027n() != null ? j1Var.mo37027n() : "";
        if ((m != C12335j1.C12337b.FAILED_PRECONDITION || !n.contains("requires an index")) && m != C12335j1.C12337b.PERMISSION_DENIED) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m37680k() {
        for (Map.Entry<Integer, List<C9977j<Void>>> value : this.f30745k.entrySet()) {
            for (C9977j b : (List) value.getValue()) {
                b.mo32543b(new C7959y("'waitForPendingWrites' task is cancelled due to User change.", C7959y.C7960a.CANCELLED));
            }
        }
        this.f30745k.clear();
    }

    /* renamed from: m */
    private C6514y1 m37681m(C6452b1 b1Var, int i, C8153i iVar) {
        C6790f1 A = this.f30735a.mo22820A(b1Var, true);
        C6514y1.C6515a aVar = C6514y1.C6515a.NONE;
        boolean z = false;
        if (this.f30738d.get(Integer.valueOf(i)) != null) {
            aVar = this.f30737c.get((C6452b1) this.f30738d.get(Integer.valueOf(i)).get(0)).mo21909c().mo22077i();
        }
        if (aVar == C6514y1.C6515a.SYNCED) {
            z = true;
        }
        C10270r0 a = C10270r0.m51978a(z, iVar);
        C6506w1 w1Var = new C6506w1(b1Var, A.mo22782b());
        C6512x1 c = w1Var.mo22073c(w1Var.mo22075g(A.mo22781a()), a);
        m37675B(c.mo22081a(), i);
        this.f30737c.put(b1Var, new C6461d1(b1Var, i, w1Var));
        if (!this.f30738d.containsKey(Integer.valueOf(i))) {
            this.f30738d.put(Integer.valueOf(i), new ArrayList(1));
        }
        this.f30738d.get(Integer.valueOf(i)).add(b1Var);
        return c.mo22082b();
    }

    /* renamed from: p */
    private void m37682p(C12335j1 j1Var, String str, Object... objArr) {
        if (m37679j(j1Var)) {
            C10468v.m52770d("Firestore", "%s: %s", String.format(str, objArr), j1Var);
        }
    }

    /* renamed from: q */
    private void m37683q(int i, C12335j1 j1Var) {
        Map map = this.f30744j.get(this.f30747m);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i);
            C9977j jVar = (C9977j) map.get(valueOf);
            if (jVar != null) {
                if (j1Var != null) {
                    jVar.mo32543b(C10449g0.m52720t(j1Var));
                } else {
                    jVar.mo32544c(null);
                }
                map.remove(valueOf);
            }
        }
    }

    /* renamed from: r */
    private void m37684r() {
        while (!this.f30740f.isEmpty() && this.f30741g.size() < this.f30739e) {
            Iterator it = this.f30740f.iterator();
            C9888l lVar = (C9888l) it.next();
            it.remove();
            int c = this.f30746l.mo21953c();
            this.f30742h.put(Integer.valueOf(c), new C6467b(lVar));
            this.f30741g.put(lVar, Integer.valueOf(c));
            this.f30736b.mo33013F(new C6792f4(C6452b1.m37619b(lVar.mo32390s()).mo21872D(), c, -1, C6787e1.LIMBO_RESOLUTION));
        }
    }

    /* renamed from: t */
    private void m37685t(int i, C12335j1 j1Var) {
        for (C6452b1 b1Var : this.f30738d.get(Integer.valueOf(i))) {
            this.f30737c.remove(b1Var);
            if (!j1Var.mo37028o()) {
                this.f30748n.mo21931c(b1Var, j1Var);
                m37682p(j1Var, "Listen for %s failed", b1Var);
            }
        }
        this.f30738d.remove(Integer.valueOf(i));
        C12130e<C9888l> d = this.f30743i.mo22816d(i);
        this.f30743i.mo22819h(i);
        Iterator<C9888l> it = d.iterator();
        while (it.hasNext()) {
            C9888l next = it.next();
            if (!this.f30743i.mo22815c(next)) {
                m37686u(next);
            }
        }
    }

    /* renamed from: u */
    private void m37686u(C9888l lVar) {
        this.f30740f.remove(lVar);
        Integer num = this.f30741g.get(lVar);
        if (num != null) {
            this.f30736b.mo33017S(num.intValue());
            this.f30741g.remove(lVar);
            this.f30742h.remove(num);
            m37684r();
        }
    }

    /* renamed from: v */
    private void m37687v(int i) {
        if (this.f30745k.containsKey(Integer.valueOf(i))) {
            for (C9977j c : this.f30745k.get(Integer.valueOf(i))) {
                c.mo32544c(null);
            }
            this.f30745k.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: z */
    private void m37688z(C6501u0 u0Var) {
        C9888l a = u0Var.mo22066a();
        if (!this.f30741g.containsKey(a) && !this.f30740f.contains(a)) {
            C10468v.m52767a(f30734o, "New document in limbo: %s", a);
            this.f30740f.add(a);
            m37684r();
        }
    }

    /* renamed from: A */
    public <TResult> C9975i<TResult> mo21914A(C10442g gVar, C7961y0 y0Var, C10466t<C6476k1, C9975i<TResult>> tVar) {
        return new C6483o1(gVar, this.f30736b, y0Var, tVar).mo22014i();
    }

    /* renamed from: C */
    public void mo21915C(List<C10009f> list, C9977j<Void> jVar) {
        m37677h("writeMutations");
        C6808m p0 = this.f30735a.mo22840p0(list);
        m37676g(p0.mo22852b(), jVar);
        m37678i(p0.mo22853c(), (C10247j0) null);
        this.f30736b.mo33024t();
    }

    /* renamed from: a */
    public void mo21916a(C6516z0 z0Var) {
        m37677h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C6452b1, C6461d1> value : this.f30737c.entrySet()) {
            C6512x1 d = ((C6461d1) value.getValue()).mo21909c().mo22074d(z0Var);
            C10432b.m52648d(d.mo22081a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (d.mo22082b() != null) {
                arrayList.add(d.mo22082b());
            }
        }
        this.f30748n.mo21930b(arrayList);
        this.f30748n.mo21929a(z0Var);
    }

    /* renamed from: b */
    public C12130e<C9888l> mo21917b(int i) {
        C6467b bVar = this.f30742h.get(Integer.valueOf(i));
        if (bVar != null && bVar.f30751b) {
            return C9888l.m50695j().mo36638f(bVar.f30750a);
        }
        C12130e<C9888l> j = C9888l.m50695j();
        if (this.f30738d.containsKey(Integer.valueOf(i))) {
            for (C6452b1 b1Var : this.f30738d.get(Integer.valueOf(i))) {
                if (this.f30737c.containsKey(b1Var)) {
                    j = j.mo36645k(this.f30737c.get(b1Var).mo21909c().mo22078j());
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    public void mo21918c(C10011h hVar) {
        m37677h("handleSuccessfulWrite");
        m37683q(hVar.mo32617b().mo32610e(), (C12335j1) null);
        m37687v(hVar.mo32617b().mo32610e());
        m37678i(this.f30735a.mo22841u(hVar), (C10247j0) null);
    }

    /* renamed from: d */
    public void mo21919d(int i, C12335j1 j1Var) {
        m37677h("handleRejectedListen");
        C6467b bVar = this.f30742h.get(Integer.valueOf(i));
        C9888l c = bVar != null ? bVar.f30750a : null;
        if (c != null) {
            this.f30741g.remove(c);
            this.f30742h.remove(Integer.valueOf(i));
            m37684r();
            C9905w wVar = C9905w.f39751b;
            mo21921f(new C10247j0(wVar, Collections.emptyMap(), Collections.emptySet(), Collections.singletonMap(c, C9899s.m50751q(c, wVar)), Collections.singleton(c)));
            return;
        }
        this.f30735a.mo22837j0(i);
        m37685t(i, j1Var);
    }

    /* renamed from: e */
    public void mo21920e(int i, C12335j1 j1Var) {
        m37677h("handleRejectedWrite");
        C12126c<C9888l, C9885i> i0 = this.f30735a.mo22836i0(i);
        if (!i0.isEmpty()) {
            m37682p(j1Var, "Write failed at %s", i0.mo36617j().mo32390s());
        }
        m37683q(i, j1Var);
        m37687v(i);
        m37678i(i0, (C10247j0) null);
    }

    /* renamed from: f */
    public void mo21921f(C10247j0 j0Var) {
        m37677h("handleRemoteEvent");
        for (Map.Entry next : j0Var.mo32967d().entrySet()) {
            C10270r0 r0Var = (C10270r0) next.getValue();
            C6467b bVar = this.f30742h.get((Integer) next.getKey());
            if (bVar != null) {
                C10432b.m52648d((r0Var.mo33032b().size() + r0Var.mo33033c().size()) + r0Var.mo33034d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (r0Var.mo33032b().size() > 0) {
                    boolean unused = bVar.f30751b = true;
                } else if (r0Var.mo33033c().size() > 0) {
                    C10432b.m52648d(bVar.f30751b, "Received change for limbo target document without add.", new Object[0]);
                } else if (r0Var.mo33034d().size() > 0) {
                    C10432b.m52648d(bVar.f30751b, "Received remove for limbo target document without add.", new Object[0]);
                    boolean unused2 = bVar.f30751b = false;
                }
            }
        }
        m37678i(this.f30735a.mo22843w(j0Var), j0Var);
    }

    /* renamed from: l */
    public void mo21922l(C13073j jVar) {
        boolean z = !this.f30747m.equals(jVar);
        this.f30747m = jVar;
        if (z) {
            m37680k();
            m37678i(this.f30735a.mo22829K(jVar), (C10247j0) null);
        }
        this.f30736b.mo33025u();
    }

    /* renamed from: n */
    public int mo21923n(C6452b1 b1Var) {
        m37677h("listen");
        C10432b.m52648d(!this.f30737c.containsKey(b1Var), "We already listen to query: %s", b1Var);
        C6792f4 v = this.f30735a.mo22842v(b1Var.mo21872D());
        this.f30736b.mo33013F(v);
        this.f30748n.mo21930b(Collections.singletonList(m37681m(b1Var, v.mo22807g(), v.mo22802c())));
        return v.mo22807g();
    }

    /* renamed from: o */
    public void mo21924o(C13469f fVar, C7910g0 g0Var) {
        try {
            C13468e d = fVar.mo38572d();
            if (this.f30735a.mo22830L(d)) {
                g0Var.mo26369x(C7913h0.m43740b(d));
                try {
                    fVar.mo38571b();
                } catch (IOException e) {
                    C10468v.m52770d("SyncEngine", "Exception while closing bundle", e);
                }
            } else {
                g0Var.mo26370y(C7913h0.m43739a(d));
                C13467d dVar = new C13467d(this.f30735a, d);
                long j = 0;
                while (true) {
                    C13466c f = fVar.mo38574f();
                    if (f != null) {
                        long e2 = fVar.mo38573e();
                        C7913h0 a = dVar.mo38562a(f, e2 - j);
                        if (a != null) {
                            g0Var.mo26370y(a);
                        }
                        j = e2;
                    } else {
                        m37678i(dVar.mo38563b(), (C10247j0) null);
                        this.f30735a.mo22833c(d);
                        g0Var.mo26369x(C7913h0.m43740b(d));
                        try {
                            fVar.mo38571b();
                            return;
                        } catch (IOException e3) {
                            C10468v.m52770d("SyncEngine", "Exception while closing bundle", e3);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e4) {
            C10468v.m52770d("Firestore", "Loading bundle failed : %s", e4);
            g0Var.mo26368w(new C7959y("Bundle failed to load", C7959y.C7960a.INVALID_ARGUMENT, e4));
            try {
                fVar.mo38571b();
            } catch (IOException e5) {
                C10468v.m52770d("SyncEngine", "Exception while closing bundle", e5);
            }
        } catch (Throwable th) {
            try {
                fVar.mo38571b();
            } catch (IOException e6) {
                C10468v.m52770d("SyncEngine", "Exception while closing bundle", e6);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public void mo21925s(C9977j<Void> jVar) {
        if (!this.f30736b.mo33020n()) {
            C10468v.m52767a(f30734o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int B = this.f30735a.mo22821B();
        if (B == -1) {
            jVar.mo32544c(null);
            return;
        }
        if (!this.f30745k.containsKey(Integer.valueOf(B))) {
            this.f30745k.put(Integer.valueOf(B), new ArrayList());
        }
        this.f30745k.get(Integer.valueOf(B)).add(jVar);
    }

    /* renamed from: w */
    public C9975i<Long> mo21926w(C6452b1 b1Var) {
        return this.f30736b.mo33014J(b1Var);
    }

    /* renamed from: x */
    public void mo21927x(C6468c cVar) {
        this.f30748n = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo21928y(C6452b1 b1Var) {
        m37677h("stopListening");
        C6461d1 d1Var = this.f30737c.get(b1Var);
        C10432b.m52648d(d1Var != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f30737c.remove(b1Var);
        int b = d1Var.mo21908b();
        List list = this.f30738d.get(Integer.valueOf(b));
        list.remove(b1Var);
        if (list.isEmpty()) {
            this.f30735a.mo22837j0(b);
            this.f30736b.mo33017S(b);
            m37685t(b, C12335j1.f45606f);
        }
    }
}
