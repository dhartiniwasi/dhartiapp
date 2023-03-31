package p092m2;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p014b2.C1618c;
import p030d2.C4035m;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4200e0;
import p037e2.C4203f0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p037e2.C4230x;
import p092m2.C5002a;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5970w;
import p166x2.C6044b;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: m2.k */
/* compiled from: Mp4Extractor */
public final class C5021k implements C4215l, C4192b0 {

    /* renamed from: y */
    public static final C4221r f26297y = C11801j.f44464b;

    /* renamed from: a */
    private final int f26298a;

    /* renamed from: b */
    private final C5918a0 f26299b;

    /* renamed from: c */
    private final C5918a0 f26300c;

    /* renamed from: d */
    private final C5918a0 f26301d;

    /* renamed from: e */
    private final C5918a0 f26302e;

    /* renamed from: f */
    private final ArrayDeque<C5002a.C5003a> f26303f;

    /* renamed from: g */
    private final C5025m f26304g;

    /* renamed from: h */
    private final List<C5432a.C5434b> f26305h;

    /* renamed from: i */
    private int f26306i;

    /* renamed from: j */
    private int f26307j;

    /* renamed from: k */
    private long f26308k;

    /* renamed from: l */
    private int f26309l;

    /* renamed from: m */
    private C5918a0 f26310m;

    /* renamed from: n */
    private int f26311n;

    /* renamed from: o */
    private int f26312o;

    /* renamed from: p */
    private int f26313p;

    /* renamed from: q */
    private int f26314q;

    /* renamed from: r */
    private C4217n f26315r;

    /* renamed from: s */
    private C5022a[] f26316s;

    /* renamed from: t */
    private long[][] f26317t;

    /* renamed from: u */
    private int f26318u;

    /* renamed from: v */
    private long f26319v;

    /* renamed from: w */
    private int f26320w;

    /* renamed from: x */
    private C6044b f26321x;

    /* renamed from: m2.k$a */
    /* compiled from: Mp4Extractor */
    private static final class C5022a {

        /* renamed from: a */
        public final C5028o f26322a;

        /* renamed from: b */
        public final C5031r f26323b;

        /* renamed from: c */
        public final C4200e0 f26324c;

        /* renamed from: d */
        public final C4203f0 f26325d;

        /* renamed from: e */
        public int f26326e;

        public C5022a(C5028o oVar, C5031r rVar, C4200e0 e0Var) {
            this.f26322a = oVar;
            this.f26323b = rVar;
            this.f26324c = e0Var;
            this.f26325d = "audio/true-hd".equals(oVar.f26344f.f30243t) ? new C4203f0() : null;
        }
    }

    public C5021k() {
        this(0);
    }

    /* renamed from: A */
    private void m31676A(long j) {
        if (this.f26307j == 1836086884) {
            int i = this.f26309l;
            this.f26321x = new C6044b(0, j, -9223372036854775807L, j + ((long) i), this.f26308k - ((long) i));
        }
    }

