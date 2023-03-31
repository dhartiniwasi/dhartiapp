package p238g8;

import com.google.firebase.firestore.C7959y;
import com.google.protobuf.C8153i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p008a8.C6452b1;
import p008a8.C6476k1;
import p008a8.C6516z0;
import p025c8.C6787e1;
import p025c8.C6792f4;
import p025c8.C6795i0;
import p211d8.C9888l;
import p211d8.C9905w;
import p218e6.C9975i;
import p218e6.C9980l;
import p220e8.C10010g;
import p220e8.C10011h;
import p220e8.C10012i;
import p238g8.C10248k;
import p238g8.C10275t0;
import p238g8.C10282u0;
import p238g8.C10291v0;
import p238g8.C10294w0;
import p247h8.C10432b;
import p247h8.C10442g;
import p247h8.C10449g0;
import p247h8.C10468v;
import p320p7.C12130e;
import p343rc.C12335j1;

/* renamed from: g8.o0 */
/* compiled from: RemoteStore */
public final class C10261o0 implements C10282u0.C10284b {

    /* renamed from: a */
    private final C10264c f40783a;

    /* renamed from: b */
    private final C6795i0 f40784b;

    /* renamed from: c */
    private final C10256n f40785c;

    /* renamed from: d */
    private final C10248k f40786d;

    /* renamed from: e */
    private final Map<Integer, C6792f4> f40787e;

    /* renamed from: f */
    private final C10240i0 f40788f;

    /* renamed from: g */
    private boolean f40789g = false;

    /* renamed from: h */
    private final C10291v0 f40790h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C10294w0 f40791i;

    /* renamed from: j */
    private C10282u0 f40792j;

    /* renamed from: k */
    private final Deque<C10010g> f40793k;

    /* renamed from: g8.o0$a */
    /* compiled from: RemoteStore */
    class C10262a implements C10291v0.C10292a {
        C10262a() {
        }

        /* renamed from: a */
        public void mo33026a() {
            C10261o0.this.m51941x();
        }

        /* renamed from: b */
        public void mo33027b(C12335j1 j1Var) {
            C10261o0.this.m51940w(j1Var);
        }

        /* renamed from: e */
        public void mo33028e(C9905w wVar, C10275t0 t0Var) {
            C10261o0.this.m51939v(wVar, t0Var);
        }
    }

    /* renamed from: g8.o0$b */
    /* compiled from: RemoteStore */
    class C10263b implements C10294w0.C10295a {
        C10263b() {
        }

        /* renamed from: a */
        public void mo33026a() {
            C10261o0.this.f40791i.mo33089C();
        }

        /* renamed from: b */
        public void mo33027b(C12335j1 j1Var) {
            C10261o0.this.m51912A(j1Var);
        }

        /* renamed from: c */
        public void mo33029c(C9905w wVar, List<C10012i> list) {
            C10261o0.this.m51914C(wVar, list);
        }

        /* renamed from: d */
        public void mo33030d() {
            C10261o0.this.m51913B();
        }
    }

    /* renamed from: g8.o0$c */
    /* compiled from: RemoteStore */
    public interface C10264c {
        /* renamed from: a */
        void mo21916a(C6516z0 z0Var);

        /* renamed from: b */
        C12130e<C9888l> mo21917b(int i);

        /* renamed from: c */
        void mo21918c(C10011h hVar);

        /* renamed from: d */
        void mo21919d(int i, C12335j1 j1Var);

        /* renamed from: e */
        void mo21920e(int i, C12335j1 j1Var);

        /* renamed from: f */
        void mo21921f(C10247j0 j0Var);
    }

