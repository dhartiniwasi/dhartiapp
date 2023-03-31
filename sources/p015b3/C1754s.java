package p015b3;

import p015b3.C1772x;
import p022c3.C1857c;
import p155v3.C5789b;
import p155v3.C5840p0;
import p161w3.C5953m0;
import p177z1.C6266q3;
import p177z1.C6300z1;

/* renamed from: b3.s */
/* compiled from: MaskingMediaSource */
public final class C1754s extends C1706g<Void> {

    /* renamed from: A */
    private boolean f5219A;

    /* renamed from: s */
    private final C1772x f5220s;

    /* renamed from: t */
    private final boolean f5221t;

    /* renamed from: u */
    private final C6266q3.C6270d f5222u;

    /* renamed from: v */
    private final C6266q3.C6268b f5223v;

    /* renamed from: w */
    private C1755a f5224w;

    /* renamed from: x */
    private C1750r f5225x;

    /* renamed from: y */
    private boolean f5226y;

    /* renamed from: z */
    private boolean f5227z;

    /* renamed from: b3.s$a */
    /* compiled from: MaskingMediaSource */
    private static final class C1755a extends C1739o {

        /* renamed from: f */
        public static final Object f5228f = new Object();

        /* renamed from: d */
        private final Object f5229d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Object f5230e;

        private C1755a(C6266q3 q3Var, Object obj, Object obj2) {
            super(q3Var);
            this.f5229d = obj;
            this.f5230e = obj2;
        }

        /* renamed from: A */
        public static C1755a m8285A(C6266q3 q3Var, Object obj, Object obj2) {
            return new C1755a(q3Var, obj, obj2);
        }

        /* renamed from: z */
        public static C1755a m8287z(C6300z1 z1Var) {
            return new C1755a(new C1756b(z1Var), C6266q3.C6270d.f30198z, f5228f);
        }

        /* renamed from: f */
        public int mo6809f(Object obj) {
            Object obj2;
            C6266q3 q3Var = this.f5157c;
            if (f5228f.equals(obj) && (obj2 = this.f5230e) != null) {
                obj = obj2;
            }
            return q3Var.mo6809f(obj);
        }

        /* renamed from: k */
        public C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
            this.f5157c.mo6711k(i, bVar, z);
            if (C5953m0.m35124c(bVar.f30185b, this.f5230e) && z) {
                bVar.f30185b = f5228f;
            }
            return bVar;
        }

        /* renamed from: q */
        public Object mo6813q(int i) {
            Object q = this.f5157c.mo6813q(i);
            return C5953m0.m35124c(q, this.f5230e) ? f5228f : q;
        }

        /* renamed from: s */
        public C6266q3.C6270d mo6712s(int i, C6266q3.C6270d dVar, long j) {
            this.f5157c.mo6712s(i, dVar, j);
            if (C5953m0.m35124c(dVar.f30199a, this.f5229d)) {
                dVar.f30199a = C6266q3.C6270d.f30198z;
            }
            return dVar;
        }

