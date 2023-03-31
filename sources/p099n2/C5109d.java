package p099n2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4200e0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6249m2;

/* renamed from: n2.d */
/* compiled from: OggExtractor */
public class C5109d implements C4215l {

    /* renamed from: d */
    public static final C4221r f26579d = C11928c.f44812b;

    /* renamed from: a */
    private C4217n f26580a;

    /* renamed from: b */
    private C5114i f26581b;

    /* renamed from: c */
    private boolean f26582c;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C4215l[] m31943f() {
        return new C4215l[]{new C5109d()};
    }

    /* renamed from: g */
    private static C5918a0 m31944g(C5918a0 a0Var) {
        a0Var.mo20546O(0);
        return a0Var;
    }

    /* renamed from: i */
    private boolean m31945i(C4216m mVar) throws IOException {
        C5111f fVar = new C5111f();
        if (fVar.mo19080a(mVar, true) && (fVar.f26589b & 2) == 2) {
            int min = Math.min(fVar.f26596i, 8);
            C5918a0 a0Var = new C5918a0(min);
            mVar.mo17563p(a0Var.mo20551d(), 0, min);
            if (C5107b.m31934p(m31944g(a0Var))) {
                this.f26581b = new C5107b();
            } else if (C5118j.m31989r(m31944g(a0Var))) {
                this.f26581b = new C5118j();
            } else if (C5113h.m31966p(m31944g(a0Var))) {
                this.f26581b = new C5113h();
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        C5114i iVar = this.f26581b;
        if (iVar != null) {
            iVar.mo19089m(j, j2);
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26580a = nVar;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        C5917a.m34875h(this.f26580a);
        if (this.f26581b == null) {
            if (m31945i(mVar)) {
                mVar.mo17560j();
            } else {
                throw C6249m2.m36661a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f26582c) {
            C4200e0 f = this.f26580a.mo6778f(0, 1);
            this.f26580a.mo6782n();
            this.f26581b.mo19086d(this.f26580a, f);
            this.f26582c = true;
        }
        return this.f26581b.mo19088g(mVar, a0Var);
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        try {
            return m31945i(mVar);
        } catch (C6249m2 unused) {
            return false;
        }
    }
}
