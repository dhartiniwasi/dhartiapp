package p015b3;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import p015b3.C1700e0;
import p015b3.C1772x;
import p030d2.C4045p;
import p030d2.C4048w;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6266q3;

/* renamed from: b3.g */
/* compiled from: CompositeMediaSource */
public abstract class C1706g<T> extends C1687a {

    /* renamed from: h */
    private final HashMap<T, C1708b<T>> f5004h = new HashMap<>();

    /* renamed from: i */
    private Handler f5005i;

    /* renamed from: r */
    private C5840p0 f5006r;

    /* renamed from: b3.g$a */
    /* compiled from: CompositeMediaSource */
    private final class C1707a implements C1700e0, C4048w {

        /* renamed from: a */
        private final T f5007a;

        /* renamed from: b */
        private C1700e0.C1701a f5008b;

        /* renamed from: c */
        private C4048w.C4049a f5009c;

        public C1707a(T t) {
            this.f5008b = C1706g.this.mo6667w((C1772x.C1774b) null);
            this.f5009c = C1706g.this.mo6665u((C1772x.C1774b) null);
            this.f5007a = t;
        }

        /* renamed from: b */
        private boolean m7960b(int i, C1772x.C1774b bVar) {
            C1772x.C1774b bVar2;
            if (bVar != null) {
                bVar2 = C1706g.this.mo6736I(this.f5007a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int K = C1706g.this.mo6738K(this.f5007a, i);
            C1700e0.C1701a aVar = this.f5008b;
            if (aVar.f4996a != K || !C5953m0.m35124c(aVar.f4997b, bVar2)) {
                this.f5008b = C1706g.this.mo6666v(K, bVar2, 0);
            }
            C4048w.C4049a aVar2 = this.f5009c;
            if (aVar2.f23127a == K && C5953m0.m35124c(aVar2.f23128b, bVar2)) {
                return true;
            }
            this.f5009c = C1706g.this.mo6664t(K, bVar2);
            return true;
        }

        /* renamed from: g */
        private C1759t m7961g(C1759t tVar) {
            long J = C1706g.this.mo6737J(this.f5007a, tVar.f5240f);
            long J2 = C1706g.this.mo6737J(this.f5007a, tVar.f5241g);
            if (J == tVar.f5240f && J2 == tVar.f5241g) {
                return tVar;
            }
            return new C1759t(tVar.f5235a, tVar.f5236b, tVar.f5237c, tVar.f5238d, tVar.f5239e, J, J2);
        }

        /* renamed from: E */
        public void mo145E(int i, C1772x.C1774b bVar, C1759t tVar) {
            if (m7960b(i, bVar)) {
                this.f5008b.mo6717E(m7961g(tVar));
            }
        }

        /* renamed from: G */
        public void mo148G(int i, C1772x.C1774b bVar, C1759t tVar) {
            if (m7960b(i, bVar)) {
                this.f5008b.mo6721j(m7961g(tVar));
            }
        }

        /* renamed from: P */
        public void mo154P(int i, C1772x.C1774b bVar, int i2) {
            if (m7960b(i, bVar)) {
                this.f5009c.mo17256k(i2);
            }
        }

        /* renamed from: Q */
        public /* synthetic */ void mo155Q(int i, C1772x.C1774b bVar) {
            C4045p.m27849a(this, i, bVar);
        }

        /* renamed from: T */
        public void mo158T(int i, C1772x.C1774b bVar) {
            if (m7960b(i, bVar)) {
                this.f5009c.mo17255j();
            }
        }

        /* renamed from: V */
        public void mo160V(int i, C1772x.C1774b bVar, Exception exc) {
            if (m7960b(i, bVar)) {
                this.f5009c.mo17257l(exc);
            }
        }

        /* renamed from: W */
        public void mo161W(int i, C1772x.C1774b bVar) {
            if (m7960b(i, bVar)) {
                this.f5009c.mo17258m();
            }
        }

        /* renamed from: Y */
        public void mo164Y(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar) {
            if (m7960b(i, bVar)) {
                this.f5008b.mo6724s(qVar, m7961g(tVar));
            }
        }

        /* renamed from: f0 */
        public void mo172f0(int i, C1772x.C1774b bVar) {
            if (m7960b(i, bVar)) {
                this.f5009c.mo17253h();
            }
        }

        /* renamed from: g0 */
        public void mo174g0(int i, C1772x.C1774b bVar) {
            if (m7960b(i, bVar)) {
                this.f5009c.mo17254i();
            }
        }

        /* renamed from: i0 */
        public void mo176i0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar, IOException iOException, boolean z) {
            if (m7960b(i, bVar)) {
                this.f5008b.mo6730y(qVar, m7961g(tVar), iOException, z);
            }
        }

        /* renamed from: k0 */
        public void mo179k0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar) {
            if (m7960b(i, bVar)) {
                this.f5008b.mo6727v(qVar, m7961g(tVar));
            }
        }

