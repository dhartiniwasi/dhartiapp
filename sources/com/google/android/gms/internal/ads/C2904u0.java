package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2904u0 implements qn4 {

    /* renamed from: q */
    public static final xn4 f18305q = C2867t0.f17801b;

    /* renamed from: a */
    private final y22 f18306a = new y22(4);

    /* renamed from: b */
    private final y22 f18307b = new y22(9);

    /* renamed from: c */
    private final y22 f18308c = new y22(11);

    /* renamed from: d */
    private final y22 f18309d = new y22();

    /* renamed from: e */
    private final C2941v0 f18310e = new C2941v0();

    /* renamed from: f */
    private tn4 f18311f;

    /* renamed from: g */
    private int f18312g = 1;

    /* renamed from: h */
    private boolean f18313h;

    /* renamed from: i */
    private long f18314i;

    /* renamed from: j */
    private int f18315j;

    /* renamed from: k */
    private int f18316k;

    /* renamed from: l */
    private int f18317l;

    /* renamed from: m */
    private long f18318m;

    /* renamed from: n */
    private boolean f18319n;

    /* renamed from: o */
    private C2830s0 f18320o;

    /* renamed from: p */
    private C3052y0 f18321p;

    /* renamed from: a */
    private final y22 m21358a(rn4 rn4) throws IOException {
        if (this.f18317l > this.f18309d.mo15297j()) {
            y22 y22 = this.f18309d;
            int j = y22.mo15297j();
            y22.mo15291d(new byte[Math.max(j + j, this.f18317l)], 0);
        } else {
            this.f18309d.mo15293f(0);
        }
        this.f18309d.mo15292e(this.f18317l);
        ((fn4) rn4).mo9984g(this.f18309d.mo15295h(), 0, this.f18317l, false);
        return this.f18309d;
    }

    /* renamed from: d */
    private final void m21359d() {
        if (!this.f18319n) {
            this.f18311f.mo10059j(new C2606m(-9223372036854775807L, 0));
            this.f18319n = true;
        }
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        fn4 fn4 = (fn4) rn4;
        fn4.mo9986i(this.f18306a.mo15295h(), 0, 3, false);
        this.f18306a.mo15293f(0);
        if (this.f18306a.mo15308u() != 4607062) {
            return false;
        }
        fn4.mo9986i(this.f18306a.mo15295h(), 0, 2, false);
        this.f18306a.mo15293f(0);
        if ((this.f18306a.mo15310w() & 250) != 0) {
            return false;
        }
        fn4.mo9986i(this.f18306a.mo15295h(), 0, 4, false);
        this.f18306a.mo15293f(0);
        int m = this.f18306a.mo15300m();
        rn4.mo9981W();
        fn4 fn42 = (fn4) rn4;
        fn42.mo10217m(m, false);
        fn42.mo9986i(this.f18306a.mo15295h(), 0, 4, false);
        this.f18306a.mo15293f(0);
        if (this.f18306a.mo15300m() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f18311f = tn4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r17, com.google.android.gms.internal.ads.C2532k r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.tn4 r2 = r0.f18311f
            com.google.android.gms.internal.ads.v91.m22048b(r2)
        L_0x0009:
            int r2 = r0.f18312g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x011f
            r10 = 3
            if (r2 == r6) goto L_0x0111
            if (r2 == r10) goto L_0x00c9
            if (r2 != r7) goto L_0x00c3
            boolean r2 = r0.f18313h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f18314i
            long r14 = r0.f18318m
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.v0 r2 = r0.f18310e
            long r2 = r2.mo14641d()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.f18318m
        L_0x003b:
            int r14 = r0.f18316k
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.s0 r14 = r0.f18320o
            if (r14 == 0) goto L_0x0053
            r16.m21359d()
            com.google.android.gms.internal.ads.s0 r4 = r0.f18320o
            com.google.android.gms.internal.ads.y22 r5 = r16.m21358a(r17)
            boolean r2 = r4.mo15014c(r5, r2)
        L_0x0050:
            r3 = 1
            goto L_0x00a2
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.android.gms.internal.ads.y0 r4 = r0.f18321p
            if (r4 == 0) goto L_0x0098
            r16.m21359d()
            com.google.android.gms.internal.ads.y0 r4 = r0.f18321p
            com.google.android.gms.internal.ads.y22 r5 = r16.m21358a(r17)
            boolean r2 = r4.mo15014c(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x0098
            boolean r4 = r0.f18319n
            if (r4 != 0) goto L_0x0098
            com.google.android.gms.internal.ads.v0 r4 = r0.f18310e
            com.google.android.gms.internal.ads.y22 r5 = r16.m21358a(r17)
            boolean r2 = r4.mo15014c(r5, r2)
            com.google.android.gms.internal.ads.v0 r3 = r0.f18310e
            long r4 = r3.mo14641d()
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.tn4 r14 = r0.f18311f
            com.google.android.gms.internal.ads.c r15 = new com.google.android.gms.internal.ads.c
            long[] r10 = r3.mo14642e()
            long[] r3 = r3.mo14643f()
            r15.<init>(r10, r3, r4)
            r14.mo10059j(r15)
            r0.f18319n = r9
            goto L_0x0050
        L_0x0098:
            int r2 = r0.f18317l
            r3 = r1
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r3.mo10218n(r2, r8)
            r2 = 0
            r3 = 0
        L_0x00a2:
            boolean r4 = r0.f18313h
            if (r4 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x00bc
            r0.f18313h = r9
            com.google.android.gms.internal.ads.v0 r2 = r0.f18310e
            long r4 = r2.mo14641d()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00b8
            long r4 = r0.f18318m
            long r10 = -r4
            goto L_0x00ba
        L_0x00b8:
            r10 = 0
        L_0x00ba:
            r0.f18314i = r10
        L_0x00bc:
            r0.f18315j = r7
            r0.f18312g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            byte[] r2 = r2.mo15295h()
            r4 = 11
            boolean r2 = r1.mo9984g(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00d8
            return r3
        L_0x00d8:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            r2.mo15293f(r8)
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            int r2 = r2.mo15306s()
            r0.f18316k = r2
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            int r2 = r2.mo15308u()
            r0.f18317l = r2
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            int r2 = r2.mo15308u()
            long r2 = (long) r2
            r0.f18318m = r2
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            int r2 = r2.mo15306s()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f18318m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f18318m = r2
            com.google.android.gms.internal.ads.y22 r2 = r0.f18308c
            r2.mo15294g(r10)
            r0.f18312g = r7
            goto L_0x0009
        L_0x0111:
            int r2 = r0.f18315j
            r3 = r1
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r3.mo10218n(r2, r8)
            r0.f18315j = r8
            r0.f18312g = r10
            goto L_0x0009
        L_0x011f:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18307b
            byte[] r2 = r2.mo15295h()
            boolean r2 = r1.mo9984g(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x012c
            return r3
        L_0x012c:
            com.google.android.gms.internal.ads.y22 r2 = r0.f18307b
            r2.mo15293f(r8)
            com.google.android.gms.internal.ads.y22 r2 = r0.f18307b
            r2.mo15294g(r7)
            com.google.android.gms.internal.ads.y22 r2 = r0.f18307b
            int r2 = r2.mo15306s()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.s0 r2 = r0.f18320o
            if (r2 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.s0 r2 = new com.google.android.gms.internal.ads.s0
            com.google.android.gms.internal.ads.tn4 r7 = r0.f18311f
            com.google.android.gms.internal.ads.r r4 = r7.mo10060n(r4, r9)
            r2.<init>(r4)
            r0.f18320o = r2
        L_0x0152:
            if (r3 == 0) goto L_0x0165
            com.google.android.gms.internal.ads.y0 r2 = r0.f18321p
            if (r2 != 0) goto L_0x0165
            com.google.android.gms.internal.ads.y0 r2 = new com.google.android.gms.internal.ads.y0
            com.google.android.gms.internal.ads.tn4 r3 = r0.f18311f
            com.google.android.gms.internal.ads.r r3 = r3.mo10060n(r5, r6)
            r2.<init>(r3)
            r0.f18321p = r2
        L_0x0165:
            com.google.android.gms.internal.ads.tn4 r2 = r0.f18311f
            r2.mo10058C()
            com.google.android.gms.internal.ads.y22 r2 = r0.f18307b
            int r2 = r2.mo15300m()
            int r2 = r2 + -5
            r0.f18315j = r2
            r0.f18312g = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2904u0.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        if (j == 0) {
            this.f18312g = 1;
            this.f18313h = false;
        } else {
            this.f18312g = 3;
        }
        this.f18315j = 0;
    }
}
