package p015b3;

import java.io.IOException;
import p015b3.C1697e;
import p015b3.C1765u;
import p021c2.C1848g;
import p149u3.C5735s;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5967v;
import p177z1.C6229i3;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: b3.d */
/* compiled from: ClippingMediaPeriod */
public final class C1694d implements C1765u, C1765u.C1766a {

    /* renamed from: a */
    public final C1765u f4965a;

    /* renamed from: b */
    private C1765u.C1766a f4966b;

    /* renamed from: c */
    private C1695a[] f4967c = new C1695a[0];

    /* renamed from: d */
    private long f4968d;

    /* renamed from: e */
    long f4969e;

    /* renamed from: f */
    long f4970f;

    /* renamed from: g */
    private C1697e.C1699b f4971g;

    /* renamed from: b3.d$a */
    /* compiled from: ClippingMediaPeriod */
    private final class C1695a implements C1749q0 {

        /* renamed from: a */
        public final C1749q0 f4972a;

        /* renamed from: b */
        private boolean f4973b;

        public C1695a(C1749q0 q0Var) {
            this.f4972a = q0Var;
        }

        /* renamed from: a */
        public void mo6699a() {
            this.f4973b = false;
        }

        /* renamed from: b */
        public void mo6700b() throws IOException {
            this.f4972a.mo6700b();
        }

        /* renamed from: f */
        public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
            if (C1694d.this.mo6689j()) {
                return -3;
            }
            if (this.f4973b) {
                gVar.mo7037v(4);
                return -4;
            }
            int f = this.f4972a.mo6701f(s1Var, gVar, i);
            if (f == -5) {
                C6272r1 r1Var = (C6272r1) C5917a.m34872e(s1Var.f30328b);
                int i2 = r1Var.f30227J;
                if (!(i2 == 0 && r1Var.f30228K == 0)) {
                    C1694d dVar = C1694d.this;
                    int i3 = 0;
                    if (dVar.f4969e != 0) {
                        i2 = 0;
                    }
                    if (dVar.f4970f == Long.MIN_VALUE) {
                        i3 = r1Var.f30228K;
                    }
                    s1Var.f30328b = r1Var.mo21483b().mo21500N(i2).mo21501O(i3).mo21491E();
                }
                return -5;
            }
            C1694d dVar2 = C1694d.this;
            long j = dVar2.f4970f;
            if (j == Long.MIN_VALUE || ((f != -4 || gVar.f5432e < j) && (f != -3 || dVar2.mo6685g() != Long.MIN_VALUE || gVar.f5431d))) {
                return f;
            }
            gVar.mo7029n();
            gVar.mo7037v(4);
            this.f4973b = true;
            return -4;
        }

        public boolean isReady() {
            return !C1694d.this.mo6689j() && this.f4972a.isReady();
        }

