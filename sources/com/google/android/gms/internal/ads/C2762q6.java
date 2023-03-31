package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2762q6 implements C2576l6 {

    /* renamed from: l */
    private static final float[] f16193l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C2206b8 f16194a;

    /* renamed from: b */
    private final y22 f16195b = new y22();

    /* renamed from: c */
    private final boolean[] f16196c = new boolean[4];

    /* renamed from: d */
    private final C2687o6 f16197d = new C2687o6(128);

    /* renamed from: e */
    private final C2168a7 f16198e = new C2168a7(178, 128);

    /* renamed from: f */
    private C2724p6 f16199f;

    /* renamed from: g */
    private long f16200g;

    /* renamed from: h */
    private String f16201h;

    /* renamed from: i */
    private C2792r f16202i;

    /* renamed from: j */
    private boolean f16203j;

    /* renamed from: k */
    private long f16204k = -9223372036854775807L;

    C2762q6(C2206b8 b8Var) {
        this.f16194a = b8Var;
    }

    /* renamed from: a */
    public final void mo8215a() {
        C2420h.m13650e(this.f16196c);
        this.f16197d.mo12836b();
        C2724p6 p6Var = this.f16199f;
        if (p6Var != null) {
            p6Var.mo13145d();
        }
        this.f16198e.mo8226b();
        this.f16200g = 0;
        this.f16204k = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8216b(com.google.android.gms.internal.ads.y22 r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.p6 r1 = r0.f16199f
            com.google.android.gms.internal.ads.v91.m22048b(r1)
            com.google.android.gms.internal.ads.r r1 = r0.f16202i
            com.google.android.gms.internal.ads.v91.m22048b(r1)
            int r1 = r19.mo15298k()
            int r2 = r19.mo15299l()
            byte[] r3 = r19.mo15295h()
            long r4 = r0.f16200g
            int r6 = r19.mo15296i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f16200g = r4
            com.google.android.gms.internal.ads.r r4 = r0.f16202i
            int r5 = r19.mo15296i()
            r6 = r19
            r4.mo8821c(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f16196c
            int r4 = com.google.android.gms.internal.ads.C2420h.m13646a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.f16203j
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.o6 r4 = r0.f16197d
            r4.mo12835a(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.p6 r4 = r0.f16199f
            r4.mo13142a(r3, r1, r2)
            com.google.android.gms.internal.ads.a7 r4 = r0.f16198e
            r4.mo8225a(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r19.mo15295h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f16203j
            if (r9 != 0) goto L_0x0181
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.o6 r9 = r0.f16197d
            r9.mo12835a(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.o6 r12 = r0.f16197d
            boolean r9 = r12.mo12837c(r7, r9)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.r r9 = r0.f16202i
            com.google.android.gms.internal.ads.o6 r12 = r0.f16197d
            int r13 = r12.f14904d
            java.lang.String r14 = r0.f16201h
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.f14905e
            int r12 = r12.f14903c
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.x12 r15 = new com.google.android.gms.internal.ads.x12
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.mo15042k(r13)
            r10 = 4
            r15.mo15042k(r10)
            r15.mo15040i()
            r13 = 8
            r15.mo15041j(r13)
            boolean r16 = r15.mo15043l()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.mo15041j(r10)
            r15.mo15041j(r11)
        L_0x00a2:
            int r10 = r15.mo15034c(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r10 != r5) goto L_0x00c7
            r5 = 8
            int r10 = r15.mo15034c(r5)
            int r5 = r15.mo15034c(r5)
            if (r5 != 0) goto L_0x00c2
            com.google.android.gms.internal.ads.ot1.m18060e(r13, r11)
            goto L_0x00d4
        L_0x00c2:
            float r10 = (float) r10
            float r5 = (float) r5
            float r16 = r10 / r5
            goto L_0x00ce
        L_0x00c7:
            r5 = 7
            if (r10 >= r5) goto L_0x00d1
            float[] r5 = f16193l
            r16 = r5[r10]
        L_0x00ce:
            r5 = r16
            goto L_0x00d6
        L_0x00d1:
            com.google.android.gms.internal.ads.ot1.m18060e(r13, r11)
        L_0x00d4:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            boolean r10 = r15.mo15043l()
            r11 = 2
            if (r10 == 0) goto L_0x0110
            r15.mo15041j(r11)
            r10 = 1
            r15.mo15041j(r10)
            boolean r10 = r15.mo15043l()
            if (r10 == 0) goto L_0x0110
            r10 = 15
            r15.mo15041j(r10)
            r15.mo15040i()
            r15.mo15041j(r10)
            r15.mo15040i()
            r15.mo15041j(r10)
            r15.mo15040i()
            r11 = 3
            r15.mo15041j(r11)
            r11 = 11
            r15.mo15041j(r11)
            r15.mo15040i()
            r15.mo15041j(r10)
            r15.mo15040i()
        L_0x0110:
            r10 = 2
            int r10 = r15.mo15034c(r10)
            if (r10 == 0) goto L_0x011c
            java.lang.String r10 = "Unhandled video object layer shape"
            com.google.android.gms.internal.ads.ot1.m18060e(r13, r10)
        L_0x011c:
            r15.mo15040i()
            r10 = 16
            int r10 = r15.mo15034c(r10)
            r15.mo15040i()
            boolean r11 = r15.mo15043l()
            if (r11 == 0) goto L_0x0143
            if (r10 != 0) goto L_0x0136
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            com.google.android.gms.internal.ads.ot1.m18060e(r13, r10)
            goto L_0x0143
        L_0x0136:
            int r10 = r10 + -1
            r11 = 0
        L_0x0139:
            if (r10 <= 0) goto L_0x0140
            int r11 = r11 + 1
            int r10 = r10 >> 1
            goto L_0x0139
        L_0x0140:
            r15.mo15041j(r11)
        L_0x0143:
            r15.mo15040i()
            r10 = 13
            int r11 = r15.mo15034c(r10)
            r15.mo15040i()
            int r10 = r15.mo15034c(r10)
            r15.mo15040i()
            r15.mo15040i()
            com.google.android.gms.internal.ads.e2 r13 = new com.google.android.gms.internal.ads.e2
            r13.<init>()
            r13.mo9764h(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo9776s(r14)
            r13.mo9781x(r11)
            r13.mo9760f(r10)
            r13.mo9773p(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo9766i(r5)
            com.google.android.gms.internal.ads.g4 r5 = r13.mo9782y()
            r9.mo8823e(r5)
            r5 = 1
            r0.f16203j = r5
            goto L_0x0183
        L_0x0181:
            r17 = r5
        L_0x0183:
            com.google.android.gms.internal.ads.p6 r5 = r0.f16199f
            r5.mo13142a(r3, r1, r4)
            com.google.android.gms.internal.ads.a7 r5 = r0.f16198e
            if (r8 <= 0) goto L_0x0191
            r5.mo8225a(r3, r1, r4)
            r10 = 0
            goto L_0x0192
        L_0x0191:
            int r10 = -r8
        L_0x0192:
            com.google.android.gms.internal.ads.a7 r1 = r0.f16198e
            boolean r1 = r1.mo8228d(r10)
            if (r1 == 0) goto L_0x01b8
            com.google.android.gms.internal.ads.a7 r1 = r0.f16198e
            byte[] r5 = r1.f6441d
            int r1 = r1.f6442e
            int r1 = com.google.android.gms.internal.ads.C2420h.m13647b(r5, r1)
            com.google.android.gms.internal.ads.y22 r5 = r0.f16195b
            int r8 = com.google.android.gms.internal.ads.gb2.f9812a
            com.google.android.gms.internal.ads.a7 r8 = r0.f16198e
            byte[] r8 = r8.f6441d
            r5.mo15291d(r8, r1)
            com.google.android.gms.internal.ads.b8 r1 = r0.f16194a
            long r8 = r0.f16204k
            com.google.android.gms.internal.ads.y22 r5 = r0.f16195b
            r1.mo8691a(r8, r5)
        L_0x01b8:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01ce
            byte[] r5 = r19.mo15295h()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01cc
            com.google.android.gms.internal.ads.a7 r5 = r0.f16198e
            r5.mo8227c(r1)
        L_0x01cc:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01ce:
            int r1 = r2 - r4
            long r4 = r0.f16200g
            com.google.android.gms.internal.ads.p6 r8 = r0.f16199f
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f16203j
            r8.mo13143b(r4, r1, r9)
            com.google.android.gms.internal.ads.p6 r1 = r0.f16199f
            long r4 = r0.f16204k
            r1.mo13144c(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2762q6.mo8216b(com.google.android.gms.internal.ads.y22):void");
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f16201h = y7Var.mo15333b();
        C2792r n = tn4.mo10060n(y7Var.mo15332a(), 2);
        this.f16202i = n;
        this.f16199f = new C2724p6(n);
        this.f16194a.mo8692b(tn4, y7Var);
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16204k = j;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
