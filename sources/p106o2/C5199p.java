package p106o2;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5920b0;
import p161w3.C5929e;
import p161w3.C5953m0;
import p161w3.C5970w;
import p177z1.C6272r1;

/* renamed from: o2.p */
/* compiled from: H264Reader */
public final class C5199p implements C5193m {

    /* renamed from: a */
    private final C5172d0 f26916a;

    /* renamed from: b */
    private final boolean f26917b;

    /* renamed from: c */
    private final boolean f26918c;

    /* renamed from: d */
    private final C5208u f26919d = new C5208u(7, 128);

    /* renamed from: e */
    private final C5208u f26920e = new C5208u(8, 128);

    /* renamed from: f */
    private final C5208u f26921f = new C5208u(6, 128);

    /* renamed from: g */
    private long f26922g;

    /* renamed from: h */
    private final boolean[] f26923h = new boolean[3];

    /* renamed from: i */
    private String f26924i;

    /* renamed from: j */
    private C4200e0 f26925j;

    /* renamed from: k */
    private C5201b f26926k;

    /* renamed from: l */
    private boolean f26927l;

    /* renamed from: m */
    private long f26928m = -9223372036854775807L;

    /* renamed from: n */
    private boolean f26929n;

    /* renamed from: o */
    private final C5918a0 f26930o = new C5918a0();

    /* renamed from: o2.p$b */
    /* compiled from: H264Reader */
    private static final class C5201b {

        /* renamed from: a */
        private final C4200e0 f26931a;

        /* renamed from: b */
        private final boolean f26932b;

        /* renamed from: c */
        private final boolean f26933c;

        /* renamed from: d */
        private final SparseArray<C5970w.C5973c> f26934d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C5970w.C5972b> f26935e = new SparseArray<>();

        /* renamed from: f */
        private final C5920b0 f26936f;

        /* renamed from: g */
        private byte[] f26937g;

        /* renamed from: h */
        private int f26938h;

        /* renamed from: i */
        private int f26939i;

        /* renamed from: j */
        private long f26940j;

        /* renamed from: k */
        private boolean f26941k;

        /* renamed from: l */
        private long f26942l;

        /* renamed from: m */
        private C5202a f26943m = new C5202a();

        /* renamed from: n */
        private C5202a f26944n = new C5202a();

        /* renamed from: o */
        private boolean f26945o;

        /* renamed from: p */
        private long f26946p;

        /* renamed from: q */
        private long f26947q;

        /* renamed from: r */
        private boolean f26948r;

        /* renamed from: o2.p$b$a */
        /* compiled from: H264Reader */
        private static final class C5202a {

            /* renamed from: a */
            private boolean f26949a;

            /* renamed from: b */
            private boolean f26950b;

            /* renamed from: c */
            private C5970w.C5973c f26951c;

            /* renamed from: d */
            private int f26952d;

            /* renamed from: e */
            private int f26953e;

            /* renamed from: f */
            private int f26954f;

            /* renamed from: g */
            private int f26955g;

            /* renamed from: h */
            private boolean f26956h;

            /* renamed from: i */
            private boolean f26957i;

            /* renamed from: j */
            private boolean f26958j;

            /* renamed from: k */
            private boolean f26959k;

            /* renamed from: l */
            private int f26960l;

            /* renamed from: m */
            private int f26961m;

            /* renamed from: n */
            private int f26962n;

            /* renamed from: o */
            private int f26963o;

            /* renamed from: p */
            private int f26964p;

            private C5202a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public boolean m32299c(C5202a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f26949a) {
                    return false;
                }
                if (!aVar.f26949a) {
                    return true;
                }
                C5970w.C5973c cVar = (C5970w.C5973c) C5917a.m34875h(this.f26951c);
                C5970w.C5973c cVar2 = (C5970w.C5973c) C5917a.m34875h(aVar.f26951c);
                if (this.f26954f == aVar.f26954f && this.f26955g == aVar.f26955g && this.f26956h == aVar.f26956h && ((!this.f26957i || !aVar.f26957i || this.f26958j == aVar.f26958j) && (((i = this.f26952d) == (i2 = aVar.f26952d) || (i != 0 && i2 != 0)) && (((i3 = cVar.f29178l) != 0 || cVar2.f29178l != 0 || (this.f26961m == aVar.f26961m && this.f26962n == aVar.f26962n)) && ((i3 != 1 || cVar2.f29178l != 1 || (this.f26963o == aVar.f26963o && this.f26964p == aVar.f26964p)) && (z = this.f26959k) == aVar.f26959k && (!z || this.f26960l == aVar.f26960l)))))) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public void mo19186b() {
                this.f26950b = false;
                this.f26949a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f26953e;
             */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo19187d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f26950b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f26953e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p106o2.C5199p.C5201b.C5202a.mo19187d():boolean");
            }

