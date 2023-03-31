package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2650n6 implements C2576l6 {

    /* renamed from: q */
    private static final double[] f13861q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f13862a;

    /* renamed from: b */
    private C2792r f13863b;

    /* renamed from: c */
    private final C2206b8 f13864c;

    /* renamed from: d */
    private final y22 f13865d;

    /* renamed from: e */
    private final C2168a7 f13866e;

    /* renamed from: f */
    private final boolean[] f13867f = new boolean[4];

    /* renamed from: g */
    private final C2613m6 f13868g = new C2613m6(128);

    /* renamed from: h */
    private long f13869h;

    /* renamed from: i */
    private boolean f13870i;

    /* renamed from: j */
    private boolean f13871j;

    /* renamed from: k */
    private long f13872k;

    /* renamed from: l */
    private long f13873l;

    /* renamed from: m */
    private long f13874m;

    /* renamed from: n */
    private long f13875n;

    /* renamed from: o */
    private boolean f13876o;

    /* renamed from: p */
    private boolean f13877p;

    C2650n6(C2206b8 b8Var) {
        y22 y22;
        this.f13864c = b8Var;
        if (b8Var != null) {
            this.f13866e = new C2168a7(178, 128);
            y22 = new y22();
        } else {
            y22 = null;
            this.f13866e = null;
        }
        this.f13865d = y22;
        this.f13873l = -9223372036854775807L;
        this.f13875n = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void mo8215a() {
        C2420h.m13650e(this.f13867f);
        this.f13868g.mo12284b();
        C2168a7 a7Var = this.f13866e;
        if (a7Var != null) {
            a7Var.mo8226b();
        }
        this.f13869h = 0;
        this.f13870i = false;
        this.f13873l = -9223372036854775807L;
        this.f13875n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0189  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8216b(com.google.android.gms.internal.ads.y22 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.r r1 = r0.f13863b
            com.google.android.gms.internal.ads.v91.m22048b(r1)
            int r1 = r20.mo15298k()
            int r2 = r20.mo15299l()
            byte[] r3 = r20.mo15295h()
            long r4 = r0.f13869h
            int r6 = r20.mo15296i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f13869h = r4
            com.google.android.gms.internal.ads.r r4 = r0.f13863b
            int r5 = r20.mo15296i()
            r6 = r20
            r4.mo8821c(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f13867f
            int r4 = com.google.android.gms.internal.ads.C2420h.m13646a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f13871j
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.m6 r4 = r0.f13868g
            r4.mo12283a(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.a7 r4 = r0.f13866e
            if (r4 == 0) goto L_0x0040
            r4.mo8225a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r20.mo15295h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f13871j
            if (r9 != 0) goto L_0x0130
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.m6 r9 = r0.f13868g
            r9.mo12283a(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.m6 r12 = r0.f13868g
            boolean r9 = r12.mo12285c(r7, r9)
            if (r9 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.m6 r9 = r0.f13868g
            java.lang.String r12 = r0.f13862a
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.f13230d
            int r14 = r9.f13228b
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            byte r15 = r13[r14]
            r16 = 5
            byte r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r14
            int r17 = r10 >> 4
            r15 = r15 | r17
            r10 = r10 & 15
            r11 = 8
            int r10 = r10 << r11
            r18 = 6
            byte r11 = r13[r18]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            r11 = 7
            byte r14 = r13[r11]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r11 = 4
            int r14 = r14 >> r11
            r11 = 2
            if (r14 == r11) goto L_0x00af
            r11 = 3
            if (r14 == r11) goto L_0x00a9
            r11 = 4
            if (r14 == r11) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r10 * 121
            float r11 = (float) r11
            int r14 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r10 * 16
            float r11 = (float) r11
            int r14 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r10 * 4
            float r11 = (float) r11
            int r14 = r15 * 3
        L_0x00b4:
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x00b6:
            com.google.android.gms.internal.ads.e2 r14 = new com.google.android.gms.internal.ads.e2
            r14.<init>()
            r14.mo9764h(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.mo9776s(r12)
            r14.mo9781x(r15)
            r14.mo9760f(r10)
            r14.mo9773p(r11)
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r14.mo9766i(r10)
            com.google.android.gms.internal.ads.g4 r10 = r14.mo9782y()
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            r14 = 0
            if (r11 < 0) goto L_0x010f
            r12 = 8
            if (r11 >= r12) goto L_0x010f
            double[] r12 = f13861q
            r11 = r12[r11]
            int r9 = r9.f13229c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x0105
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r15
            int r9 = r9 + 1
            r16 = r5
            double r5 = (double) r9
            double r13 = r13 / r5
            double r11 = r11 * r13
            goto L_0x0107
        L_0x0105:
            r16 = r5
        L_0x0107:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 / r11
            long r14 = (long) r5
            goto L_0x0111
        L_0x010f:
            r16 = r5
        L_0x0111:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            android.util.Pair r5 = android.util.Pair.create(r10, r5)
            com.google.android.gms.internal.ads.r r6 = r0.f13863b
            java.lang.Object r9 = r5.first
            com.google.android.gms.internal.ads.g4 r9 = (com.google.android.gms.internal.ads.C2388g4) r9
            r6.mo8823e(r9)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.f13872k = r5
            r5 = 1
            r0.f13871j = r5
            goto L_0x0132
        L_0x0130:
            r16 = r5
        L_0x0132:
            com.google.android.gms.internal.ads.a7 r5 = r0.f13866e
            r6 = 178(0xb2, float:2.5E-43)
            if (r5 == 0) goto L_0x017a
            if (r8 <= 0) goto L_0x013f
            r5.mo8225a(r3, r1, r4)
            r1 = 0
            goto L_0x0140
        L_0x013f:
            int r1 = -r8
        L_0x0140:
            com.google.android.gms.internal.ads.a7 r5 = r0.f13866e
            boolean r1 = r5.mo8228d(r1)
            if (r1 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.a7 r1 = r0.f13866e
            byte[] r5 = r1.f6441d
            int r1 = r1.f6442e
            int r1 = com.google.android.gms.internal.ads.C2420h.m13647b(r5, r1)
            com.google.android.gms.internal.ads.y22 r5 = r0.f13865d
            int r8 = com.google.android.gms.internal.ads.gb2.f9812a
            com.google.android.gms.internal.ads.a7 r8 = r0.f13866e
            byte[] r8 = r8.f6441d
            r5.mo15291d(r8, r1)
            com.google.android.gms.internal.ads.b8 r1 = r0.f13864c
            long r8 = r0.f13875n
            com.google.android.gms.internal.ads.y22 r5 = r0.f13865d
            r1.mo8691a(r8, r5)
        L_0x0166:
            if (r7 != r6) goto L_0x017a
            byte[] r1 = r20.mo15295h()
            int r5 = r4 + 2
            byte r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L_0x0178
            com.google.android.gms.internal.ads.a7 r1 = r0.f13866e
            r1.mo8227c(r6)
        L_0x0178:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x017a:
            if (r7 == 0) goto L_0x0189
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x0181
            goto L_0x0189
        L_0x0181:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01e4
            r1 = 1
            r0.f13876o = r1
            goto L_0x01e4
        L_0x0189:
            int r1 = r2 - r4
            boolean r4 = r0.f13877p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01af
            boolean r4 = r0.f13871j
            if (r4 == 0) goto L_0x01af
            long r9 = r0.f13875n
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01af
            boolean r11 = r0.f13876o
            long r12 = r0.f13869h
            long r14 = r0.f13874m
            com.google.android.gms.internal.ads.r r8 = r0.f13863b
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            r14 = 0
            r13 = r1
            r8.mo8824f(r9, r11, r12, r13, r14)
        L_0x01af:
            boolean r4 = r0.f13870i
            if (r4 == 0) goto L_0x01bb
            boolean r4 = r0.f13877p
            if (r4 == 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r1 = 0
            r4 = 1
            goto L_0x01dd
        L_0x01bb:
            long r8 = r0.f13869h
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f13874m = r8
            long r8 = r0.f13873l
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01c8
            goto L_0x01d3
        L_0x01c8:
            long r8 = r0.f13875n
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d2
            long r10 = r0.f13872k
            long r8 = r8 + r10
            goto L_0x01d3
        L_0x01d2:
            r8 = r5
        L_0x01d3:
            r0.f13875n = r8
            r1 = 0
            r0.f13876o = r1
            r0.f13873l = r5
            r4 = 1
            r0.f13870i = r4
        L_0x01dd:
            if (r7 != 0) goto L_0x01e1
            r10 = 1
            goto L_0x01e2
        L_0x01e1:
            r10 = 0
        L_0x01e2:
            r0.f13877p = r10
        L_0x01e4:
            r6 = r20
            r1 = r16
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2650n6.mo8216b(com.google.android.gms.internal.ads.y22):void");
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f13862a = y7Var.mo15333b();
        this.f13863b = tn4.mo10060n(y7Var.mo15332a(), 2);
        C2206b8 b8Var = this.f13864c;
        if (b8Var != null) {
            b8Var.mo8692b(tn4, y7Var);
        }
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        this.f13873l = j;
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
