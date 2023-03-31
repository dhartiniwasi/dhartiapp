package p177z1;

import java.io.IOException;
import p004a2.C0079u1;
import p015b3.C1749q0;
import p021c2.C1848g;
import p161w3.C5917a;
import p161w3.C5965t;

/* renamed from: z1.f */
/* compiled from: BaseRenderer */
public abstract class C6218f implements C6211d3, C6220f3 {

    /* renamed from: a */
    private final int f29920a;

    /* renamed from: b */
    private final C6279s1 f29921b = new C6279s1();

    /* renamed from: c */
    private C6223g3 f29922c;

    /* renamed from: d */
    private int f29923d;

    /* renamed from: e */
    private C0079u1 f29924e;

    /* renamed from: f */
    private int f29925f;

    /* renamed from: g */
    private C1749q0 f29926g;

    /* renamed from: h */
    private C6272r1[] f29927h;

    /* renamed from: i */
    private long f29928i;

    /* renamed from: r */
    private long f29929r;

    /* renamed from: s */
    private long f29930s = Long.MIN_VALUE;

    /* renamed from: t */
    private boolean f29931t;

    /* renamed from: u */
    private boolean f29932u;

    public C6218f(int i) {
        this.f29920a = i;
    }

    /* renamed from: O */
    private void m36432O(long j, boolean z) throws C6264q {
        this.f29931t = false;
        this.f29929r = j;
        this.f29930s = j;
        mo6468I(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C6223g3 mo21288A() {
        return (C6223g3) C5917a.m34872e(this.f29922c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final C6279s1 mo21289B() {
        this.f29921b.mo21536a();
        return this.f29921b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final int mo21290C() {
        return this.f29923d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C0079u1 mo21291D() {
        return (C0079u1) C5917a.m34872e(this.f29924e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C6272r1[] mo21292E() {
        return (C6272r1[]) C5917a.m34872e(this.f29927h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo21293F() {
        return mo21222h() ? this.f29931t : ((C1749q0) C5917a.m34872e(this.f29926g)).isReady();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo6466G();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo6467H(boolean z, boolean z2) throws C6264q {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo6468I(long j, boolean z) throws C6264q;

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo6470J() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6472K() throws C6264q {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6474L() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract void mo18662M(C6272r1[] r1VarArr, long j, long j2) throws C6264q;

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final int mo21294N(C6279s1 s1Var, C1848g gVar, int i) {
        int f = ((C1749q0) C5917a.m34872e(this.f29926g)).mo6701f(s1Var, gVar, i);
        if (f == -4) {
            if (gVar.mo7034s()) {
                this.f29930s = Long.MIN_VALUE;
                if (this.f29931t) {
                    return -4;
                }
                return -3;
            }
            long j = gVar.f5432e + this.f29928i;
            gVar.f5432e = j;
            this.f29930s = Math.max(this.f29930s, j);
        } else if (f == -5) {
            C6272r1 r1Var = (C6272r1) C5917a.m34872e(s1Var.f30328b);
            if (r1Var.f30247x != Long.MAX_VALUE) {
                s1Var.f30328b = r1Var.mo21483b().mo21521i0(r1Var.f30247x + this.f29928i).mo21491E();
            }
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public int mo21295P(long j) {
        return ((C1749q0) C5917a.m34872e(this.f29926g)).mo6703l(j - this.f29928i);
    }

    /* renamed from: f */
    public final void mo21219f() {
        boolean z = true;
        if (this.f29925f != 1) {
            z = false;
        }
        C5917a.m34873f(z);
        this.f29921b.mo21536a();
        this.f29925f = 0;
        this.f29926g = null;
        this.f29927h = null;
        this.f29931t = false;
        mo6466G();
    }

    /* renamed from: g */
    public final int mo21220g() {
        return this.f29920a;
    }

    public final int getState() {
        return this.f29925f;
    }

    /* renamed from: h */
    public final boolean mo21222h() {
        return this.f29930s == Long.MIN_VALUE;
    }

    /* renamed from: i */
    public final void mo21223i(C6272r1[] r1VarArr, C1749q0 q0Var, long j, long j2) throws C6264q {
        C5917a.m34873f(!this.f29931t);
        this.f29926g = q0Var;
        if (this.f29930s == Long.MIN_VALUE) {
            this.f29930s = j;
        }
        this.f29927h = r1VarArr;
        this.f29928i = j2;
        mo18662M(r1VarArr, j, j2);
    }

    /* renamed from: j */
    public final void mo21224j() {
        this.f29931t = true;
    }

    /* renamed from: k */
    public final C6220f3 mo21225k() {
        return this;
    }

    /* renamed from: m */
    public /* synthetic */ void mo19501m(float f, float f2) {
        C6207c3.m36299a(this, f, f2);
    }

    /* renamed from: n */
    public final void mo21226n(int i, C0079u1 u1Var) {
        this.f29923d = i;
        this.f29924e = u1Var;
    }

    /* renamed from: o */
    public int mo19504o() throws C6264q {
        return 0;
    }

    /* renamed from: q */
    public final void mo21227q(C6223g3 g3Var, C6272r1[] r1VarArr, C1749q0 q0Var, long j, boolean z, boolean z2, long j2, long j3) throws C6264q {
        boolean z3 = z;
        C5917a.m34873f(this.f29925f == 0);
        this.f29922c = g3Var;
        this.f29925f = 1;
        mo6467H(z, z2);
        mo21223i(r1VarArr, q0Var, j2, j3);
        long j4 = j;
        m36432O(j, z);
    }

    /* renamed from: r */
    public void mo6490r(int i, Object obj) throws C6264q {
    }

    public final void reset() {
        C5917a.m34873f(this.f29925f == 0);
        this.f29921b.mo21536a();
        mo6470J();
    }

    /* renamed from: s */
    public final C1749q0 mo21229s() {
        return this.f29926g;
    }

    public final void start() throws C6264q {
        boolean z = true;
        if (this.f29925f != 1) {
            z = false;
        }
        C5917a.m34873f(z);
        this.f29925f = 2;
        mo6472K();
    }

    public final void stop() {
        C5917a.m34873f(this.f29925f == 2);
        this.f29925f = 1;
        mo6474L();
    }

    /* renamed from: t */
    public final void mo21232t() throws IOException {
        ((C1749q0) C5917a.m34872e(this.f29926g)).mo6700b();
    }

    /* renamed from: u */
    public final long mo21233u() {
        return this.f29930s;
    }

    /* renamed from: v */
    public final void mo21234v(long j) throws C6264q {
        m36432O(j, false);
    }

    /* renamed from: w */
    public final boolean mo21235w() {
        return this.f29931t;
    }

    /* renamed from: x */
    public C5965t mo6497x() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C6264q mo21296y(Throwable th, C6272r1 r1Var, int i) {
        return mo21297z(th, r1Var, false, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C6264q mo21297z(Throwable th, C6272r1 r1Var, boolean z, int i) {
        int i2;
        if (r1Var != null && !this.f29932u) {
            this.f29932u = true;
            try {
                int f = C6217e3.m36429f(mo18664a(r1Var));
                this.f29932u = false;
                i2 = f;
            } catch (C6264q unused) {
                this.f29932u = false;
            } catch (Throwable th2) {
                this.f29932u = false;
                throw th2;
            }
            return C6264q.m36812g(th, mo6482b(), mo21290C(), r1Var, i2, z, i);
        }
        i2 = 4;
        return C6264q.m36812g(th, mo6482b(), mo21290C(), r1Var, i2, z, i);
    }
}
