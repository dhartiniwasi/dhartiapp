package p031d3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015b3.C1700e0;
import p015b3.C1743p0;
import p015b3.C1748q;
import p015b3.C1749q0;
import p015b3.C1752r0;
import p021c2.C1848g;
import p030d2.C4048w;
import p030d2.C4052y;
import p031d3.C4068j;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6229i3;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: d3.i */
/* compiled from: ChunkSampleStream */
public class C4065i<T extends C4068j> implements C1749q0, C1752r0, C5810h0.C5812b<C4060f>, C5810h0.C5816f {

    /* renamed from: A */
    private long f23173A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f23174B;

    /* renamed from: C */
    private int f23175C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C4055a f23176D;

    /* renamed from: E */
    boolean f23177E;

    /* renamed from: a */
    public final int f23178a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int[] f23179b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6272r1[] f23180c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean[] f23181d;

    /* renamed from: e */
    private final T f23182e;

    /* renamed from: f */
    private final C1752r0.C1753a<C4065i<T>> f23183f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1700e0.C1701a f23184g;

    /* renamed from: h */
    private final C5804g0 f23185h;

    /* renamed from: i */
    private final C5810h0 f23186i;

    /* renamed from: r */
    private final C4064h f23187r;

    /* renamed from: s */
    private final ArrayList<C4055a> f23188s;

    /* renamed from: t */
    private final List<C4055a> f23189t;

    /* renamed from: u */
    private final C1743p0 f23190u;

    /* renamed from: v */
    private final C1743p0[] f23191v;

    /* renamed from: w */
    private final C4057c f23192w;

    /* renamed from: x */
    private C4060f f23193x;

    /* renamed from: y */
    private C6272r1 f23194y;

    /* renamed from: z */
    private C4067b<T> f23195z;

    /* renamed from: d3.i$a */
    /* compiled from: ChunkSampleStream */
    public final class C4066a implements C1749q0 {

        /* renamed from: a */
        public final C4065i<T> f23196a;

        /* renamed from: b */
        private final C1743p0 f23197b;

        /* renamed from: c */
        private final int f23198c;

        /* renamed from: d */
        private boolean f23199d;

        public C4066a(C4065i<T> iVar, C1743p0 p0Var, int i) {
            this.f23196a = iVar;
            this.f23197b = p0Var;
            this.f23198c = i;
        }

        /* renamed from: a */
        private void m27973a() {
            if (!this.f23199d) {
                C4065i.this.f23184g.mo6720i(C4065i.this.f23179b[this.f23198c], C4065i.this.f23180c[this.f23198c], 0, (Object) null, C4065i.this.f23174B);
                this.f23199d = true;
            }
        }

        /* renamed from: b */
        public void mo6700b() {
        }

        /* renamed from: c */
        public void mo17295c() {
            C5917a.m34873f(C4065i.this.f23181d[this.f23198c]);
            C4065i.this.f23181d[this.f23198c] = false;
        }

        /* renamed from: f */
        public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
            if (C4065i.this.mo17285G()) {
                return -3;
            }
            if (C4065i.this.f23176D != null && C4065i.this.f23176D.mo17261i(this.f23198c + 1) <= this.f23197b.mo6822C()) {
                return -3;
            }
            m27973a();
            return this.f23197b.mo6832S(s1Var, gVar, i, C4065i.this.f23177E);
        }

        public boolean isReady() {
            return !C4065i.this.mo17285G() && this.f23197b.mo6828K(C4065i.this.f23177E);
        }

