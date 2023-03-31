package p099n2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4200e0;
import p037e2.C4216m;
import p037e2.C4217n;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: n2.i */
/* compiled from: StreamReader */
abstract class C5114i {

    /* renamed from: a */
    private final C5110e f26602a = new C5110e();

    /* renamed from: b */
    private C4200e0 f26603b;

    /* renamed from: c */
    private C4217n f26604c;

    /* renamed from: d */
    private C5112g f26605d;

    /* renamed from: e */
    private long f26606e;

    /* renamed from: f */
    private long f26607f;

    /* renamed from: g */
    private long f26608g;

    /* renamed from: h */
    private int f26609h;

    /* renamed from: i */
    private int f26610i;

    /* renamed from: j */
    private C5116b f26611j = new C5116b();

    /* renamed from: k */
    private long f26612k;

    /* renamed from: l */
    private boolean f26613l;

    /* renamed from: m */
    private boolean f26614m;

    /* renamed from: n2.i$b */
    /* compiled from: StreamReader */
    static class C5116b {

        /* renamed from: a */
        C6272r1 f26615a;

        /* renamed from: b */
        C5112g f26616b;

        C5116b() {
        }
    }

    /* renamed from: n2.i$c */
    /* compiled from: StreamReader */
    private static final class C5117c implements C5112g {
        private C5117c() {
        }

        /* renamed from: a */
        public C4192b0 mo19066a() {
            return new C4192b0.C4194b(-9223372036854775807L);
        }

        /* renamed from: b */
        public long mo19067b(C4216m mVar) {
            return -1;
        }

        /* renamed from: c */
        public void mo19068c(long j) {
        }
    }

    /* renamed from: a */
    private void m31970a() {
        C5917a.m34875h(this.f26603b);
        C5953m0.m35138j(this.f26604c);
    }

    /* renamed from: h */
    private boolean m31971h(C4216m mVar) throws IOException {
        while (this.f26602a.mo19077d(mVar)) {
            this.f26612k = mVar.mo17554c() - this.f26607f;
            if (!mo19072i(this.f26602a.mo19076c(), this.f26607f, this.f26611j)) {
                return true;
            }
            this.f26607f = mVar.mo17554c();
        }
        this.f26609h = 3;
        return false;
    }

    /* renamed from: j */
    private int m31972j(C4216m mVar) throws IOException {
        if (!m31971h(mVar)) {
            return -1;
        }
        C6272r1 r1Var = this.f26611j.f26615a;
        this.f26610i = r1Var.f30225H;
        if (!this.f26614m) {
            this.f26603b.mo6845e(r1Var);
            this.f26614m = true;
        }
        C5112g gVar = this.f26611j.f26616b;
        if (gVar != null) {
            this.f26605d = gVar;
        } else if (mVar.mo17553b() == -1) {
            this.f26605d = new C5117c();
        } else {
            C5111f b = this.f26602a.mo19075b();
            this.f26605d = new C5104a(this, this.f26607f, mVar.mo17553b(), (long) (b.f26595h + b.f26596i), b.f26590c, (b.f26589b & 4) != 0);
        }
        this.f26609h = 2;
        this.f26602a.mo19079f();
        return 0;
    }

    /* renamed from: k */
    private int m31973k(C4216m mVar, C4190a0 a0Var) throws IOException {
        C4216m mVar2 = mVar;
        long b = this.f26605d.mo19067b(mVar2);
        if (b >= 0) {
            a0Var.f23479a = b;
            return 1;
        }
        if (b < -1) {
            mo19087e(-(b + 2));
        }
        if (!this.f26613l) {
            this.f26604c.mo6781l((C4192b0) C5917a.m34875h(this.f26605d.mo19066a()));
            this.f26613l = true;
        }
        if (this.f26612k > 0 || this.f26602a.mo19077d(mVar2)) {
            this.f26612k = 0;
            C5918a0 c = this.f26602a.mo19076c();
            long f = mo19071f(c);
            if (f >= 0) {
                long j = this.f26608g;
                if (j + f >= this.f26606e) {
                    long b2 = mo19084b(j);
                    this.f26603b.mo6843d(c, c.mo20553f());
                    this.f26603b.mo6838a(b2, 1, c.mo20553f(), 0, (C4200e0.C4201a) null);
                    this.f26606e = -1;
                }
            }
            this.f26608g += f;
            return 0;
        }
        this.f26609h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo19084b(long j) {
        return (j * 1000000) / ((long) this.f26610i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo19085c(long j) {
        return (((long) this.f26610i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19086d(C4217n nVar, C4200e0 e0Var) {
        this.f26604c = nVar;
        this.f26603b = e0Var;
        mo19073l(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19087e(long j) {
        this.f26608g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract long mo19071f(C5918a0 a0Var);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo19088g(C4216m mVar, C4190a0 a0Var) throws IOException {
        m31970a();
        int i = this.f26609h;
        if (i == 0) {
            return m31972j(mVar);
        }
        if (i == 1) {
            mVar.mo17561k((int) this.f26607f);
            this.f26609h = 2;
            return 0;
        } else if (i == 2) {
            C5953m0.m35138j(this.f26605d);
            return m31973k(mVar, a0Var);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo19072i(C5918a0 a0Var, long j, C5116b bVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo19073l(boolean z) {
        if (z) {
            this.f26611j = new C5116b();
            this.f26607f = 0;
            this.f26609h = 0;
        } else {
            this.f26609h = 1;
        }
        this.f26606e = -1;
        this.f26608g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo19089m(long j, long j2) {
        this.f26602a.mo19078e();
        if (j == 0) {
            mo19073l(!this.f26613l);
        } else if (this.f26609h != 0) {
            this.f26606e = mo19085c(j2);
            ((C5112g) C5953m0.m35138j(this.f26605d)).mo19068c(this.f26606e);
            this.f26609h = 2;
        }
    }
}
