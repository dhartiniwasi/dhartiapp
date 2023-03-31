package p106o2;

import java.util.Arrays;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5918a0;
import p161w3.C5970w;

/* renamed from: o2.n */
/* compiled from: H262Reader */
public final class C5194n implements C5193m {

    /* renamed from: q */
    private static final double[] f26868q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f26869a;

    /* renamed from: b */
    private C4200e0 f26870b;

    /* renamed from: c */
    private final C5191k0 f26871c;

    /* renamed from: d */
    private final C5918a0 f26872d;

    /* renamed from: e */
    private final C5208u f26873e;

    /* renamed from: f */
    private final boolean[] f26874f;

    /* renamed from: g */
    private final C5195a f26875g;

    /* renamed from: h */
    private long f26876h;

    /* renamed from: i */
    private boolean f26877i;

    /* renamed from: j */
    private boolean f26878j;

    /* renamed from: k */
    private long f26879k;

    /* renamed from: l */
    private long f26880l;

    /* renamed from: m */
    private long f26881m;

    /* renamed from: n */
    private long f26882n;

    /* renamed from: o */
    private boolean f26883o;

    /* renamed from: p */
    private boolean f26884p;

    /* renamed from: o2.n$a */
    /* compiled from: H262Reader */
    private static final class C5195a {

        /* renamed from: e */
        private static final byte[] f26885e = {0, 0, 1};

        /* renamed from: a */
        private boolean f26886a;

        /* renamed from: b */
        public int f26887b;

        /* renamed from: c */
        public int f26888c;

        /* renamed from: d */
        public byte[] f26889d;

        public C5195a(int i) {
            this.f26889d = new byte[i];
        }

        /* renamed from: a */
        public void mo19169a(byte[] bArr, int i, int i2) {
            if (this.f26886a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f26889d;
                int length = bArr2.length;
                int i4 = this.f26887b;
                if (length < i4 + i3) {
                    this.f26889d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f26889d, this.f26887b, i3);
                this.f26887b += i3;
            }
        }