            /* renamed from: e */
            public void mo19188e(C5970w.C5973c cVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f26951c = cVar;
                this.f26952d = i;
                this.f26953e = i2;
                this.f26954f = i3;
                this.f26955g = i4;
                this.f26956h = z;
                this.f26957i = z2;
                this.f26958j = z3;
                this.f26959k = z4;
                this.f26960l = i5;
                this.f26961m = i6;
                this.f26962n = i7;
                this.f26963o = i8;
                this.f26964p = i9;
                this.f26949a = true;
                this.f26950b = true;
            }

            /* renamed from: f */
            public void mo19189f(int i) {
                this.f26953e = i;
                this.f26950b = true;
            }
        }

        public C5201b(C4200e0 e0Var, boolean z, boolean z2) {
            this.f26931a = e0Var;
            this.f26932b = z;
            this.f26933c = z2;
            byte[] bArr = new byte[128];
            this.f26937g = bArr;
            this.f26936f = new C5920b0(bArr, 0, 0);
            mo19184g();
        }

        /* renamed from: d */
        private void m32290d(int i) {
            long j = this.f26947q;
            if (j != -9223372036854775807L) {
                boolean z = this.f26948r;
                this.f26931a.mo6838a(j, z ? 1 : 0, (int) (this.f26940j - this.f26946p), i, (C4200e0.C4201a) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19179a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f26941k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f26937g
                int r4 = r3.length
                int r5 = r0.f26938h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f26937g = r3
            L_0x001e:
                byte[] r3 = r0.f26937g
                int r4 = r0.f26938h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f26938h
                int r1 = r1 + r2
                r0.f26938h = r1
                w3.b0 r2 = r0.f26936f
                byte[] r3 = r0.f26937g
                r4 = 0
                r2.mo20580i(r3, r4, r1)
                w3.b0 r1 = r0.f26936f
                r2 = 8
                boolean r1 = r1.mo20574b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                w3.b0 r1 = r0.f26936f
                r1.mo20581k()
                w3.b0 r1 = r0.f26936f
                int r10 = r1.mo20577e(r7)
                w3.b0 r1 = r0.f26936f
                r2 = 5
                r1.mo20582l(r2)
                w3.b0 r1 = r0.f26936f
                boolean r1 = r1.mo20575c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                w3.b0 r1 = r0.f26936f
                r1.mo20579h()
                w3.b0 r1 = r0.f26936f
                boolean r1 = r1.mo20575c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                w3.b0 r1 = r0.f26936f
                int r11 = r1.mo20579h()
                boolean r1 = r0.f26933c
                if (r1 != 0) goto L_0x0079
                r0.f26941k = r4
                o2.p$b$a r1 = r0.f26944n
                r1.mo19189f(r11)
                return
            L_0x0079:
                w3.b0 r1 = r0.f26936f
                boolean r1 = r1.mo20575c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                w3.b0 r1 = r0.f26936f
                int r13 = r1.mo20579h()
                android.util.SparseArray<w3.w$b> r1 = r0.f26935e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.f26941k = r4
                return
            L_0x0093:
                android.util.SparseArray<w3.w$b> r1 = r0.f26935e
                java.lang.Object r1 = r1.get(r13)
                w3.w$b r1 = (p161w3.C5970w.C5972b) r1
                android.util.SparseArray<w3.w$c> r3 = r0.f26934d
                int r5 = r1.f29165b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                w3.w$c r9 = (p161w3.C5970w.C5973c) r9
                boolean r3 = r9.f29175i
                if (r3 == 0) goto L_0x00b8
                w3.b0 r3 = r0.f26936f
                boolean r3 = r3.mo20574b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                w3.b0 r3 = r0.f26936f
                r3.mo20582l(r7)
            L_0x00b8:
                w3.b0 r3 = r0.f26936f
                int r5 = r9.f29177k
                boolean r3 = r3.mo20574b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                w3.b0 r3 = r0.f26936f
                int r5 = r9.f29177k
                int r12 = r3.mo20577e(r5)
                boolean r3 = r9.f29176j
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                w3.b0 r3 = r0.f26936f
                boolean r3 = r3.mo20574b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                w3.b0 r3 = r0.f26936f
                boolean r3 = r3.mo20576d()
                if (r3 == 0) goto L_0x00f5
                w3.b0 r6 = r0.f26936f
                boolean r6 = r6.mo20574b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                w3.b0 r6 = r0.f26936f
                boolean r6 = r6.mo20576d()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.f26939i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                w3.b0 r2 = r0.f26936f
                boolean r2 = r2.mo20575c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                w3.b0 r2 = r0.f26936f
                int r2 = r2.mo20579h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.f29178l
                if (r2 != 0) goto L_0x014e
                w3.b0 r2 = r0.f26936f
                int r3 = r9.f29179m
                boolean r2 = r2.mo20574b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                w3.b0 r2 = r0.f26936f
                int r3 = r9.f29179m
                int r2 = r2.mo20577e(r3)
                boolean r1 = r1.f29166c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                w3.b0 r1 = r0.f26936f
                boolean r1 = r1.mo20575c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                w3.b0 r1 = r0.f26936f
                int r1 = r1.mo20578g()
                r20 = r1
                r19 = r2
                goto L_0x018c
            L_0x014b:
                r19 = r2
                goto L_0x018a
            L_0x014e:
                if (r2 != r5) goto L_0x0188
                boolean r2 = r9.f29180n
                if (r2 != 0) goto L_0x0188
                w3.b0 r2 = r0.f26936f
                boolean r2 = r2.mo20575c()
                if (r2 != 0) goto L_0x015d
                return
            L_0x015d:
                w3.b0 r2 = r0.f26936f
                int r2 = r2.mo20578g()
                boolean r1 = r1.f29166c
                if (r1 == 0) goto L_0x0181
                if (r14 != 0) goto L_0x0181
                w3.b0 r1 = r0.f26936f
                boolean r1 = r1.mo20575c()
                if (r1 != 0) goto L_0x0172
                return
            L_0x0172:
                w3.b0 r1 = r0.f26936f
                int r1 = r1.mo20578g()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x0181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x018e
            L_0x0188:
                r19 = 0
            L_0x018a:
                r20 = 0
            L_0x018c:
                r21 = 0
            L_0x018e:
                r22 = 0
            L_0x0190:
                o2.p$b$a r8 = r0.f26944n
                r8.mo19188e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f26941k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p106o2.C5199p.C5201b.mo19179a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean mo19180b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f26939i == 9 || (this.f26933c && this.f26944n.m32299c(this.f26943m))) {
                if (z && this.f26945o) {
                    m32290d(i + ((int) (j - this.f26940j)));
                }
                this.f26946p = this.f26940j;
                this.f26947q = this.f26942l;
                this.f26948r = false;
                this.f26945o = true;
            }
            if (this.f26932b) {
                z2 = this.f26944n.mo19187d();
            }
            boolean z4 = this.f26948r;
            int i2 = this.f26939i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f26948r = z5;
            return z5;
        }

        /* renamed from: c */
        public boolean mo19181c() {
            return this.f26933c;
        }

        /* renamed from: e */
        public void mo19182e(C5970w.C5972b bVar) {
            this.f26935e.append(bVar.f29164a, bVar);
        }

        /* renamed from: f */
        public void mo19183f(C5970w.C5973c cVar) {
            this.f26934d.append(cVar.f29170d, cVar);
        }

        /* renamed from: g */
        public void mo19184g() {
            this.f26941k = false;
            this.f26945o = false;
            this.f26944n.mo19186b();
        }

        /* renamed from: h */
        public void mo19185h(long j, int i, long j2) {
            this.f26939i = i;
            this.f26942l = j2;
            this.f26940j = j;
            if (!this.f26932b || i != 1) {
                if (!this.f26933c) {
                    return;
                }
                if (!(i == 5 || i == 1 || i == 2)) {
                    return;
                }
            }
            C5202a aVar = this.f26943m;
            this.f26943m = this.f26944n;
            this.f26944n = aVar;
            aVar.mo19186b();
            this.f26938h = 0;
            this.f26941k = true;
        }
    }

