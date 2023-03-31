package p065i2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p161w3.C5917a;
import p161w3.C5918a0;

/* renamed from: i2.c */
/* compiled from: FlvExtractor */
public final class C4651c implements C4215l {

    /* renamed from: q */
    public static final C4221r f25161q = C10545b.f41572b;

    /* renamed from: a */
    private final C5918a0 f25162a = new C5918a0(4);

    /* renamed from: b */
    private final C5918a0 f25163b = new C5918a0(9);

    /* renamed from: c */
    private final C5918a0 f25164c = new C5918a0(11);

    /* renamed from: d */
    private final C5918a0 f25165d = new C5918a0();

    /* renamed from: e */
    private final C4652d f25166e = new C4652d();

    /* renamed from: f */
    private C4217n f25167f;

    /* renamed from: g */
    private int f25168g = 1;

    /* renamed from: h */
    private boolean f25169h;

    /* renamed from: i */
    private long f25170i;

    /* renamed from: j */
    private int f25171j;

    /* renamed from: k */
    private int f25172k;

    /* renamed from: l */
    private int f25173l;

    /* renamed from: m */
    private long f25174m;

    /* renamed from: n */
    private boolean f25175n;

    /* renamed from: o */
    private C4650a f25176o;

    /* renamed from: p */
    private C4655f f25177p;

    /* renamed from: f */
    private void m30250f() {
        if (!this.f25175n) {
            this.f25167f.mo6781l(new C4192b0.C4194b(-9223372036854775807L));
            this.f25175n = true;
        }
    }