        /* renamed from: y */
        public C1755a mo6872y(C6266q3 q3Var) {
            return new C1755a(q3Var, this.f5229d, this.f5230e);
        }
    }

    /* renamed from: b3.s$b */
    /* compiled from: MaskingMediaSource */
    public static final class C1756b extends C6266q3 {

        /* renamed from: c */
        private final C6300z1 f5231c;

        public C1756b(C6300z1 z1Var) {
            this.f5231c = z1Var;
        }

        /* renamed from: f */
        public int mo6809f(Object obj) {
            return obj == C1755a.f5228f ? 0 : -1;
        }

        /* renamed from: k */
        public C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
            Object obj = null;
            Integer num = z ? 0 : null;
            if (z) {
                obj = C1755a.f5228f;
            }
            bVar.mo21473w(num, obj, 0, -9223372036854775807L, 0, C1857c.f5461g, true);
            return bVar;
        }

        /* renamed from: m */
        public int mo6760m() {
            return 1;
        }

        /* renamed from: q */
        public Object mo6813q(int i) {
            return C1755a.f5228f;
        }

        /* renamed from: s */
        public C6266q3.C6270d mo6712s(int i, C6266q3.C6270d dVar, long j) {
            C6266q3.C6270d dVar2 = dVar;
            dVar.mo21482j(C6266q3.C6270d.f30198z, this.f5231c, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (C6300z1.C6309g) null, 0, -9223372036854775807L, 0, 0, 0);
            C6266q3.C6270d dVar3 = dVar;
            dVar3.f30210t = true;
            return dVar3;
        }

        /* renamed from: t */
        public int mo6761t() {
            return 1;
        }
    }

    public C1754s(C1772x xVar, boolean z) {
        this.f5220s = xVar;
        this.f5221t = z && xVar.mo6659m();
        this.f5222u = new C6266q3.C6270d();
        this.f5223v = new C6266q3.C6268b();
        C6266q3 n = xVar.mo6660n();
        if (n != null) {
            this.f5224w = C1755a.m8285A(n, (Object) null, (Object) null);
            this.f5219A = true;
            return;
        }
        this.f5224w = C1755a.m8287z(xVar.mo6708i());
    }

    /* renamed from: Q */
    private Object m8270Q(Object obj) {
        return (this.f5224w.f5230e == null || !this.f5224w.f5230e.equals(obj)) ? obj : C1755a.f5228f;
    }

    /* renamed from: R */
    private Object m8271R(Object obj) {
        return (this.f5224w.f5230e == null || !obj.equals(C1755a.f5228f)) ? obj : this.f5224w.f5230e;
    }

    /* renamed from: V */
    private void m8272V(long j) {
        C1750r rVar = this.f5225x;
        int f = this.f5224w.mo6809f(rVar.f5210a.f5270a);
        if (f != -1) {
            long j2 = this.f5224w.mo21447j(f, this.f5223v).f30187d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            rVar.mo6863u(j);
        }
    }

    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        super.mo6651C(p0Var);
        if (!this.f5221t) {
            this.f5226y = true;
            mo6739N(null, this.f5220s);
        }
    }

    /* renamed from: E */
    public void mo6653E() {
        this.f5227z = false;
        this.f5226y = false;
        super.mo6653E();
    }

    /* renamed from: P */
    public C1750r mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        C1750r rVar = new C1750r(bVar, bVar2, j);
        rVar.mo6865w(this.f5220s);
        if (this.f5227z) {
            rVar.mo6859a(bVar.mo6896c(m8271R(bVar.f5270a)));
        } else {
            this.f5225x = rVar;
            if (!this.f5226y) {
                this.f5226y = true;
                mo6739N(null, this.f5220s);
            }
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C1772x.C1774b mo6736I(Void voidR, C1772x.C1774b bVar) {
        return bVar.mo6896c(m8270Q(bVar.f5270a));
    }

    /* renamed from: T */
    public C6266q3 mo6870T() {
        return this.f5224w;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6705M(java.lang.Void r13, p015b3.C1772x r14, p177z1.C6266q3 r15) {
        /*
            r12 = this;
            boolean r13 = r12.f5227z
            if (r13 == 0) goto L_0x0019
            b3.s$a r13 = r12.f5224w
            b3.s$a r13 = r13.mo6872y(r15)
            r12.f5224w = r13
            b3.r r13 = r12.f5225x
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.mo6860j()
            r12.m8272V(r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.mo21451u()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f5219A
            if (r13 == 0) goto L_0x002a
            b3.s$a r13 = r12.f5224w
            b3.s$a r13 = r13.mo6872y(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = p177z1.C6266q3.C6270d.f30198z
            java.lang.Object r14 = p015b3.C1754s.C1755a.f5228f
            b3.s$a r13 = p015b3.C1754s.C1755a.m8285A(r15, r13, r14)
        L_0x0032:
            r12.f5224w = r13
            goto L_0x00ae
        L_0x0036:
            z1.q3$d r13 = r12.f5222u
            r14 = 0
            r15.mo21450r(r14, r13)
            z1.q3$d r13 = r12.f5222u
            long r0 = r13.mo21476e()
            z1.q3$d r13 = r12.f5222u
            java.lang.Object r13 = r13.f30199a
            b3.r r2 = r12.f5225x
            if (r2 == 0) goto L_0x0074
            long r2 = r2.mo6861n()
            b3.s$a r4 = r12.f5224w
            b3.r r5 = r12.f5225x
            b3.x$b r5 = r5.f5210a
            java.lang.Object r5 = r5.f5270a
            z1.q3$b r6 = r12.f5223v
            r4.mo21149l(r5, r6)
            z1.q3$b r4 = r12.f5223v
            long r4 = r4.mo21468q()
            long r4 = r4 + r2
            b3.s$a r2 = r12.f5224w
            z1.q3$d r3 = r12.f5222u
            z1.q3$d r14 = r2.mo21450r(r14, r3)
            long r2 = r14.mo21476e()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            z1.q3$d r7 = r12.f5222u
            z1.q3$b r8 = r12.f5223v
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.mo21448n(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f5219A
            if (r14 == 0) goto L_0x0094
            b3.s$a r13 = r12.f5224w
            b3.s$a r13 = r13.mo6872y(r15)
            goto L_0x0098
        L_0x0094:
            b3.s$a r13 = p015b3.C1754s.C1755a.m8285A(r15, r13, r0)
        L_0x0098:
            r12.f5224w = r13
            b3.r r13 = r12.f5225x
            if (r13 == 0) goto L_0x00ae
            r12.m8272V(r1)
            b3.x$b r13 = r13.f5210a
            java.lang.Object r14 = r13.f5270a
            java.lang.Object r14 = r12.m8271R(r14)
            b3.x$b r13 = r13.mo6896c(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f5219A = r14
            r12.f5227z = r14
            b3.s$a r14 = r12.f5224w
            r12.mo6652D(r14)
            if (r13 == 0) goto L_0x00c6
            b3.r r14 = r12.f5225x
            java.lang.Object r14 = p161w3.C5917a.m34872e(r14)
            b3.r r14 = (p015b3.C1750r) r14
            r14.mo6859a(r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1754s.mo6705M(java.lang.Void, b3.x, z1.q3):void");
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        ((C1750r) uVar).mo6864v();
        if (uVar == this.f5225x) {
            this.f5225x = null;
        }
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f5220s.mo6708i();
    }

    /* renamed from: l */
    public void mo6710l() {
    }
}