    public C10261o0(C10264c cVar, C6795i0 i0Var, C10256n nVar, C10442g gVar, C10248k kVar) {
        this.f40783a = cVar;
        this.f40784b = i0Var;
        this.f40785c = nVar;
        this.f40786d = kVar;
        this.f40787e = new HashMap();
        this.f40793k = new ArrayDeque();
        Objects.requireNonNull(cVar);
        this.f40788f = new C10240i0(gVar, new C10253l0(cVar));
        this.f40790h = nVar.mo33001f(new C10262a());
        this.f40791i = nVar.mo33002g(new C10263b());
        kVar.mo32948a(new C10255m0(this, gVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m51912A(C12335j1 j1Var) {
        if (j1Var.mo37028o()) {
            C10432b.m52648d(!m51923N(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!j1Var.mo37028o() && !this.f40793k.isEmpty()) {
            if (this.f40791i.mo33092z()) {
                m51942y(j1Var);
            } else {
                m51943z(j1Var);
            }
        }
        if (m51923N()) {
            m51925R();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m51913B() {
        this.f40784b.mo22838k0(this.f40791i.mo33091y());
        for (C10010g h : this.f40793k) {
            this.f40791i.mo33090D(h.mo32614h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m51914C(C9905w wVar, List<C10012i> list) {
        this.f40783a.mo21918c(C10011h.m51123a(this.f40793k.poll(), wVar, list, this.f40791i.mo33091y()));
        mo33024t();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m51915D(C10248k.C10249a aVar) {
        if (aVar.equals(C10248k.C10249a.REACHABLE) && this.f40788f.mo32943c().equals(C6516z0.ONLINE)) {
            return;
        }
        if ((!aVar.equals(C10248k.C10249a.UNREACHABLE) || !this.f40788f.mo32943c().equals(C6516z0.OFFLINE)) && mo33020n()) {
            C10468v.m52767a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            m51919I();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m51916E(C10442g gVar, C10248k.C10249a aVar) {
        gVar.mo33521l(new C10259n0(this, aVar));
    }

    /* renamed from: G */
    private void m51917G(C10275t0.C10279d dVar) {
        C10432b.m52648d(dVar.mo33060a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer next : dVar.mo33063d()) {
            if (this.f40787e.containsKey(next)) {
                this.f40787e.remove(next);
                this.f40792j.mo33072n(next.intValue());
                this.f40783a.mo21919d(next.intValue(), dVar.mo33060a());
            }
        }
    }

    /* renamed from: H */
    private void m51918H(C9905w wVar) {
        C10432b.m52648d(!wVar.equals(C9905w.f39751b), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        C10247j0 b = this.f40792j.mo33067b(wVar);
        for (Map.Entry next : b.mo32967d().entrySet()) {
            C10270r0 r0Var = (C10270r0) next.getValue();
            if (!r0Var.mo33035e().isEmpty()) {
                int intValue = ((Integer) next.getKey()).intValue();
                C6792f4 f4Var = this.f40787e.get(Integer.valueOf(intValue));
                if (f4Var != null) {
                    this.f40787e.put(Integer.valueOf(intValue), f4Var.mo22810i(r0Var.mo33035e(), wVar));
                }
            }
        }
        for (Integer intValue2 : b.mo32968e()) {
            int intValue3 = intValue2.intValue();
            C6792f4 f4Var2 = this.f40787e.get(Integer.valueOf(intValue3));
            if (f4Var2 != null) {
                this.f40787e.put(Integer.valueOf(intValue3), f4Var2.mo22810i(C8153i.f34908b, f4Var2.mo22804e()));
                m51920K(intValue3);
                m51921L(new C6792f4(f4Var2.mo22806f(), intValue3, f4Var2.mo22803d(), C6787e1.EXISTENCE_FILTER_MISMATCH));
            }
        }
        this.f40783a.mo21921f(b);
    }

    /* renamed from: I */
    private void m51919I() {
        this.f40789g = false;
        m51938r();
        this.f40788f.mo32946i(C6516z0.UNKNOWN);
        this.f40791i.mo32916l();
        this.f40790h.mo32916l();
        mo33023s();
    }

    /* renamed from: K */
    private void m51920K(int i) {
        this.f40792j.mo33071l(i);
        this.f40790h.mo33086z(i);
    }

    /* renamed from: L */
    private void m51921L(C6792f4 f4Var) {
        this.f40792j.mo33071l(f4Var.mo22807g());
        this.f40790h.mo33084A(f4Var);
    }

    /* renamed from: M */
    private boolean m51922M() {
        return mo33020n() && !this.f40790h.mo32918n() && !this.f40787e.isEmpty();
    }

    /* renamed from: N */
    private boolean m51923N() {
        return mo33020n() && !this.f40791i.mo32918n() && !this.f40793k.isEmpty();
    }

    /* renamed from: Q */
    private void m51924Q() {
        C10432b.m52648d(m51922M(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f40792j = new C10282u0(this);
        this.f40790h.mo32921u();
        this.f40788f.mo32945e();
    }

    /* renamed from: R */
    private void m51925R() {
        C10432b.m52648d(m51923N(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f40791i.mo32921u();
    }

    /* renamed from: l */
    private void m51935l(C10010g gVar) {
        C10432b.m52648d(m51936m(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f40793k.add(gVar);
        if (this.f40791i.mo32917m() && this.f40791i.mo33092z()) {
            this.f40791i.mo33090D(gVar.mo32614h());
        }
    }

    /* renamed from: m */
    private boolean m51936m() {
        return mo33020n() && this.f40793k.size() < 10;
    }

    /* renamed from: o */
    private void m51937o() {
        this.f40792j = null;
    }

    /* renamed from: r */
    private void m51938r() {
        this.f40790h.mo32922v();
        this.f40791i.mo32922v();
        if (!this.f40793k.isEmpty()) {
            C10468v.m52767a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f40793k.size()));
            this.f40793k.clear();
        }
        m51937o();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m51939v(C9905w wVar, C10275t0 t0Var) {
        this.f40788f.mo32946i(C6516z0.ONLINE);
        C10432b.m52648d((this.f40790h == null || this.f40792j == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z = t0Var instanceof C10275t0.C10279d;
        C10275t0.C10279d dVar = z ? (C10275t0.C10279d) t0Var : null;
        if (dVar == null || !dVar.mo33061b().equals(C10275t0.C10280e.Removed) || dVar.mo33060a() == null) {
            if (t0Var instanceof C10275t0.C10277b) {
                this.f40792j.mo33068g((C10275t0.C10277b) t0Var);
            } else if (t0Var instanceof C10275t0.C10278c) {
                this.f40792j.mo33069h((C10275t0.C10278c) t0Var);
            } else {
                C10432b.m52648d(z, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
                this.f40792j.mo33070i((C10275t0.C10279d) t0Var);
            }
            if (!wVar.equals(C9905w.f39751b) && wVar.compareTo(this.f40784b.mo22823E()) >= 0) {
                m51918H(wVar);
                return;
            }
            return;
        }
        m51917G(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m51940w(C12335j1 j1Var) {
        if (j1Var.mo37028o()) {
            C10432b.m52648d(!m51922M(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        m51937o();
        if (m51922M()) {
            this.f40788f.mo32944d(j1Var);
            m51924Q();
            return;
        }
        this.f40788f.mo32946i(C6516z0.UNKNOWN);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m51941x() {
        for (C6792f4 L : this.f40787e.values()) {
            m51921L(L);
        }
    }

    /* renamed from: y */
    private void m51942y(C12335j1 j1Var) {
        C10432b.m52648d(!j1Var.mo37028o(), "Handling write error with status OK.", new Object[0]);
        if (C10256n.m51898l(j1Var)) {
            this.f40791i.mo32916l();
            this.f40783a.mo21920e(this.f40793k.poll().mo32610e(), j1Var);
            mo33024t();
        }
    }

    /* renamed from: z */
    private void m51943z(C12335j1 j1Var) {
        C10432b.m52648d(!j1Var.mo37028o(), "Handling write error with status OK.", new Object[0]);
        if (C10256n.m51897k(j1Var)) {
            C10468v.m52767a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", C10449g0.m52698A(this.f40791i.mo33091y()), j1Var);
            C10294w0 w0Var = this.f40791i;
            C8153i iVar = C10294w0.f40882v;
            w0Var.mo33088B(iVar);
            this.f40784b.mo22838k0(iVar);
        }
    }

    /* renamed from: F */
    public void mo33013F(C6792f4 f4Var) {
        Integer valueOf = Integer.valueOf(f4Var.mo22807g());
        if (!this.f40787e.containsKey(valueOf)) {
            this.f40787e.put(valueOf, f4Var);
            if (m51922M()) {
                m51924Q();
            } else if (this.f40790h.mo32917m()) {
                m51921L(f4Var);
            }
        }
    }

    /* renamed from: J */
    public C9975i<Long> mo33014J(C6452b1 b1Var) {
        if (mo33020n()) {
            return this.f40785c.mo33005p(b1Var);
        }
        return C9980l.m51030d(new C7959y("Failed to get result from server.", C7959y.C7960a.UNAVAILABLE));
    }

    /* renamed from: O */
    public void mo33015O() {
        C10468v.m52767a("RemoteStore", "Shutting down", new Object[0]);
        this.f40786d.shutdown();
        this.f40789g = false;
        m51938r();
        this.f40785c.mo33006q();
        this.f40788f.mo32946i(C6516z0.UNKNOWN);
    }

    /* renamed from: P */
    public void mo33016P() {
        mo33023s();
    }

    /* renamed from: S */
    public void mo33017S(int i) {
        C10432b.m52648d(this.f40787e.remove(Integer.valueOf(i)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        if (this.f40790h.mo32917m()) {
            m51920K(i);
        }
        if (!this.f40787e.isEmpty()) {
            return;
        }
        if (this.f40790h.mo32917m()) {
            this.f40790h.mo32919q();
        } else if (mo33020n()) {
            this.f40788f.mo32946i(C6516z0.UNKNOWN);
        }
    }

    /* renamed from: a */
    public C6792f4 mo33018a(int i) {
        return this.f40787e.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public C12130e<C9888l> mo33019b(int i) {
        return this.f40783a.mo21917b(i);
    }

    /* renamed from: n */
    public boolean mo33020n() {
        return this.f40789g;
    }

    /* renamed from: p */
    public C6476k1 mo33021p() {
        return new C6476k1(this.f40785c);
    }

    /* renamed from: q */
    public void mo33022q() {
        this.f40789g = false;
        m51938r();
        this.f40788f.mo32946i(C6516z0.OFFLINE);
    }

    /* renamed from: s */
    public void mo33023s() {
        this.f40789g = true;
        if (mo33020n()) {
            this.f40791i.mo33088B(this.f40784b.mo22824F());
            if (m51922M()) {
                m51924Q();
            } else {
                this.f40788f.mo32946i(C6516z0.UNKNOWN);
            }
            mo33024t();
        }
    }

    /* renamed from: t */
    public void mo33024t() {
        int e = this.f40793k.isEmpty() ? -1 : this.f40793k.getLast().mo32610e();
        while (true) {
            if (!m51936m()) {
                break;
            }
            C10010g I = this.f40784b.mo22827I(e);
            if (I != null) {
                m51935l(I);
                e = I.mo32610e();
            } else if (this.f40793k.size() == 0) {
                this.f40791i.mo32919q();
            }
        }
        if (m51923N()) {
            m51925R();
        }
    }

    /* renamed from: u */
    public void mo33025u() {
        if (mo33020n()) {
            C10468v.m52767a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            m51919I();
        }
    }
}
