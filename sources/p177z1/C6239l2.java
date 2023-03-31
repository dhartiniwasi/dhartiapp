package p177z1;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p004a2.C0010a;
import p004a2.C0079u1;
import p015b3.C1700e0;
import p015b3.C1748q;
import p015b3.C1750r;
import p015b3.C1754s;
import p015b3.C1757s0;
import p015b3.C1759t;
import p015b3.C1765u;
import p015b3.C1772x;
import p030d2.C4045p;
import p030d2.C4048w;
import p155v3.C5789b;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: z1.l2 */
/* compiled from: MediaSourceList */
final class C6239l2 {

    /* renamed from: a */
    private final C0079u1 f30041a;

    /* renamed from: b */
    private final List<C6242c> f30042b = new ArrayList();

    /* renamed from: c */
    private final IdentityHashMap<C1765u, C6242c> f30043c = new IdentityHashMap<>();

    /* renamed from: d */
    private final Map<Object, C6242c> f30044d = new HashMap();

    /* renamed from: e */
    private final C6243d f30045e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1700e0.C1701a f30046f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4048w.C4049a f30047g;

    /* renamed from: h */
    private final HashMap<C6242c, C6241b> f30048h;

    /* renamed from: i */
    private final Set<C6242c> f30049i;

    /* renamed from: j */
    private C1757s0 f30050j = new C1757s0.C1758a(0);

    /* renamed from: k */
    private boolean f30051k;

    /* renamed from: l */
    private C5840p0 f30052l;

    /* renamed from: z1.l2$a */
    /* compiled from: MediaSourceList */
    private final class C6240a implements C1700e0, C4048w {

        /* renamed from: a */
        private final C6242c f30053a;

        /* renamed from: b */
        private C1700e0.C1701a f30054b;

        /* renamed from: c */
        private C4048w.C4049a f30055c;

        public C6240a(C6242c cVar) {
            this.f30054b = C6239l2.this.f30046f;
            this.f30055c = C6239l2.this.f30047g;
            this.f30053a = cVar;
        }

        /* renamed from: b */
        private boolean m36620b(int i, C1772x.C1774b bVar) {
            C1772x.C1774b bVar2;
            if (bVar != null) {
                bVar2 = C6239l2.m36601n(this.f30053a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int e = C6239l2.m36604r(this.f30053a, i);
            C1700e0.C1701a aVar = this.f30054b;
            if (aVar.f4996a != e || !C5953m0.m35124c(aVar.f4997b, bVar2)) {
                this.f30054b = C6239l2.this.f30046f.mo6718F(e, bVar2, 0);
            }
            C4048w.C4049a aVar2 = this.f30055c;
            if (aVar2.f23127a == e && C5953m0.m35124c(aVar2.f23128b, bVar2)) {
                return true;
            }
            this.f30055c = C6239l2.this.f30047g.mo17260u(e, bVar2);
            return true;
        }

        /* renamed from: E */
        public void mo145E(int i, C1772x.C1774b bVar, C1759t tVar) {
            if (m36620b(i, bVar)) {
                this.f30054b.mo6717E(tVar);
            }
        }

        /* renamed from: G */
        public void mo148G(int i, C1772x.C1774b bVar, C1759t tVar) {
            if (m36620b(i, bVar)) {
                this.f30054b.mo6721j(tVar);
            }
        }

        /* renamed from: P */
        public void mo154P(int i, C1772x.C1774b bVar, int i2) {
            if (m36620b(i, bVar)) {
                this.f30055c.mo17256k(i2);
            }
        }

        /* renamed from: Q */
        public /* synthetic */ void mo155Q(int i, C1772x.C1774b bVar) {
            C4045p.m27849a(this, i, bVar);
        }

        /* renamed from: T */
        public void mo158T(int i, C1772x.C1774b bVar) {
            if (m36620b(i, bVar)) {
                this.f30055c.mo17255j();
            }
        }

        /* renamed from: V */
        public void mo160V(int i, C1772x.C1774b bVar, Exception exc) {
            if (m36620b(i, bVar)) {
                this.f30055c.mo17257l(exc);
            }
        }

        /* renamed from: W */
        public void mo161W(int i, C1772x.C1774b bVar) {
            if (m36620b(i, bVar)) {
                this.f30055c.mo17258m();
            }
        }

        /* renamed from: Y */
        public void mo164Y(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar) {
            if (m36620b(i, bVar)) {
                this.f30054b.mo6724s(qVar, tVar);
            }
        }

        /* renamed from: f0 */
        public void mo172f0(int i, C1772x.C1774b bVar) {
            if (m36620b(i, bVar)) {
                this.f30055c.mo17253h();
            }
        }

        /* renamed from: g0 */
        public void mo174g0(int i, C1772x.C1774b bVar) {
            if (m36620b(i, bVar)) {
                this.f30055c.mo17254i();
            }
        }

        /* renamed from: i0 */
        public void mo176i0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar, IOException iOException, boolean z) {
            if (m36620b(i, bVar)) {
                this.f30054b.mo6730y(qVar, tVar, iOException, z);
            }
        }

        /* renamed from: k0 */
        public void mo179k0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar) {
            if (m36620b(i, bVar)) {
                this.f30054b.mo6727v(qVar, tVar);
            }
        }

