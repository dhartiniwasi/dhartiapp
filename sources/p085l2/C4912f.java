package p085l2;

import java.io.EOFException;
import java.io.IOException;
import p014b2.C1635f0;
import p037e2.C4190a0;
import p037e2.C4200e0;
import p037e2.C4214k;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p037e2.C4230x;
import p037e2.C4231y;
import p127r2.C5432a;
import p160w2.C5903h;
import p160w2.C5909k;
import p160w2.C5913m;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: l2.f */
/* compiled from: Mp3Extractor */
public final class C4912f implements C4215l {

    /* renamed from: u */
    public static final C4221r f25874u = C11754d.f44375b;

    /* renamed from: v */
    private static final C5903h.C5904a f25875v = C11755e.f44376a;

    /* renamed from: a */
    private final int f25876a;

    /* renamed from: b */
    private final long f25877b;

    /* renamed from: c */
    private final C5918a0 f25878c;

    /* renamed from: d */
    private final C1635f0.C1636a f25879d;

    /* renamed from: e */
    private final C4230x f25880e;

    /* renamed from: f */
    private final C4231y f25881f;

    /* renamed from: g */
    private final C4200e0 f25882g;

    /* renamed from: h */
    private C4217n f25883h;

    /* renamed from: i */
    private C4200e0 f25884i;

    /* renamed from: j */
    private C4200e0 f25885j;

    /* renamed from: k */
    private int f25886k;

    /* renamed from: l */
    private C5432a f25887l;

    /* renamed from: m */
    private long f25888m;

    /* renamed from: n */
    private long f25889n;

    /* renamed from: o */
    private long f25890o;

    /* renamed from: p */
    private int f25891p;

    /* renamed from: q */
    private C4913g f25892q;

    /* renamed from: r */
    private boolean f25893r;

    /* renamed from: s */
    private boolean f25894s;

    /* renamed from: t */
    private long f25895t;

    public C4912f() {
        this(0);
    }

