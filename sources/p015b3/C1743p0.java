package p015b3;

import com.facebook.ads.AdError;
import java.io.IOException;
import p021c2.C1848g;
import p030d2.C4035m;
import p030d2.C4042o;
import p030d2.C4048w;
import p030d2.C4052y;
import p037e2.C4198d0;
import p037e2.C4200e0;
import p155v3.C5789b;
import p155v3.C5819i;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5967v;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: b3.p0 */
/* compiled from: SampleQueue */
public class C1743p0 implements C4200e0 {

    /* renamed from: A */
    private C6272r1 f5164A;

    /* renamed from: B */
    private C6272r1 f5165B;

    /* renamed from: C */
    private int f5166C;

    /* renamed from: D */
    private boolean f5167D;

    /* renamed from: E */
    private boolean f5168E;

    /* renamed from: F */
    private long f5169F;

    /* renamed from: G */
    private boolean f5170G;

    /* renamed from: a */
    private final C1737n0 f5171a;

    /* renamed from: b */
    private final C1745b f5172b = new C1745b();

    /* renamed from: c */
    private final C1769v0<C1746c> f5173c = new C1769v0<>(C1740o0.f5158a);

    /* renamed from: d */
    private final C4052y f5174d;

    /* renamed from: e */
    private final C4048w.C4049a f5175e;

    /* renamed from: f */
    private C1747d f5176f;

    /* renamed from: g */
    private C6272r1 f5177g;

    /* renamed from: h */
    private C4042o f5178h;

    /* renamed from: i */
    private int f5179i = AdError.NETWORK_ERROR_CODE;

    /* renamed from: j */
    private int[] f5180j = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: k */
    private long[] f5181k = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: l */
    private int[] f5182l = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: m */
    private int[] f5183m = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: n */
    private long[] f5184n = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: o */
    private C4200e0.C4201a[] f5185o = new C4200e0.C4201a[AdError.NETWORK_ERROR_CODE];

    /* renamed from: p */
    private int f5186p;

    /* renamed from: q */
    private int f5187q;

    /* renamed from: r */
    private int f5188r;

    /* renamed from: s */
    private int f5189s;

    /* renamed from: t */
    private long f5190t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f5191u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f5192v = Long.MIN_VALUE;

    /* renamed from: w */
    private boolean f5193w;

    /* renamed from: x */
    private boolean f5194x = true;

    /* renamed from: y */
    private boolean f5195y = true;

    /* renamed from: z */
    private boolean f5196z;

    /* renamed from: b3.p0$b */
    /* compiled from: SampleQueue */
    static final class C1745b {

        /* renamed from: a */
        public int f5197a;

        /* renamed from: b */
        public long f5198b;

        /* renamed from: c */
        public C4200e0.C4201a f5199c;

        C1745b() {
        }
    }

    /* renamed from: b3.p0$c */
    /* compiled from: SampleQueue */
    private static final class C1746c {

        /* renamed from: a */
        public final C6272r1 f5200a;

        /* renamed from: b */
        public final C4052y.C4054b f5201b;

        private C1746c(C6272r1 r1Var, C4052y.C4054b bVar) {
            this.f5200a = r1Var;
            this.f5201b = bVar;
        }
    }

    /* renamed from: b3.p0$d */
    /* compiled from: SampleQueue */
    public interface C1747d {
        /* renamed from: b */
        void mo6774b(C6272r1 r1Var);
    }

    protected C1743p0(C5789b bVar, C4052y yVar, C4048w.C4049a aVar) {
        this.f5174d = yVar;
        this.f5175e = aVar;
        this.f5171a = new C1737n0(bVar);
    }

    /* renamed from: B */
    private long m8177B(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int D = m8178D(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f5184n[D]);
            if ((this.f5183m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f5179i - 1;
            }
        }
        return j;
    }

