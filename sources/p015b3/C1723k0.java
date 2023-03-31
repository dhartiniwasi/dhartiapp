package p015b3;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p015b3.C1700e0;
import p015b3.C1741p;
import p015b3.C1743p0;
import p015b3.C1765u;
import p021c2.C1848g;
import p030d2.C4048w;
import p030d2.C4052y;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4200e0;
import p037e2.C4217n;
import p127r2.C5432a;
import p149u3.C5735s;
import p154v2.C5783b;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p155v3.C5819i;
import p155v3.C5828l;
import p155v3.C5835o;
import p155v3.C5836o0;
import p155v3.C5837p;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5933g;
import p161w3.C5953m0;
import p161w3.C5967v;
import p177z1.C6229i3;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: b3.k0 */
/* compiled from: ProgressiveMediaPeriod */
final class C1723k0 implements C1765u, C4217n, C5810h0.C5812b<C1724a>, C5810h0.C5816f, C1743p0.C1747d {
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final Map<String, String> f5052b0 = m8053K();
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final C6272r1 f5053c0 = new C6272r1.C6274b().mo21505S("icy").mo21517e0("application/x-icy").mo21491E();

    /* renamed from: A */
    private C1743p0[] f5054A;

    /* renamed from: B */
    private C1727d[] f5055B;

    /* renamed from: C */
    private boolean f5056C;

    /* renamed from: D */
    private boolean f5057D;

    /* renamed from: E */
    private boolean f5058E;

    /* renamed from: F */
    private C1728e f5059F;

    /* renamed from: G */
    private C4192b0 f5060G;

    /* renamed from: H */
    private long f5061H;

    /* renamed from: I */
    private boolean f5062I;

    /* renamed from: J */
    private int f5063J;

    /* renamed from: K */
    private boolean f5064K;

    /* renamed from: L */
    private boolean f5065L;

    /* renamed from: M */
    private int f5066M;

    /* renamed from: N */
    private boolean f5067N;

    /* renamed from: O */
    private long f5068O;

    /* renamed from: P */
    private long f5069P;

    /* renamed from: Q */
    private boolean f5070Q;

    /* renamed from: R */
    private int f5071R;

    /* renamed from: S */
    private boolean f5072S;

    /* renamed from: a */
    private final Uri f5073a;

    /* renamed from: a0 */
    private boolean f5074a0;

    /* renamed from: b */
    private final C5828l f5075b;

    /* renamed from: c */
    private final C4052y f5076c;

    /* renamed from: d */
    private final C5804g0 f5077d;

    /* renamed from: e */
    private final C1700e0.C1701a f5078e;

    /* renamed from: f */
    private final C4048w.C4049a f5079f;

    /* renamed from: g */
    private final C1725b f5080g;

    /* renamed from: h */
    private final C5789b f5081h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f5082i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final long f5083r;

    /* renamed from: s */
    private final C5810h0 f5084s = new C5810h0("ProgressiveMediaPeriod");

    /* renamed from: t */
    private final C1704f0 f5085t;

    /* renamed from: u */
    private final C5933g f5086u;

    /* renamed from: v */
    private final Runnable f5087v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final Runnable f5088w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final Handler f5089x;

    /* renamed from: y */
    private C1765u.C1766a f5090y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C5783b f5091z;

    /* renamed from: b3.k0$a */
    /* compiled from: ProgressiveMediaPeriod */
    final class C1724a implements C5810h0.C5815e, C1741p.C1742a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f5092a = C1748q.m8237a();

        /* renamed from: b */
        private final Uri f5093b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C5836o0 f5094c;

        /* renamed from: d */
        private final C1704f0 f5095d;

        /* renamed from: e */
        private final C4217n f5096e;

        /* renamed from: f */
        private final C5933g f5097f;

        /* renamed from: g */
        private final C4190a0 f5098g = new C4190a0();

        /* renamed from: h */
        private volatile boolean f5099h;

        /* renamed from: i */
        private boolean f5100i = true;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f5101j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C5837p f5102k = m8110i(0);

        /* renamed from: l */
        private C4200e0 f5103l;

        /* renamed from: m */
        private boolean f5104m;

