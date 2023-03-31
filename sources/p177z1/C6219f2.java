package p177z1;

import p015b3.C1694d;
import p015b3.C1736n;
import p015b3.C1749q0;
import p015b3.C1765u;
import p015b3.C1772x;
import p015b3.C1780z0;
import p149u3.C5717b0;
import p149u3.C5720c0;
import p149u3.C5735s;
import p155v3.C5789b;
import p161w3.C5917a;
import p161w3.C5961r;

/* renamed from: z1.f2 */
/* compiled from: MediaPeriodHolder */
final class C6219f2 {

    /* renamed from: a */
    public final C1765u f29933a;

    /* renamed from: b */
    public final Object f29934b;

    /* renamed from: c */
    public final C1749q0[] f29935c;

    /* renamed from: d */
    public boolean f29936d;

    /* renamed from: e */
    public boolean f29937e;

    /* renamed from: f */
    public C6222g2 f29938f;

    /* renamed from: g */
    public boolean f29939g;

    /* renamed from: h */
    private final boolean[] f29940h;

    /* renamed from: i */
    private final C6220f3[] f29941i;

    /* renamed from: j */
    private final C5717b0 f29942j;

    /* renamed from: k */
    private final C6239l2 f29943k;

    /* renamed from: l */
    private C6219f2 f29944l;

    /* renamed from: m */
    private C1780z0 f29945m = C1780z0.f5294d;

    /* renamed from: n */
    private C5720c0 f29946n;

    /* renamed from: o */
    private long f29947o;

    public C6219f2(C6220f3[] f3VarArr, long j, C5717b0 b0Var, C5789b bVar, C6239l2 l2Var, C6222g2 g2Var, C5720c0 c0Var) {
        this.f29941i = f3VarArr;
        this.f29947o = j;
        this.f29942j = b0Var;
        this.f29943k = l2Var;
        C1772x.C1774b bVar2 = g2Var.f29949a;
        this.f29934b = bVar2.f5270a;
        this.f29938f = g2Var;
        this.f29946n = c0Var;
        this.f29935c = new C1749q0[f3VarArr.length];
        this.f29940h = new boolean[f3VarArr.length];
        this.f29933a = m36468e(bVar2, l2Var, bVar, g2Var.f29950b, g2Var.f29952d);
    }