        /* renamed from: b */
        public boolean mo19170b(int i, int i2) {
            if (this.f26886a) {
                int i3 = this.f26887b - i2;
                this.f26887b = i3;
                if (this.f26888c == 0 && i == 181) {
                    this.f26888c = i3;
                } else {
                    this.f26886a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f26886a = true;
            }
            byte[] bArr = f26885e;
            mo19169a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo19171c() {
            this.f26886a = false;
            this.f26887b = 0;
            this.f26888c = 0;
        }
    }

    public C5194n() {
        this((C5191k0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<p177z1.C6272r1, java.lang.Long> m32259f(p106o2.C5194n.C5195a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f26889d
            int r1 = r8.f26887b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            z1.r1$b r6 = new z1.r1$b
            r6.<init>()
            z1.r1$b r9 = r6.mo21505S(r9)
            java.lang.String r6 = "video/mpeg2"
            z1.r1$b r9 = r9.mo21517e0(r6)
            z1.r1$b r9 = r9.mo21522j0(r2)
            z1.r1$b r9 = r9.mo21503Q(r4)
            z1.r1$b r9 = r9.mo21513a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            z1.r1$b r9 = r9.mo21506T(r1)
            z1.r1 r9 = r9.mo21491E()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x009d
            double[] r5 = f26868q
            int r6 = r5.length
            if (r4 >= r6) goto L_0x009d
            r1 = r5[r4]
            int r8 = r8.f26888c
            int r8 = r8 + 9
            byte r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            byte r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L_0x0096
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0096:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x009d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o2.C5194n.m32259f(o2.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19147a(p161w3.C5918a0 r21) {
        /*
            r20 = this;
            r0 = r20
            e2.e0 r1 = r0.f26870b
            p161w3.C5917a.m34875h(r1)
            int r1 = r21.mo20552e()
            int r2 = r21.mo20553f()
            byte[] r3 = r21.mo20551d()
            long r4 = r0.f26876h
            int r6 = r21.mo20548a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f26876h = r4
            e2.e0 r4 = r0.f26870b
            int r5 = r21.mo20548a()
            r6 = r21
            r4.mo6843d(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f26874f
            int r4 = p161w3.C5970w.m35260c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f26878j
            if (r4 != 0) goto L_0x0039
            o2.n$a r4 = r0.f26875g
            r4.mo19169a(r3, r1, r2)
        L_0x0039:
            o2.u r4 = r0.f26873e
            if (r4 == 0) goto L_0x0040
            r4.mo19194a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.mo20551d()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f26878j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            o2.n$a r9 = r0.f26875g
            r9.mo19169a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            o2.n$a r12 = r0.f26875g
            boolean r9 = r12.mo19170b(r5, r9)
            if (r9 == 0) goto L_0x008a
            o2.n$a r9 = r0.f26875g
            java.lang.String r12 = r0.f26869a
            java.lang.Object r12 = p161w3.C5917a.m34872e(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = m32259f(r9, r12)
            e2.e0 r12 = r0.f26870b
            java.lang.Object r13 = r9.first
            z1.r1 r13 = (p177z1.C6272r1) r13
            r12.mo6845e(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f26879k = r12
            r0.f26878j = r11
        L_0x008a:
            o2.u r9 = r0.f26873e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.mo19194a(r3, r1, r4)
            r1 = 0
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            o2.u r8 = r0.f26873e
            boolean r1 = r8.mo19195b(r1)
            if (r1 == 0) goto L_0x00c6
            o2.u r1 = r0.f26873e
            byte[] r8 = r1.f27034d
            int r1 = r1.f27035e
            int r1 = p161w3.C5970w.m35274q(r8, r1)
            w3.a0 r8 = r0.f26872d
            java.lang.Object r8 = p161w3.C5953m0.m35138j(r8)
            w3.a0 r8 = (p161w3.C5918a0) r8
            o2.u r9 = r0.f26873e
            byte[] r9 = r9.f27034d
            r8.mo20544M(r9, r1)
            o2.k0 r1 = r0.f26871c
            java.lang.Object r1 = p161w3.C5953m0.m35138j(r1)
            o2.k0 r1 = (p106o2.C5191k0) r1
            long r8 = r0.f26882n
            w3.a0 r12 = r0.f26872d
            r1.mo19167a(r8, r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.mo20551d()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            o2.u r1 = r0.f26873e
            r1.mo19198e(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f26883o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f26884p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f26878j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f26882n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f26883o
            long r11 = r0.f26876h
            r19 = r5
            long r4 = r0.f26881m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            e2.e0 r12 = r0.f26870b
            r18 = 0
            r17 = r1
            r12.mo6838a(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f26877i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f26884p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f26876h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f26881m = r4
            long r4 = r0.f26880l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f26882n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f26879k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f26882n = r4
            r0.f26883o = r10
            r0.f26880l = r8
            r1 = 1
            r0.f26877i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = 1
        L_0x0143:
            r0.f26884p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o2.C5194n.mo19147a(w3.a0):void");
    }

    /* renamed from: b */
    public void mo19148b() {
        C5970w.m35258a(this.f26874f);
        this.f26875g.mo19171c();
        C5208u uVar = this.f26873e;
        if (uVar != null) {
            uVar.mo19197d();
        }
        this.f26876h = 0;
        this.f26877i = false;
        this.f26880l = -9223372036854775807L;
        this.f26882n = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26869a = dVar.mo19165b();
        this.f26870b = nVar.mo6778f(dVar.mo19166c(), 2);
        C5191k0 k0Var = this.f26871c;
        if (k0Var != null) {
            k0Var.mo19168b(nVar, dVar);
        }
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        this.f26880l = j;
    }

    C5194n(C5191k0 k0Var) {
        this.f26871c = k0Var;
        this.f26874f = new boolean[4];
        this.f26875g = new C5195a(128);
        if (k0Var != null) {
            this.f26873e = new C5208u(178, 128);
            this.f26872d = new C5918a0();
        } else {
            this.f26873e = null;
            this.f26872d = null;
        }
        this.f26880l = -9223372036854775807L;
        this.f26882n = -9223372036854775807L;
    }
}