    /* renamed from: g */
    private void m31151g() {
        C5917a.m34875h(this.f25884i);
        C5953m0.m35138j(this.f25883h);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: l2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: l2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: l2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: l2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: l2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: l2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: l2.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p085l2.C4913g m31152i(p037e2.C4216m r12) throws java.io.IOException {
        /*
            r11 = this;
            l2.g r0 = r11.m31161s(r12)
            r2.a r1 = r11.f25887l
            long r2 = r12.mo17554c()
            l2.c r1 = m31160r(r1, r2)
            boolean r2 = r11.f25893r
            if (r2 == 0) goto L_0x0018
            l2.g$a r12 = new l2.g$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f25876a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.mo17536j()
            long r0 = r1.mo18736f()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.mo17536j()
            long r0 = r0.mo18736f()
            goto L_0x002b
        L_0x0039:
            r2.a r0 = r11.f25887l
            long r0 = m31155m(r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            l2.b r0 = new l2.b
            long r7 = r12.mo17554c()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            r1 = 1
            if (r0 == 0) goto L_0x0062
            boolean r2 = r0.mo17534g()
            if (r2 != 0) goto L_0x006e
            int r2 = r11.f25876a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x006e
        L_0x0062:
            int r0 = r11.f25876a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            l2.g r0 = r11.m31154l(r12, r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p085l2.C4912f.m31152i(e2.m):l2.g");
    }

    /* renamed from: j */
    private long m31153j(long j) {
        return this.f25888m + ((j * 1000000) / ((long) this.f25879d.f4696d));
    }

    /* renamed from: l */
    private C4913g m31154l(C4216m mVar, boolean z) throws IOException {
        mVar.mo17563p(this.f25878c.mo20551d(), 0, 4);
        this.f25878c.mo20546O(0);
        this.f25879d.mo6511a(this.f25878c.mo20560m());
        return new C4909a(mVar.mo17553b(), mVar.mo17554c(), this.f25879d, z);
    }

    /* renamed from: m */
    private static long m31155m(C5432a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int d = aVar.mo19696d();
        for (int i = 0; i < d; i++) {
            C5432a.C5434b c = aVar.mo19695c(i);
            if (c instanceof C5913m) {
                C5913m mVar = (C5913m) c;
                if (mVar.f29032a.equals("TLEN")) {
                    return C5953m0.m35071B0(Long.parseLong(mVar.f29044c));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: n */
    private static int m31156n(C5918a0 a0Var, int i) {
        if (a0Var.mo20553f() >= i + 4) {
            a0Var.mo20546O(i);
            int m = a0Var.mo20560m();
            if (m == 1483304551 || m == 1231971951) {
                return m;
            }
        }
        if (a0Var.mo20553f() < 40) {
            return 0;
        }
        a0Var.mo20546O(36);
        return a0Var.mo20560m() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: o */
    private static boolean m31157o(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ C4215l[] m31158p() {
        return new C4215l[]{new C4912f()};
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ boolean m31159q(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: r */
    private static C4911c m31160r(C5432a aVar, long j) {
        if (aVar == null) {
            return null;
        }
        int d = aVar.mo19696d();
        for (int i = 0; i < d; i++) {
            C5432a.C5434b c = aVar.mo19695c(i);
            if (c instanceof C5909k) {
                return C4911c.m31142a(j, (C5909k) c, m31155m(aVar));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p085l2.C4913g m31161s(p037e2.C4216m r11) throws java.io.IOException {
        /*
            r10 = this;
            w3.a0 r5 = new w3.a0
            b2.f0$a r0 = r10.f25879d
            int r0 = r0.f4695c
            r5.<init>((int) r0)
            byte[] r0 = r5.mo20551d()
            b2.f0$a r1 = r10.f25879d
            int r1 = r1.f4695c
            r6 = 0
            r11.mo17563p(r0, r6, r1)
            b2.f0$a r0 = r10.f25879d
            int r1 = r0.f4693a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            if (r1 == 0) goto L_0x0028
            int r0 = r0.f4697e
            if (r0 == r2) goto L_0x002c
            r3 = 36
            r7 = 36
            goto L_0x0033
        L_0x0028:
            int r0 = r0.f4697e
            if (r0 == r2) goto L_0x002f
        L_0x002c:
            r7 = 21
            goto L_0x0033
        L_0x002f:
            r3 = 13
            r7 = 13
        L_0x0033:
            int r8 = m31156n(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x0062
            if (r8 != r9) goto L_0x0042
            goto L_0x0062
        L_0x0042:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x005d
            long r0 = r11.mo17553b()
            long r2 = r11.mo17554c()
            b2.f0$a r4 = r10.f25879d
            l2.h r0 = p085l2.C4915h.m31176a(r0, r2, r4, r5)
            b2.f0$a r1 = r10.f25879d
            int r1 = r1.f4695c
            r11.mo17561k(r1)
            goto L_0x00b2
        L_0x005d:
            r0 = 0
            r11.mo17560j()
            goto L_0x00b2
        L_0x0062:
            long r0 = r11.mo17553b()
            long r2 = r11.mo17554c()
            b2.f0$a r4 = r10.f25879d
            l2.i r0 = p085l2.C4916i.m31182a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x009c
            e2.x r1 = r10.f25880e
            boolean r1 = r1.mo17592a()
            if (r1 != 0) goto L_0x009c
            r11.mo17560j()
            int r7 = r7 + 141
            r11.mo17558g(r7)
            w3.a0 r1 = r10.f25878c
            byte[] r1 = r1.mo20551d()
            r2 = 3
            r11.mo17563p(r1, r6, r2)
            w3.a0 r1 = r10.f25878c
            r1.mo20546O(r6)
            e2.x r1 = r10.f25880e
            w3.a0 r2 = r10.f25878c
            int r2 = r2.mo20537F()
            r1.mo17594d(r2)
        L_0x009c:
            b2.f0$a r1 = r10.f25879d
            int r1 = r1.f4695c
            r11.mo17561k(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r0.mo17534g()
            if (r1 != 0) goto L_0x00b2
            if (r8 != r9) goto L_0x00b2
            l2.g r11 = r10.m31154l(r11, r6)
            return r11
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p085l2.C4912f.m31161s(e2.m):l2.g");
    }

    /* renamed from: t */
    private boolean m31162t(C4216m mVar) throws IOException {
        C4913g gVar = this.f25892q;
        if (gVar != null) {
            long f = gVar.mo18736f();
            if (f != -1 && mVar.mo17557f() > f - 4) {
                return true;
            }
        }
        try {
            return !mVar.mo17556e(this.f25878c.mo20551d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: u */
    private int m31163u(C4216m mVar) throws IOException {
        if (this.f25886k == 0) {
            try {
                m31165w(mVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f25892q == null) {
            C4913g i = m31152i(mVar);
            this.f25892q = i;
            this.f25883h.mo6781l(i);
            this.f25885j.mo6845e(new C6272r1.C6274b().mo21517e0(this.f25879d.f4694b).mo21509W(4096).mo21494H(this.f25879d.f4697e).mo21518f0(this.f25879d.f4696d).mo21500N(this.f25880e.f23585a).mo21501O(this.f25880e.f23586b).mo21510X((this.f25876a & 8) != 0 ? null : this.f25887l).mo21491E());
            this.f25890o = mVar.mo17554c();
        } else if (this.f25890o != 0) {
            long c = mVar.mo17554c();
            long j = this.f25890o;
            if (c < j) {
                mVar.mo17561k((int) (j - c));
            }
        }
        return m31164v(mVar);
    }

    /* renamed from: v */
    private int m31164v(C4216m mVar) throws IOException {
        if (this.f25891p == 0) {
            mVar.mo17560j();
            if (m31162t(mVar)) {
                return -1;
            }
            this.f25878c.mo20546O(0);
            int m = this.f25878c.mo20560m();
            if (!m31157o(m, (long) this.f25886k) || C1635f0.m7525j(m) == -1) {
                mVar.mo17561k(1);
                this.f25886k = 0;
                return 0;
            }
            this.f25879d.mo6511a(m);
            if (this.f25888m == -9223372036854775807L) {
                this.f25888m = this.f25892q.mo18735b(mVar.mo17554c());
                if (this.f25877b != -9223372036854775807L) {
                    this.f25888m += this.f25877b - this.f25892q.mo18735b(0);
                }
            }
            C1635f0.C1636a aVar = this.f25879d;
            this.f25891p = aVar.f4695c;
            C4913g gVar = this.f25892q;
            if (gVar instanceof C4910b) {
                C4910b bVar = (C4910b) gVar;
                bVar.mo18738c(m31153j(this.f25889n + ((long) aVar.f4699g)), mVar.mo17554c() + ((long) this.f25879d.f4695c));
                if (this.f25894s && bVar.mo18737a(this.f25895t)) {
                    this.f25894s = false;
                    this.f25885j = this.f25884i;
                }
            }
        }
        int b = this.f25885j.mo6840b(mVar, this.f25891p, true);
        if (b == -1) {
            return -1;
        }
        int i = this.f25891p - b;
        this.f25891p = i;
        if (i > 0) {
            return 0;
        }
        this.f25885j.mo6838a(m31153j(this.f25889n), 1, this.f25879d.f4695c, 0, (C4200e0.C4201a) null);
        this.f25889n += (long) this.f25879d.f4699g;
        this.f25891p = 0;
        return 0;
    }

    /* renamed from: w */
    private boolean m31165w(C4216m mVar, boolean z) throws IOException {
        int i;
        int i2;
        int j;
        C5903h.C5904a aVar;
        int i3 = z ? 32768 : 131072;
        mVar.mo17560j();
        if (mVar.mo17554c() == 0) {
            if ((this.f25876a & 8) == 0) {
                aVar = null;
            } else {
                aVar = f25875v;
            }
            C5432a a = this.f25881f.mo17595a(mVar, aVar);
            this.f25887l = a;
            if (a != null) {
                this.f25880e.mo17593c(a);
            }
            i = (int) mVar.mo17557f();
            if (!z) {
                mVar.mo17561k(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m31162t(mVar)) {
                this.f25878c.mo20546O(0);
                int m = this.f25878c.mo20560m();
                if ((i2 == 0 || m31157o(m, (long) i2)) && (j = C1635f0.m7525j(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f25879d.mo6511a(m);
                        i2 = m;
                    }
                    mVar.mo17558g(j - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            mVar.mo17560j();
                            mVar.mo17558g(i + i6);
                        } else {
                            mVar.mo17561k(1);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C6249m2.m36661a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            mVar.mo17561k(i + i5);
        } else {
            mVar.mo17560j();
        }
        this.f25886k = i2;
        return true;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f25886k = 0;
        this.f25888m = -9223372036854775807L;
        this.f25889n = 0;
        this.f25891p = 0;
        this.f25895t = j2;
        C4913g gVar = this.f25892q;
        if ((gVar instanceof C4910b) && !((C4910b) gVar).mo18737a(j2)) {
            this.f25894s = true;
            this.f25885j = this.f25882g;
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f25883h = nVar;
        C4200e0 f = nVar.mo6778f(0, 1);
        this.f25884i = f;
        this.f25885j = f;
        this.f25883h.mo6782n();
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        m31151g();
        int u = m31163u(mVar);
        if (u == -1 && (this.f25892q instanceof C4910b)) {
            long j = m31153j(this.f25889n);
            if (this.f25892q.mo17536j() != j) {
                ((C4910b) this.f25892q).mo18739d(j);
                this.f25883h.mo6781l(this.f25892q);
            }
        }
        return u;
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        return m31165w(mVar, true);
    }

    /* renamed from: k */
    public void mo18740k() {
        this.f25893r = true;
    }

    public C4912f(int i) {
        this(i, -9223372036854775807L);
    }

    public C4912f(int i, long j) {
        this.f25876a = (i & 2) != 0 ? i | 1 : i;
        this.f25877b = j;
        this.f25878c = new C5918a0(10);
        this.f25879d = new C1635f0.C1636a();
        this.f25880e = new C4230x();
        this.f25888m = -9223372036854775807L;
        this.f25881f = new C4231y();
        C4214k kVar = new C4214k();
        this.f25882g = kVar;
        this.f25885j = kVar;
    }
}