        /* renamed from: o0 */
        public void mo183o0(int i, C1772x.C1774b bVar, C1748q qVar, C1759t tVar) {
            if (m7960b(i, bVar)) {
                this.f5008b.mo6714B(qVar, m7961g(tVar));
            }
        }
    }

    /* renamed from: b3.g$b */
    /* compiled from: CompositeMediaSource */
    private static final class C1708b<T> {

        /* renamed from: a */
        public final C1772x f5011a;

        /* renamed from: b */
        public final C1772x.C1775c f5012b;

        /* renamed from: c */
        public final C1706g<T>.C0000a f5013c;

        public C1708b(C1772x xVar, C1772x.C1775c cVar, C1706g<T>.C0000a aVar) {
            this.f5011a = xVar;
            this.f5012b = cVar;
            this.f5013c = aVar;
        }
    }

    protected C1706g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        this.f5006r = p0Var;
        this.f5005i = C5953m0.m35164w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
        for (C1708b next : this.f5004h.values()) {
            next.f5011a.mo6656c(next.f5012b);
            next.f5011a.mo6654a(next.f5013c);
            next.f5011a.mo6657f(next.f5013c);
        }
        this.f5004h.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo6734G(T t) {
        C1708b bVar = (C1708b) C5917a.m34872e(this.f5004h.get(t));
        bVar.f5011a.mo6655b(bVar.f5012b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo6735H(T t) {
        C1708b bVar = (C1708b) C5917a.m34872e(this.f5004h.get(t));
        bVar.f5011a.mo6663s(bVar.f5012b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C1772x.C1774b mo6736I(T t, C1772x.C1774b bVar) {
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public long mo6737J(T t, long j) {
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public int mo6738K(T t, int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract void m7946L(T t, C1772x xVar, C6266q3 q3Var);

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo6739N(T t, C1772x xVar) {
        C5917a.m34868a(!this.f5004h.containsKey(t));
        C1703f fVar = new C1703f(this, t);
        C1707a aVar = new C1707a(t);
        this.f5004h.put(t, new C1708b(xVar, fVar, aVar));
        xVar.mo6661p((Handler) C5917a.m34872e(this.f5005i), aVar);
        xVar.mo6658h((Handler) C5917a.m34872e(this.f5005i), aVar);
        xVar.mo6662r(fVar, this.f5006r, mo6649A());
        if (!mo6650B()) {
            xVar.mo6655b(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo6740O(T t) {
        C1708b bVar = (C1708b) C5917a.m34872e(this.f5004h.remove(t));
        bVar.f5011a.mo6656c(bVar.f5012b);
        bVar.f5011a.mo6654a(bVar.f5013c);
        bVar.f5011a.mo6657f(bVar.f5013c);
    }

    /* renamed from: l */
    public void mo6710l() throws IOException {
        for (C1708b<T> bVar : this.f5004h.values()) {
            bVar.f5011a.mo6710l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6669y() {
        for (C1708b next : this.f5004h.values()) {
            next.f5011a.mo6655b(next.f5012b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo6670z() {
        for (C1708b next : this.f5004h.values()) {
            next.f5011a.mo6663s(next.f5012b);
        }
    }
}
