package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.w3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2981w3 implements qn4 {

    /* renamed from: q */
    public static final xn4 f19432q = C2907u3.f18336b;

    /* renamed from: r */
    private static final C2348f2 f19433r = C2944v3.f18892a;

    /* renamed from: a */
    private final y22 f19434a;

    /* renamed from: b */
    private final C2271d f19435b;

    /* renamed from: c */
    private final fo4 f19436c;

    /* renamed from: d */
    private final ho4 f19437d;

    /* renamed from: e */
    private final C2792r f19438e;

    /* renamed from: f */
    private tn4 f19439f;

    /* renamed from: g */
    private C2792r f19440g;

    /* renamed from: h */
    private C2792r f19441h;

    /* renamed from: i */
    private int f19442i;

    /* renamed from: j */
    private k60 f19443j;

    /* renamed from: k */
    private long f19444k;

    /* renamed from: l */
    private long f19445l;

    /* renamed from: m */
    private long f19446m;

    /* renamed from: n */
    private int f19447n;

    /* renamed from: o */
    private C3055y3 f19448o;

    /* renamed from: p */
    private boolean f19449p;

    public C2981w3() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0163  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22557d(com.google.android.gms.internal.ads.rn4 r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f19442i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m22562k(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.y3 r2 = r0.f19448o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.y22 r14 = new com.google.android.gms.internal.ads.y22
            com.google.android.gms.internal.ads.d r2 = r0.f19435b
            int r2 = r2.f7991c
            r14.<init>((int) r2)
            byte[] r2 = r14.mo15295h()
            com.google.android.gms.internal.ads.d r9 = r0.f19435b
            int r9 = r9.f7991c
            r10 = r1
            com.google.android.gms.internal.ads.fn4 r10 = (com.google.android.gms.internal.ads.fn4) r10
            r10.mo9986i(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.d r2 = r0.f19435b
            int r9 = r2.f7989a
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x0042
            int r2 = r2.f7993e
            if (r2 == r8) goto L_0x0046
            r2 = 36
            goto L_0x004d
        L_0x0042:
            int r2 = r2.f7993e
            if (r2 == r8) goto L_0x0049
        L_0x0046:
            r2 = 21
            goto L_0x004d
        L_0x0049:
            r11 = 13
            r2 = 13
        L_0x004d:
            int r9 = r14.mo15299l()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006f
            r14.mo15293f(r2)
            int r9 = r14.mo15300m()
            if (r9 == r12) goto L_0x006d
            if (r9 != r15) goto L_0x006f
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0085
        L_0x006d:
            r11 = r9
            goto L_0x0085
        L_0x006f:
            int r9 = r14.mo15299l()
            r11 = 40
            if (r9 < r11) goto L_0x0084
            r14.mo15293f(r10)
            int r9 = r14.mo15300m()
            if (r9 != r13) goto L_0x0084
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == r12) goto L_0x00aa
            if (r11 != r15) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            if (r11 != r13) goto L_0x00a5
            long r9 = r17.mo9005b()
            long r11 = r17.mo9003T()
            com.google.android.gms.internal.ads.d r13 = r0.f19435b
            com.google.android.gms.internal.ads.z3 r2 = com.google.android.gms.internal.ads.C3092z3.m24356b(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.d r9 = r0.f19435b
            int r9 = r9.f7991c
            r10 = r1
            com.google.android.gms.internal.ads.fn4 r10 = (com.google.android.gms.internal.ads.fn4) r10
            r10.mo10218n(r9, r4)
            goto L_0x010d
        L_0x00a5:
            r17.mo9981W()
            r2 = 0
            goto L_0x010d
        L_0x00aa:
            long r9 = r17.mo9005b()
            long r12 = r17.mo9003T()
            com.google.android.gms.internal.ads.d r8 = r0.f19435b
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.a4 r8 = com.google.android.gms.internal.ads.C2165a4.m9562b(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.fo4 r9 = r0.f19436c
            boolean r9 = r9.mo10237a()
            if (r9 != 0) goto L_0x00f3
            r17.mo9981W()
            r9 = r1
            com.google.android.gms.internal.ads.fn4 r9 = (com.google.android.gms.internal.ads.fn4) r9
            int r2 = r2 + 141
            r9.mo10217m(r2, r4)
            com.google.android.gms.internal.ads.y22 r2 = r0.f19434a
            byte[] r2 = r2.mo15295h()
            r10 = 3
            r9.mo9986i(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.y22 r2 = r0.f19434a
            r2.mo15293f(r4)
            com.google.android.gms.internal.ads.fo4 r2 = r0.f19436c
            com.google.android.gms.internal.ads.y22 r9 = r0.f19434a
            int r9 = r9.mo15308u()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00ef
            if (r9 <= 0) goto L_0x00f3
        L_0x00ef:
            r2.f9379a = r10
            r2.f9380b = r9
        L_0x00f3:
            com.google.android.gms.internal.ads.d r2 = r0.f19435b
            int r2 = r2.f7991c
            r9 = r1
            com.google.android.gms.internal.ads.fn4 r9 = (com.google.android.gms.internal.ads.fn4) r9
            r9.mo10218n(r2, r4)
            if (r8 == 0) goto L_0x010c
            boolean r2 = r8.mo8197U()
            if (r2 != 0) goto L_0x010c
            if (r7 != r15) goto L_0x010c
            com.google.android.gms.internal.ads.y3 r2 = r0.m22559h(r1, r4)
            goto L_0x010d
        L_0x010c:
            r2 = r8
        L_0x010d:
            com.google.android.gms.internal.ads.k60 r7 = r0.f19443j
            long r8 = r17.mo9003T()
            if (r7 == 0) goto L_0x0158
            int r10 = r7.mo11568a()
            r11 = 0
        L_0x011a:
            if (r11 >= r10) goto L_0x0158
            com.google.android.gms.internal.ads.j50 r12 = r7.mo11569b(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.C2609m2
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.m2 r12 = (com.google.android.gms.internal.ads.C2609m2) r12
            int r10 = r7.mo11568a()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x014f
            com.google.android.gms.internal.ads.j50 r13 = r7.mo11569b(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.C2758q2
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.q2 r13 = (com.google.android.gms.internal.ads.C2758q2) r13
            java.lang.String r14 = r13.f10589a
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014c
            java.lang.String r7 = r13.f16147c
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.gb2.m13168f0(r10)
            goto L_0x0150
        L_0x014c:
            int r11 = r11 + 1
            goto L_0x012b
        L_0x014f:
            r10 = r5
        L_0x0150:
            com.google.android.gms.internal.ads.t3 r7 = com.google.android.gms.internal.ads.C2870t3.m20777b(r8, r12, r10)
            goto L_0x0159
        L_0x0155:
            int r11 = r11 + 1
            goto L_0x011a
        L_0x0158:
            r7 = 0
        L_0x0159:
            boolean r8 = r0.f19449p
            if (r8 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.x3 r2 = new com.google.android.gms.internal.ads.x3
            r2.<init>()
            goto L_0x0174
        L_0x0163:
            if (r7 == 0) goto L_0x0167
            r2 = r7
            goto L_0x016a
        L_0x0167:
            if (r2 != 0) goto L_0x016a
            r2 = 0
        L_0x016a:
            if (r2 == 0) goto L_0x0170
            r2.mo8197U()
            goto L_0x0174
        L_0x0170:
            com.google.android.gms.internal.ads.y3 r2 = r0.m22559h(r1, r4)
        L_0x0174:
            r0.f19448o = r2
            com.google.android.gms.internal.ads.tn4 r7 = r0.f19439f
            r7.mo10059j(r2)
            com.google.android.gms.internal.ads.r r2 = r0.f19441h
            com.google.android.gms.internal.ads.e2 r7 = new com.google.android.gms.internal.ads.e2
            r7.<init>()
            com.google.android.gms.internal.ads.d r8 = r0.f19435b
            java.lang.String r8 = r8.f7990b
            r7.mo9776s(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.mo9769l(r8)
            com.google.android.gms.internal.ads.d r8 = r0.f19435b
            int r8 = r8.f7993e
            r7.mo9759e0(r8)
            com.google.android.gms.internal.ads.d r8 = r0.f19435b
            int r8 = r8.f7992d
            r7.mo9777t(r8)
            com.google.android.gms.internal.ads.fo4 r8 = r0.f19436c
            int r8 = r8.f9379a
            r7.mo9754c(r8)
            com.google.android.gms.internal.ads.fo4 r8 = r0.f19436c
            int r8 = r8.f9380b
            r7.mo9756d(r8)
            com.google.android.gms.internal.ads.k60 r8 = r0.f19443j
            r7.mo9770m(r8)
            com.google.android.gms.internal.ads.g4 r7 = r7.mo9782y()
            r2.mo8823e(r7)
            long r7 = r17.mo9003T()
            r0.f19446m = r7
            goto L_0x01d5
        L_0x01bd:
            long r7 = r0.f19446m
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01d5
            long r9 = r17.mo9003T()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d5
            r2 = r1
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            long r7 = r7 - r9
            int r8 = (int) r7
            r2.mo10218n(r8, r4)
        L_0x01d5:
            int r2 = r0.f19447n
            if (r2 != 0) goto L_0x0239
            r17.mo9981W()
            boolean r2 = r16.m22561j(r17)
            if (r2 == 0) goto L_0x01e3
            goto L_0x024b
        L_0x01e3:
            com.google.android.gms.internal.ads.y22 r2 = r0.f19434a
            r2.mo15293f(r4)
            com.google.android.gms.internal.ads.y22 r2 = r0.f19434a
            int r2 = r2.mo15300m()
            int r7 = r0.f19442i
            long r7 = (long) r7
            boolean r7 = m22560i(r2, r7)
            if (r7 == 0) goto L_0x0230
            int r7 = com.google.android.gms.internal.ads.C2308e.m11792b(r2)
            if (r7 != r3) goto L_0x01fe
            goto L_0x0230
        L_0x01fe:
            com.google.android.gms.internal.ads.d r7 = r0.f19435b
            r7.mo9405a(r2)
            long r7 = r0.f19444k
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.y3 r2 = r0.f19448o
            long r5 = r17.mo9003T()
            long r5 = r2.mo8201e(r5)
            r0.f19444k = r5
        L_0x0215:
            com.google.android.gms.internal.ads.d r2 = r0.f19435b
            int r5 = r2.f7991c
            r0.f19447n = r5
            com.google.android.gms.internal.ads.y3 r6 = r0.f19448o
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.C2833s3
            if (r7 != 0) goto L_0x0223
            r2 = r5
            goto L_0x0239
        L_0x0223:
            com.google.android.gms.internal.ads.s3 r6 = (com.google.android.gms.internal.ads.C2833s3) r6
            long r3 = r0.f19445l
            int r1 = r2.f7995g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m22558e(r3)
            r1 = 0
            throw r1
        L_0x0230:
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r5 = 1
            r1.mo10218n(r5, r4)
            r0.f19442i = r4
            goto L_0x024a
        L_0x0239:
            r5 = 1
            com.google.android.gms.internal.ads.r r6 = r0.f19441h
            int r1 = r6.mo8819a(r1, r2, r5)
            if (r1 != r3) goto L_0x0243
            goto L_0x024b
        L_0x0243:
            int r2 = r0.f19447n
            int r2 = r2 - r1
            r0.f19447n = r2
            if (r2 <= 0) goto L_0x024c
        L_0x024a:
            r3 = 0
        L_0x024b:
            return r3
        L_0x024c:
            com.google.android.gms.internal.ads.r r5 = r0.f19441h
            long r1 = r0.f19445l
            long r6 = r0.m22558e(r1)
            r8 = 1
            com.google.android.gms.internal.ads.d r1 = r0.f19435b
            int r9 = r1.f7991c
            r10 = 0
            r11 = 0
            r5.mo8824f(r6, r8, r9, r10, r11)
            long r1 = r0.f19445l
            com.google.android.gms.internal.ads.d r3 = r0.f19435b
            int r3 = r3.f7995g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f19445l = r1
            r0.f19447n = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2981w3.m22557d(com.google.android.gms.internal.ads.rn4):int");
    }

    /* renamed from: e */
    private final long m22558e(long j) {
        return this.f19444k + ((j * 1000000) / ((long) this.f19435b.f7992d));
    }

    /* renamed from: h */
    private final C3055y3 m22559h(rn4 rn4, boolean z) throws IOException {
        ((fn4) rn4).mo9986i(this.f19434a.mo15295h(), 0, 4, false);
        this.f19434a.mo15293f(0);
        this.f19435b.mo9405a(this.f19434a.mo15300m());
        return new C2796r3(rn4.mo9005b(), rn4.mo9003T(), this.f19435b, false);
    }

    /* renamed from: i */
    private static boolean m22560i(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: j */
    private final boolean m22561j(rn4 rn4) throws IOException {
        C3055y3 y3Var = this.f19448o;
        if (y3Var != null) {
            long d = y3Var.mo8200d();
            if (d != -1 && rn4.mo9004a() > d - 4) {
                return true;
            }
        }
        try {
            return !rn4.mo9986i(this.f19434a.mo15295h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final boolean m22562k(rn4 rn4, boolean z) throws IOException {
        int i;
        int i2;
        int b;
        int i3 = true != z ? 131072 : 32768;
        rn4.mo9981W();
        if (rn4.mo9003T() == 0) {
            k60 a = this.f19437d.mo10887a(rn4, (C2348f2) null);
            this.f19443j = a;
            if (a != null) {
                this.f19436c.mo10238b(a);
            }
            i = (int) rn4.mo9004a();
            if (!z) {
                ((fn4) rn4).mo10218n(i, false);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m22561j(rn4)) {
                this.f19434a.mo15293f(0);
                int m = this.f19434a.mo15300m();
                if ((i2 == 0 || m22560i(m, (long) i2)) && (b = C2308e.m11792b(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f19435b.mo9405a(m);
                        i2 = m;
                    }
                    ((fn4) rn4).mo10217m(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            rn4.mo9981W();
                            ((fn4) rn4).mo10217m(i + i6, false);
                        } else {
                            ((fn4) rn4).mo10218n(1, false);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw ea0.m11990a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((fn4) rn4).mo10218n(i + i5, false);
        } else {
            rn4.mo9981W();
        }
        this.f19442i = i2;
        return true;
    }

    /* renamed from: a */
    public final void mo14865a() {
        this.f19449p = true;
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        return m22562k(rn4, true);
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f19439f = tn4;
        C2792r n = tn4.mo10060n(0, 1);
        this.f19440g = n;
        this.f19441h = n;
        this.f19439f.mo10058C();
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        v91.m22048b(this.f19440g);
        int i = gb2.f9812a;
        int d = m22557d(rn4);
        if (d == -1 && (this.f19448o instanceof C2833s3)) {
            if (this.f19448o.mo8199a() != m22558e(this.f19445l)) {
                C2833s3 s3Var = (C2833s3) this.f19448o;
                throw null;
            }
        }
        return d;
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f19442i = 0;
        this.f19444k = -9223372036854775807L;
        this.f19445l = 0;
        this.f19447n = 0;
        C3055y3 y3Var = this.f19448o;
        if (y3Var instanceof C2833s3) {
            C2833s3 s3Var = (C2833s3) y3Var;
            throw null;
        }
    }

    public C2981w3(int i) {
        this.f19434a = new y22(10);
        this.f19435b = new C2271d();
        this.f19436c = new fo4();
        this.f19444k = -9223372036854775807L;
        this.f19437d = new ho4();
        pn4 pn4 = new pn4();
        this.f19438e = pn4;
        this.f19441h = pn4;
    }
}