        /* renamed from: l */
        public int mo6703l(long j) {
            if (C4065i.this.mo17285G()) {
                return 0;
            }
            int E = this.f23197b.mo6823E(j, C4065i.this.f23177E);
            if (C4065i.this.f23176D != null) {
                E = Math.min(E, C4065i.this.f23176D.mo17261i(this.f23198c + 1) - this.f23197b.mo6822C());
            }
            this.f23197b.mo6846e0(E);
            if (E > 0) {
                m27973a();
            }
            return E;
        }
    }

    /* renamed from: d3.i$b */
    /* compiled from: ChunkSampleStream */
    public interface C4067b<T extends C4068j> {
        /* renamed from: a */
        void mo7751a(C4065i<T> iVar);
    }

    public C4065i(int i, int[] iArr, C6272r1[] r1VarArr, T t, C1752r0.C1753a<C4065i<T>> aVar, C5789b bVar, long j, C4052y yVar, C4048w.C4049a aVar2, C5804g0 g0Var, C1700e0.C1701a aVar3) {
        this.f23178a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f23179b = iArr;
        this.f23180c = r1VarArr == null ? new C6272r1[0] : r1VarArr;
        this.f23182e = t;
        this.f23183f = aVar;
        this.f23184g = aVar3;
        this.f23185h = g0Var;
        this.f23186i = new C5810h0("ChunkSampleStream");
        this.f23187r = new C4064h();
        ArrayList<C4055a> arrayList = new ArrayList<>();
        this.f23188s = arrayList;
        this.f23189t = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f23191v = new C1743p0[length];
        this.f23181d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C1743p0[] p0VarArr = new C1743p0[i3];
        C1743p0 k = C1743p0.m8191k(bVar, yVar, aVar2);
        this.f23190u = k;
        iArr2[0] = i;
        p0VarArr[0] = k;
        while (i2 < length) {
            C1743p0 l = C1743p0.m8192l(bVar);
            this.f23191v[i2] = l;
            int i4 = i2 + 1;
            p0VarArr[i4] = l;
            iArr2[i4] = this.f23179b[i2];
            i2 = i4;
        }
        this.f23192w = new C4057c(iArr2, p0VarArr);
        this.f23173A = j;
        this.f23174B = j;
    }

    /* renamed from: A */
    private void m27935A(int i) {
        C5917a.m34873f(!this.f23186i.mo20337j());
        int size = this.f23188s.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!m27938E(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            long j = m27937D().f23169h;
            C4055a B = m27936B(i);
            if (this.f23188s.isEmpty()) {
                this.f23173A = this.f23174B;
            }
            this.f23177E = false;
            this.f23184g.mo6716D(this.f23178a, B.f23168g, j);
        }
    }

    /* renamed from: B */
    private C4055a m27936B(int i) {
        C4055a aVar = this.f23188s.get(i);
        ArrayList<C4055a> arrayList = this.f23188s;
        C5953m0.m35093M0(arrayList, i, arrayList.size());
        this.f23175C = Math.max(this.f23175C, this.f23188s.size());
        int i2 = 0;
        this.f23190u.mo6854u(aVar.mo17261i(0));
        while (true) {
            C1743p0[] p0VarArr = this.f23191v;
            if (i2 >= p0VarArr.length) {
                return aVar;
            }
            C1743p0 p0Var = p0VarArr[i2];
            i2++;
            p0Var.mo6854u(aVar.mo17261i(i2));
        }
    }

    /* renamed from: D */
    private C4055a m27937D() {
        ArrayList<C4055a> arrayList = this.f23188s;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: E */
    private boolean m27938E(int i) {
        int C;
        C4055a aVar = this.f23188s.get(i);
        if (this.f23190u.mo6822C() > aVar.mo17261i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C1743p0[] p0VarArr = this.f23191v;
            if (i2 >= p0VarArr.length) {
                return false;
            }
            C = p0VarArr[i2].mo6822C();
            i2++;
        } while (C <= aVar.mo17261i(i2));
        return true;
    }

    /* renamed from: F */
    private boolean m27939F(C4060f fVar) {
        return fVar instanceof C4055a;
    }

    /* renamed from: H */
    private void m27940H() {
        int M = m27942M(this.f23190u.mo6822C(), this.f23175C - 1);
        while (true) {
            int i = this.f23175C;
            if (i <= M) {
                this.f23175C = i + 1;
                m27941I(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: I */
    private void m27941I(int i) {
        C4055a aVar = this.f23188s.get(i);
        C6272r1 r1Var = aVar.f23165d;
        if (!r1Var.equals(this.f23194y)) {
            this.f23184g.mo6720i(this.f23178a, r1Var, aVar.f23166e, aVar.f23167f, aVar.f23168g);
        }
        this.f23194y = r1Var;
    }

    /* renamed from: M */
    private int m27942M(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f23188s.size()) {
                return this.f23188s.size() - 1;
            }
        } while (this.f23188s.get(i2).mo17261i(0) <= i);
        return i2 - 1;
    }

    /* renamed from: P */
    private void m27943P() {
        this.f23190u.mo6834V();
        for (C1743p0 V : this.f23191v) {
            V.mo6834V();
        }
    }

    /* renamed from: z */
    private void m27950z(int i) {
        int min = Math.min(m27942M(i, 0), this.f23175C);
        if (min > 0) {
            C5953m0.m35093M0(this.f23188s, 0, min);
            this.f23175C -= min;
        }
    }

    /* renamed from: C */
    public T mo17284C() {
        return this.f23182e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo17285G() {
        return this.f23173A != -9223372036854775807L;
    }

    /* renamed from: J */
    public void mo6784q(C4060f fVar, long j, long j2, boolean z) {
        C4060f fVar2 = fVar;
        this.f23193x = null;
        this.f23176D = null;
        C1748q qVar = new C1748q(fVar2.f23162a, fVar2.f23163b, fVar.mo17281f(), fVar.mo17280e(), j, j2, fVar.mo17278a());
        this.f23185h.mo20330b(fVar2.f23162a);
        this.f23184g.mo6723r(qVar, fVar2.f23164c, this.f23178a, fVar2.f23165d, fVar2.f23166e, fVar2.f23167f, fVar2.f23168g, fVar2.f23169h);
        if (!z) {
            if (mo17285G()) {
                m27943P();
            } else if (m27939F(fVar)) {
                m27936B(this.f23188s.size() - 1);
                if (this.f23188s.isEmpty()) {
                    this.f23173A = this.f23174B;
                }
            }
            this.f23183f.mo6684f(this);
        }
    }

    /* renamed from: K */
    public void mo6780j(C4060f fVar, long j, long j2) {
        C4060f fVar2 = fVar;
        this.f23193x = null;
        this.f23182e.mo7759k(fVar2);
        C1748q qVar = new C1748q(fVar2.f23162a, fVar2.f23163b, fVar.mo17281f(), fVar.mo17280e(), j, j2, fVar.mo17278a());
        this.f23185h.mo20330b(fVar2.f23162a);
        this.f23184g.mo6726u(qVar, fVar2.f23164c, this.f23178a, fVar2.f23165d, fVar2.f23166e, fVar2.f23167f, fVar2.f23168g, fVar2.f23169h);
        this.f23183f.mo6684f(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f1  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p155v3.C5810h0.C5813c mo6783o(p031d3.C4060f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            long r12 = r31.mo17278a()
            boolean r14 = r30.m27939F(r31)
            java.util.ArrayList<d3.a> r2 = r0.f23188s
            int r2 = r2.size()
            r15 = 1
            int r10 = r2 + -1
            r11 = 0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0027
            if (r14 == 0) goto L_0x0027
            boolean r2 = r0.m27938E(r10)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r8 = 0
            goto L_0x0028
        L_0x0027:
            r8 = 1
        L_0x0028:
            b3.q r9 = new b3.q
            long r3 = r1.f23162a
            v3.p r5 = r1.f23163b
            android.net.Uri r6 = r31.mo17281f()
            java.util.Map r7 = r31.mo17280e()
            r2 = r9
            r15 = r8
            r17 = r14
            r14 = r9
            r8 = r32
            r29 = r10
            r10 = r34
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            b3.t r2 = new b3.t
            int r3 = r1.f23164c
            int r4 = r0.f23178a
            z1.r1 r5 = r1.f23165d
            int r6 = r1.f23166e
            java.lang.Object r7 = r1.f23167f
            long r8 = r1.f23168g
            long r24 = p161w3.C5953m0.m35117Y0(r8)
            long r8 = r1.f23169h
            long r26 = p161w3.C5953m0.m35117Y0(r8)
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            v3.g0$c r3 = new v3.g0$c
            r4 = r36
            r5 = r37
            r3.<init>(r14, r2, r4, r5)
            T r2 = r0.f23182e
            v3.g0 r5 = r0.f23185h
            boolean r2 = r2.mo7755g(r1, r15, r3, r5)
            if (r2 == 0) goto L_0x00a6
            if (r15 == 0) goto L_0x009f
            v3.h0$c r2 = p155v3.C5810h0.f28823f
            if (r17 == 0) goto L_0x00a7
            r6 = r29
            d3.a r6 = r0.m27936B(r6)
            if (r6 != r1) goto L_0x008e
            r11 = 1
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            p161w3.C5917a.m34873f(r11)
            java.util.ArrayList<d3.a> r6 = r0.f23188s
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a7
            long r6 = r0.f23174B
            r0.f23173A = r6
            goto L_0x00a7
        L_0x009f:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r6 = "Ignoring attempt to cancel non-cancelable load."
            p161w3.C5961r.m35215i(r2, r6)
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 != 0) goto L_0x00c0
            v3.g0 r2 = r0.f23185h
            long r2 = r2.mo20331c(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00be
            r6 = 0
            v3.h0$c r2 = p155v3.C5810h0.m34569h(r6, r2)
            goto L_0x00c0
        L_0x00be:
            v3.h0$c r2 = p155v3.C5810h0.f28824g
        L_0x00c0:
            boolean r3 = r2.mo20342c()
            r6 = 1
            r3 = r3 ^ r6
            b3.e0$a r6 = r0.f23184g
            int r7 = r1.f23164c
            int r8 = r0.f23178a
            z1.r1 r9 = r1.f23165d
            int r10 = r1.f23166e
            java.lang.Object r11 = r1.f23167f
            long r12 = r1.f23168g
            long r4 = r1.f23169h
            r16 = r6
            r17 = r14
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r25 = r4
            r27 = r36
            r28 = r3
            r16.mo6728w(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            if (r3 == 0) goto L_0x0100
            r3 = 0
            r0.f23193x = r3
            v3.g0 r3 = r0.f23185h
            long r4 = r1.f23162a
            r3.mo20330b(r4)
            b3.r0$a<d3.i<T>> r1 = r0.f23183f
            r1.mo6684f(r0)
        L_0x0100:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p031d3.C4065i.mo6783o(d3.f, long, long, java.io.IOException, int):v3.h0$c");
    }

    /* renamed from: N */
    public void mo17289N() {
        mo17290O((C4067b) null);
    }

    /* renamed from: O */
    public void mo17290O(C4067b<T> bVar) {
        this.f23195z = bVar;
        this.f23190u.mo6831R();
        for (C1743p0 R : this.f23191v) {
            R.mo6831R();
        }
        this.f23186i.mo20340m(this);
    }

    /* renamed from: Q */
    public void mo17291Q(long j) {
        boolean z;
        this.f23174B = j;
        if (mo17285G()) {
            this.f23173A = j;
            return;
        }
        C4055a aVar = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f23188s.size()) {
                break;
            }
            C4055a aVar2 = this.f23188s.get(i2);
            int i3 = (aVar2.f23168g > j ? 1 : (aVar2.f23168g == j ? 0 : -1));
            if (i3 == 0 && aVar2.f23135k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i3 > 0) {
                break;
            } else {
                i2++;
            }
        }
        if (aVar != null) {
            z = this.f23190u.mo6836Y(aVar.mo17261i(0));
        } else {
            z = this.f23190u.mo6837Z(j, j < mo6682d());
        }
        if (z) {
            this.f23175C = m27942M(this.f23190u.mo6822C(), 0);
            C1743p0[] p0VarArr = this.f23191v;
            int length = p0VarArr.length;
            while (i < length) {
                p0VarArr[i].mo6837Z(j, true);
                i++;
            }
            return;
        }
        this.f23173A = j;
        this.f23177E = false;
        this.f23188s.clear();
        this.f23175C = 0;
        if (this.f23186i.mo20337j()) {
            this.f23190u.mo6852r();
            C1743p0[] p0VarArr2 = this.f23191v;
            int length2 = p0VarArr2.length;
            while (i < length2) {
                p0VarArr2[i].mo6852r();
                i++;
            }
            this.f23186i.mo20334f();
            return;
        }
        this.f23186i.mo20335g();
        m27943P();
    }

    /* renamed from: R */
    public C4065i<T>.C0000a mo17292R(long j, int i) {
        for (int i2 = 0; i2 < this.f23191v.length; i2++) {
            if (this.f23179b[i2] == i) {
                C5917a.m34873f(!this.f23181d[i2]);
                this.f23181d[i2] = true;
                this.f23191v[i2].mo6837Z(j, true);
                return new C4066a(this, this.f23191v[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void mo6772a() {
        this.f23190u.mo6833T();
        for (C1743p0 T : this.f23191v) {
            T.mo6833T();
        }
        this.f23182e.mo7752a();
        C4067b<T> bVar = this.f23195z;
        if (bVar != null) {
            bVar.mo7751a(this);
        }
    }

    /* renamed from: b */
    public void mo6700b() throws IOException {
        this.f23186i.mo7740b();
        this.f23190u.mo6829N();
        if (!this.f23186i.mo20337j()) {
            this.f23182e.mo7753b();
        }
    }

    /* renamed from: c */
    public long mo17293c(long j, C6229i3 i3Var) {
        return this.f23182e.mo7754c(j, i3Var);
    }

    /* renamed from: d */
    public long mo6682d() {
        if (mo17285G()) {
            return this.f23173A;
        }
        if (this.f23177E) {
            return Long.MIN_VALUE;
        }
        return m27937D().f23169h;
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        long j2;
        List<C4055a> list;
        if (this.f23177E || this.f23186i.mo20337j() || this.f23186i.mo20336i()) {
            return false;
        }
        boolean G = mo17285G();
        if (G) {
            list = Collections.emptyList();
            j2 = this.f23173A;
        } else {
            list = this.f23189t;
            j2 = m27937D().f23169h;
        }
        this.f23182e.mo7756h(j, j2, list, this.f23187r);
        C4064h hVar = this.f23187r;
        boolean z = hVar.f23172b;
        C4060f fVar = hVar.f23171a;
        hVar.mo17283a();
        if (z) {
            this.f23173A = -9223372036854775807L;
            this.f23177E = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f23193x = fVar;
            if (m27939F(fVar)) {
                C4055a aVar = (C4055a) fVar;
                if (G) {
                    long j3 = aVar.f23168g;
                    long j4 = this.f23173A;
                    if (j3 != j4) {
                        this.f23190u.mo6841b0(j4);
                        for (C1743p0 b0 : this.f23191v) {
                            b0.mo6841b0(this.f23173A);
                        }
                    }
                    this.f23173A = -9223372036854775807L;
                }
                aVar.mo17263k(this.f23192w);
                this.f23188s.add(aVar);
            } else if (fVar instanceof C4071m) {
                ((C4071m) fVar).mo17301g(this.f23192w);
            }
            this.f23184g.mo6713A(new C1748q(fVar.f23162a, fVar.f23163b, this.f23186i.mo20341n(fVar, this, this.f23185h.mo20332d(fVar.f23164c))), fVar.f23164c, this.f23178a, fVar.f23165d, fVar.f23166e, fVar.f23167f, fVar.f23168g, fVar.f23169h);
            return true;
        }
    }

    /* renamed from: f */
    public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
        if (mo17285G()) {
            return -3;
        }
        C4055a aVar = this.f23176D;
        if (aVar != null && aVar.mo17261i(0) <= this.f23190u.mo6822C()) {
            return -3;
        }
        m27940H();
        return this.f23190u.mo6832S(s1Var, gVar, i, this.f23177E);
    }

    /* renamed from: g */
    public long mo6685g() {
        if (this.f23177E) {
            return Long.MIN_VALUE;
        }
        if (mo17285G()) {
            return this.f23173A;
        }
        long j = this.f23174B;
        C4055a D = m27937D();
        if (!D.mo17297h()) {
            if (this.f23188s.size() > 1) {
                ArrayList<C4055a> arrayList = this.f23188s;
                D = arrayList.get(arrayList.size() - 2);
            } else {
                D = null;
            }
        }
        if (D != null) {
            j = Math.max(j, D.f23169h);
        }
        return Math.max(j, this.f23190u.mo6858z());
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        if (!this.f23186i.mo20336i() && !mo17285G()) {
            if (this.f23186i.mo20337j()) {
                C4060f fVar = (C4060f) C5917a.m34872e(this.f23193x);
                if ((!m27939F(fVar) || !m27938E(this.f23188s.size() - 1)) && this.f23182e.mo7757i(j, fVar, this.f23189t)) {
                    this.f23186i.mo20334f();
                    if (m27939F(fVar)) {
                        this.f23176D = (C4055a) fVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int j2 = this.f23182e.mo7758j(j, this.f23189t);
            if (j2 < this.f23188s.size()) {
                m27935A(j2);
            }
        }
    }

    public boolean isLoading() {
        return this.f23186i.mo20337j();
    }

    public boolean isReady() {
        return !mo17285G() && this.f23190u.mo6828K(this.f23177E);
    }

    /* renamed from: l */
    public int mo6703l(long j) {
        if (mo17285G()) {
            return 0;
        }
        int E = this.f23190u.mo6823E(j, this.f23177E);
        C4055a aVar = this.f23176D;
        if (aVar != null) {
            E = Math.min(E, aVar.mo17261i(0) - this.f23190u.mo6822C());
        }
        this.f23190u.mo6846e0(E);
        m27940H();
        return E;
    }

    /* renamed from: t */
    public void mo17294t(long j, boolean z) {
        if (!mo17285G()) {
            int x = this.f23190u.mo6856x();
            this.f23190u.mo6851q(j, z, true);
            int x2 = this.f23190u.mo6856x();
            if (x2 > x) {
                long y = this.f23190u.mo6857y();
                int i = 0;
                while (true) {
                    C1743p0[] p0VarArr = this.f23191v;
                    if (i >= p0VarArr.length) {
                        break;
                    }
                    p0VarArr[i].mo6851q(y, z, this.f23181d[i]);
                    i++;
                }
            }
            m27950z(x2);
        }
    }
}