        public C1724a(Uri uri, C5828l lVar, C1704f0 f0Var, C4217n nVar, C5933g gVar) {
            this.f5093b = uri;
            this.f5094c = new C5836o0(lVar);
            this.f5095d = f0Var;
            this.f5096e = nVar;
            this.f5097f = gVar;
        }

        /* renamed from: i */
        private C5837p m8110i(long j) {
            return new C5837p.C5839b().mo20380i(this.f5093b).mo20379h(j).mo20377f(C1723k0.this.f5082i).mo20373b(6).mo20376e(C1723k0.f5052b0).mo20372a();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m8111j(long j, long j2) {
            this.f5098g.f23479a = j;
            this.f5101j = j2;
            this.f5100i = true;
            this.f5104m = false;
        }

        /* renamed from: a */
        public void mo6785a(C5918a0 a0Var) {
            long j;
            if (!this.f5104m) {
                j = this.f5101j;
            } else {
                j = Math.max(C1723k0.this.m8055M(true), this.f5101j);
            }
            int a = a0Var.mo20548a();
            C4200e0 e0Var = (C4200e0) C5917a.m34872e(this.f5103l);
            e0Var.mo6843d(a0Var, a);
            e0Var.mo6838a(j, 1, a, 0, (C4200e0.C4201a) null);
            this.f5104m = true;
        }

        /* renamed from: b */
        public void mo6786b() throws IOException {
            int i = 0;
            while (i == 0 && !this.f5099h) {
                try {
                    long j = this.f5098g.f23479a;
                    C5837p i2 = m8110i(j);
                    this.f5102k = i2;
                    long o = this.f5094c.mo6819o(i2);
                    if (o != -1) {
                        o += j;
                        C1723k0.this.m8063Y();
                    }
                    long j2 = o;
                    C5783b unused = C1723k0.this.f5091z = C5783b.m34509a(this.f5094c.mo6816i());
                    C5819i iVar = this.f5094c;
                    if (!(C1723k0.this.f5091z == null || C1723k0.this.f5091z.f28775f == -1)) {
                        iVar = new C1741p(this.f5094c, C1723k0.this.f5091z.f28775f, this);
                        C4200e0 N = C1723k0.this.mo6767N();
                        this.f5103l = N;
                        N.mo6845e(C1723k0.f5053c0);
                    }
                    long j3 = j;
                    this.f5095d.mo6675d(iVar, this.f5093b, this.f5094c.mo6816i(), j, j2, this.f5096e);
                    if (C1723k0.this.f5091z != null) {
                        this.f5095d.mo6677f();
                    }
                    if (this.f5100i) {
                        this.f5095d.mo6674c(j3, this.f5101j);
                        this.f5100i = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i == 0 && !this.f5099h) {
                            this.f5097f.mo20592a();
                            i = this.f5095d.mo6678g(this.f5098g);
                            j3 = this.f5095d.mo6676e();
                            if (j3 > C1723k0.this.f5083r + j4) {
                                this.f5097f.mo20594c();
                                C1723k0.this.f5089x.post(C1723k0.this.f5088w);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f5095d.mo6676e() != -1) {
                        this.f5098g.f23479a = this.f5095d.mo6676e();
                    }
                    C5835o.m34625a(this.f5094c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i == 1 || this.f5095d.mo6676e() == -1)) {
                        this.f5098g.f23479a = this.f5095d.mo6676e();
                    }
                    C5835o.m34625a(this.f5094c);
                    throw th;
                }
            }
        }

        /* renamed from: c */
        public void mo6787c() {
            this.f5099h = true;
        }
    }

    /* renamed from: b3.k0$b */
    /* compiled from: ProgressiveMediaPeriod */
    interface C1725b {
        /* renamed from: g */
        void mo6788g(long j, boolean z, boolean z2);
    }

    /* renamed from: b3.k0$c */
    /* compiled from: ProgressiveMediaPeriod */
    private final class C1726c implements C1749q0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f5106a;

        public C1726c(int i) {
            this.f5106a = i;
        }

        /* renamed from: b */
        public void mo6700b() throws IOException {
            C1723k0.this.mo6770X(this.f5106a);
        }

