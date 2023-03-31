package p058h2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4200e0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p037e2.C4222s;
import p037e2.C4224t;
import p037e2.C4226u;
import p037e2.C4227v;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;

/* renamed from: h2.d */
/* compiled from: FlacExtractor */
public final class C4441d implements C4215l {

    /* renamed from: o */
    public static final C4221r f24649o = C10403c.f41323b;

    /* renamed from: a */
    private final byte[] f24650a;

    /* renamed from: b */
    private final C5918a0 f24651b;

    /* renamed from: c */
    private final boolean f24652c;

    /* renamed from: d */
    private final C4222s.C4223a f24653d;

    /* renamed from: e */
    private C4217n f24654e;

    /* renamed from: f */
    private C4200e0 f24655f;

    /* renamed from: g */
    private int f24656g;

    /* renamed from: h */
    private C5432a f24657h;

    /* renamed from: i */
    private C4227v f24658i;

    /* renamed from: j */
    private int f24659j;

    /* renamed from: k */
    private int f24660k;

    /* renamed from: l */
    private C4438b f24661l;

    /* renamed from: m */
    private int f24662m;

    /* renamed from: n */
    private long f24663n;

    public C4441d() {
        this(0);
    }

    /* renamed from: f */
    private long m29392f(C5918a0 a0Var, boolean z) {
        boolean z2;
        C5917a.m34872e(this.f24658i);
        int e = a0Var.mo20552e();
        while (e <= a0Var.mo20553f() - 16) {
            a0Var.mo20546O(e);
            if (C4222s.m28493d(a0Var, this.f24658i, this.f24660k, this.f24653d)) {
                a0Var.mo20546O(e);
                return this.f24653d.f23565a;
            }
            e++;
        }
        if (z) {
            while (e <= a0Var.mo20553f() - this.f24659j) {
                a0Var.mo20546O(e);
                boolean z3 = false;
                try {
                    z2 = C4222s.m28493d(a0Var, this.f24658i, this.f24660k, this.f24653d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (a0Var.mo20552e() <= a0Var.mo20553f()) {
                    z3 = z2;
                }
                if (z3) {
                    a0Var.mo20546O(e);
                    return this.f24653d.f23565a;
                }
                e++;
            }
            a0Var.mo20546O(a0Var.mo20553f());
            return -1;
        }
        a0Var.mo20546O(e);
        return -1;
    }

    /* renamed from: g */
    private void m29393g(C4216m mVar) throws IOException {
        this.f24660k = C4224t.m28501b(mVar);
        ((C4217n) C5953m0.m35138j(this.f24654e)).mo6781l(m29394i(mVar.mo17554c(), mVar.mo17553b()));
        this.f24656g = 5;
    }

    /* renamed from: i */
    private C4192b0 m29394i(long j, long j2) {
        C5917a.m34872e(this.f24658i);
        C4227v vVar = this.f24658i;
        if (vVar.f23579k != null) {
            return new C4226u(vVar, j);
        }
        if (j2 == -1 || vVar.f23578j <= 0) {
            return new C4192b0.C4194b(vVar.mo17588f());
        }
        C4438b bVar = new C4438b(vVar, this.f24660k, j, j2);
        this.f24661l = bVar;
        return bVar.mo17526b();
    }

    /* renamed from: j */
    private void m29395j(C4216m mVar) throws IOException {
        byte[] bArr = this.f24650a;
        mVar.mo17563p(bArr, 0, bArr.length);
        mVar.mo17560j();
        this.f24656g = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ C4215l[] m29396k() {
        return new C4215l[]{new C4441d()};
    }

    /* renamed from: l */
    private void m29397l() {
        ((C4200e0) C5953m0.m35138j(this.f24655f)).mo6838a((this.f24663n * 1000000) / ((long) ((C4227v) C5953m0.m35138j(this.f24658i)).f23573e), 1, this.f24662m, 0, (C4200e0.C4201a) null);
    }

    /* renamed from: m */
    private int m29398m(C4216m mVar, C4190a0 a0Var) throws IOException {
        boolean z;
        C5917a.m34872e(this.f24655f);
        C5917a.m34872e(this.f24658i);
        C4438b bVar = this.f24661l;
        if (bVar != null && bVar.mo17528d()) {
            return this.f24661l.mo17527c(mVar, a0Var);
        }
        if (this.f24663n == -1) {
            this.f24663n = C4222s.m28498i(mVar, this.f24658i);
            return 0;
        }
        int f = this.f24651b.mo20553f();
        if (f < 32768) {
            int read = mVar.read(this.f24651b.mo20551d(), f, 32768 - f);
            z = read == -1;
            if (!z) {
                this.f24651b.mo20545N(f + read);
            } else if (this.f24651b.mo20548a() == 0) {
                m29397l();
                return -1;
            }
        } else {
            z = false;
        }
        int e = this.f24651b.mo20552e();
        int i = this.f24662m;
        int i2 = this.f24659j;
        if (i < i2) {
            C5918a0 a0Var2 = this.f24651b;
            a0Var2.mo20547P(Math.min(i2 - i, a0Var2.mo20548a()));
        }
        long f2 = m29392f(this.f24651b, z);
        int e2 = this.f24651b.mo20552e() - e;
        this.f24651b.mo20546O(e);
        this.f24655f.mo6843d(this.f24651b, e2);
        this.f24662m += e2;
        if (f2 != -1) {
            m29397l();
            this.f24662m = 0;
            this.f24663n = f2;
        }
        if (this.f24651b.mo20548a() < 16) {
            int a = this.f24651b.mo20548a();
            System.arraycopy(this.f24651b.mo20551d(), this.f24651b.mo20552e(), this.f24651b.mo20551d(), 0, a);
            this.f24651b.mo20546O(0);
            this.f24651b.mo20545N(a);
        }
        return 0;
    }

    /* renamed from: n */
    private void m29399n(C4216m mVar) throws IOException {
        this.f24657h = C4224t.m28503d(mVar, !this.f24652c);
        this.f24656g = 1;
    }

    /* renamed from: o */
    private void m29400o(C4216m mVar) throws IOException {
        C4224t.C4225a aVar = new C4224t.C4225a(this.f24658i);
        boolean z = false;
        while (!z) {
            z = C4224t.m28504e(mVar, aVar);
            this.f24658i = (C4227v) C5953m0.m35138j(aVar.f23566a);
        }
        C5917a.m34872e(this.f24658i);
        this.f24659j = Math.max(this.f24658i.f23571c, 6);
        ((C4200e0) C5953m0.m35138j(this.f24655f)).mo6845e(this.f24658i.mo17589g(this.f24650a, this.f24657h));
        this.f24656g = 4;
    }

    /* renamed from: p */
    private void m29401p(C4216m mVar) throws IOException {
        C4224t.m28508i(mVar);
        this.f24656g = 3;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f24656g = 0;
        } else {
            C4438b bVar = this.f24661l;
            if (bVar != null) {
                bVar.mo17532h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f24663n = j3;
        this.f24662m = 0;
        this.f24651b.mo20542K(0);
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f24654e = nVar;
        this.f24655f = nVar.mo6778f(0, 1);
        nVar.mo6782n();
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        int i = this.f24656g;
        if (i == 0) {
            m29399n(mVar);
            return 0;
        } else if (i == 1) {
            m29395j(mVar);
            return 0;
        } else if (i == 2) {
            m29401p(mVar);
            return 0;
        } else if (i == 3) {
            m29400o(mVar);
            return 0;
        } else if (i == 4) {
            m29393g(mVar);
            return 0;
        } else if (i == 5) {
            return m29398m(mVar, a0Var);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        C4224t.m28502c(mVar, false);
        return C4224t.m28500a(mVar);
    }

    public C4441d(int i) {
        this.f24650a = new byte[42];
        this.f24651b = new C5918a0(new byte[32768], 0);
        this.f24652c = (i & 1) == 0 ? false : true;
        this.f24653d = new C4222s.C4223a();
        this.f24656g = 0;
    }
}
