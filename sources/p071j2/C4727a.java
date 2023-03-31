package p071j2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p092m2.C5021k;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5918a0;
import p166x2.C6044b;
import p177z1.C6272r1;

/* renamed from: j2.a */
/* compiled from: JpegExtractor */
public final class C4727a implements C4215l {

    /* renamed from: a */
    private final C5918a0 f25309a = new C5918a0(6);

    /* renamed from: b */
    private C4217n f25310b;

    /* renamed from: c */
    private int f25311c;

    /* renamed from: d */
    private int f25312d;

    /* renamed from: e */
    private int f25313e;

    /* renamed from: f */
    private long f25314f = -1;

    /* renamed from: g */
    private C6044b f25315g;

    /* renamed from: h */
    private C4216m f25316h;

    /* renamed from: i */
    private C4730c f25317i;

    /* renamed from: j */
    private C5021k f25318j;

    /* renamed from: b */
    private void m30491b(C4216m mVar) throws IOException {
        this.f25309a.mo20542K(2);
        mVar.mo17563p(this.f25309a.mo20551d(), 0, 2);
        mVar.mo17558g(this.f25309a.mo20540I() - 2);
    }

    /* renamed from: f */
    private void m30492f() {
        m30494i(new C5432a.C5434b[0]);
        ((C4217n) C5917a.m34872e(this.f25310b)).mo6782n();
        this.f25310b.mo6781l(new C4192b0.C4194b(-9223372036854775807L));
        this.f25311c = 6;
    }

    /* renamed from: g */
    private static C6044b m30493g(String str, long j) throws IOException {
        C4728b a;
        if (j == -1 || (a = C4733e.m30517a(str)) == null) {
            return null;
        }
        return a.mo18393a(j);
    }

    /* renamed from: i */
    private void m30494i(C5432a.C5434b... bVarArr) {
        ((C4217n) C5917a.m34872e(this.f25310b)).mo6778f(1024, 4).mo6845e(new C6272r1.C6274b().mo21497K("image/jpeg").mo21510X(new C5432a(bVarArr)).mo21491E());
    }

    /* renamed from: j */
    private int m30495j(C4216m mVar) throws IOException {
        this.f25309a.mo20542K(2);
        mVar.mo17563p(this.f25309a.mo20551d(), 0, 2);
        return this.f25309a.mo20540I();
    }

    /* renamed from: k */
    private void m30496k(C4216m mVar) throws IOException {
        this.f25309a.mo20542K(2);
        mVar.readFully(this.f25309a.mo20551d(), 0, 2);
        int I = this.f25309a.mo20540I();
        this.f25312d = I;
        if (I == 65498) {
            if (this.f25314f != -1) {
                this.f25311c = 4;
            } else {
                m30492f();
            }
        } else if ((I < 65488 || I > 65497) && I != 65281) {
            this.f25311c = 1;
        }
    }

    /* renamed from: l */
    private void m30497l(C4216m mVar) throws IOException {
        String w;
        if (this.f25312d == 65505) {
            C5918a0 a0Var = new C5918a0(this.f25313e);
            mVar.readFully(a0Var.mo20551d(), 0, this.f25313e);
            if (this.f25315g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.mo20570w()) && (w = a0Var.mo20570w()) != null) {
                C6044b g = m30493g(w, mVar.mo17553b());
                this.f25315g = g;
                if (g != null) {
                    this.f25314f = g.f29316d;
                }
            }
        } else {
            mVar.mo17561k(this.f25313e);
        }
        this.f25311c = 0;
    }

    /* renamed from: m */
    private void m30498m(C4216m mVar) throws IOException {
        this.f25309a.mo20542K(2);
        mVar.readFully(this.f25309a.mo20551d(), 0, 2);
        this.f25313e = this.f25309a.mo20540I() - 2;
        this.f25311c = 2;
    }

    /* renamed from: n */
    private void m30499n(C4216m mVar) throws IOException {
        if (!mVar.mo17556e(this.f25309a.mo20551d(), 0, 1, true)) {
            m30492f();
            return;
        }
        mVar.mo17560j();
        if (this.f25318j == null) {
            this.f25318j = new C5021k();
        }
        C4730c cVar = new C4730c(mVar, this.f25314f);
        this.f25317i = cVar;
        if (this.f25318j.mo17583h(cVar)) {
            this.f25318j.mo17581d(new C4731d(this.f25314f, (C4217n) C5917a.m34872e(this.f25310b)));
            m30500o();
            return;
        }
        m30492f();
    }

    /* renamed from: o */
    private void m30500o() {
        m30494i((C5432a.C5434b) C5917a.m34872e(this.f25315g));
        this.f25311c = 5;
    }

    /* renamed from: a */
    public void mo17579a() {
        C5021k kVar = this.f25318j;
        if (kVar != null) {
            kVar.mo17579a();
        }
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        if (j == 0) {
            this.f25311c = 0;
            this.f25318j = null;
        } else if (this.f25311c == 5) {
            ((C5021k) C5917a.m34872e(this.f25318j)).mo17580c(j, j2);
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f25310b = nVar;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        int i = this.f25311c;
        if (i == 0) {
            m30496k(mVar);
            return 0;
        } else if (i == 1) {
            m30498m(mVar);
            return 0;
        } else if (i == 2) {
            m30497l(mVar);
            return 0;
        } else if (i == 4) {
            long c = mVar.mo17554c();
            long j = this.f25314f;
            if (c != j) {
                a0Var.f23479a = j;
                return 1;
            }
            m30499n(mVar);
            return 0;
        } else if (i == 5) {
            if (this.f25317i == null || mVar != this.f25316h) {
                this.f25316h = mVar;
                this.f25317i = new C4730c(mVar, this.f25314f);
            }
            int e = ((C5021k) C5917a.m34872e(this.f25318j)).mo17582e(this.f25317i, a0Var);
            if (e == 1) {
                a0Var.f23479a += this.f25314f;
            }
            return e;
        } else if (i == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        if (m30495j(mVar) != 65496) {
            return false;
        }
        int j = m30495j(mVar);
        this.f25312d = j;
        if (j == 65504) {
            m30491b(mVar);
            this.f25312d = m30495j(mVar);
        }
        if (this.f25312d != 65505) {
            return false;
        }
        mVar.mo17558g(2);
        this.f25309a.mo20542K(6);
        mVar.mo17563p(this.f25309a.mo20551d(), 0, 6);
        if (this.f25309a.mo20536E() == 1165519206 && this.f25309a.mo20540I() == 0) {
            return true;
        }
        return false;
    }
}