    public C5199p(C5172d0 d0Var, boolean z, boolean z2) {
        this.f26916a = d0Var;
        this.f26917b = z;
        this.f26918c = z2;
    }

    /* renamed from: f */
    private void m32281f() {
        C5917a.m34875h(this.f26925j);
        C5953m0.m35138j(this.f26926k);
    }

    /* renamed from: g */
    private void m32282g(long j, int i, int i2, long j2) {
        if (!this.f26927l || this.f26926k.mo19181c()) {
            this.f26919d.mo19195b(i2);
            this.f26920e.mo19195b(i2);
            if (!this.f26927l) {
                if (this.f26919d.mo19196c() && this.f26920e.mo19196c()) {
                    ArrayList arrayList = new ArrayList();
                    C5208u uVar = this.f26919d;
                    arrayList.add(Arrays.copyOf(uVar.f27034d, uVar.f27035e));
                    C5208u uVar2 = this.f26920e;
                    arrayList.add(Arrays.copyOf(uVar2.f27034d, uVar2.f27035e));
                    C5208u uVar3 = this.f26919d;
                    C5970w.C5973c l = C5970w.m35269l(uVar3.f27034d, 3, uVar3.f27035e);
                    C5208u uVar4 = this.f26920e;
                    C5970w.C5972b j3 = C5970w.m35267j(uVar4.f27034d, 3, uVar4.f27035e);
                    this.f26925j.mo6845e(new C6272r1.C6274b().mo21505S(this.f26924i).mo21517e0("video/avc").mo21495I(C5929e.m34964a(l.f29167a, l.f29168b, l.f29169c)).mo21522j0(l.f29172f).mo21503Q(l.f29173g).mo21513a0(l.f29174h).mo21506T(arrayList).mo21491E());
                    this.f26927l = true;
                    this.f26926k.mo19183f(l);
                    this.f26926k.mo19182e(j3);
                    this.f26919d.mo19197d();
                    this.f26920e.mo19197d();
                }
            } else if (this.f26919d.mo19196c()) {
                C5208u uVar5 = this.f26919d;
                this.f26926k.mo19183f(C5970w.m35269l(uVar5.f27034d, 3, uVar5.f27035e));
                this.f26919d.mo19197d();
            } else if (this.f26920e.mo19196c()) {
                C5208u uVar6 = this.f26920e;
                this.f26926k.mo19182e(C5970w.m35267j(uVar6.f27034d, 3, uVar6.f27035e));
                this.f26920e.mo19197d();
            }
        }
        if (this.f26921f.mo19195b(i2)) {
            C5208u uVar7 = this.f26921f;
            this.f26930o.mo20544M(this.f26921f.f27034d, C5970w.m35274q(uVar7.f27034d, uVar7.f27035e));
            this.f26930o.mo20546O(4);
            this.f26916a.mo19155a(j2, this.f26930o);
        }
        if (this.f26926k.mo19180b(j, i, this.f26927l, this.f26929n)) {
            this.f26929n = false;
        }
    }