    /* renamed from: c */
    private void m36467c(C1749q0[] q0VarArr) {
        int i = 0;
        while (true) {
            C6220f3[] f3VarArr = this.f29941i;
            if (i < f3VarArr.length) {
                if (f3VarArr[i].mo21220g() == -2 && this.f29946n.mo20160c(i)) {
                    q0VarArr[i] = new C1736n();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static C1765u m36468e(C1772x.C1774b bVar, C6239l2 l2Var, C5789b bVar2, long j, long j2) {
        C1765u h = l2Var.mo21386h(bVar, bVar2, j);
        return j2 != -9223372036854775807L ? new C1694d(h, true, 0, j2) : h;
    }

    /* renamed from: f */
    private void m36469f() {
        if (m36472r()) {
            int i = 0;
            while (true) {
                C5720c0 c0Var = this.f29946n;
                if (i < c0Var.f28540a) {
                    boolean c = c0Var.mo20160c(i);
                    C5735s sVar = this.f29946n.f28542c[i];
                    if (c && sVar != null) {
                        sVar.mo20124f();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m36470g(C1749q0[] q0VarArr) {
        int i = 0;
        while (true) {
            C6220f3[] f3VarArr = this.f29941i;
            if (i < f3VarArr.length) {
                if (f3VarArr[i].mo21220g() == -2) {
                    q0VarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m36471h() {
        if (m36472r()) {
            int i = 0;
            while (true) {
                C5720c0 c0Var = this.f29946n;
                if (i < c0Var.f28540a) {
                    boolean c = c0Var.mo20160c(i);
                    C5735s sVar = this.f29946n.f28542c[i];
                    if (c && sVar != null) {
                        sVar.mo20125m();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private boolean m36472r() {
        return this.f29944l == null;
    }

    /* renamed from: u */
    private static void m36473u(C6239l2 l2Var, C1765u uVar) {
        try {
            if (uVar instanceof C1694d) {
                l2Var.mo21393z(((C1694d) uVar).f4965a);
            } else {
                l2Var.mo21393z(uVar);
            }
        } catch (RuntimeException e) {
            C5961r.m35210d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: A */
    public void mo21298A() {
        C1765u uVar = this.f29933a;
        if (uVar instanceof C1694d) {
            long j = this.f29938f.f29952d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C1694d) uVar).mo6698u(0, j);
        }
    }

    /* renamed from: a */
    public long mo21299a(C5720c0 c0Var, long j, boolean z) {
        return mo21300b(c0Var, j, z, new boolean[this.f29941i.length]);
    }

    /* renamed from: b */
    public long mo21300b(C5720c0 c0Var, long j, boolean z, boolean[] zArr) {
        C5720c0 c0Var2 = c0Var;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c0Var2.f28540a) {
                break;
            }
            boolean[] zArr2 = this.f29940h;
            if (z || !c0Var.mo20159b(this.f29946n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m36470g(this.f29935c);
        m36469f();
        this.f29946n = c0Var2;
        m36471h();
        long i2 = this.f29933a.mo6687i(c0Var2.f28542c, this.f29940h, this.f29935c, zArr, j);
        m36467c(this.f29935c);
        this.f29937e = false;
        int i3 = 0;
        while (true) {
            C1749q0[] q0VarArr = this.f29935c;
            if (i3 >= q0VarArr.length) {
                return i2;
            }
            if (q0VarArr[i3] != null) {
                C5917a.m34873f(c0Var.mo20160c(i3));
                if (this.f29941i[i3].mo21220g() != -2) {
                    this.f29937e = true;
                }
            } else {
                C5917a.m34873f(c0Var2.f28542c[i3] == null);
            }
            i3++;
        }
    }

    /* renamed from: d */
    public void mo21301d(long j) {
        C5917a.m34873f(m36472r());
        this.f29933a.mo6683e(mo21316y(j));
    }

    /* renamed from: i */
    public long mo21302i() {
        if (!this.f29936d) {
            return this.f29938f.f29950b;
        }
        long g = this.f29937e ? this.f29933a.mo6685g() : Long.MIN_VALUE;
        return g == Long.MIN_VALUE ? this.f29938f.f29953e : g;
    }

    /* renamed from: j */
    public C6219f2 mo21303j() {
        return this.f29944l;
    }

    /* renamed from: k */
    public long mo21304k() {
        if (!this.f29936d) {
            return 0;
        }
        return this.f29933a.mo6682d();
    }

    /* renamed from: l */
    public long mo21305l() {
        return this.f29947o;
    }

    /* renamed from: m */
    public long mo21306m() {
        return this.f29938f.f29950b + this.f29947o;
    }

    /* renamed from: n */
    public C1780z0 mo21307n() {
        return this.f29945m;
    }

    /* renamed from: o */
    public C5720c0 mo21308o() {
        return this.f29946n;
    }

    /* renamed from: p */
    public void mo21309p(float f, C6266q3 q3Var) throws C6264q {
        this.f29936d = true;
        this.f29945m = this.f29933a.mo6696s();
        C5720c0 v = mo21313v(f, q3Var);
        C6222g2 g2Var = this.f29938f;
        long j = g2Var.f29950b;
        long j2 = g2Var.f29953e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long a = mo21299a(v, j, false);
        long j3 = this.f29947o;
        C6222g2 g2Var2 = this.f29938f;
        this.f29947o = j3 + (g2Var2.f29950b - a);
        this.f29938f = g2Var2.mo21319b(a);
    }

    /* renamed from: q */
    public boolean mo21310q() {
        return this.f29936d && (!this.f29937e || this.f29933a.mo6685g() == Long.MIN_VALUE);
    }

    /* renamed from: s */
    public void mo21311s(long j) {
        C5917a.m34873f(m36472r());
        if (this.f29936d) {
            this.f29933a.mo6686h(mo21316y(j));
        }
    }

    /* renamed from: t */
    public void mo21312t() {
        m36469f();
        m36473u(this.f29943k, this.f29933a);
    }

    /* renamed from: v */
    public C5720c0 mo21313v(float f, C6266q3 q3Var) throws C6264q {
        C5720c0 g = this.f29942j.mo20139g(this.f29941i, mo21307n(), this.f29938f.f29949a, q3Var);
        for (C5735s sVar : g.f28542c) {
            if (sVar != null) {
                sVar.mo20127r(f);
            }
        }
        return g;
    }

    /* renamed from: w */
    public void mo21314w(C6219f2 f2Var) {
        if (f2Var != this.f29944l) {
            m36469f();
            this.f29944l = f2Var;
            m36471h();
        }
    }

    /* renamed from: x */
    public void mo21315x(long j) {
        this.f29947o = j;
    }

    /* renamed from: y */
    public long mo21316y(long j) {
        return j - mo21305l();
    }

    /* renamed from: z */
    public long mo21317z(long j) {
        return j + mo21305l();
    }
}