    /* renamed from: g */
    private long m30251g() {
        if (this.f25169h) {
            return this.f25170i + this.f25174m;
        }
        if (this.f25166e.mo18328d() == -9223372036854775807L) {
            return 0;
        }
        return this.f25174m;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C4215l[] m30252i() {
        return new C4215l[]{new C4651c()};
    }

    /* renamed from: j */
    private C5918a0 m30253j(C4216m mVar) throws IOException {
        if (this.f25173l > this.f25165d.mo20549b()) {
            C5918a0 a0Var = this.f25165d;
            a0Var.mo20544M(new byte[Math.max(a0Var.mo20549b() * 2, this.f25173l)], 0);
        } else {
            this.f25165d.mo20546O(0);
        }
        this.f25165d.mo20545N(this.f25173l);
        mVar.readFully(this.f25165d.mo20551d(), 0, this.f25173l);
        return this.f25165d;
    }

    /* renamed from: k */
    private boolean m30254k(C4216m mVar) throws IOException {
        boolean z = false;
        if (!mVar.mo17555d(this.f25163b.mo20551d(), 0, 9, true)) {
            return false;
        }
        this.f25163b.mo20546O(0);
        this.f25163b.mo20547P(4);
        int C = this.f25163b.mo20534C();
        boolean z2 = (C & 4) != 0;
        if ((C & 1) != 0) {
            z = true;
        }
        if (z2 && this.f25176o == null) {
            this.f25176o = new C4650a(this.f25167f.mo6778f(8, 1));
        }
        if (z && this.f25177p == null) {
            this.f25177p = new C4655f(this.f25167f.mo6778f(9, 2));
        }
        this.f25167f.mo6782n();
        this.f25171j = (this.f25163b.mo20560m() - 9) + 4;
        this.f25168g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m30255l(p037e2.C4216m r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.m30251g()
            int r2 = r9.f25172k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            i2.a r7 = r9.f25176o
            if (r7 == 0) goto L_0x0024
            r9.m30250f()
            i2.a r2 = r9.f25176o
            w3.a0 r10 = r9.m30253j(r10)
            boolean r5 = r2.mo18331a(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0075
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x003a
            i2.f r7 = r9.f25177p
            if (r7 == 0) goto L_0x003a
            r9.m30250f()
            i2.f r2 = r9.f25177p
            w3.a0 r10 = r9.m30253j(r10)
            boolean r5 = r2.mo18331a(r10, r0)
            goto L_0x0022
        L_0x003a:
            r7 = 18
            if (r2 != r7) goto L_0x006f
            boolean r2 = r9.f25175n
            if (r2 != 0) goto L_0x006f
            i2.d r2 = r9.f25166e
            w3.a0 r10 = r9.m30253j(r10)
            boolean r5 = r2.mo18331a(r10, r0)
            i2.d r10 = r9.f25166e
            long r0 = r10.mo18328d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            e2.n r10 = r9.f25167f
            e2.z r2 = new e2.z
            i2.d r7 = r9.f25166e
            long[] r7 = r7.mo18329e()
            i2.d r8 = r9.f25166e
            long[] r8 = r8.mo18330f()
            r2.<init>(r7, r8, r0)
            r10.mo6781l(r2)
            r9.f25175n = r6
            goto L_0x0022
        L_0x006f:
            int r0 = r9.f25173l
            r10.mo17561k(r0)
            r10 = 0
        L_0x0075:
            boolean r0 = r9.f25169h
            if (r0 != 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            r9.f25169h = r6
            i2.d r0 = r9.f25166e
            long r0 = r0.mo18328d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008b
            long r0 = r9.f25174m
            long r0 = -r0
            goto L_0x008d
        L_0x008b:
            r0 = 0
        L_0x008d:
            r9.f25170i = r0
        L_0x008f:
            r0 = 4
            r9.f25171j = r0
            r0 = 2
            r9.f25168g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i2.C4651c.m30255l(e2.m):boolean");
    }

    /* renamed from: m */
    private boolean m30256m(C4216m mVar) throws IOException {
        if (!mVar.mo17555d(this.f25164c.mo20551d(), 0, 11, true)) {
            return false;
        }
        this.f25164c.mo20546O(0);
        this.f25172k = this.f25164c.mo20534C();
        this.f25173l = this.f25164c.mo20537F();
        this.f25174m = (long) this.f25164c.mo20537F();
        this.f25174m = (((long) (this.f25164c.mo20534C() << 24)) | this.f25174m) * 1000;
        this.f25164c.mo20547P(3);
        this.f25168g = 4;
        return true;
    }

    /* renamed from: n */
    private void m30257n(C4216m mVar) throws IOException {
        mVar.mo17561k(this.f25171j);
        this.f25171j = 0;
        this.f25168g = 3;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        if (j == 0) {
            this.f25168g = 1;
            this.f25169h = false;
        } else {
            this.f25168g = 3;
        }
        this.f25171j = 0;
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f25167f = nVar;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        C5917a.m34875h(this.f25167f);
        while (true) {
            int i = this.f25168g;
            if (i != 1) {
                if (i == 2) {
                    m30257n(mVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m30255l(mVar)) {
                        return 0;
                    }
                } else if (!m30256m(mVar)) {
                    return -1;
                }
            } else if (!m30254k(mVar)) {
                return -1;
            }
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        mVar.mo17563p(this.f25162a.mo20551d(), 0, 3);
        this.f25162a.mo20546O(0);
        if (this.f25162a.mo20537F() != 4607062) {
            return false;
        }
        mVar.mo17563p(this.f25162a.mo20551d(), 0, 2);
        this.f25162a.mo20546O(0);
        if ((this.f25162a.mo20540I() & 250) != 0) {
            return false;
        }
        mVar.mo17563p(this.f25162a.mo20551d(), 0, 4);
        this.f25162a.mo20546O(0);
        int m = this.f25162a.mo20560m();
        mVar.mo17560j();
        mVar.mo17558g(m);
        mVar.mo17563p(this.f25162a.mo20551d(), 0, 4);
        this.f25162a.mo20546O(0);
        if (this.f25162a.mo20560m() == 0) {
            return true;
        }
        return false;
    }
}