        /* renamed from: l */
        public int mo6703l(long j) {
            if (C1694d.this.mo6689j()) {
                return -3;
            }
            return this.f4972a.mo6703l(j);
        }
    }

    public C1694d(C1765u uVar, boolean z, long j, long j2) {
        this.f4965a = uVar;
        this.f4968d = z ? j : -9223372036854775807L;
        this.f4969e = j;
        this.f4970f = j2;
    }

    /* renamed from: a */
    private C6229i3 m7863a(long j, C6229i3 i3Var) {
        long r = C5953m0.m35154r(i3Var.f29983a, 0, j - this.f4969e);
        long j2 = i3Var.f29984b;
        long j3 = this.f4970f;
        long r2 = C5953m0.m35154r(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (r == i3Var.f29983a && r2 == i3Var.f29984b) {
            return i3Var;
        }
        return new C6229i3(r, r2);
    }

    /* renamed from: q */
    private static boolean m7864q(long j, C5735s[] sVarArr) {
        if (j != 0) {
            for (C5735s sVar : sVarArr) {
                if (sVar != null) {
                    C6272r1 p = sVar.mo20155p();
                    if (!C5967v.m35237a(p.f30243t, p.f30240i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo6680b(C1765u uVar) {
        if (this.f4971g == null) {
            ((C1765u.C1766a) C5917a.m34872e(this.f4966b)).mo6680b(this);
        }
    }

    /* renamed from: c */
    public long mo6681c(long j, C6229i3 i3Var) {
        long j2 = this.f4969e;
        if (j == j2) {
            return j2;
        }
        return this.f4965a.mo6681c(j, m7863a(j, i3Var));
    }

    /* renamed from: d */
    public long mo6682d() {
        long d = this.f4965a.mo6682d();
        if (d != Long.MIN_VALUE) {
            long j = this.f4970f;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        return this.f4965a.mo6683e(j);
    }

    /* renamed from: g */
    public long mo6685g() {
        long g = this.f4965a.mo6685g();
        if (g != Long.MIN_VALUE) {
            long j = this.f4970f;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        this.f4965a.mo6686h(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo6687i(p149u3.C5735s[] r13, boolean[] r14, p015b3.C1749q0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            b3.d$a[] r2 = new p015b3.C1694d.C1695a[r2]
            r0.f4967c = r2
            int r2 = r1.length
            b3.q0[] r9 = new p015b3.C1749q0[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            b3.d$a[] r3 = r0.f4967c
            r4 = r1[r2]
            b3.d$a r4 = (p015b3.C1694d.C1695a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            b3.q0 r11 = r3.f4972a
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            b3.u r2 = r0.f4965a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo6687i(r3, r4, r5, r6, r7)
            boolean r4 = r12.mo6689j()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f4969e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = m7864q(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f4968d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f4969e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f4970f
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            p161w3.C5917a.m34873f(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0097
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            b3.d$a[] r4 = r0.f4967c
            r4[r10] = r11
            goto L_0x008e
        L_0x0077:
            b3.d$a[] r4 = r0.f4967c
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r5 = r4[r10]
            b3.q0 r5 = r5.f4972a
            r6 = r9[r10]
            if (r5 == r6) goto L_0x008e
        L_0x0085:
            b3.d$a r5 = new b3.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x008e:
            b3.d$a[] r4 = r0.f4967c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1694d.mo6687i(u3.s[], boolean[], b3.q0[], boolean[], long):long");
    }

    public boolean isLoading() {
        return this.f4965a.isLoading();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo6689j() {
        return this.f4968d != -9223372036854775807L;
    }

    /* renamed from: k */
    public void mo6690k() throws IOException {
        C1697e.C1699b bVar = this.f4971g;
        if (bVar == null) {
            this.f4965a.mo6690k();
            return;
        }
        throw bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo6691m(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f4968d = r0
            b3.d$a[] r0 = r6.f4967c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo6699a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            b3.u r0 = r6.f4965a
            long r0 = r0.mo6691m(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f4969e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f4970f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            p161w3.C5917a.m34873f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1694d.mo6691m(long):long");
    }

    /* renamed from: n */
    public void mo6684f(C1765u uVar) {
        ((C1765u.C1766a) C5917a.m34872e(this.f4966b)).mo6684f(this);
    }

    /* renamed from: o */
    public void mo6693o(C1697e.C1699b bVar) {
        this.f4971g = bVar;
    }

    /* renamed from: p */
    public long mo6694p() {
        if (mo6689j()) {
            long j = this.f4968d;
            this.f4968d = -9223372036854775807L;
            long p = mo6694p();
            return p != -9223372036854775807L ? p : j;
        }
        long p2 = this.f4965a.mo6694p();
        if (p2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C5917a.m34873f(p2 >= this.f4969e);
        long j2 = this.f4970f;
        if (j2 != Long.MIN_VALUE && p2 > j2) {
            z = false;
        }
        C5917a.m34873f(z);
        return p2;
    }

    /* renamed from: r */
    public void mo6695r(C1765u.C1766a aVar, long j) {
        this.f4966b = aVar;
        this.f4965a.mo6695r(this, j);
    }

    /* renamed from: s */
    public C1780z0 mo6696s() {
        return this.f4965a.mo6696s();
    }

    /* renamed from: t */
    public void mo6697t(long j, boolean z) {
        this.f4965a.mo6697t(j, z);
    }

    /* renamed from: u */
    public void mo6698u(long j, long j2) {
        this.f4969e = j;
        this.f4970f = j2;
    }
}
