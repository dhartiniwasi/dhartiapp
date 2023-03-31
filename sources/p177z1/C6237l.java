package p177z1;

import p161w3.C5917a;
import p161w3.C5923d;
import p161w3.C5930e0;
import p161w3.C5965t;

/* renamed from: z1.l */
/* compiled from: DefaultMediaClock */
final class C6237l implements C5965t {

    /* renamed from: a */
    private final C5930e0 f30035a;

    /* renamed from: b */
    private final C6238a f30036b;

    /* renamed from: c */
    private C6211d3 f30037c;

    /* renamed from: d */
    private C5965t f30038d;

    /* renamed from: e */
    private boolean f30039e = true;

    /* renamed from: f */
    private boolean f30040f;

    /* renamed from: z1.l$a */
    /* compiled from: DefaultMediaClock */
    public interface C6238a {
        /* renamed from: g */
        void mo21381g(C6280t2 t2Var);
    }

    public C6237l(C6238a aVar, C5923d dVar) {
        this.f30036b = aVar;
        this.f30035a = new C5930e0(dVar);
    }

    /* renamed from: f */
    private boolean m36578f(boolean z) {
        C6211d3 d3Var = this.f30037c;
        return d3Var == null || d3Var.mo6484d() || (!this.f30037c.isReady() && (z || this.f30037c.mo21222h()));
    }

    /* renamed from: j */
    private void m36579j(boolean z) {
        if (m36578f(z)) {
            this.f30039e = true;
            if (this.f30040f) {
                this.f30035a.mo20590b();
                return;
            }
            return;
        }
        C5965t tVar = (C5965t) C5917a.m34872e(this.f30038d);
        long l = tVar.mo6489l();
        if (this.f30039e) {
            if (l < this.f30035a.mo6489l()) {
                this.f30035a.mo20591d();
                return;
            }
            this.f30039e = false;
            if (this.f30040f) {
                this.f30035a.mo20590b();
            }
        }
        this.f30035a.mo20589a(l);
        C6280t2 e = tVar.mo6485e();
        if (!e.equals(this.f30035a.mo6485e())) {
            this.f30035a.mo6483c(e);
            this.f30036b.mo21381g(e);
        }
    }

    /* renamed from: a */
    public void mo21375a(C6211d3 d3Var) {
        if (d3Var == this.f30037c) {
            this.f30038d = null;
            this.f30037c = null;
            this.f30039e = true;
        }
    }

    /* renamed from: b */
    public void mo21376b(C6211d3 d3Var) throws C6264q {
        C5965t tVar;
        C5965t x = d3Var.mo6497x();
        if (x != null && x != (tVar = this.f30038d)) {
            if (tVar == null) {
                this.f30038d = x;
                this.f30037c = d3Var;
                x.mo6483c(this.f30035a.mo6485e());
                return;
            }
            throw C6264q.m36814i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: c */
    public void mo6483c(C6280t2 t2Var) {
        C5965t tVar = this.f30038d;
        if (tVar != null) {
            tVar.mo6483c(t2Var);
            t2Var = this.f30038d.mo6485e();
        }
        this.f30035a.mo6483c(t2Var);
    }

    /* renamed from: d */
    public void mo21377d(long j) {
        this.f30035a.mo20589a(j);
    }

    /* renamed from: e */
    public C6280t2 mo6485e() {
        C5965t tVar = this.f30038d;
        if (tVar != null) {
            return tVar.mo6485e();
        }
        return this.f30035a.mo6485e();
    }

    /* renamed from: g */
    public void mo21378g() {
        this.f30040f = true;
        this.f30035a.mo20590b();
    }

    /* renamed from: h */
    public void mo21379h() {
        this.f30040f = false;
        this.f30035a.mo20591d();
    }

    /* renamed from: i */
    public long mo21380i(boolean z) {
        m36579j(z);
        return mo6489l();
    }

    /* renamed from: l */
    public long mo6489l() {
        if (this.f30039e) {
            return this.f30035a.mo6489l();
        }
        return ((C5965t) C5917a.m34872e(this.f30038d)).mo6489l();
    }
}
