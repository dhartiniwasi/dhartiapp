package p051g2;

import java.io.IOException;
import java.util.ArrayList;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4200e0;
import p037e2.C4213j;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p190b7.C6695s0;

/* renamed from: g2.b */
/* compiled from: AviExtractor */
public final class C4350b implements C4215l {

    /* renamed from: a */
    private final C5918a0 f24263a = new C5918a0(12);

    /* renamed from: b */
    private final C4353c f24264b = new C4353c();

    /* renamed from: c */
    private int f24265c;

    /* renamed from: d */
    private C4217n f24266d = new C4213j();

    /* renamed from: e */
    private C4354c f24267e;

    /* renamed from: f */
    private long f24268f = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4356e[] f24269g = new C4356e[0];

    /* renamed from: h */
    private long f24270h;

    /* renamed from: i */
    private C4356e f24271i;

    /* renamed from: j */
    private int f24272j = -1;

    /* renamed from: k */
    private long f24273k = -1;

    /* renamed from: l */
    private long f24274l = -1;

    /* renamed from: m */
    private int f24275m;

    /* renamed from: n */
    private boolean f24276n;

    /* renamed from: g2.b$b */
    /* compiled from: AviExtractor */
    private class C4352b implements C4192b0 {

        /* renamed from: a */
        private final long f24277a;

        public C4352b(long j) {
            this.f24277a = j;
        }

        /* renamed from: g */
        public boolean mo17534g() {
            return true;
        }

        /* renamed from: i */
        public C4192b0.C4193a mo17535i(long j) {
            C4192b0.C4193a i = C4350b.this.f24269g[0].mo17789i(j);
            for (int i2 = 1; i2 < C4350b.this.f24269g.length; i2++) {
                C4192b0.C4193a i3 = C4350b.this.f24269g[i2].mo17789i(j);
                if (i3.f23480a.f23486b < i.f23480a.f23486b) {
                    i = i3;
                }
            }
            return i;
        }

        /* renamed from: j */
        public long mo17536j() {
            return this.f24277a;
        }
    }

    /* renamed from: g2.b$c */
    /* compiled from: AviExtractor */
    private static class C4353c {

        /* renamed from: a */
        public int f24279a;

        /* renamed from: b */
        public int f24280b;

        /* renamed from: c */
        public int f24281c;

        private C4353c() {
        }

        /* renamed from: a */
        public void mo17779a(C5918a0 a0Var) {
            this.f24279a = a0Var.mo20563p();
            this.f24280b = a0Var.mo20563p();
            this.f24281c = 0;
        }

        /* renamed from: b */
        public void mo17780b(C5918a0 a0Var) throws C6249m2 {
            mo17779a(a0Var);
            if (this.f24279a == 1414744396) {
                this.f24281c = a0Var.mo20563p();
                return;
            }
            throw C6249m2.m36661a("LIST expected, found: " + this.f24279a, (Throwable) null);
        }
    }

    /* renamed from: f */
    private static void m28961f(C4216m mVar) throws IOException {
        if ((mVar.mo17554c() & 1) == 1) {
            mVar.mo17561k(1);
        }
    }

