package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2910u6 implements C2576l6 {

    /* renamed from: a */
    private final C2651n7 f18395a;

    /* renamed from: b */
    private final C2168a7 f18396b = new C2168a7(7, 128);

    /* renamed from: c */
    private final C2168a7 f18397c = new C2168a7(8, 128);

    /* renamed from: d */
    private final C2168a7 f18398d = new C2168a7(6, 128);

    /* renamed from: e */
    private long f18399e;

    /* renamed from: f */
    private final boolean[] f18400f = new boolean[3];

    /* renamed from: g */
    private String f18401g;

    /* renamed from: h */
    private C2792r f18402h;

    /* renamed from: i */
    private C2873t6 f18403i;

    /* renamed from: j */
    private boolean f18404j;

    /* renamed from: k */
    private long f18405k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f18406l;

    /* renamed from: m */
    private final y22 f18407m = new y22();

    public C2910u6(C2651n7 n7Var, boolean z, boolean z2) {
        this.f18395a = n7Var;
    }

    /* renamed from: f */
    private final void m21429f(byte[] bArr, int i, int i2) {
        if (!this.f18404j) {
            this.f18396b.mo8225a(bArr, i, i2);
            this.f18397c.mo8225a(bArr, i, i2);
        }
        this.f18398d.mo8225a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f18399e = 0;
        this.f18406l = false;
        this.f18405k = -9223372036854775807L;
        C2420h.m13650e(this.f18400f);
        this.f18396b.mo8226b();
        this.f18397c.mo8226b();
        this.f18398d.mo8226b();
        C2873t6 t6Var = this.f18403i;
        if (t6Var != null) {
            t6Var.mo14207c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0181 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8216b(com.google.android.gms.internal.ads.y22 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.r r1 = r0.f18402h
            com.google.android.gms.internal.ads.v91.m22048b(r1)
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a
            int r1 = r20.mo15298k()
            int r2 = r20.mo15299l()
            byte[] r3 = r20.mo15295h()
            long r4 = r0.f18399e
            int r6 = r20.mo15296i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f18399e = r4
            com.google.android.gms.internal.ads.r r4 = r0.f18402h
            int r5 = r20.mo15296i()
            r6 = r20
            r4.mo8821c(r6, r5)
        L_0x002a:
            boolean[] r4 = r0.f18400f
            int r4 = com.google.android.gms.internal.ads.C2420h.m13646a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x0191
            int r5 = r4 + 3
            byte r6 = r3[r5]
            r10 = r6 & 31
            int r6 = r4 - r1
            if (r6 <= 0) goto L_0x003f
            r0.m21429f(r3, r1, r4)
        L_0x003f:
            int r14 = r2 - r4
            long r7 = r0.f18399e
            long r11 = (long) r14
            long r8 = r7 - r11
            if (r6 >= 0) goto L_0x004a
            int r4 = -r6
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            long r6 = r0.f18405k
            boolean r11 = r0.f18404j
            r12 = 4
            if (r11 == 0) goto L_0x0058
        L_0x0052:
            r18 = r2
            r17 = r5
            goto L_0x0137
        L_0x0058:
            com.google.android.gms.internal.ads.a7 r11 = r0.f18396b
            r11.mo8228d(r4)
            com.google.android.gms.internal.ads.a7 r11 = r0.f18397c
            r11.mo8228d(r4)
            boolean r11 = r0.f18404j
            if (r11 != 0) goto L_0x00fc
            com.google.android.gms.internal.ads.a7 r11 = r0.f18396b
            boolean r11 = r11.mo8229e()
            if (r11 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.a7 r11 = r0.f18397c
            boolean r11 = r11.mo8229e()
            if (r11 == 0) goto L_0x0052
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.internal.ads.a7 r13 = r0.f18396b
            byte[] r15 = r13.f6441d
            int r13 = r13.f6442e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.a7 r13 = r0.f18397c
            byte[] r15 = r13.f6441d
            int r13 = r13.f6442e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.a7 r13 = r0.f18396b
            byte[] r15 = r13.f6441d
            int r13 = r13.f6442e
            com.google.android.gms.internal.ads.g r13 = com.google.android.gms.internal.ads.C2420h.m13649d(r15, r12, r13)
            com.google.android.gms.internal.ads.a7 r15 = r0.f18397c
            byte[] r1 = r15.f6441d
            int r15 = r15.f6442e
            com.google.android.gms.internal.ads.f r1 = com.google.android.gms.internal.ads.C2420h.m13648c(r1, r12, r15)
            int r15 = r13.f9615a
            int r12 = r13.f9616b
            r17 = r5
            int r5 = r13.f9617c
            java.lang.String r5 = com.google.android.gms.internal.ads.xb1.m23166a(r15, r12, r5)
            com.google.android.gms.internal.ads.r r12 = r0.f18402h
            com.google.android.gms.internal.ads.e2 r15 = new com.google.android.gms.internal.ads.e2
            r15.<init>()
            r18 = r2
            java.lang.String r2 = r0.f18401g
            r15.mo9764h(r2)
            java.lang.String r2 = "video/avc"
            r15.mo9776s(r2)
            r15.mo9761f0(r5)
            int r2 = r13.f9619e
            r15.mo9781x(r2)
            int r2 = r13.f9620f
            r15.mo9760f(r2)
            float r2 = r13.f9621g
            r15.mo9773p(r2)
            r15.mo9766i(r11)
            com.google.android.gms.internal.ads.g4 r2 = r15.mo9782y()
            r12.mo8823e(r2)
            r2 = 1
            r0.f18404j = r2
            com.google.android.gms.internal.ads.t6 r2 = r0.f18403i
            r2.mo14206b(r13)
            com.google.android.gms.internal.ads.t6 r2 = r0.f18403i
            r2.mo14205a(r1)
            com.google.android.gms.internal.ads.a7 r1 = r0.f18396b
            r1.mo8226b()
            com.google.android.gms.internal.ads.a7 r1 = r0.f18397c
            r1.mo8226b()
            goto L_0x0137
        L_0x00fc:
            r18 = r2
            r17 = r5
            com.google.android.gms.internal.ads.a7 r1 = r0.f18396b
            boolean r2 = r1.mo8229e()
            if (r2 == 0) goto L_0x011c
            byte[] r2 = r1.f6441d
            int r1 = r1.f6442e
            r5 = 4
            com.google.android.gms.internal.ads.g r1 = com.google.android.gms.internal.ads.C2420h.m13649d(r2, r5, r1)
            com.google.android.gms.internal.ads.t6 r2 = r0.f18403i
            r2.mo14206b(r1)
            com.google.android.gms.internal.ads.a7 r1 = r0.f18396b
            r1.mo8226b()
            goto L_0x0137
        L_0x011c:
            r5 = 4
            com.google.android.gms.internal.ads.a7 r1 = r0.f18397c
            boolean r2 = r1.mo8229e()
            if (r2 == 0) goto L_0x0137
            byte[] r2 = r1.f6441d
            int r1 = r1.f6442e
            com.google.android.gms.internal.ads.f r1 = com.google.android.gms.internal.ads.C2420h.m13648c(r2, r5, r1)
            com.google.android.gms.internal.ads.t6 r2 = r0.f18403i
            r2.mo14205a(r1)
            com.google.android.gms.internal.ads.a7 r1 = r0.f18397c
            r1.mo8226b()
        L_0x0137:
            com.google.android.gms.internal.ads.a7 r1 = r0.f18398d
            boolean r1 = r1.mo8228d(r4)
            if (r1 == 0) goto L_0x015f
            com.google.android.gms.internal.ads.a7 r1 = r0.f18398d
            byte[] r2 = r1.f6441d
            int r1 = r1.f6442e
            int r1 = com.google.android.gms.internal.ads.C2420h.m13647b(r2, r1)
            com.google.android.gms.internal.ads.y22 r2 = r0.f18407m
            com.google.android.gms.internal.ads.a7 r4 = r0.f18398d
            byte[] r4 = r4.f6441d
            r2.mo15291d(r4, r1)
            com.google.android.gms.internal.ads.y22 r1 = r0.f18407m
            r2 = 4
            r1.mo15293f(r2)
            com.google.android.gms.internal.ads.n7 r1 = r0.f18395a
            com.google.android.gms.internal.ads.y22 r2 = r0.f18407m
            r1.mo12538a(r6, r2)
        L_0x015f:
            com.google.android.gms.internal.ads.t6 r11 = r0.f18403i
            boolean r15 = r0.f18404j
            boolean r1 = r0.f18406l
            r12 = r8
            r16 = r1
            boolean r1 = r11.mo14209e(r12, r14, r15, r16)
            if (r1 == 0) goto L_0x0171
            r1 = 0
            r0.f18406l = r1
        L_0x0171:
            long r11 = r0.f18405k
            boolean r1 = r0.f18404j
            if (r1 != 0) goto L_0x0181
            com.google.android.gms.internal.ads.a7 r1 = r0.f18396b
            r1.mo8227c(r10)
            com.google.android.gms.internal.ads.a7 r1 = r0.f18397c
            r1.mo8227c(r10)
        L_0x0181:
            com.google.android.gms.internal.ads.a7 r1 = r0.f18398d
            r1.mo8227c(r10)
            com.google.android.gms.internal.ads.t6 r7 = r0.f18403i
            r7.mo14208d(r8, r10, r11)
            r1 = r17
            r2 = r18
            goto L_0x002a
        L_0x0191:
            r0.m21429f(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2910u6.mo8216b(com.google.android.gms.internal.ads.y22):void");
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f18401g = y7Var.mo15333b();
        C2792r n = tn4.mo10060n(y7Var.mo15332a(), 2);
        this.f18402h = n;
        this.f18403i = new C2873t6(n, false, false);
        this.f18395a.mo12539b(tn4, y7Var);
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f18405k = j;
        }
        this.f18406l |= (i & 2) != 0;
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
