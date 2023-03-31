package p071j2;

import p037e2.C4192b0;
import p037e2.C4196c0;
import p037e2.C4200e0;
import p037e2.C4217n;

/* renamed from: j2.d */
/* compiled from: StartOffsetExtractorOutput */
public final class C4731d implements C4217n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f25326a;

    /* renamed from: b */
    private final C4217n f25327b;

    /* renamed from: j2.d$a */
    /* compiled from: StartOffsetExtractorOutput */
    class C4732a implements C4192b0 {

        /* renamed from: a */
        final /* synthetic */ C4192b0 f25328a;

        C4732a(C4192b0 b0Var) {
            this.f25328a = b0Var;
        }

        /* renamed from: g */
        public boolean mo17534g() {
            return this.f25328a.mo17534g();
        }

        /* renamed from: i */
        public C4192b0.C4193a mo17535i(long j) {
            C4192b0.C4193a i = this.f25328a.mo17535i(j);
            C4196c0 c0Var = i.f23480a;
            C4196c0 c0Var2 = new C4196c0(c0Var.f23485a, c0Var.f23486b + C4731d.this.f25326a);
            C4196c0 c0Var3 = i.f23481b;
            return new C4192b0.C4193a(c0Var2, new C4196c0(c0Var3.f23485a, c0Var3.f23486b + C4731d.this.f25326a));
        }

        /* renamed from: j */
        public long mo17536j() {
            return this.f25328a.mo17536j();
        }
    }

    public C4731d(long j, C4217n nVar) {
        this.f25326a = j;
        this.f25327b = nVar;
    }

    /* renamed from: f */
    public C4200e0 mo6778f(int i, int i2) {
        return this.f25327b.mo6778f(i, i2);
    }

    /* renamed from: l */
    public void mo6781l(C4192b0 b0Var) {
        this.f25327b.mo6781l(new C4732a(b0Var));
    }

    /* renamed from: n */
    public void mo6782n() {
        this.f25327b.mo6782n();
    }
}