    /* renamed from: g */
    private C4356e m28962g(int i) {
        for (C4356e eVar : this.f24269g) {
            if (eVar.mo17790j(i)) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: i */
    private void m28963i(C5918a0 a0Var) throws IOException {
        C4357f c = C4357f.m29000c(1819436136, a0Var);
        if (c.getType() == 1819436136) {
            C4354c cVar = (C4354c) c.mo17796b(C4354c.class);
            if (cVar != null) {
                this.f24267e = cVar;
                this.f24268f = ((long) cVar.f24284c) * ((long) cVar.f24282a);
                ArrayList arrayList = new ArrayList();
                C6695s0<C4349a> l = c.f24304a.iterator();
                int i = 0;
                while (l.hasNext()) {
                    C4349a next = l.next();
                    if (next.getType() == 1819440243) {
                        int i2 = i + 1;
                        C4356e l2 = m28966l((C4357f) next, i);
                        if (l2 != null) {
                            arrayList.add(l2);
                        }
                        i = i2;
                    }
                }
                this.f24269g = (C4356e[]) arrayList.toArray(new C4356e[0]);
                this.f24266d.mo6782n();
                return;
            }
            throw C6249m2.m36661a("AviHeader not found", (Throwable) null);
        }
        throw C6249m2.m36661a("Unexpected header list type " + c.getType(), (Throwable) null);
    }

    /* renamed from: j */
    private void m28964j(C5918a0 a0Var) {
        long k = m28965k(a0Var);
        while (a0Var.mo20548a() >= 16) {
            int p = a0Var.mo20563p();
            int p2 = a0Var.mo20563p();
            long p3 = ((long) a0Var.mo20563p()) + k;
            a0Var.mo20563p();
            C4356e g = m28962g(p);
            if (g != null) {
                if ((p2 & 16) == 16) {
                    g.mo17785b(p3);
                }
                g.mo17791k();
            }
        }
        for (C4356e c : this.f24269g) {
            c.mo17786c();
        }
        this.f24276n = true;
        this.f24266d.mo6781l(new C4352b(this.f24268f));
    }

    /* renamed from: k */
    private long m28965k(C5918a0 a0Var) {
        long j = 0;
        if (a0Var.mo20548a() < 16) {
            return 0;
        }
        int e = a0Var.mo20552e();
        a0Var.mo20547P(8);
        long j2 = this.f24273k;
        if (((long) a0Var.mo20563p()) <= j2) {
            j = 8 + j2;
        }
        a0Var.mo20546O(e);
        return j;
    }

    /* renamed from: l */
    private C4356e m28966l(C4357f fVar, int i) {
        C4355d dVar = (C4355d) fVar.mo17796b(C4355d.class);
        C4358g gVar = (C4358g) fVar.mo17796b(C4358g.class);
        if (dVar == null) {
            C5961r.m35215i("AviExtractor", "Missing Stream Header");
            return null;
        } else if (gVar == null) {
            C5961r.m35215i("AviExtractor", "Missing Stream Format");
            return null;
        } else {
            long a = dVar.mo17782a();
            C6272r1 r1Var = gVar.f24306a;
            C6272r1.C6274b b = r1Var.mo21483b();
            b.mo21504R(i);
            int i2 = dVar.f24291f;
            if (i2 != 0) {
                b.mo21509W(i2);
            }
            C4359h hVar = (C4359h) fVar.mo17796b(C4359h.class);
            if (hVar != null) {
                b.mo21507U(hVar.f24307a);
            }
            int k = C5967v.m35247k(r1Var.f30243t);
            if (k != 1 && k != 2) {
                return null;
            }
            C4200e0 f = this.f24266d.mo6778f(i, k);
            f.mo6845e(b.mo21491E());
            C4356e eVar = new C4356e(i, k, a, dVar.f24290e, f);
            this.f24268f = a;
            return eVar;
        }
    }

    /* renamed from: m */
    private int m28967m(C4216m mVar) throws IOException {
        if (mVar.mo17554c() >= this.f24274l) {
            return -1;
        }
        C4356e eVar = this.f24271i;
        if (eVar == null) {
            m28961f(mVar);
            int i = 12;
            mVar.mo17563p(this.f24263a.mo20551d(), 0, 12);
            this.f24263a.mo20546O(0);
            int p = this.f24263a.mo20563p();
            if (p == 1414744396) {
                this.f24263a.mo20546O(8);
                if (this.f24263a.mo20563p() != 1769369453) {
                    i = 8;
                }
                mVar.mo17561k(i);
                mVar.mo17560j();
                return 0;
            }
            int p2 = this.f24263a.mo20563p();
            if (p == 1263424842) {
                this.f24270h = mVar.mo17554c() + ((long) p2) + 8;
                return 0;
            }
            mVar.mo17561k(8);
            mVar.mo17560j();
            C4356e g = m28962g(p);
            if (g == null) {
                this.f24270h = mVar.mo17554c() + ((long) p2);
                return 0;
            }
            g.mo17794n(p2);
            this.f24271i = g;
        } else if (eVar.mo17793m(mVar)) {
            this.f24271i = null;
        }
        return 0;
    }

    /* renamed from: n */
    private boolean m28968n(C4216m mVar, C4190a0 a0Var) throws IOException {
        boolean z;
        if (this.f24270h != -1) {
            long c = mVar.mo17554c();
            long j = this.f24270h;
            if (j < c || j > 262144 + c) {
                a0Var.f23479a = j;
                z = true;
                this.f24270h = -1;
                return z;
            }
            mVar.mo17561k((int) (j - c));
        }
        z = false;
        this.f24270h = -1;
        return z;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f24270h = -1;
        this.f24271i = null;
        for (C4356e o : this.f24269g) {
            o.mo17795o(j);
        }
        if (j != 0) {
            this.f24265c = 6;
        } else if (this.f24269g.length == 0) {
            this.f24265c = 0;
        } else {
            this.f24265c = 3;
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f24265c = 0;
        this.f24266d = nVar;
        this.f24270h = -1;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        if (m28968n(mVar, a0Var)) {
            return 1;
        }
        switch (this.f24265c) {
            case 0:
                if (mo17583h(mVar)) {
                    mVar.mo17561k(12);
                    this.f24265c = 1;
                    return 0;
                }
                throw C6249m2.m36661a("AVI Header List not found", (Throwable) null);
            case 1:
                mVar.readFully(this.f24263a.mo20551d(), 0, 12);
                this.f24263a.mo20546O(0);
                this.f24264b.mo17780b(this.f24263a);
                C4353c cVar = this.f24264b;
                if (cVar.f24281c == 1819436136) {
                    this.f24272j = cVar.f24280b;
                    this.f24265c = 2;
                    return 0;
                }
                throw C6249m2.m36661a("hdrl expected, found: " + this.f24264b.f24281c, (Throwable) null);
            case 2:
                int i = this.f24272j - 4;
                C5918a0 a0Var2 = new C5918a0(i);
                mVar.readFully(a0Var2.mo20551d(), 0, i);
                m28963i(a0Var2);
                this.f24265c = 3;
                return 0;
            case 3:
                if (this.f24273k != -1) {
                    long c = mVar.mo17554c();
                    long j = this.f24273k;
                    if (c != j) {
                        this.f24270h = j;
                        return 0;
                    }
                }
                mVar.mo17563p(this.f24263a.mo20551d(), 0, 12);
                mVar.mo17560j();
                this.f24263a.mo20546O(0);
                this.f24264b.mo17779a(this.f24263a);
                int p = this.f24263a.mo20563p();
                int i2 = this.f24264b.f24279a;
                if (i2 == 1179011410) {
                    mVar.mo17561k(12);
                    return 0;
                } else if (i2 == 1414744396 && p == 1769369453) {
                    long c2 = mVar.mo17554c();
                    this.f24273k = c2;
                    this.f24274l = c2 + ((long) this.f24264b.f24280b) + 8;
                    if (!this.f24276n) {
                        if (((C4354c) C5917a.m34872e(this.f24267e)).mo17781a()) {
                            this.f24265c = 4;
                            this.f24270h = this.f24274l;
                            return 0;
                        }
                        this.f24266d.mo6781l(new C4192b0.C4194b(this.f24268f));
                        this.f24276n = true;
                    }
                    this.f24270h = mVar.mo17554c() + 12;
                    this.f24265c = 6;
                    return 0;
                } else {
                    this.f24270h = mVar.mo17554c() + ((long) this.f24264b.f24280b) + 8;
                    return 0;
                }
            case 4:
                mVar.readFully(this.f24263a.mo20551d(), 0, 8);
                this.f24263a.mo20546O(0);
                int p2 = this.f24263a.mo20563p();
                int p3 = this.f24263a.mo20563p();
                if (p2 == 829973609) {
                    this.f24265c = 5;
                    this.f24275m = p3;
                } else {
                    this.f24270h = mVar.mo17554c() + ((long) p3);
                }
                return 0;
            case 5:
                C5918a0 a0Var3 = new C5918a0(this.f24275m);
                mVar.readFully(a0Var3.mo20551d(), 0, this.f24275m);
                m28964j(a0Var3);
                this.f24265c = 6;
                this.f24270h = this.f24273k;
                return 0;
            case 6:
                return m28967m(mVar);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        mVar.mo17563p(this.f24263a.mo20551d(), 0, 12);
        this.f24263a.mo20546O(0);
        if (this.f24263a.mo20563p() != 1179011410) {
            return false;
        }
        this.f24263a.mo20547P(4);
        if (this.f24263a.mo20563p() == 541677121) {
            return true;
        }
        return false;
    }
}
