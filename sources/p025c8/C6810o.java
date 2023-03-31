package p025c8;

import com.google.protobuf.C8153i;
import java.util.ArrayList;
import java.util.List;
import p008a8.C6452b1;
import p008a8.C6469g1;
import p211d8.C9885i;
import p211d8.C9893q;
import p211d8.C9898r;
import p211d8.C9899s;
import p211d8.C9902t;
import p211d8.C9905w;
import p220e8.C10009f;
import p220e8.C10010g;
import p229f8.C10144a;
import p229f8.C10148b;
import p229f8.C10151c;
import p229f8.C10155d;
import p229f8.C10158e;
import p238g8.C10250k0;
import p246h7.C10428q;
import p247h8.C10432b;
import p387w8.C12923a;
import p396x8.C12981a;
import p405y8.C13093c0;
import p405y8.C13123i;
import p405y8.C13139n;
import p405y8.C13210y;
import p413z7.C13472i;

/* renamed from: c8.o */
/* compiled from: LocalSerializer */
public final class C6810o {

    /* renamed from: a */
    private final C10250k0 f31394a;

    /* renamed from: c8.o$a */
    /* compiled from: LocalSerializer */
    static /* synthetic */ class C6811a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31395a;

        /* renamed from: b */
        static final /* synthetic */ int[] f31396b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                f8.c$c[] r0 = p229f8.C10151c.C10154c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31396b = r0
                r1 = 1
                f8.c$c r2 = p229f8.C10151c.C10154c.DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f31396b     // Catch:{ NoSuchFieldError -> 0x001d }
                f8.c$c r3 = p229f8.C10151c.C10154c.QUERY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                f8.a$c[] r2 = p229f8.C10144a.C10147c.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f31395a = r2
                f8.a$c r3 = p229f8.C10144a.C10147c.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f31395a     // Catch:{ NoSuchFieldError -> 0x0038 }
                f8.a$c r2 = p229f8.C10144a.C10147c.NO_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f31395a     // Catch:{ NoSuchFieldError -> 0x0043 }
                f8.a$c r1 = p229f8.C10144a.C10147c.UNKNOWN_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p025c8.C6810o.C6811a.<clinit>():void");
        }
    }

    public C6810o(C10250k0 k0Var) {
        this.f31394a = k0Var;
    }

    /* renamed from: b */
    private C9899s m39059b(C13123i iVar, boolean z) {
        C9899s o = C9899s.m50749o(this.f31394a.mo32991l(iVar.mo38181h0()), this.f31394a.mo32998y(iVar.mo38182i0()), C9902t.m50774g(iVar.mo38180f0()));
        return z ? o.mo32422s() : o;
    }

    /* renamed from: g */
    private C9899s m39060g(C10148b bVar, boolean z) {
        C9899s q = C9899s.m50751q(this.f31394a.mo32991l(bVar.mo32803e0()), this.f31394a.mo32998y(bVar.mo32804f0()));
        return z ? q.mo32422s() : q;
    }

    /* renamed from: i */
    private C9899s m39061i(C10155d dVar) {
        return C9899s.m50752r(this.f31394a.mo32991l(dVar.mo32823e0()), this.f31394a.mo32998y(dVar.mo32824f0()));
    }

    /* renamed from: k */
    private C13123i m39062k(C9885i iVar) {
        C13123i.C13125b l0 = C13123i.m61640l0();
        l0.mo38184E(this.f31394a.mo32976L(iVar.getKey()));
        l0.mo38183D(iVar.getData().mo32433j());
        l0.mo38185F(this.f31394a.mo32981V(iVar.mo32381j().mo32439b()));
        return (C13123i) l0.build();
    }

    /* renamed from: p */
    private C10148b m39063p(C9885i iVar) {
        C10148b.C10150b g0 = C10148b.m51500g0();
        g0.mo32805D(this.f31394a.mo32976L(iVar.getKey()));
        g0.mo32806E(this.f31394a.mo32981V(iVar.mo32381j().mo32439b()));
        return (C10148b) g0.build();
    }

    /* renamed from: r */
    private C10155d m39064r(C9885i iVar) {
        C10155d.C10157b g0 = C10155d.m51549g0();
        g0.mo32825D(this.f31394a.mo32976L(iVar.getKey()));
        g0.mo32826E(this.f31394a.mo32981V(iVar.mo32381j().mo32439b()));
        return (C10155d) g0.build();
    }

    /* renamed from: a */
    public C13472i mo22861a(C12981a aVar) {
        C6452b1.C6453a aVar2;
        if (aVar.mo38041e0().equals(C12981a.C12984c.FIRST)) {
            aVar2 = C6452b1.C6453a.LIMIT_TO_FIRST;
        } else {
            aVar2 = C6452b1.C6453a.LIMIT_TO_LAST;
        }
        return new C13472i(this.f31394a.mo32995t(aVar.mo38042f0(), aVar.mo38043g0()), aVar2);
    }

    /* renamed from: c */
    public List<C9893q.C9896c> mo22862c(C12923a aVar) {
        C9893q.C9896c.C9897a aVar2;
        ArrayList arrayList = new ArrayList();
        for (C12923a.C12926c next : aVar.mo37964f0()) {
            C9898r w = C9898r.m50742w(next.mo37967e0());
            if (next.mo37969g0().equals(C12923a.C12926c.C12932d.ARRAY_CONFIG)) {
                aVar2 = C9893q.C9896c.C9897a.CONTAINS;
            } else if (next.mo37968f0().equals(C12923a.C12926c.C12930c.ASCENDING)) {
                aVar2 = C9893q.C9896c.C9897a.ASCENDING;
            } else {
                aVar2 = C9893q.C9896c.C9897a.DESCENDING;
            }
            arrayList.add(C9893q.C9896c.m50737b(w, aVar2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9899s mo22863d(C10144a aVar) {
        int i = C6811a.f31395a[aVar.mo32795g0().ordinal()];
        if (i == 1) {
            return m39059b(aVar.mo32794f0(), aVar.mo32796h0());
        }
        if (i == 2) {
            return m39060g(aVar.mo32797i0(), aVar.mo32796h0());
        }
        if (i == 3) {
            return m39061i(aVar.mo32798j0());
        }
        throw C10432b.m52645a("Unknown MaybeDocument %s", aVar);
    }

    /* renamed from: e */
    public C10009f mo22864e(C13093c0 c0Var) {
        return this.f31394a.mo32993o(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10010g mo22865f(C10158e eVar) {
        int l0 = eVar.mo32829l0();
        C10428q w = this.f31394a.mo32997w(eVar.mo32830m0());
        int k0 = eVar.mo32828k0();
        ArrayList arrayList = new ArrayList(k0);
        for (int i = 0; i < k0; i++) {
            arrayList.add(this.f31394a.mo32993o(eVar.mo32827j0(i)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.mo32832o0());
        int i2 = 0;
        while (i2 < eVar.mo32832o0()) {
            C13093c0 n0 = eVar.mo32831n0(i2);
            int i3 = i2 + 1;
            if (i3 < eVar.mo32832o0() && eVar.mo32831n0(i3).mo38146s0()) {
                C10432b.m52648d(eVar.mo32831n0(i2).mo38147t0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                C13093c0.C13095b w0 = C13093c0.m61533w0(n0);
                for (C13139n.C13142c D : eVar.mo32831n0(i3).mo38140m0().mo38197c0()) {
                    w0.mo38149D(D);
                }
                arrayList2.add(this.f31394a.mo32993o((C13093c0) w0.build()));
                i2 = i3;
            } else {
                arrayList2.add(this.f31394a.mo32993o(n0));
            }
            i2++;
        }
        return new C10010g(l0, w, arrayList, arrayList2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C6792f4 mo22866h(C10151c cVar) {
        C6469g1 g1Var;
        int q0 = cVar.mo32813q0();
        C9905w y = this.f31394a.mo32998y(cVar.mo32812p0());
        C9905w y2 = this.f31394a.mo32998y(cVar.mo32808l0());
        C8153i o0 = cVar.mo32811o0();
        long m0 = cVar.mo32809m0();
        int i = C6811a.f31396b[cVar.mo32814r0().ordinal()];
        if (i == 1) {
            g1Var = this.f31394a.mo32988e(cVar.mo32807k0());
        } else if (i == 2) {
            g1Var = this.f31394a.mo32996u(cVar.mo32810n0());
        } else {
            throw C10432b.m52645a("Unknown targetType %d", cVar.mo32814r0());
        }
        return new C6792f4(g1Var, q0, m0, C6787e1.LISTEN, y, y2, o0);
    }

    /* renamed from: j */
    public C12981a mo22867j(C13472i iVar) {
        C12981a.C12984c cVar;
        C13210y.C13215d S = this.f31394a.mo32979S(iVar.mo38586b());
        C12981a.C12983b h0 = C12981a.m61183h0();
        if (iVar.mo38585a().equals(C6452b1.C6453a.LIMIT_TO_FIRST)) {
            cVar = C12981a.C12984c.FIRST;
        } else {
            cVar = C12981a.C12984c.LAST;
        }
        h0.mo38044D(cVar);
        h0.mo38045E(S.mo38307e0());
        h0.mo38046F(S.mo38308f0());
        return (C12981a) h0.build();
    }

    /* renamed from: l */
    public C12923a mo22868l(List<C9893q.C9896c> list) {
        C12923a.C12925b g0 = C12923a.m61059g0();
        g0.mo37966E(C12923a.C12933d.COLLECTION_GROUP);
        for (C9893q.C9896c next : list) {
            C12923a.C12926c.C12929b h0 = C12923a.C12926c.m61070h0();
            h0.mo37972E(next.mo32341c().mo32348c());
            if (next.mo32344j() == C9893q.C9896c.C9897a.CONTAINS) {
                h0.mo37971D(C12923a.C12926c.C12927a.CONTAINS);
            } else if (next.mo32344j() == C9893q.C9896c.C9897a.ASCENDING) {
                h0.mo37973F(C12923a.C12926c.C12930c.ASCENDING);
            } else {
                h0.mo37973F(C12923a.C12926c.C12930c.DESCENDING);
            }
            g0.mo37965D(h0);
        }
        return (C12923a) g0.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C10144a mo22869m(C9885i iVar) {
        C10144a.C10146b k0 = C10144a.m51479k0();
        if (iVar.mo32379h()) {
            k0.mo32801F(m39063p(iVar));
        } else if (iVar.mo32371b()) {
            k0.mo32799D(m39062k(iVar));
        } else if (iVar.mo32380i()) {
            k0.mo32802G(m39064r(iVar));
        } else {
            throw C10432b.m52645a("Cannot encode invalid document %s", iVar);
        }
        k0.mo32800E(iVar.mo32372c());
        return (C10144a) k0.build();
    }

    /* renamed from: n */
    public C13093c0 mo22870n(C10009f fVar) {
        return this.f31394a.mo32978O(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C10158e mo22871o(C10010g gVar) {
        C10158e.C10160b p0 = C10158e.m51566p0();
        p0.mo32835F(gVar.mo32610e());
        p0.mo32836G(this.f31394a.mo32981V(gVar.mo32613g()));
        for (C10009f O : gVar.mo32609d()) {
            p0.mo32833D(this.f31394a.mo32978O(O));
        }
        for (C10009f O2 : gVar.mo32614h()) {
            p0.mo32834E(this.f31394a.mo32978O(O2));
        }
        return (C10158e) p0.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C10151c mo22872q(C6792f4 f4Var) {
        C6787e1 e1Var = C6787e1.LISTEN;
        C10432b.m52648d(e1Var.equals(f4Var.mo22801b()), "Only queries with purpose %s may be stored, got %s", e1Var, f4Var.mo22801b());
        C10151c.C10153b s0 = C10151c.m51519s0();
        s0.mo32822K(f4Var.mo22807g()).mo32818G(f4Var.mo22803d()).mo32817F(this.f31394a.mo32983X(f4Var.mo22800a())).mo32821J(this.f31394a.mo32983X(f4Var.mo22804e())).mo32820I(f4Var.mo22802c());
        C6469g1 f = f4Var.mo22806f();
        if (f.mo21949s()) {
            s0.mo32816E(this.f31394a.mo32974F(f));
        } else {
            s0.mo32819H(this.f31394a.mo32979S(f));
        }
        return (C10151c) s0.build();
    }
}