    /* renamed from: h */
    private void m32283h(byte[] bArr, int i, int i2) {
        if (!this.f26927l || this.f26926k.mo19181c()) {
            this.f26919d.mo19194a(bArr, i, i2);
            this.f26920e.mo19194a(bArr, i, i2);
        }
        this.f26921f.mo19194a(bArr, i, i2);
        this.f26926k.mo19179a(bArr, i, i2);
    }

    /* renamed from: i */
    private void m32284i(long j, int i, long j2) {
        if (!this.f26927l || this.f26926k.mo19181c()) {
            this.f26919d.mo19198e(i);
            this.f26920e.mo19198e(i);
        }
        this.f26921f.mo19198e(i);
        this.f26926k.mo19185h(j, i, j2);
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        m32281f();
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        byte[] d = a0Var.mo20551d();
        this.f26922g += (long) a0Var.mo20548a();
        this.f26925j.mo6843d(a0Var, a0Var.mo20548a());
        while (true) {
            int c = C5970w.m35260c(d, e, f, this.f26923h);
            if (c == f) {
                m32283h(d, e, f);
                return;
            }
            int f2 = C5970w.m35263f(d, c);
            int i = c - e;
            if (i > 0) {
                m32283h(d, e, c);
            }
            int i2 = f - c;
            long j = this.f26922g - ((long) i2);
            m32282g(j, i2, i < 0 ? -i : 0, this.f26928m);
            m32284i(j, f2, this.f26928m);
            e = c + 3;
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26922g = 0;
        this.f26929n = false;
        this.f26928m = -9223372036854775807L;
        C5970w.m35258a(this.f26923h);
        this.f26919d.mo19197d();
        this.f26920e.mo19197d();
        this.f26921f.mo19197d();
        C5201b bVar = this.f26926k;
        if (bVar != null) {
            bVar.mo19184g();
        }
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26924i = dVar.mo19165b();
        C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 2);
        this.f26925j = f;
        this.f26926k = new C5201b(f, this.f26917b, this.f26918c);
        this.f26916a.mo19156b(nVar, dVar);
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26928m = j;
        }
        this.f26929n |= (i & 2) != 0;
    }
}