        /* renamed from: f */
        public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
            return C1723k0.this.mo6776d0(this.f5106a, s1Var, gVar, i);
        }

        public boolean isReady() {
            return C1723k0.this.mo6768P(this.f5106a);
        }

        /* renamed from: l */
        public int mo6703l(long j) {
            return C1723k0.this.mo6779h0(this.f5106a, j);
        }
    }

    /* renamed from: b3.k0$d */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C1727d {

        /* renamed from: a */
        public final int f5108a;

        /* renamed from: b */
        public final boolean f5109b;

        public C1727d(int i, boolean z) {
            this.f5108a = i;
            this.f5109b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1727d.class != obj.getClass()) {
                return false;
            }
            C1727d dVar = (C1727d) obj;
            if (this.f5108a == dVar.f5108a && this.f5109b == dVar.f5109b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f5108a * 31) + (this.f5109b ? 1 : 0);
        }
    }

    /* renamed from: b3.k0$e */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C1728e {

        /* renamed from: a */
        public final C1780z0 f5110a;

        /* renamed from: b */
        public final boolean[] f5111b;

        /* renamed from: c */
        public final boolean[] f5112c;

        /* renamed from: d */
        public final boolean[] f5113d;

        public C1728e(C1780z0 z0Var, boolean[] zArr) {
            this.f5110a = z0Var;
            this.f5111b = zArr;
            int i = z0Var.f5296a;
            this.f5112c = new boolean[i];
            this.f5113d = new boolean[i];
        }
    }

    public C1723k0(Uri uri, C5828l lVar, C1704f0 f0Var, C4052y yVar, C4048w.C4049a aVar, C5804g0 g0Var, C1700e0.C1701a aVar2, C1725b bVar, C5789b bVar2, String str, int i) {
        this.f5073a = uri;
        this.f5075b = lVar;
        this.f5076c = yVar;
        this.f5079f = aVar;
        this.f5077d = g0Var;
        this.f5078e = aVar2;
        this.f5080g = bVar;
        this.f5081h = bVar2;
        this.f5082i = str;
        this.f5083r = (long) i;
        this.f5085t = f0Var;
        this.f5086u = new C5933g();
        this.f5087v = new C1709g0(this);
        this.f5088w = new C1713i0(this);
        this.f5089x = C5953m0.m35164w();
        this.f5055B = new C1727d[0];
        this.f5054A = new C1743p0[0];
        this.f5069P = -9223372036854775807L;
        this.f5061H = -9223372036854775807L;
        this.f5063J = 1;
    }

    /* renamed from: I */
    private void m8051I() {
        C5917a.m34873f(this.f5057D);
        C5917a.m34872e(this.f5059F);
        C5917a.m34872e(this.f5060G);
    }

    /* renamed from: J */
    private boolean m8052J(C1724a aVar, int i) {
        C4192b0 b0Var;
        if (this.f5067N || !((b0Var = this.f5060G) == null || b0Var.mo17536j() == -9223372036854775807L)) {
            this.f5071R = i;
            return true;
        }
        if (!this.f5057D || m8068j0()) {
            this.f5065L = this.f5057D;
            this.f5068O = 0;
            this.f5071R = 0;
            for (C1743p0 V : this.f5054A) {
                V.mo6834V();
            }
            aVar.m8111j(0, 0);
            return true;
        }
        this.f5070Q = true;
        return false;
    }

    /* renamed from: K */
    private static Map<String, String> m8053K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: L */
    private int m8054L() {
        int i = 0;
        for (C1743p0 G : this.f5054A) {
            i += G.mo6825G();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public long m8055M(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f5054A.length; i++) {
            if (z || ((C1728e) C5917a.m34872e(this.f5059F)).f5112c[i]) {
                j = Math.max(j, this.f5054A[i].mo6858z());
            }
        }
        return j;
    }

    /* renamed from: O */
    private boolean m8056O() {
        return this.f5069P != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m8057Q() {
        if (!this.f5074a0) {
            ((C1765u.C1766a) C5917a.m34872e(this.f5090y)).mo6684f(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m8058R() {
        this.f5067N = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m8060T() {
        C5432a aVar;
        if (!this.f5074a0 && !this.f5057D && this.f5056C && this.f5060G != null) {
            C1743p0[] p0VarArr = this.f5054A;
            int length = p0VarArr.length;
            int i = 0;
            while (i < length) {
                if (p0VarArr[i].mo6824F() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f5086u.mo20594c();
            int length2 = this.f5054A.length;
            C1776x0[] x0VarArr = new C1776x0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C6272r1 r1Var = (C6272r1) C5917a.m34872e(this.f5054A[i2].mo6824F());
                String str = r1Var.f30243t;
                boolean o = C5967v.m35251o(str);
                boolean z = o || C5967v.m35255s(str);
                zArr[i2] = z;
                this.f5058E = z | this.f5058E;
                C5783b bVar = this.f5091z;
                if (bVar != null) {
                    if (o || this.f5055B[i2].f5109b) {
                        C5432a aVar2 = r1Var.f30241r;
                        if (aVar2 == null) {
                            aVar = new C5432a(bVar);
                        } else {
                            aVar = aVar2.mo19693a(bVar);
                        }
                        r1Var = r1Var.mo21483b().mo21510X(aVar).mo21491E();
                    }
                    if (o && r1Var.f30237f == -1 && r1Var.f30238g == -1 && bVar.f28770a != -1) {
                        r1Var = r1Var.mo21483b().mo21493G(bVar.f28770a).mo21491E();
                    }
                }
                x0VarArr[i2] = new C1776x0(Integer.toString(i2), r1Var.mo21484c(this.f5076c.mo17212e(r1Var)));
            }
            this.f5059F = new C1728e(new C1780z0(x0VarArr), zArr);
            this.f5057D = true;
            ((C1765u.C1766a) C5917a.m34872e(this.f5090y)).mo6680b(this);
        }
    }

    /* renamed from: U */
    private void m8061U(int i) {
        m8051I();
        C1728e eVar = this.f5059F;
        boolean[] zArr = eVar.f5113d;
        if (!zArr[i]) {
            C6272r1 b = eVar.f5110a.mo6903b(i).mo6897b(0);
            this.f5078e.mo6720i(C5967v.m35247k(b.f30243t), b, 0, (Object) null, this.f5068O);
            zArr[i] = true;
        }
    }

    /* renamed from: V */
    private void m8062V(int i) {
        m8051I();
        boolean[] zArr = this.f5059F.f5111b;
        if (this.f5070Q && zArr[i]) {
            if (!this.f5054A[i].mo6828K(false)) {
                this.f5069P = 0;
                this.f5070Q = false;
                this.f5065L = true;
                this.f5068O = 0;
                this.f5071R = 0;
                for (C1743p0 V : this.f5054A) {
                    V.mo6834V();
                }
                ((C1765u.C1766a) C5917a.m34872e(this.f5090y)).mo6684f(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m8063Y() {
        this.f5089x.post(new C1711h0(this));
    }

    /* renamed from: c0 */
    private C4200e0 m8064c0(C1727d dVar) {
        int length = this.f5054A.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f5055B[i])) {
                return this.f5054A[i];
            }
        }
        C1743p0 k = C1743p0.m8191k(this.f5081h, this.f5076c, this.f5079f);
        k.mo6844d0(this);
        int i2 = length + 1;
        C1727d[] dVarArr = (C1727d[]) Arrays.copyOf(this.f5055B, i2);
        dVarArr[length] = dVar;
        this.f5055B = (C1727d[]) C5953m0.m35140k(dVarArr);
        C1743p0[] p0VarArr = (C1743p0[]) Arrays.copyOf(this.f5054A, i2);
        p0VarArr[length] = k;
        this.f5054A = (C1743p0[]) C5953m0.m35140k(p0VarArr);
        return k;
    }

    /* renamed from: f0 */
    private boolean m8065f0(boolean[] zArr, long j) {
        int length = this.f5054A.length;
        for (int i = 0; i < length; i++) {
            if (!this.f5054A[i].mo6837Z(j, false) && (zArr[i] || !this.f5058E)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m8059S(C4192b0 b0Var) {
        this.f5060G = this.f5091z == null ? b0Var : new C4192b0.C4194b(-9223372036854775807L);
        this.f5061H = b0Var.mo17536j();
        int i = 1;
        boolean z = !this.f5067N && b0Var.mo17536j() == -9223372036854775807L;
        this.f5062I = z;
        if (z) {
            i = 7;
        }
        this.f5063J = i;
        this.f5080g.mo6788g(this.f5061H, b0Var.mo17534g(), this.f5062I);
        if (!this.f5057D) {
            m8060T();
        }
    }

    /* renamed from: i0 */
    private void m8067i0() {
        C1724a aVar = new C1724a(this.f5073a, this.f5075b, this.f5085t, this, this.f5086u);
        if (this.f5057D) {
            C5917a.m34873f(m8056O());
            long j = this.f5061H;
            if (j == -9223372036854775807L || this.f5069P <= j) {
                aVar.m8111j(((C4192b0) C5917a.m34872e(this.f5060G)).mo17535i(this.f5069P).f23480a.f23486b, this.f5069P);
                for (C1743p0 b0 : this.f5054A) {
                    b0.mo6841b0(this.f5069P);
                }
                this.f5069P = -9223372036854775807L;
            } else {
                this.f5072S = true;
                this.f5069P = -9223372036854775807L;
                return;
            }
        }
        this.f5071R = m8054L();
        this.f5078e.mo6713A(new C1748q(aVar.f5092a, aVar.f5102k, this.f5084s.mo20341n(aVar, this, this.f5077d.mo20332d(this.f5063J))), 1, -1, (C6272r1) null, 0, (Object) null, aVar.f5101j, this.f5061H);
    }

    /* renamed from: j0 */
    private boolean m8068j0() {
        return this.f5065L || m8056O();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public C4200e0 mo6767N() {
        return m8064c0(new C1727d(0, true));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo6768P(int i) {
        return !m8068j0() && this.f5054A[i].mo6828K(this.f5072S);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo6769W() throws IOException {
        this.f5084s.mo20338k(this.f5077d.mo20332d(this.f5063J));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo6770X(int i) throws IOException {
        this.f5054A[i].mo6829N();
        mo6769W();
    }

    /* renamed from: Z */
    public void mo6784q(C1724a aVar, long j, long j2, boolean z) {
        C5836o0 d = aVar.f5094c;
        C1748q qVar = new C1748q(aVar.f5092a, aVar.f5102k, d.mo20363r(), d.mo20364s(), j, j2, d.mo20362q());
        this.f5077d.mo20330b(aVar.f5092a);
        this.f5078e.mo6723r(qVar, 1, -1, (C6272r1) null, 0, (Object) null, aVar.f5101j, this.f5061H);
        if (!z) {
            for (C1743p0 V : this.f5054A) {
                V.mo6834V();
            }
            if (this.f5066M > 0) {
                ((C1765u.C1766a) C5917a.m34872e(this.f5090y)).mo6684f(this);
            }
        }
    }

    /* renamed from: a */
    public void mo6772a() {
        for (C1743p0 T : this.f5054A) {
            T.mo6833T();
        }
        this.f5085t.mo6673a();
    }

    /* renamed from: a0 */
    public void mo6780j(C1724a aVar, long j, long j2) {
        C4192b0 b0Var;
        if (this.f5061H == -9223372036854775807L && (b0Var = this.f5060G) != null) {
            boolean g = b0Var.mo17534g();
            long M = m8055M(true);
            long j3 = M == Long.MIN_VALUE ? 0 : M + 10000;
            this.f5061H = j3;
            this.f5080g.mo6788g(j3, g, this.f5062I);
        }
        C5836o0 d = aVar.f5094c;
        C1748q qVar = new C1748q(aVar.f5092a, aVar.f5102k, d.mo20363r(), d.mo20364s(), j, j2, d.mo20362q());
        this.f5077d.mo20330b(aVar.f5092a);
        this.f5078e.mo6726u(qVar, 1, -1, (C6272r1) null, 0, (Object) null, aVar.f5101j, this.f5061H);
        this.f5072S = true;
        ((C1765u.C1766a) C5917a.m34872e(this.f5090y)).mo6684f(this);
    }

    /* renamed from: b */
    public void mo6774b(C6272r1 r1Var) {
        this.f5089x.post(this.f5087v);
    }

    /* renamed from: b0 */
    public C5810h0.C5813c mo6783o(C1724a aVar, long j, long j2, IOException iOException, int i) {
        C5810h0.C5813c cVar;
        C1724a aVar2;
        boolean z;
        C5836o0 d = aVar.f5094c;
        C1748q qVar = new C1748q(aVar.f5092a, aVar.f5102k, d.mo20363r(), d.mo20364s(), j, j2, d.mo20362q());
        long c = this.f5077d.mo20331c(new C5804g0.C5807c(qVar, new C1759t(1, -1, (C6272r1) null, 0, (Object) null, C5953m0.m35117Y0(aVar.f5101j), C5953m0.m35117Y0(this.f5061H)), iOException, i));
        if (c == -9223372036854775807L) {
            cVar = C5810h0.f28824g;
            C1724a aVar3 = aVar;
        } else {
            int L = m8054L();
            if (L > this.f5071R) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            if (m8052J(aVar2, L)) {
                cVar = C5810h0.m34569h(z, c);
            } else {
                cVar = C5810h0.f28823f;
            }
        }
        boolean z2 = !cVar.mo20342c();
        this.f5078e.mo6728w(qVar, 1, -1, (C6272r1) null, 0, (Object) null, aVar.f5101j, this.f5061H, iOException, z2);
        if (z2) {
            this.f5077d.mo20330b(aVar.f5092a);
        }
        return cVar;
    }

    /* renamed from: c */
    public long mo6681c(long j, C6229i3 i3Var) {
        m8051I();
        if (!this.f5060G.mo17534g()) {
            return 0;
        }
        C4192b0.C4193a i = this.f5060G.mo17535i(j);
        return i3Var.mo21342a(j, i.f23480a.f23485a, i.f23481b.f23485a);
    }

    /* renamed from: d */
    public long mo6682d() {
        return mo6685g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public int mo6776d0(int i, C6279s1 s1Var, C1848g gVar, int i2) {
        if (m8068j0()) {
            return -3;
        }
        m8061U(i);
        int S = this.f5054A[i].mo6832S(s1Var, gVar, i2, this.f5072S);
        if (S == -3) {
            m8062V(i);
        }
        return S;
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        if (this.f5072S || this.f5084s.mo20336i() || this.f5070Q) {
            return false;
        }
        if (this.f5057D && this.f5066M == 0) {
            return false;
        }
        boolean e = this.f5086u.mo20596e();
        if (this.f5084s.mo20337j()) {
            return e;
        }
        m8067i0();
        return true;
    }

    /* renamed from: e0 */
    public void mo6777e0() {
        if (this.f5057D) {
            for (C1743p0 R : this.f5054A) {
                R.mo6831R();
            }
        }
        this.f5084s.mo20340m(this);
        this.f5089x.removeCallbacksAndMessages((Object) null);
        this.f5090y = null;
        this.f5074a0 = true;
    }

    /* renamed from: f */
    public C4200e0 mo6778f(int i, int i2) {
        return m8064c0(new C1727d(i, false));
    }

    /* renamed from: g */
    public long mo6685g() {
        long j;
        m8051I();
        if (this.f5072S || this.f5066M == 0) {
            return Long.MIN_VALUE;
        }
        if (m8056O()) {
            return this.f5069P;
        }
        if (this.f5058E) {
            int length = this.f5054A.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C1728e eVar = this.f5059F;
                if (eVar.f5111b[i] && eVar.f5112c[i] && !this.f5054A[i].mo6827J()) {
                    j = Math.min(j, this.f5054A[i].mo6858z());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m8055M(false);
        }
        return j == Long.MIN_VALUE ? this.f5068O : j;
    }

    /* renamed from: h */
    public void mo6686h(long j) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public int mo6779h0(int i, long j) {
        if (m8068j0()) {
            return 0;
        }
        m8061U(i);
        C1743p0 p0Var = this.f5054A[i];
        int E = p0Var.mo6823E(j, this.f5072S);
        p0Var.mo6846e0(E);
        if (E == 0) {
            m8062V(i);
        }
        return E;
    }

    /* renamed from: i */
    public long mo6687i(C5735s[] sVarArr, boolean[] zArr, C1749q0[] q0VarArr, boolean[] zArr2, long j) {
        m8051I();
        C1728e eVar = this.f5059F;
        C1780z0 z0Var = eVar.f5110a;
        boolean[] zArr3 = eVar.f5112c;
        int i = this.f5066M;
        int i2 = 0;
        for (int i3 = 0; i3 < sVarArr.length; i3++) {
            if (q0VarArr[i3] != null && (sVarArr[i3] == null || !zArr[i3])) {
                int a = q0VarArr[i3].f5106a;
                C5917a.m34873f(zArr3[a]);
                this.f5066M--;
                zArr3[a] = false;
                q0VarArr[i3] = null;
            }
        }
        boolean z = !this.f5064K ? j != 0 : i == 0;
        for (int i4 = 0; i4 < sVarArr.length; i4++) {
            if (q0VarArr[i4] == null && sVarArr[i4] != null) {
                C5735s sVar = sVarArr[i4];
                C5917a.m34873f(sVar.length() == 1);
                C5917a.m34873f(sVar.mo20145d(0) == 0);
                int c = z0Var.mo6904c(sVar.mo20142a());
                C5917a.m34873f(!zArr3[c]);
                this.f5066M++;
                zArr3[c] = true;
                q0VarArr[i4] = new C1726c(c);
                zArr2[i4] = true;
                if (!z) {
                    C1743p0 p0Var = this.f5054A[c];
                    z = !p0Var.mo6837Z(j, true) && p0Var.mo6822C() != 0;
                }
            }
        }
        if (this.f5066M == 0) {
            this.f5070Q = false;
            this.f5065L = false;
            if (this.f5084s.mo20337j()) {
                C1743p0[] p0VarArr = this.f5054A;
                int length = p0VarArr.length;
                while (i2 < length) {
                    p0VarArr[i2].mo6852r();
                    i2++;
                }
                this.f5084s.mo20334f();
            } else {
                C1743p0[] p0VarArr2 = this.f5054A;
                int length2 = p0VarArr2.length;
                while (i2 < length2) {
                    p0VarArr2[i2].mo6834V();
                    i2++;
                }
            }
        } else if (z) {
            j = mo6691m(j);
            while (i2 < q0VarArr.length) {
                if (q0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f5064K = true;
        return j;
    }

    public boolean isLoading() {
        return this.f5084s.mo20337j() && this.f5086u.mo20595d();
    }

    /* renamed from: k */
    public void mo6690k() throws IOException {
        mo6769W();
        if (this.f5072S && !this.f5057D) {
            throw C6249m2.m36661a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: l */
    public void mo6781l(C4192b0 b0Var) {
        this.f5089x.post(new C1715j0(this, b0Var));
    }

    /* renamed from: m */
    public long mo6691m(long j) {
        m8051I();
        boolean[] zArr = this.f5059F.f5111b;
        if (!this.f5060G.mo17534g()) {
            j = 0;
        }
        int i = 0;
        this.f5065L = false;
        this.f5068O = j;
        if (m8056O()) {
            this.f5069P = j;
            return j;
        } else if (this.f5063J != 7 && m8065f0(zArr, j)) {
            return j;
        } else {
            this.f5070Q = false;
            this.f5069P = j;
            this.f5072S = false;
            if (this.f5084s.mo20337j()) {
                C1743p0[] p0VarArr = this.f5054A;
                int length = p0VarArr.length;
                while (i < length) {
                    p0VarArr[i].mo6852r();
                    i++;
                }
                this.f5084s.mo20334f();
            } else {
                this.f5084s.mo20335g();
                C1743p0[] p0VarArr2 = this.f5054A;
                int length2 = p0VarArr2.length;
                while (i < length2) {
                    p0VarArr2[i].mo6834V();
                    i++;
                }
            }
            return j;
        }
    }

    /* renamed from: n */
    public void mo6782n() {
        this.f5056C = true;
        this.f5089x.post(this.f5087v);
    }

    /* renamed from: p */
    public long mo6694p() {
        if (!this.f5065L) {
            return -9223372036854775807L;
        }
        if (!this.f5072S && m8054L() <= this.f5071R) {
            return -9223372036854775807L;
        }
        this.f5065L = false;
        return this.f5068O;
    }

    /* renamed from: r */
    public void mo6695r(C1765u.C1766a aVar, long j) {
        this.f5090y = aVar;
        this.f5086u.mo20596e();
        m8067i0();
    }

    /* renamed from: s */
    public C1780z0 mo6696s() {
        m8051I();
        return this.f5059F.f5110a;
    }

    /* renamed from: t */
    public void mo6697t(long j, boolean z) {
        m8051I();
        if (!m8056O()) {
            boolean[] zArr = this.f5059F.f5112c;
            int length = this.f5054A.length;
            for (int i = 0; i < length; i++) {
                this.f5054A[i].mo6851q(j, z, zArr[i]);
            }
        }
    }
}