        /* renamed from: o0 */
        public void mo183o0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar) {
            if (m36620b(i, bVar)) {
                this.f30054b.mo6714B(qVar, tVar);
            }
        }
    }

    /* renamed from: z1.l2$b */
    /* compiled from: MediaSourceList */
    private static final class C6241b {

        /* renamed from: a */
        public final C1772x f30057a;

        /* renamed from: b */
        public final C1772x.C1775c f30058b;

        /* renamed from: c */
        public final C6240a f30059c;

        public C6241b(C1772x xVar, C1772x.C1775c cVar, C6240a aVar) {
            this.f30057a = xVar;
            this.f30058b = cVar;
            this.f30059c = aVar;
        }
    }

    /* renamed from: z1.l2$c */
    /* compiled from: MediaSourceList */
    static final class C6242c implements C6233j2 {

        /* renamed from: a */
        public final C1754s f30060a;

        /* renamed from: b */
        public final Object f30061b = new Object();

        /* renamed from: c */
        public final List<C1772x.C1774b> f30062c = new ArrayList();

        /* renamed from: d */
        public int f30063d;

        /* renamed from: e */
        public boolean f30064e;

        public C6242c(C1772x xVar, boolean z) {
            this.f30060a = new C1754s(xVar, z);
        }

        /* renamed from: a */
        public C6266q3 mo21212a() {
            return this.f30060a.mo6870T();
        }

        /* renamed from: b */
        public Object mo21213b() {
            return this.f30061b;
        }

        /* renamed from: c */
        public void mo21394c(int i) {
            this.f30063d = i;
            this.f30064e = false;
            this.f30062c.clear();
        }
    }

    /* renamed from: z1.l2$d */
    /* compiled from: MediaSourceList */
    public interface C6243d {
        /* renamed from: d */
        void mo21395d();
    }

    public C6239l2(C6243d dVar, C0010a aVar, Handler handler, C0079u1 u1Var) {
        this.f30041a = u1Var;
        this.f30045e = dVar;
        C1700e0.C1701a aVar2 = new C1700e0.C1701a();
        this.f30046f = aVar2;
        C4048w.C4049a aVar3 = new C4048w.C4049a();
        this.f30047g = aVar3;
        this.f30048h = new HashMap<>();
        this.f30049i = new HashSet();
        aVar2.mo6719g(handler, aVar);
        aVar3.mo17252g(handler, aVar);
    }

    /* renamed from: B */
    private void m36590B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C6242c remove = this.f30042b.remove(i3);
            this.f30044d.remove(remove.f30061b);
            m36596g(i3, -remove.f30060a.mo6870T().mo6761t());
            remove.f30064e = true;
            if (this.f30051k) {
                m36606u(remove);
            }
        }
    }

    /* renamed from: g */
    private void m36596g(int i, int i2) {
        while (i < this.f30042b.size()) {
            this.f30042b.get(i).f30063d += i2;
            i++;
        }
    }

    /* renamed from: j */
    private void m36597j(C6242c cVar) {
        C6241b bVar = this.f30048h.get(cVar);
        if (bVar != null) {
            bVar.f30057a.mo6655b(bVar.f30058b);
        }
    }

    /* renamed from: k */
    private void m36598k() {
        Iterator<C6242c> it = this.f30049i.iterator();
        while (it.hasNext()) {
            C6242c next = it.next();
            if (next.f30062c.isEmpty()) {
                m36597j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    private void m36599l(C6242c cVar) {
        this.f30049i.add(cVar);
        C6241b bVar = this.f30048h.get(cVar);
        if (bVar != null) {
            bVar.f30057a.mo6663s(bVar.f30058b);
        }
    }

    /* renamed from: m */
    private static Object m36600m(Object obj) {
        return C6196a.m36062A(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static C1772x.C1774b m36601n(C6242c cVar, C1772x.C1774b bVar) {
        for (int i = 0; i < cVar.f30062c.size(); i++) {
            if (cVar.f30062c.get(i).f5273d == bVar.f5273d) {
                return bVar.mo6896c(m36603p(cVar, bVar.f5270a));
            }
        }
        return null;
    }

    /* renamed from: o */
    private static Object m36602o(Object obj) {
        return C6196a.m36063B(obj);
    }

    /* renamed from: p */
    private static Object m36603p(C6242c cVar, Object obj) {
        return C6196a.m36064D(cVar.f30061b, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static int m36604r(C6242c cVar, int i) {
        return i + cVar.f30063d;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m36605t(C1772x xVar, C6266q3 q3Var) {
        this.f30045e.mo21395d();
    }

    /* renamed from: u */
    private void m36606u(C6242c cVar) {
        if (cVar.f30064e && cVar.f30062c.isEmpty()) {
            C6241b bVar = (C6241b) C5917a.m34872e(this.f30048h.remove(cVar));
            bVar.f30057a.mo6656c(bVar.f30058b);
            bVar.f30057a.mo6654a(bVar.f30059c);
            bVar.f30057a.mo6657f(bVar.f30059c);
            this.f30049i.remove(cVar);
        }
    }

    /* renamed from: x */
    private void m36607x(C6242c cVar) {
        C1754s sVar = cVar.f30060a;
        C13402k2 k2Var = new C13402k2(this);
        C6240a aVar = new C6240a(cVar);
        this.f30048h.put(cVar, new C6241b(sVar, k2Var, aVar));
        sVar.mo6661p(C5953m0.m35168y(), aVar);
        sVar.mo6658h(C5953m0.m35168y(), aVar);
        sVar.mo6662r(k2Var, this.f30052l, this.f30041a);
    }

    /* renamed from: A */
    public C6266q3 mo21382A(int i, int i2, C1757s0 s0Var) {
        C5917a.m34868a(i >= 0 && i <= i2 && i2 <= mo21388q());
        this.f30050j = s0Var;
        m36590B(i, i2);
        return mo21387i();
    }

    /* renamed from: C */
    public C6266q3 mo21383C(List<C6242c> list, C1757s0 s0Var) {
        m36590B(0, this.f30042b.size());
        return mo21385f(this.f30042b.size(), list, s0Var);
    }

    /* renamed from: D */
    public C6266q3 mo21384D(C1757s0 s0Var) {
        int q = mo21388q();
        if (s0Var.mo6873b() != q) {
            s0Var = s0Var.mo6880i().mo6878g(0, q);
        }
        this.f30050j = s0Var;
        return mo21387i();
    }

    /* renamed from: f */
    public C6266q3 mo21385f(int i, List<C6242c> list, C1757s0 s0Var) {
        if (!list.isEmpty()) {
            this.f30050j = s0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C6242c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    C6242c cVar2 = this.f30042b.get(i2 - 1);
                    cVar.mo21394c(cVar2.f30063d + cVar2.f30060a.mo6870T().mo6761t());
                } else {
                    cVar.mo21394c(0);
                }
                m36596g(i2, cVar.f30060a.mo6870T().mo6761t());
                this.f30042b.add(i2, cVar);
                this.f30044d.put(cVar.f30061b, cVar);
                if (this.f30051k) {
                    m36607x(cVar);
                    if (this.f30043c.isEmpty()) {
                        this.f30049i.add(cVar);
                    } else {
                        m36597j(cVar);
                    }
                }
            }
        }
        return mo21387i();
    }

    /* renamed from: h */
    public C1765u mo21386h(C1772x.C1774b bVar, C5789b bVar2, long j) {
        Object o = m36602o(bVar.f5270a);
        C1772x.C1774b c = bVar.mo6896c(m36600m(bVar.f5270a));
        C6242c cVar = (C6242c) C5917a.m34872e(this.f30044d.get(o));
        m36599l(cVar);
        cVar.f30062c.add(c);
        C1750r P = cVar.f30060a.mo6709k(c, bVar2, j);
        this.f30043c.put(P, cVar);
        m36598k();
        return P;
    }

    /* renamed from: i */
    public C6266q3 mo21387i() {
        if (this.f30042b.isEmpty()) {
            return C6266q3.f30181a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f30042b.size(); i2++) {
            C6242c cVar = this.f30042b.get(i2);
            cVar.f30063d = i;
            i += cVar.f30060a.mo6870T().mo6761t();
        }
        return new C6318z2(this.f30042b, this.f30050j);
    }

    /* renamed from: q */
    public int mo21388q() {
        return this.f30042b.size();
    }

    /* renamed from: s */
    public boolean mo21389s() {
        return this.f30051k;
    }

    /* renamed from: v */
    public C6266q3 mo21390v(int i, int i2, int i3, C1757s0 s0Var) {
        C5917a.m34868a(i >= 0 && i <= i2 && i2 <= mo21388q() && i3 >= 0);
        this.f30050j = s0Var;
        if (i == i2 || i == i3) {
            return mo21387i();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = this.f30042b.get(min).f30063d;
        C5953m0.m35069A0(this.f30042b, i, i2, i3);
        while (min <= max) {
            C6242c cVar = this.f30042b.get(min);
            cVar.f30063d = i4;
            i4 += cVar.f30060a.mo6870T().mo6761t();
            min++;
        }
        return mo21387i();
    }

    /* renamed from: w */
    public void mo21391w(C5840p0 p0Var) {
        C5917a.m34873f(!this.f30051k);
        this.f30052l = p0Var;
        for (int i = 0; i < this.f30042b.size(); i++) {
            C6242c cVar = this.f30042b.get(i);
            m36607x(cVar);
            this.f30049i.add(cVar);
        }
        this.f30051k = true;
    }

    /* renamed from: y */
    public void mo21392y() {
        for (C6241b next : this.f30048h.values()) {
            try {
                next.f30057a.mo6656c(next.f30058b);
            } catch (RuntimeException e) {
                C5961r.m35210d("MediaSourceList", "Failed to release child source.", e);
            }
            next.f30057a.mo6654a(next.f30059c);
            next.f30057a.mo6657f(next.f30059c);
        }
        this.f30048h.clear();
        this.f30049i.clear();
        this.f30051k = false;
    }

    /* renamed from: z */
    public void mo21393z(C1765u uVar) {
        C6242c cVar = (C6242c) C5917a.m34872e(this.f30043c.remove(uVar));
        cVar.f30060a.mo6707d(uVar);
        cVar.f30062c.remove(((C1750r) uVar).f5210a);
        if (!this.f30043c.isEmpty()) {
            m36598k();
        }
        m36606u(cVar);
    }
}
