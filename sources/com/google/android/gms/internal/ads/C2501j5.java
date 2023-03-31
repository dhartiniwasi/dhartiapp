package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2501j5 implements C2761q5 {

    /* renamed from: a */
    private final C2723p5 f11220a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f11221b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f11222c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2946v5 f11223d;

    /* renamed from: e */
    private int f11224e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f11225f;

    /* renamed from: g */
    private long f11226g;

    /* renamed from: h */
    private long f11227h;

    /* renamed from: i */
    private long f11228i;

    /* renamed from: j */
    private long f11229j;

    /* renamed from: k */
    private long f11230k;

    /* renamed from: l */
    private long f11231l;

    public C2501j5(C2946v5 v5Var, long j, long j2, long j3, long j4, boolean z) {
        v91.m22050d(j >= 0 && j2 > j);
        this.f11223d = v5Var;
        this.f11221b = j;
        this.f11222c = j2;
        if (j3 == j2 - j || z) {
            this.f11225f = j4;
            this.f11224e = 4;
        } else {
            this.f11224e = 0;
        }
        this.f11220a = new C2723p5();
    }

    /* renamed from: V */
    public final void mo11320V(long j) {
        this.f11227h = gb2.m13160b0(j, 0, this.f11225f - 1);
        this.f11224e = 2;
        this.f11228i = this.f11221b;
        this.f11229j = this.f11222c;
        this.f11230k = 0;
        this.f11231l = this.f11225f;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2643n mo11321a() {
        if (this.f11225f != 0) {
            return new C2463i5(this, (C2389g5) null);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo11322b(com.google.android.gms.internal.ads.rn4 r24) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f11224e
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00ea
            if (r2 == r3) goto L_0x00fd
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0015
            if (r2 == r10) goto L_0x00ab
            return r6
        L_0x0015:
            long r2 = r0.f11228i
            long r11 = r0.f11229j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0020
        L_0x001d:
            r11 = r6
            goto L_0x00a4
        L_0x0020:
            long r2 = r24.mo9003T()
            com.google.android.gms.internal.ads.p5 r13 = r0.f11220a
            boolean r11 = r13.mo13136c(r1, r11)
            if (r11 != 0) goto L_0x003c
            long r11 = r0.f11228i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0034
            goto L_0x00a4
        L_0x0034:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x003c:
            com.google.android.gms.internal.ads.p5 r11 = r0.f11220a
            r11.mo13135b(r1, r5)
            r24.mo9981W()
            long r11 = r0.f11227h
            com.google.android.gms.internal.ads.p5 r13 = r0.f11220a
            long r14 = r13.f15682b
            long r11 = r11 - r14
            int r8 = r13.f15684d
            int r9 = r13.f15685e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x005e
            r16 = 72000(0x11940, double:3.55727E-319)
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x005e
            goto L_0x001d
        L_0x005e:
            if (r9 >= 0) goto L_0x0065
            r0.f11229j = r2
            r0.f11231l = r14
            goto L_0x006f
        L_0x0065:
            long r2 = r24.mo9003T()
            long r4 = (long) r8
            long r2 = r2 + r4
            r0.f11228i = r2
            r0.f11230k = r14
        L_0x006f:
            long r2 = r0.f11229j
            long r4 = r0.f11228i
            long r14 = r2 - r4
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0080
            r0.f11229j = r4
            r11 = r4
            goto L_0x00a4
        L_0x0080:
            long r6 = (long) r8
            if (r9 > 0) goto L_0x0086
            r8 = 2
            goto L_0x0088
        L_0x0086:
            r8 = 1
        L_0x0088:
            long r17 = r24.mo9003T()
            long r6 = r6 * r8
            long r17 = r17 - r6
            long r11 = r11 * r14
            long r6 = r0.f11231l
            long r8 = r0.f11230k
            long r6 = r6 - r8
            long r11 = r11 / r6
            long r17 = r17 + r11
            r6 = -1
            long r21 = r2 + r6
            r19 = r4
            long r11 = com.google.android.gms.internal.ads.gb2.m13160b0(r17, r19, r21)
        L_0x00a4:
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            return r11
        L_0x00a9:
            r0.f11224e = r10
        L_0x00ab:
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            r2.mo13136c(r1, r6)
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            r3 = 0
            r2.mo13135b(r1, r3)
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            long r3 = r2.f15682b
            long r5 = r0.f11227h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00cd
            r24.mo9981W()
            r1 = 4
            r0.f11224e = r1
            long r1 = r0.f11230k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00cd:
            r4 = 2
            int r3 = r2.f15684d
            int r2 = r2.f15685e
            r6 = r1
            com.google.android.gms.internal.ads.fn4 r6 = (com.google.android.gms.internal.ads.fn4) r6
            int r3 = r3 + r2
            r2 = 0
            r6.mo10218n(r3, r2)
            long r2 = r24.mo9003T()
            r0.f11228i = r2
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            long r2 = r2.f15682b
            r0.f11230k = r2
            r6 = -1
            goto L_0x00ab
        L_0x00ea:
            long r4 = r24.mo9003T()
            r0.f11226g = r4
            r0.f11224e = r3
            long r6 = r0.f11222c
            r8 = -65307(0xffffffffffff00e5, double:NaN)
            long r6 = r6 + r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fd
            return r6
        L_0x00fd:
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            r2.mo13134a()
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            r4 = -1
            boolean r2 = r2.mo13136c(r1, r4)
            if (r2 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            r4 = 0
            r2.mo13135b(r1, r4)
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            int r5 = r2.f15684d
            int r2 = r2.f15685e
            r6 = r1
            com.google.android.gms.internal.ads.fn4 r6 = (com.google.android.gms.internal.ads.fn4) r6
            int r5 = r5 + r2
            r6.mo10218n(r5, r4)
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            long r4 = r2.f15682b
        L_0x0123:
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            int r6 = r2.f15681a
            r7 = 4
            r6 = r6 & r7
            if (r6 == r7) goto L_0x0158
            r6 = -1
            boolean r2 = r2.mo13136c(r1, r6)
            if (r2 == 0) goto L_0x0158
            long r8 = r24.mo9003T()
            long r10 = r0.f11222c
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0158
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            boolean r2 = r2.mo13135b(r1, r3)
            if (r2 == 0) goto L_0x0158
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            int r8 = r2.f15684d
            int r2 = r2.f15685e
            int r8 = r8 + r2
            boolean r2 = com.google.android.gms.internal.ads.un4.m21759e(r1, r8)
            if (r2 != 0) goto L_0x0153
            goto L_0x0158
        L_0x0153:
            com.google.android.gms.internal.ads.p5 r2 = r0.f11220a
            long r4 = r2.f15682b
            goto L_0x0123
        L_0x0158:
            r0.f11225f = r4
            r1 = 4
            r0.f11224e = r1
            long r1 = r0.f11226g
            return r1
        L_0x0160:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2501j5.mo11322b(com.google.android.gms.internal.ads.rn4):long");
    }
}
