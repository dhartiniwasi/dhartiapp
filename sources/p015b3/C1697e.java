package p015b3;

import java.io.IOException;
import java.util.ArrayList;
import p015b3.C1772x;
import p155v3.C5789b;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6266q3;
import p177z1.C6300z1;

/* renamed from: b3.e */
/* compiled from: ClippingMediaSource */
public final class C1697e extends C1706g<Void> {

    /* renamed from: A */
    private C1698a f4979A;

    /* renamed from: B */
    private C1699b f4980B;

    /* renamed from: C */
    private long f4981C;

    /* renamed from: D */
    private long f4982D;

    /* renamed from: s */
    private final C1772x f4983s;

    /* renamed from: t */
    private final long f4984t;

    /* renamed from: u */
    private final long f4985u;

    /* renamed from: v */
    private final boolean f4986v;

    /* renamed from: w */
    private final boolean f4987w;

    /* renamed from: x */
    private final boolean f4988x;

    /* renamed from: y */
    private final ArrayList<C1694d> f4989y;

    /* renamed from: z */
    private final C6266q3.C6270d f4990z;

    /* renamed from: b3.e$a */
    /* compiled from: ClippingMediaSource */
    private static final class C1698a extends C1739o {

        /* renamed from: d */
        private final long f4991d;

        /* renamed from: e */
        private final long f4992e;

        /* renamed from: f */
        private final long f4993f;

        /* renamed from: g */
        private final boolean f4994g;

        public C1698a(C6266q3 q3Var, long j, long j2) throws C1699b {
            super(q3Var);
            boolean z = false;
            if (q3Var.mo6760m() == 1) {
                C6266q3.C6270d r = q3Var.mo21450r(0, new C6266q3.C6270d());
                long max = Math.max(0, j);
                if (r.f30210t || max == 0 || r.f30206h) {
                    long max2 = j2 == Long.MIN_VALUE ? r.f30212v : Math.max(0, j2);
                    long j3 = r.f30212v;
                    if (j3 != -9223372036854775807L) {
                        max2 = max2 > j3 ? j3 : max2;
                        if (max > max2) {
                            throw new C1699b(2);
                        }
                    }
                    this.f4991d = max;
                    this.f4992e = max2;
                    int i = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                    this.f4993f = i == 0 ? -9223372036854775807L : max2 - max;
                    if (r.f30207i && (i == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                        z = true;
                    }
                    this.f4994g = z;
                    return;
                }
                throw new C1699b(1);
            }
            throw new C1699b(0);
        }

        /* renamed from: k */
        public C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
            this.f5157c.mo6711k(0, bVar, z);
            long q = bVar.mo21468q() - this.f4991d;
            long j = this.f4993f;
            return bVar.mo21472v(bVar.f30184a, bVar.f30185b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - q, q);
        }

        /* renamed from: s */
        public C6266q3.C6270d mo6712s(int i, C6266q3.C6270d dVar, long j) {
            this.f5157c.mo6712s(0, dVar, 0);
            long j2 = dVar.f30215y;
            long j3 = this.f4991d;
            dVar.f30215y = j2 + j3;
            dVar.f30212v = this.f4993f;
            dVar.f30207i = this.f4994g;
            long j4 = dVar.f30211u;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                dVar.f30211u = max;
                long j5 = this.f4992e;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                dVar.f30211u = max;
                dVar.f30211u = max - this.f4991d;
            }
            long Y0 = C5953m0.m35117Y0(this.f4991d);
            long j6 = dVar.f30203e;
            if (j6 != -9223372036854775807L) {
                dVar.f30203e = j6 + Y0;
            }
            long j7 = dVar.f30204f;
            if (j7 != -9223372036854775807L) {
                dVar.f30204f = j7 + Y0;
            }
            return dVar;
        }
    }

    /* renamed from: b3.e$b */
    /* compiled from: ClippingMediaSource */
    public static final class C1699b extends IOException {

        /* renamed from: a */
        public final int f4995a;

        public C1699b(int i) {
            super("Illegal clipping: " + m7898a(i));
            this.f4995a = i;
        }

        /* renamed from: a */
        private static String m7898a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C1697e(C1772x xVar, long j, long j2) {
        this(xVar, j, j2, true, false, false);
    }

    /* renamed from: Q */
    private void m7887Q(C6266q3 q3Var) {
        long j;
        q3Var.mo21450r(0, this.f4990z);
        long g = this.f4990z.mo21479g();
        long j2 = Long.MIN_VALUE;
        if (this.f4979A == null || this.f4989y.isEmpty() || this.f4987w) {
            long j3 = this.f4984t;
            long j4 = this.f4985u;
            if (this.f4988x) {
                long e = this.f4990z.mo21476e();
                j3 += e;
                j4 += e;
            }
            this.f4981C = g + j3;
            if (this.f4985u != Long.MIN_VALUE) {
                j2 = g + j4;
            }
            this.f4982D = j2;
            int size = this.f4989y.size();
            for (int i = 0; i < size; i++) {
                this.f4989y.get(i).mo6698u(this.f4981C, this.f4982D);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.f4981C - g;
            if (this.f4985u != Long.MIN_VALUE) {
                j2 = this.f4982D - g;
            }
            j = j5;
        }
        try {
            C1698a aVar = new C1698a(q3Var, j, j2);
            this.f4979A = aVar;
            mo6652D(aVar);
        } catch (C1699b e2) {
            this.f4980B = e2;
            for (int i2 = 0; i2 < this.f4989y.size(); i2++) {
                this.f4989y.get(i2).mo6693o(this.f4980B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        super.mo6651C(p0Var);
        mo6739N(null, this.f4983s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
        super.mo6653E();
        this.f4980B = null;
        this.f4979A = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo6705M(Void voidR, C1772x xVar, C6266q3 q3Var) {
        if (this.f4980B == null) {
            m7887Q(q3Var);
        }
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        C5917a.m34873f(this.f4989y.remove(uVar));
        this.f4983s.mo6707d(((C1694d) uVar).f4965a);
        if (this.f4989y.isEmpty() && !this.f4987w) {
            m7887Q(((C1698a) C5917a.m34872e(this.f4979A)).f5157c);
        }
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f4983s.mo6708i();
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        C1694d dVar = new C1694d(this.f4983s.mo6709k(bVar, bVar2, j), this.f4986v, this.f4981C, this.f4982D);
        this.f4989y.add(dVar);
        return dVar;
    }

    /* renamed from: l */
    public void mo6710l() throws IOException {
        C1699b bVar = this.f4980B;
        if (bVar == null) {
            super.mo6710l();
            return;
        }
        throw bVar;
    }

    public C1697e(C1772x xVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        C5917a.m34868a(j >= 0);
        this.f4983s = (C1772x) C5917a.m34872e(xVar);
        this.f4984t = j;
        this.f4985u = j2;
        this.f4986v = z;
        this.f4987w = z2;
        this.f4988x = z3;
        this.f4989y = new ArrayList<>();
        this.f4990z = new C6266q3.C6270d();
    }
}