    /* renamed from: D */
    private int m8178D(int i) {
        int i2 = this.f5188r + i;
        int i3 = this.f5179i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: H */
    private boolean m8179H() {
        return this.f5189s != this.f5186p;
    }

    /* renamed from: M */
    private boolean m8181M(int i) {
        C4042o oVar = this.f5178h;
        return oVar == null || oVar.getState() == 4 || ((this.f5183m[i] & 1073741824) == 0 && this.f5178h.mo17180d());
    }

    /* renamed from: O */
    private void m8182O(C6272r1 r1Var, C6279s1 s1Var) {
        C4035m mVar;
        C6272r1 r1Var2 = this.f5177g;
        boolean z = r1Var2 == null;
        if (z) {
            mVar = null;
        } else {
            mVar = r1Var2.f30246w;
        }
        this.f5177g = r1Var;
        C4035m mVar2 = r1Var.f30246w;
        C4052y yVar = this.f5174d;
        s1Var.f30328b = yVar != null ? r1Var.mo21484c(yVar.mo17212e(r1Var)) : r1Var;
        s1Var.f30327a = this.f5178h;
        if (this.f5174d != null) {
            if (z || !C5953m0.m35124c(mVar, mVar2)) {
                C4042o oVar = this.f5178h;
                C4042o b = this.f5174d.mo17209b(this.f5175e, r1Var);
                this.f5178h = b;
                s1Var.f30327a = b;
                if (oVar != null) {
                    oVar.mo17177a(this.f5175e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return -3;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m8183P(p177z1.C6279s1 r5, p021c2.C1848g r6, boolean r7, boolean r8, p015b3.C1743p0.C1745b r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f5431d = r0     // Catch:{ all -> 0x0088 }
            boolean r0 = r4.m8179H()     // Catch:{ all -> 0x0088 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0031
            if (r8 != 0) goto L_0x002b
            boolean r8 = r4.f5193w     // Catch:{ all -> 0x0088 }
            if (r8 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            z1.r1 r6 = r4.f5165B     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x0029
            if (r7 != 0) goto L_0x001e
            z1.r1 r7 = r4.f5177g     // Catch:{ all -> 0x0088 }
            if (r6 == r7) goto L_0x0029
        L_0x001e:
            java.lang.Object r6 = p161w3.C5917a.m34872e(r6)     // Catch:{ all -> 0x0088 }
            z1.r1 r6 = (p177z1.C6272r1) r6     // Catch:{ all -> 0x0088 }
            r4.m8182O(r6, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r5 = 4
            r6.mo7037v(r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0031:
            b3.v0<b3.p0$c> r8 = r4.f5173c     // Catch:{ all -> 0x0088 }
            int r0 = r4.mo6822C()     // Catch:{ all -> 0x0088 }
            java.lang.Object r8 = r8.mo6893e(r0)     // Catch:{ all -> 0x0088 }
            b3.p0$c r8 = (p015b3.C1743p0.C1746c) r8     // Catch:{ all -> 0x0088 }
            z1.r1 r8 = r8.f5200a     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0083
            z1.r1 r7 = r4.f5177g     // Catch:{ all -> 0x0088 }
            if (r8 == r7) goto L_0x0046
            goto L_0x0083
        L_0x0046:
            int r5 = r4.f5189s     // Catch:{ all -> 0x0088 }
            int r5 = r4.m8178D(r5)     // Catch:{ all -> 0x0088 }
            boolean r7 = r4.m8181M(r5)     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0057
            r5 = 1
            r6.f5431d = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r2
        L_0x0057:
            int[] r7 = r4.f5183m     // Catch:{ all -> 0x0088 }
            r7 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.mo7037v(r7)     // Catch:{ all -> 0x0088 }
            long[] r7 = r4.f5184n     // Catch:{ all -> 0x0088 }
            r0 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.f5432e = r0     // Catch:{ all -> 0x0088 }
            long r7 = r4.f5190t     // Catch:{ all -> 0x0088 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x006f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.mo7028k(r7)     // Catch:{ all -> 0x0088 }
        L_0x006f:
            int[] r6 = r4.f5182l     // Catch:{ all -> 0x0088 }
            r6 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f5197a = r6     // Catch:{ all -> 0x0088 }
            long[] r6 = r4.f5181k     // Catch:{ all -> 0x0088 }
            r7 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f5198b = r7     // Catch:{ all -> 0x0088 }
            e2.e0$a[] r6 = r4.f5185o     // Catch:{ all -> 0x0088 }
            r5 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f5199c = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0083:
            r4.m8182O(r8, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0088:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.m8183P(z1.s1, c2.g, boolean, boolean, b3.p0$b):int");
    }

    /* renamed from: U */
    private void m8184U() {
        C4042o oVar = this.f5178h;
        if (oVar != null) {
            oVar.mo17177a(this.f5175e);
            this.f5178h = null;
            this.f5177g = null;
        }
    }

    /* renamed from: X */
    private synchronized void m8185X() {
        this.f5189s = 0;
        this.f5171a.mo6799o();
    }

    /* renamed from: c0 */
    private synchronized boolean m8186c0(C6272r1 r1Var) {
        this.f5195y = false;
        if (C5953m0.m35124c(r1Var, this.f5165B)) {
            return false;
        }
        if (this.f5173c.mo6895g() || !this.f5173c.mo6894f().f5200a.equals(r1Var)) {
            this.f5165B = r1Var;
        } else {
            this.f5165B = this.f5173c.mo6894f().f5200a;
        }
        C6272r1 r1Var2 = this.f5165B;
        this.f5167D = C5967v.m35237a(r1Var2.f30243t, r1Var2.f30240i);
        this.f5168E = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m8188h(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f5186p     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f5191u     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.mo6821A()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.m8190j(r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f5187q     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.m8196t(r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.m8188h(long):boolean");
    }

    /* renamed from: i */
    private synchronized void m8189i(long j, int i, long j2, int i2, C4200e0.C4201a aVar) {
        C4052y.C4054b bVar;
        int i3 = this.f5186p;
        if (i3 > 0) {
            int D = m8178D(i3 - 1);
            C5917a.m34868a(this.f5181k[D] + ((long) this.f5182l[D]) <= j2);
        }
        this.f5193w = (536870912 & i) != 0;
        this.f5192v = Math.max(this.f5192v, j);
        int D2 = m8178D(this.f5186p);
        this.f5184n[D2] = j;
        this.f5181k[D2] = j2;
        this.f5182l[D2] = i2;
        this.f5183m[D2] = i;
        this.f5185o[D2] = aVar;
        this.f5180j[D2] = this.f5166C;
        if (this.f5173c.mo6895g() || !this.f5173c.mo6894f().f5200a.equals(this.f5165B)) {
            C4052y yVar = this.f5174d;
            if (yVar != null) {
                bVar = yVar.mo17211d(this.f5175e, this.f5165B);
            } else {
                bVar = C4052y.C4054b.f23134a;
            }
            this.f5173c.mo6889a(mo6825G(), new C1746c((C6272r1) C5917a.m34872e(this.f5165B), bVar));
        }
        int i4 = this.f5186p + 1;
        this.f5186p = i4;
        int i5 = this.f5179i;
        if (i4 == i5) {
            int i6 = i5 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            C4200e0.C4201a[] aVarArr = new C4200e0.C4201a[i6];
            int i7 = this.f5188r;
            int i8 = i5 - i7;
            System.arraycopy(this.f5181k, i7, jArr, 0, i8);
            System.arraycopy(this.f5184n, this.f5188r, jArr2, 0, i8);
            System.arraycopy(this.f5183m, this.f5188r, iArr2, 0, i8);
            System.arraycopy(this.f5182l, this.f5188r, iArr3, 0, i8);
            System.arraycopy(this.f5185o, this.f5188r, aVarArr, 0, i8);
            System.arraycopy(this.f5180j, this.f5188r, iArr, 0, i8);
            int i9 = this.f5188r;
            System.arraycopy(this.f5181k, 0, jArr, i8, i9);
            System.arraycopy(this.f5184n, 0, jArr2, i8, i9);
            System.arraycopy(this.f5183m, 0, iArr2, i8, i9);
            System.arraycopy(this.f5182l, 0, iArr3, i8, i9);
            System.arraycopy(this.f5185o, 0, aVarArr, i8, i9);
            System.arraycopy(this.f5180j, 0, iArr, i8, i9);
            this.f5181k = jArr;
            this.f5184n = jArr2;
            this.f5183m = iArr2;
            this.f5182l = iArr3;
            this.f5185o = aVarArr;
            this.f5180j = iArr;
            this.f5188r = 0;
            this.f5179i = i6;
        }
    }

    /* renamed from: j */
    private int m8190j(long j) {
        int i = this.f5186p;
        int D = m8178D(i - 1);
        while (i > this.f5189s && this.f5184n[D] >= j) {
            i--;
            D--;
            if (D == -1) {
                D = this.f5179i - 1;
            }
        }
        return i;
    }

    /* renamed from: k */
    public static C1743p0 m8191k(C5789b bVar, C4052y yVar, C4048w.C4049a aVar) {
        return new C1743p0(bVar, (C4052y) C5917a.m34872e(yVar), (C4048w.C4049a) C5917a.m34872e(aVar));
    }

    /* renamed from: l */
    public static C1743p0 m8192l(C5789b bVar) {
        return new C1743p0(bVar, (C4052y) null, (C4048w.C4049a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m8193m(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f5186p     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f5184n     // Catch:{ all -> 0x002f }
            int r5 = r10.f5188r     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f5189s     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.m8197v(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.m8195p(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.m8193m(long, boolean, boolean):long");
    }

    /* renamed from: n */
    private synchronized long m8194n() {
        int i = this.f5186p;
        if (i == 0) {
            return -1;
        }
        return m8195p(i);
    }

    /* renamed from: p */
    private long m8195p(int i) {
        this.f5191u = Math.max(this.f5191u, m8177B(i));
        this.f5186p -= i;
        int i2 = this.f5187q + i;
        this.f5187q = i2;
        int i3 = this.f5188r + i;
        this.f5188r = i3;
        int i4 = this.f5179i;
        if (i3 >= i4) {
            this.f5188r = i3 - i4;
        }
        int i5 = this.f5189s - i;
        this.f5189s = i5;
        if (i5 < 0) {
            this.f5189s = 0;
        }
        this.f5173c.mo6892d(i2);
        if (this.f5186p != 0) {
            return this.f5181k[this.f5188r];
        }
        int i6 = this.f5188r;
        if (i6 == 0) {
            i6 = this.f5179i;
        }
        int i7 = i6 - 1;
        return this.f5181k[i7] + ((long) this.f5182l[i7]);
    }

    /* renamed from: t */
    private long m8196t(int i) {
        int G = mo6825G() - i;
        boolean z = false;
        C5917a.m34868a(G >= 0 && G <= this.f5186p - this.f5189s);
        int i2 = this.f5186p - G;
        this.f5186p = i2;
        this.f5192v = Math.max(this.f5191u, m8177B(i2));
        if (G == 0 && this.f5193w) {
            z = true;
        }
        this.f5193w = z;
        this.f5173c.mo6891c(i);
        int i3 = this.f5186p;
        if (i3 == 0) {
            return 0;
        }
        int D = m8178D(i3 - 1);
        return this.f5181k[D] + ((long) this.f5182l[D]);
    }

    /* renamed from: v */
    private int m8197v(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr = this.f5184n;
            if (jArr[i] > j) {
                return i3;
            }
            if (!z || (this.f5183m[i] & 1) != 0) {
                if (jArr[i] == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f5179i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: A */
    public final synchronized long mo6821A() {
        return Math.max(this.f5191u, m8177B(this.f5189s));
    }

    /* renamed from: C */
    public final int mo6822C() {
        return this.f5187q + this.f5189s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo6823E(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f5189s     // Catch:{ all -> 0x003c }
            int r2 = r8.m8178D(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.m8179H()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f5184n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f5192v     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f5186p     // Catch:{ all -> 0x003c }
            int r10 = r8.f5189s     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f5186p     // Catch:{ all -> 0x003c }
            int r0 = r8.f5189s     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m8197v(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            if (r9 != r10) goto L_0x0038
            monitor-exit(r8)
            return r7
        L_0x0038:
            monitor-exit(r8)
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.mo6823E(long, boolean):int");
    }

    /* renamed from: F */
    public final synchronized C6272r1 mo6824F() {
        return this.f5195y ? null : this.f5165B;
    }

    /* renamed from: G */
    public final int mo6825G() {
        return this.f5187q + this.f5186p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo6826I() {
        this.f5196z = true;
    }

    /* renamed from: J */
    public final synchronized boolean mo6827J() {
        return this.f5193w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo6828K(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m8179H()     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r3 != 0) goto L_0x0018
            boolean r3 = r2.f5193w     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0018
            z1.r1 r3 = r2.f5165B     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0017
            z1.r1 r0 = r2.f5177g     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r2)
            return r1
        L_0x001a:
            b3.v0<b3.p0$c> r3 = r2.f5173c     // Catch:{ all -> 0x003a }
            int r0 = r2.mo6822C()     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.mo6893e(r0)     // Catch:{ all -> 0x003a }
            b3.p0$c r3 = (p015b3.C1743p0.C1746c) r3     // Catch:{ all -> 0x003a }
            z1.r1 r3 = r3.f5200a     // Catch:{ all -> 0x003a }
            z1.r1 r0 = r2.f5177g     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            int r3 = r2.f5189s     // Catch:{ all -> 0x003a }
            int r3 = r2.m8178D(r3)     // Catch:{ all -> 0x003a }
            boolean r3 = r2.m8181M(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.mo6828K(boolean):boolean");
    }

    /* renamed from: N */
    public void mo6829N() throws IOException {
        C4042o oVar = this.f5178h;
        if (oVar != null && oVar.getState() == 1) {
            throw ((C4042o.C4043a) C5917a.m34872e(this.f5178h.mo17183g()));
        }
    }

    /* renamed from: Q */
    public final synchronized int mo6830Q() {
        return m8179H() ? this.f5180j[m8178D(this.f5189s)] : this.f5166C;
    }

    /* renamed from: R */
    public void mo6831R() {
        mo6852r();
        m8184U();
    }

    /* renamed from: S */
    public int mo6832S(C6279s1 s1Var, C1848g gVar, int i, boolean z) {
        boolean z2 = false;
        int P = m8183P(s1Var, gVar, (i & 2) != 0, z, this.f5172b);
        if (P == -4 && !gVar.mo7034s()) {
            if ((i & 1) != 0) {
                z2 = true;
            }
            if ((i & 4) == 0) {
                if (z2) {
                    this.f5171a.mo6796f(gVar, this.f5172b);
                } else {
                    this.f5171a.mo6797m(gVar, this.f5172b);
                }
            }
            if (!z2) {
                this.f5189s++;
            }
        }
        return P;
    }

    /* renamed from: T */
    public void mo6833T() {
        mo6835W(true);
        m8184U();
    }

    /* renamed from: V */
    public final void mo6834V() {
        mo6835W(false);
    }

    /* renamed from: W */
    public void mo6835W(boolean z) {
        this.f5171a.mo6798n();
        this.f5186p = 0;
        this.f5187q = 0;
        this.f5188r = 0;
        this.f5189s = 0;
        this.f5194x = true;
        this.f5190t = Long.MIN_VALUE;
        this.f5191u = Long.MIN_VALUE;
        this.f5192v = Long.MIN_VALUE;
        this.f5193w = false;
        this.f5173c.mo6890b();
        if (z) {
            this.f5164A = null;
            this.f5165B = null;
            this.f5195y = true;
        }
    }

    /* renamed from: Y */
    public final synchronized boolean mo6836Y(int i) {
        m8185X();
        int i2 = this.f5187q;
        if (i >= i2) {
            if (i <= this.f5186p + i2) {
                this.f5190t = Long.MIN_VALUE;
                this.f5189s = i - i2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo6837Z(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m8185X()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f5189s     // Catch:{ all -> 0x0040 }
            int r2 = r8.m8178D(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.m8179H()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f5184n     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f5192v     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f5186p     // Catch:{ all -> 0x0040 }
            int r0 = r8.f5189s     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m8197v(r2, r3, r4, r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f5190t = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f5189s     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f5189s = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.mo6837Z(long, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6838a(long r12, int r14, int r15, int r16, p037e2.C4200e0.C4201a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f5196z
            if (r0 == 0) goto L_0x0010
            z1.r1 r0 = r8.f5164A
            java.lang.Object r0 = p161w3.C5917a.m34875h(r0)
            z1.r1 r0 = (p177z1.C6272r1) r0
            r11.mo6845e(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            boolean r4 = r8.f5194x
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f5194x = r1
        L_0x0022:
            long r4 = r8.f5169F
            long r4 = r4 + r12
            boolean r6 = r8.f5167D
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f5190t
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f5168E
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            z1.r1 r6 = r8.f5165B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p161w3.C5961r.m35215i(r6, r0)
            r8.f5168E = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f5170G
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.m8188h(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f5170G = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            b3.n0 r0 = r8.f5171a
            long r0 = r0.mo6795e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m8189i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1743p0.mo6838a(long, int, int, int, e2.e0$a):void");
    }

    /* renamed from: a0 */
    public final void mo6839a0(long j) {
        if (this.f5169F != j) {
            this.f5169F = j;
            mo6826I();
        }
    }

    /* renamed from: b */
    public /* synthetic */ int mo6840b(C5819i iVar, int i, boolean z) {
        return C4198d0.m28382a(this, iVar, i, z);
    }

    /* renamed from: b0 */
    public final void mo6841b0(long j) {
        this.f5190t = j;
    }

    /* renamed from: c */
    public final int mo6842c(C5819i iVar, int i, boolean z, int i2) throws IOException {
        return this.f5171a.mo6800p(iVar, i, z);
    }

    /* renamed from: d */
    public /* synthetic */ void mo6843d(C5918a0 a0Var, int i) {
        C4198d0.m28383b(this, a0Var, i);
    }

    /* renamed from: d0 */
    public final void mo6844d0(C1747d dVar) {
        this.f5176f = dVar;
    }

    /* renamed from: e */
    public final void mo6845e(C6272r1 r1Var) {
        C6272r1 w = mo6855w(r1Var);
        this.f5196z = false;
        this.f5164A = r1Var;
        boolean c0 = m8186c0(w);
        C1747d dVar = this.f5176f;
        if (dVar != null && c0) {
            dVar.mo6774b(w);
        }
    }

    /* renamed from: e0 */
    public final synchronized void mo6846e0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f5189s + i <= this.f5186p) {
                    z = true;
                    C5917a.m34868a(z);
                    this.f5189s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C5917a.m34868a(z);
        this.f5189s += i;
    }

    /* renamed from: f */
    public final void mo6847f(C5918a0 a0Var, int i, int i2) {
        this.f5171a.mo6801q(a0Var, i);
    }

    /* renamed from: f0 */
    public final void mo6848f0(int i) {
        this.f5166C = i;
    }

    /* renamed from: g0 */
    public final void mo6849g0() {
        this.f5170G = true;
    }

    /* renamed from: o */
    public synchronized long mo6850o() {
        int i = this.f5189s;
        if (i == 0) {
            return -1;
        }
        return m8195p(i);
    }

    /* renamed from: q */
    public final void mo6851q(long j, boolean z, boolean z2) {
        this.f5171a.mo6793b(m8193m(j, z, z2));
    }

    /* renamed from: r */
    public final void mo6852r() {
        this.f5171a.mo6793b(m8194n());
    }

    /* renamed from: s */
    public final void mo6853s() {
        this.f5171a.mo6793b(mo6850o());
    }

    /* renamed from: u */
    public final void mo6854u(int i) {
        this.f5171a.mo6794c(m8196t(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C6272r1 mo6855w(C6272r1 r1Var) {
        return (this.f5169F == 0 || r1Var.f30247x == Long.MAX_VALUE) ? r1Var : r1Var.mo21483b().mo21521i0(r1Var.f30247x + this.f5169F).mo21491E();
    }

    /* renamed from: x */
    public final int mo6856x() {
        return this.f5187q;
    }

    /* renamed from: y */
    public final synchronized long mo6857y() {
        return this.f5186p == 0 ? Long.MIN_VALUE : this.f5184n[this.f5188r];
    }

    /* renamed from: z */
    public final synchronized long mo6858z() {
        return this.f5192v;
    }
}
