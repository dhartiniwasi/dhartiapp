package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3058y6 implements C2576l6 {

    /* renamed from: a */
    private final String f20470a;

    /* renamed from: b */
    private final y22 f20471b;

    /* renamed from: c */
    private final x12 f20472c;

    /* renamed from: d */
    private C2792r f20473d;

    /* renamed from: e */
    private String f20474e;

    /* renamed from: f */
    private C2388g4 f20475f;

    /* renamed from: g */
    private int f20476g;

    /* renamed from: h */
    private int f20477h;

    /* renamed from: i */
    private int f20478i;

    /* renamed from: j */
    private int f20479j;

    /* renamed from: k */
    private long f20480k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f20481l;

    /* renamed from: m */
    private int f20482m;

    /* renamed from: n */
    private int f20483n;

    /* renamed from: o */
    private int f20484o;

    /* renamed from: p */
    private boolean f20485p;

    /* renamed from: q */
    private long f20486q;

    /* renamed from: r */
    private int f20487r;

    /* renamed from: s */
    private long f20488s;

    /* renamed from: t */
    private int f20489t;

    /* renamed from: u */
    private String f20490u;

    public C3058y6(String str) {
        this.f20470a = str;
        y22 y22 = new y22(1024);
        this.f20471b = y22;
        byte[] h = y22.mo15295h();
        this.f20472c = new x12(h, h.length);
    }

    /* renamed from: f */
    private final int m23771f(x12 x12) throws ea0 {
        int a = x12.mo15032a();
        mm4 b = nm4.m17192b(x12, true);
        this.f20490u = b.f13417c;
        this.f20487r = b.f13415a;
        this.f20489t = b.f13416b;
        return a - x12.mo15032a();
    }

    /* renamed from: g */
    private static long m23772g(x12 x12) {
        return (long) x12.mo15034c((x12.mo15034c(2) + 1) * 8);
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f20476g = 0;
        this.f20480k = -9223372036854775807L;
        this.f20481l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14.f20481l == false) goto L_0x01b9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8216b(com.google.android.gms.internal.ads.y22 r15) throws com.google.android.gms.internal.ads.ea0 {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.r r0 = r14.f20473d
            com.google.android.gms.internal.ads.v91.m22048b(r0)
        L_0x0005:
            int r0 = r15.mo15296i()
            if (r0 <= 0) goto L_0x0218
            int r0 = r14.f20476g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x020e
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01f8
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01ce
            int r0 = r15.mo15296i()
            int r3 = r14.f20478i
            int r6 = r14.f20477h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.x12 r3 = r14.f20472c
            byte[] r3 = r3.f19942a
            int r6 = r14.f20477h
            r15.mo15289b(r3, r6, r0)
            int r3 = r14.f20477h
            int r3 = r3 + r0
            r14.f20477h = r3
            int r0 = r14.f20478i
            if (r3 != r0) goto L_0x0005
            com.google.android.gms.internal.ads.x12 r0 = r14.f20472c
            r0.mo15039h(r4)
            com.google.android.gms.internal.ads.x12 r0 = r14.f20472c
            boolean r3 = r0.mo15043l()
            r6 = 0
            if (r3 != 0) goto L_0x0152
            r14.f20481l = r2
            int r3 = r0.mo15034c(r2)
            if (r3 != r2) goto L_0x0056
            int r3 = r0.mo15034c(r2)
            r7 = 1
            goto L_0x0058
        L_0x0056:
            r7 = r3
            r3 = 0
        L_0x0058:
            r14.f20482m = r3
            if (r3 != 0) goto L_0x014d
            if (r7 != r2) goto L_0x0062
            m23772g(r0)
            r7 = 1
        L_0x0062:
            boolean r3 = r0.mo15043l()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r8 = r0.mo15034c(r3)
            r14.f20483n = r8
            r8 = 4
            int r9 = r0.mo15034c(r8)
            int r10 = r0.mo15034c(r1)
            if (r9 != 0) goto L_0x0143
            if (r10 != 0) goto L_0x0143
            if (r7 != 0) goto L_0x00d8
            int r9 = r0.mo15033b()
            int r10 = r14.m23771f(r0)
            r0.mo15039h(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.mo15037f(r9, r4, r10)
            com.google.android.gms.internal.ads.e2 r10 = new com.google.android.gms.internal.ads.e2
            r10.<init>()
            java.lang.String r11 = r14.f20474e
            r10.mo9764h(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.mo9776s(r11)
            java.lang.String r11 = r14.f20490u
            r10.mo9761f0(r11)
            int r11 = r14.f20489t
            r10.mo9759e0(r11)
            int r11 = r14.f20487r
            r10.mo9777t(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.mo9766i(r9)
            java.lang.String r9 = r14.f20470a
            r10.mo9768k(r9)
            com.google.android.gms.internal.ads.g4 r9 = r10.mo9782y()
            com.google.android.gms.internal.ads.g4 r10 = r14.f20475f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00e5
            r14.f20475f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f9687z
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f20488s = r10
            com.google.android.gms.internal.ads.r r10 = r14.f20473d
            r10.mo8823e(r9)
            goto L_0x00e5
        L_0x00d8:
            long r9 = m23772g(r0)
            int r10 = (int) r9
            int r9 = r14.m23771f(r0)
            int r10 = r10 - r9
            r0.mo15041j(r10)
        L_0x00e5:
            int r9 = r0.mo15034c(r1)
            r14.f20484o = r9
            if (r9 == 0) goto L_0x0110
            if (r9 == r2) goto L_0x010a
            if (r9 == r1) goto L_0x0106
            if (r9 == r8) goto L_0x0106
            r1 = 5
            if (r9 == r1) goto L_0x0106
            if (r9 == r3) goto L_0x0102
            r1 = 7
            if (r9 != r1) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0102:
            r0.mo15041j(r2)
            goto L_0x0113
        L_0x0106:
            r0.mo15041j(r3)
            goto L_0x0113
        L_0x010a:
            r1 = 9
            r0.mo15041j(r1)
            goto L_0x0113
        L_0x0110:
            r0.mo15041j(r5)
        L_0x0113:
            boolean r1 = r0.mo15043l()
            r14.f20485p = r1
            r8 = 0
            r14.f20486q = r8
            if (r1 == 0) goto L_0x0139
            if (r7 == r2) goto L_0x0133
        L_0x0121:
            boolean r1 = r0.mo15043l()
            long r2 = r14.f20486q
            long r2 = r2 << r5
            int r7 = r0.mo15034c(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f20486q = r2
            if (r1 != 0) goto L_0x0121
            goto L_0x0139
        L_0x0133:
            long r1 = m23772g(r0)
            r14.f20486q = r1
        L_0x0139:
            boolean r1 = r0.mo15043l()
            if (r1 == 0) goto L_0x0157
            r0.mo15041j(r5)
            goto L_0x0157
        L_0x0143:
            com.google.android.gms.internal.ads.ea0 r15 = com.google.android.gms.internal.ads.ea0.m11990a(r6, r6)
            throw r15
        L_0x0148:
            com.google.android.gms.internal.ads.ea0 r15 = com.google.android.gms.internal.ads.ea0.m11990a(r6, r6)
            throw r15
        L_0x014d:
            com.google.android.gms.internal.ads.ea0 r15 = com.google.android.gms.internal.ads.ea0.m11990a(r6, r6)
            throw r15
        L_0x0152:
            boolean r1 = r14.f20481l
            if (r1 != 0) goto L_0x0157
            goto L_0x01b9
        L_0x0157:
            int r1 = r14.f20482m
            if (r1 != 0) goto L_0x01c9
            int r1 = r14.f20483n
            if (r1 != 0) goto L_0x01c4
            int r1 = r14.f20484o
            if (r1 != 0) goto L_0x01bf
            r1 = 0
        L_0x0164:
            int r2 = r0.mo15034c(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01bd
            int r1 = r0.mo15033b()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.y22 r2 = r14.f20471b
            int r1 = r1 >> 3
            r2.mo15293f(r1)
            goto L_0x018e
        L_0x017e:
            com.google.android.gms.internal.ads.y22 r1 = r14.f20471b
            byte[] r1 = r1.mo15295h()
            int r2 = r10 * 8
            r0.mo15037f(r1, r4, r2)
            com.google.android.gms.internal.ads.y22 r1 = r14.f20471b
            r1.mo15293f(r4)
        L_0x018e:
            com.google.android.gms.internal.ads.r r1 = r14.f20473d
            com.google.android.gms.internal.ads.y22 r2 = r14.f20471b
            r1.mo8821c(r2, r10)
            long r7 = r14.f20480k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.r r6 = r14.f20473d
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo8824f(r7, r9, r10, r11, r12)
            long r1 = r14.f20480k
            long r5 = r14.f20488s
            long r1 = r1 + r5
            r14.f20480k = r1
        L_0x01af:
            boolean r1 = r14.f20485p
            if (r1 == 0) goto L_0x01b9
            long r1 = r14.f20486q
            int r2 = (int) r1
            r0.mo15041j(r2)
        L_0x01b9:
            r14.f20476g = r4
            goto L_0x0005
        L_0x01bd:
            r1 = r10
            goto L_0x0164
        L_0x01bf:
            com.google.android.gms.internal.ads.ea0 r15 = com.google.android.gms.internal.ads.ea0.m11990a(r6, r6)
            throw r15
        L_0x01c4:
            com.google.android.gms.internal.ads.ea0 r15 = com.google.android.gms.internal.ads.ea0.m11990a(r6, r6)
            throw r15
        L_0x01c9:
            com.google.android.gms.internal.ads.ea0 r15 = com.google.android.gms.internal.ads.ea0.m11990a(r6, r6)
            throw r15
        L_0x01ce:
            int r0 = r14.f20479j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.mo15306s()
            r0 = r0 | r2
            r14.f20478i = r0
            com.google.android.gms.internal.ads.y22 r2 = r14.f20471b
            byte[] r3 = r2.mo15295h()
            int r3 = r3.length
            if (r0 <= r3) goto L_0x01f2
            r2.mo15290c(r0)
            com.google.android.gms.internal.ads.x12 r0 = r14.f20472c
            com.google.android.gms.internal.ads.y22 r2 = r14.f20471b
            byte[] r2 = r2.mo15295h()
            int r3 = r2.length
            r0.mo15038g(r2, r3)
        L_0x01f2:
            r14.f20477h = r4
            r14.f20476g = r1
            goto L_0x0005
        L_0x01f8:
            int r0 = r15.mo15306s()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0208
            r14.f20479j = r0
            r14.f20476g = r3
            goto L_0x0005
        L_0x0208:
            if (r0 == r1) goto L_0x0005
            r14.f20476g = r4
            goto L_0x0005
        L_0x020e:
            int r0 = r15.mo15306s()
            if (r0 != r1) goto L_0x0005
            r14.f20476g = r2
            goto L_0x0005
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3058y6.mo8216b(com.google.android.gms.internal.ads.y22):void");
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f20473d = tn4.mo10060n(y7Var.mo15332a(), 1);
        this.f20474e = y7Var.mo15333b();
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f20480k = j;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