    /* renamed from: B */
    private boolean m31677B(C4216m mVar) throws IOException {
        C5002a.C5003a peek;
        if (this.f26309l == 0) {
            if (!mVar.mo17555d(this.f26302e.mo20551d(), 0, 8, true)) {
                m31696x();
                return false;
            }
            this.f26309l = 8;
            this.f26302e.mo20546O(0);
            this.f26308k = this.f26302e.mo20536E();
            this.f26307j = this.f26302e.mo20560m();
        }
        long j = this.f26308k;
        if (j == 1) {
            mVar.readFully(this.f26302e.mo20551d(), 8, 8);
            this.f26309l += 8;
            this.f26308k = this.f26302e.mo20539H();
        } else if (j == 0) {
            long b = mVar.mo17553b();
            if (b == -1 && (peek = this.f26303f.peek()) != null) {
                b = peek.f26201b;
            }
            if (b != -1) {
                this.f26308k = (b - mVar.mo17554c()) + ((long) this.f26309l);
            }
        }
        if (this.f26308k >= ((long) this.f26309l)) {
            if (m31681F(this.f26307j)) {
                long c = mVar.mo17554c();
                long j2 = this.f26308k;
                int i = this.f26309l;
                long j3 = (c + j2) - ((long) i);
                if (j2 != ((long) i) && this.f26307j == 1835365473) {
                    m31694v(mVar);
                }
                this.f26303f.push(new C5002a.C5003a(this.f26307j, j3));
                if (this.f26308k == ((long) this.f26309l)) {
                    m31695w(j3);
                } else {
                    m31688o();
                }
            } else if (m31682G(this.f26307j)) {
                C5917a.m34873f(this.f26309l == 8);
                C5917a.m34873f(this.f26308k <= 2147483647L);
                C5918a0 a0Var = new C5918a0((int) this.f26308k);
                System.arraycopy(this.f26302e.mo20551d(), 0, a0Var.mo20551d(), 0, 8);
                this.f26310m = a0Var;
                this.f26306i = 1;
            } else {
                m31676A(mVar.mo17554c() - ((long) this.f26309l));
                this.f26310m = null;
                this.f26306i = 1;
            }
            return true;
        }
        throw C6249m2.m36664d("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m31678C(p037e2.C4216m r10, p037e2.C4190a0 r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f26308k
            int r2 = r9.f26309l
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.mo17554c()
            long r2 = r2 + r0
            w3.a0 r4 = r9.f26310m
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.mo20551d()
            int r7 = r9.f26309l
            int r1 = (int) r0
            r10.readFully(r11, r7, r1)
            int r10 = r9.f26307j
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = m31697y(r4)
            r9.f26320w = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque<m2.a$a> r10 = r9.f26303f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque<m2.a$a> r10 = r9.f26303f
            java.lang.Object r10 = r10.peek()
            m2.a$a r10 = (p092m2.C5002a.C5003a) r10
            m2.a$b r11 = new m2.a$b
            int r0 = r9.f26307j
            r11.<init>(r0, r4)
            r10.mo18931e(r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.mo17561k(r11)
        L_0x004f:
            r10 = 0
            goto L_0x0059
        L_0x0051:
            long r7 = r10.mo17554c()
            long r7 = r7 + r0
            r11.f23479a = r7
            r10 = 1
        L_0x0059:
            r9.m31695w(r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f26306i
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5021k.m31678C(e2.m, e2.a0):boolean");
    }

    /* renamed from: D */
    private int m31679D(C4216m mVar, C4190a0 a0Var) throws IOException {
        int i;
        C4190a0 a0Var2;
        C4216m mVar2 = mVar;
        long c = mVar.mo17554c();
        if (this.f26311n == -1) {
            int r = m31690r(c);
            this.f26311n = r;
            if (r == -1) {
                return -1;
            }
        }
        C5022a aVar = this.f26316s[this.f26311n];
        C4200e0 e0Var = aVar.f26324c;
        int i2 = aVar.f26326e;
        C5031r rVar = aVar.f26323b;
        long j = rVar.f26375c[i2];
        int i3 = rVar.f26376d[i2];
        C4203f0 f0Var = aVar.f26325d;
        long j2 = (j - c) + ((long) this.f26312o);
        if (j2 < 0) {
            i = 1;
            a0Var2 = a0Var;
        } else if (j2 >= 262144) {
            a0Var2 = a0Var;
            i = 1;
        } else {
            if (aVar.f26322a.f26345g == 1) {
                j2 += 8;
                i3 -= 8;
            }
            mVar2.mo17561k((int) j2);
            C5028o oVar = aVar.f26322a;
            if (oVar.f26348j == 0) {
                if ("audio/ac4".equals(oVar.f26344f.f30243t)) {
                    if (this.f26313p == 0) {
                        C1618c.m7431a(i3, this.f26301d);
                        e0Var.mo6843d(this.f26301d, 7);
                        this.f26313p += 7;
                    }
                    i3 += 7;
                } else if (f0Var != null) {
                    f0Var.mo17569d(mVar2);
                }
                while (true) {
                    int i4 = this.f26313p;
                    if (i4 >= i3) {
                        break;
                    }
                    int b = e0Var.mo6840b(mVar2, i3 - i4, false);
                    this.f26312o += b;
                    this.f26313p += b;
                    this.f26314q -= b;
                }
            } else {
                byte[] d = this.f26300c.mo20551d();
                d[0] = 0;
                d[1] = 0;
                d[2] = 0;
                int i5 = aVar.f26322a.f26348j;
                int i6 = 4 - i5;
                while (this.f26313p < i3) {
                    int i7 = this.f26314q;
                    if (i7 == 0) {
                        mVar2.readFully(d, i6, i5);
                        this.f26312o += i5;
                        this.f26300c.mo20546O(0);
                        int m = this.f26300c.mo20560m();
                        if (m >= 0) {
                            this.f26314q = m;
                            this.f26299b.mo20546O(0);
                            e0Var.mo6843d(this.f26299b, 4);
                            this.f26313p += 4;
                            i3 += i6;
                        } else {
                            throw C6249m2.m36661a("Invalid NAL length", (Throwable) null);
                        }
                    } else {
                        int b2 = e0Var.mo6840b(mVar2, i7, false);
                        this.f26312o += b2;
                        this.f26313p += b2;
                        this.f26314q -= b2;
                    }
                }
            }
            int i8 = i3;
            C5031r rVar2 = aVar.f26323b;
            long j3 = rVar2.f26378f[i2];
            int i9 = rVar2.f26379g[i2];
            if (f0Var != null) {
                int i10 = i8;
                C4203f0 f0Var2 = f0Var;
                f0Var.mo17568c(e0Var, j3, i9, i10, 0, (C4200e0.C4201a) null);
                if (i2 + 1 == aVar.f26323b.f26374b) {
                    f0Var2.mo17566a(e0Var, (C4200e0.C4201a) null);
                }
            } else {
                e0Var.mo6838a(j3, i9, i8, 0, (C4200e0.C4201a) null);
            }
            aVar.f26326e++;
            this.f26311n = -1;
            this.f26312o = 0;
            this.f26313p = 0;
            this.f26314q = 0;
            return 0;
        }
        a0Var2.f23479a = j;
        return i;
    }

    /* renamed from: E */
    private int m31680E(C4216m mVar, C4190a0 a0Var) throws IOException {
        int c = this.f26304g.mo18952c(mVar, a0Var, this.f26305h);
        if (c == 1 && a0Var.f23479a == 0) {
            m31688o();
        }
        return c;
    }

    /* renamed from: F */
    private static boolean m31681F(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: G */
    private static boolean m31682G(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* renamed from: H */
    private void m31683H(C5022a aVar, long j) {
        C5031r rVar = aVar.f26323b;
        int a = rVar.mo18962a(j);
        if (a == -1) {
            a = rVar.mo18963b(j);
        }
        aVar.f26326e = a;
    }

    /* renamed from: m */
    private static int m31686m(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: n */
    private static long[][] m31687n(C5022a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f26323b.f26374b];
            jArr2[i] = aVarArr[i].f26323b.f26378f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].f26323b.f26376d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f26323b.f26378f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: o */
    private void m31688o() {
        this.f26306i = 0;
        this.f26309l = 0;
    }

    /* renamed from: q */
    private static int m31689q(C5031r rVar, long j) {
        int a = rVar.mo18962a(j);
        return a == -1 ? rVar.mo18963b(j) : a;
    }

    /* renamed from: r */
    private int m31690r(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C5022a[] aVarArr = this.f26316s;
            if (i3 >= aVarArr.length) {
                break;
            }
            C5022a aVar = aVarArr[i3];
            int i4 = aVar.f26326e;
            C5031r rVar = aVar.f26323b;
            if (i4 != rVar.f26374b) {
                long j5 = rVar.f26375c[i4];
                long j6 = ((long[][]) C5953m0.m35138j(this.f26317t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ C5028o m31691s(C5028o oVar) {
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ C4215l[] m31692t() {
        return new C4215l[]{new C5021k()};
    }

    /* renamed from: u */
    private static long m31693u(C5031r rVar, long j, long j2) {
        int q = m31689q(rVar, j);
        if (q == -1) {
            return j2;
        }
        return Math.min(rVar.f26375c[q], j2);
    }

    /* renamed from: v */
    private void m31694v(C4216m mVar) throws IOException {
        this.f26301d.mo20542K(8);
        mVar.mo17563p(this.f26301d.mo20551d(), 0, 8);
        C5005b.m31568e(this.f26301d);
        mVar.mo17561k(this.f26301d.mo20552e());
        mVar.mo17560j();
    }

    /* renamed from: w */
    private void m31695w(long j) throws C6249m2 {
        while (!this.f26303f.isEmpty() && this.f26303f.peek().f26201b == j) {
            C5002a.C5003a pop = this.f26303f.pop();
            if (pop.f26200a == 1836019574) {
                m31698z(pop);
                this.f26303f.clear();
                this.f26306i = 2;
            } else if (!this.f26303f.isEmpty()) {
                this.f26303f.peek().mo18930d(pop);
            }
        }
        if (this.f26306i != 2) {
            m31688o();
        }
    }

    /* renamed from: x */
    private void m31696x() {
        C5432a aVar;
        if (this.f26320w == 2 && (this.f26298a & 2) != 0) {
            C4200e0 f = this.f26315r.mo6778f(0, 4);
            if (this.f26321x == null) {
                aVar = null;
            } else {
                aVar = new C5432a(this.f26321x);
            }
            f.mo6845e(new C6272r1.C6274b().mo21510X(aVar).mo21491E());
            this.f26315r.mo6782n();
            this.f26315r.mo6781l(new C4192b0.C4194b(-9223372036854775807L));
        }
    }

    /* renamed from: y */
    private static int m31697y(C5918a0 a0Var) {
        a0Var.mo20546O(8);
        int m = m31686m(a0Var.mo20560m());
        if (m != 0) {
            return m;
        }
        a0Var.mo20547P(4);
        while (a0Var.mo20548a() > 0) {
            int m2 = m31686m(a0Var.mo20560m());
            if (m2 != 0) {
                return m2;
            }
        }
        return 0;
    }

    /* renamed from: z */
    private void m31698z(C5002a.C5003a aVar) throws C6249m2 {
        C5432a aVar2;
        C5432a aVar3;
        int i;
        List<C5031r> list;
        int i2;
        int i3;
        C5002a.C5003a aVar4 = aVar;
        ArrayList arrayList = new ArrayList();
        boolean z = this.f26320w == 1;
        C4230x xVar = new C4230x();
        C5002a.C5004b g = aVar4.mo18933g(1969517665);
        if (g != null) {
            Pair<C5432a, C5432a> B = C5005b.m31561B(g);
            C5432a aVar5 = (C5432a) B.first;
            C5432a aVar6 = (C5432a) B.second;
            if (aVar5 != null) {
                xVar.mo17593c(aVar5);
            }
            aVar3 = aVar6;
            aVar2 = aVar5;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        C5002a.C5003a f = aVar4.mo18932f(1835365473);
        long j = -9223372036854775807L;
        C5432a n = f != null ? C5005b.m31577n(f) : null;
        List<C5031r> A = C5005b.m31560A(aVar, xVar, -9223372036854775807L, (C4035m) null, (this.f26298a & 1) != 0, z, C11800i.f44463a);
        int size = A.size();
        long j2 = -9223372036854775807L;
        int i4 = 0;
        int i5 = -1;
        while (i4 < size) {
            C5031r rVar = A.get(i4);
            if (rVar.f26374b == 0) {
                list = A;
                i = size;
            } else {
                C5028o oVar = rVar.f26373a;
                list = A;
                i = size;
                long j3 = oVar.f26343e;
                if (j3 == j) {
                    j3 = rVar.f26380h;
                }
                long max = Math.max(j2, j3);
                C5022a aVar7 = new C5022a(oVar, rVar, this.f26315r.mo6778f(i4, oVar.f26340b));
                if ("audio/true-hd".equals(oVar.f26344f.f30243t)) {
                    i2 = rVar.f26377e * 16;
                } else {
                    i2 = rVar.f26377e + 30;
                }
                C6272r1.C6274b b = oVar.f26344f.mo21483b();
                b.mo21509W(i2);
                if (oVar.f26340b == 2 && j3 > 0 && (i3 = rVar.f26374b) > 1) {
                    b.mo21502P(((float) i3) / (((float) j3) / 1000000.0f));
                }
                C5020h.m31674k(oVar.f26340b, xVar, b);
                int i6 = oVar.f26340b;
                C5432a[] aVarArr = new C5432a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f26305h.isEmpty() ? null : new C5432a((List<? extends C5432a.C5434b>) this.f26305h);
                C5020h.m31675l(i6, aVar2, n, b, aVarArr);
                aVar7.f26324c.mo6845e(b.mo21491E());
                if (oVar.f26340b == 2) {
                    if (i5 == -1) {
                        i5 = arrayList.size();
                    }
                }
                arrayList.add(aVar7);
                j2 = max;
            }
            i4++;
            A = list;
            size = i;
            j = -9223372036854775807L;
        }
        this.f26318u = i5;
        this.f26319v = j2;
        C5022a[] aVarArr2 = (C5022a[]) arrayList.toArray(new C5022a[0]);
        this.f26316s = aVarArr2;
        this.f26317t = m31687n(aVarArr2);
        this.f26315r.mo6782n();
        this.f26315r.mo6781l(this);
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f26303f.clear();
        this.f26309l = 0;
        this.f26311n = -1;
        this.f26312o = 0;
        this.f26313p = 0;
        this.f26314q = 0;
        if (j != 0) {
            for (C5022a aVar : this.f26316s) {
                m31683H(aVar, j2);
                C4203f0 f0Var = aVar.f26325d;
                if (f0Var != null) {
                    f0Var.mo17567b();
                }
            }
        } else if (this.f26306i != 3) {
            m31688o();
        } else {
            this.f26304g.mo18953g();
            this.f26305h.clear();
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26315r = nVar;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        while (true) {
            int i = this.f26306i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m31679D(mVar, a0Var);
                    }
                    if (i == 3) {
                        return m31680E(mVar, a0Var);
                    }
                    throw new IllegalStateException();
                } else if (m31678C(mVar, a0Var)) {
                    return 1;
                }
            } else if (!m31677B(mVar)) {
                return -1;
            }
        }
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        return C5027n.m31728d(mVar, (this.f26298a & 2) != 0);
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        return mo18951p(j, -1);
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f26319v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p037e2.C4192b0.C4193a mo18951p(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            m2.k$a[] r4 = r0.f26316s
            int r5 = r4.length
            if (r5 != 0) goto L_0x0013
            e2.b0$a r1 = new e2.b0$a
            e2.c0 r2 = p037e2.C4196c0.f23484c
            r1.<init>(r2)
            return r1
        L_0x0013:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L_0x001a
            r8 = r3
            goto L_0x001c
        L_0x001a:
            int r8 = r0.f26318u
        L_0x001c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L_0x0058
            r4 = r4[r8]
            m2.r r4 = r4.f26323b
            int r8 = m31689q(r4, r1)
            if (r8 != r7) goto L_0x0035
            e2.b0$a r1 = new e2.b0$a
            e2.c0 r2 = p037e2.C4196c0.f23484c
            r1.<init>(r2)
            return r1
        L_0x0035:
            long[] r11 = r4.f26378f
            r12 = r11[r8]
            long[] r11 = r4.f26375c
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            int r11 = r4.f26374b
            int r11 = r11 + -1
            if (r8 >= r11) goto L_0x005e
            int r1 = r4.mo18963b(r1)
            if (r1 == r7) goto L_0x005e
            if (r1 == r8) goto L_0x005e
            long[] r2 = r4.f26378f
            r5 = r2[r1]
            long[] r2 = r4.f26375c
            r1 = r2[r1]
            goto L_0x0060
        L_0x0058:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L_0x005e:
            r1 = r5
            r5 = r9
        L_0x0060:
            if (r3 != r7) goto L_0x007f
            r3 = 0
        L_0x0063:
            m2.k$a[] r4 = r0.f26316s
            int r7 = r4.length
            if (r3 >= r7) goto L_0x007f
            int r7 = r0.f26318u
            if (r3 == r7) goto L_0x007c
            r4 = r4[r3]
            m2.r r4 = r4.f26323b
            long r14 = m31693u(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
            long r1 = m31693u(r4, r5, r1)
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x007f:
            e2.c0 r3 = new e2.c0
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x008e
            e2.b0$a r1 = new e2.b0$a
            r1.<init>(r3)
            return r1
        L_0x008e:
            e2.c0 r4 = new e2.c0
            r4.<init>(r5, r1)
            e2.b0$a r1 = new e2.b0$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5021k.mo18951p(long, int):e2.b0$a");
    }

    public C5021k(int i) {
        this.f26298a = i;
        this.f26306i = (i & 4) != 0 ? 3 : 0;
        this.f26304g = new C5025m();
        this.f26305h = new ArrayList();
        this.f26302e = new C5918a0(16);
        this.f26303f = new ArrayDeque<>();
        this.f26299b = new C5918a0(C5970w.f29150a);
        this.f26300c = new C5918a0(4);
        this.f26301d = new C5918a0();
        this.f26311n = -1;
        this.f26315r = C4217n.f23563W;
        this.f26316s = new C5022a[0];
    }
}
