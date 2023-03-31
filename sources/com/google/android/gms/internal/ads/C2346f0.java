package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2346f0 implements qn4 {

    /* renamed from: a */
    private final y22 f9051a = new y22(12);

    /* renamed from: b */
    private final C2309e0 f9052b = new C2309e0((C2272d0) null);

    /* renamed from: c */
    private int f9053c;

    /* renamed from: d */
    private tn4 f9054d = new on4();

    /* renamed from: e */
    private C2384g0 f9055e;

    /* renamed from: f */
    private long f9056f = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2458i0[] f9057g = new C2458i0[0];

    /* renamed from: h */
    private long f9058h;

    /* renamed from: i */
    private C2458i0 f9059i;

    /* renamed from: j */
    private int f9060j = -1;

    /* renamed from: k */
    private long f9061k = -1;

    /* renamed from: l */
    private long f9062l = -1;

    /* renamed from: m */
    private int f9063m;

    /* renamed from: n */
    private boolean f9064n;

    /* renamed from: d */
    private final C2458i0 m12377d(int i) {
        for (C2458i0 i0Var : this.f9057g) {
            if (i0Var.mo10982g(i)) {
                return i0Var;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        ((fn4) rn4).mo9986i(this.f9051a.mo15295h(), 0, 12, false);
        this.f9051a.mo15293f(0);
        if (this.f9051a.mo15302o() != 1179011410) {
            return false;
        }
        this.f9051a.mo15294g(4);
        if (this.f9051a.mo15302o() == 541677121) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f9053c = 0;
        this.f9054d = tn4;
        this.f9058h = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r23, com.google.android.gms.internal.ads.C2532k r24) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            long r2 = r0.f9058h
            r4 = -1
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x002e
            long r8 = r23.mo9003T()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0028
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 + r8
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            r10 = r1
            com.google.android.gms.internal.ads.fn4 r10 = (com.google.android.gms.internal.ads.fn4) r10
            long r2 = r2 - r8
            int r3 = (int) r2
            r10.mo10218n(r3, r7)
            goto L_0x002e
        L_0x0028:
            r8 = r24
            r8.f11852a = r2
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r0.f9058h = r4
            if (r2 == 0) goto L_0x0034
            return r6
        L_0x0034:
            int r2 = r0.f9053c
            r3 = 12
            r8 = 0
            if (r2 == 0) goto L_0x03ad
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r6) goto L_0x0350
            r12 = 3
            if (r2 == r11) goto L_0x022e
            r9 = 6
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r16 = 8
            r14 = 16
            if (r2 == r12) goto L_0x0199
            r4 = 5
            r5 = 8
            if (r2 == r13) goto L_0x0169
            if (r2 == r4) goto L_0x00e7
            long r12 = r23.mo9003T()
            long r14 = r0.f9062l
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            r7 = -1
            goto L_0x00e6
        L_0x0066:
            com.google.android.gms.internal.ads.i0 r2 = r0.f9059i
            if (r2 == 0) goto L_0x0075
            boolean r1 = r2.mo10983h(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x00e6
        L_0x0072:
            r0.f9059i = r8
            return r7
        L_0x0075:
            long r8 = r23.mo9003T()
            r12 = 1
            long r8 = r8 & r12
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0086
            r2 = r1
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            r2.mo10218n(r6, r7)
        L_0x0086:
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            byte[] r2 = r2.mo15295h()
            r4 = r1
            com.google.android.gms.internal.ads.fn4 r4 = (com.google.android.gms.internal.ads.fn4) r4
            r4.mo9986i(r2, r7, r3, r7)
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            r2.mo15293f(r7)
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            int r2 = r2.mo15302o()
            if (r2 != r10) goto L_0x00b6
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            r2.mo15293f(r5)
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            int r2 = r2.mo15302o()
            if (r2 != r11) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r3 = 8
        L_0x00af:
            r4.mo10218n(r3, r7)
            r23.mo9981W()
            goto L_0x00e6
        L_0x00b6:
            com.google.android.gms.internal.ads.y22 r3 = r0.f9051a
            int r3 = r3.mo15302o()
            r6 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r2 != r6) goto L_0x00cc
            long r1 = r23.mo9003T()
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.f9058h = r1
            goto L_0x00e6
        L_0x00cc:
            r4.mo10218n(r5, r7)
            r23.mo9981W()
            com.google.android.gms.internal.ads.i0 r2 = r0.m12377d(r2)
            if (r2 != 0) goto L_0x00e1
            long r1 = r23.mo9003T()
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f9058h = r1
            goto L_0x00e6
        L_0x00e1:
            r2.mo10980e(r3)
            r0.f9059i = r2
        L_0x00e6:
            return r7
        L_0x00e7:
            com.google.android.gms.internal.ads.y22 r2 = new com.google.android.gms.internal.ads.y22
            int r3 = r0.f9063m
            r2.<init>((int) r3)
            byte[] r3 = r2.mo15295h()
            int r4 = r0.f9063m
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9984g(r3, r7, r4, r7)
            int r1 = r2.mo15296i()
            if (r1 >= r14) goto L_0x0102
            r18 = 0
            goto L_0x011e
        L_0x0102:
            int r1 = r2.mo15298k()
            r2.mo15294g(r5)
            int r3 = r2.mo15302o()
            long r4 = r0.f9061k
            long r10 = (long) r3
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
            r18 = 0
            goto L_0x011b
        L_0x0117:
            long r4 = r4 + r16
            r18 = r4
        L_0x011b:
            r2.mo15293f(r1)
        L_0x011e:
            int r1 = r2.mo15296i()
            if (r1 < r14) goto L_0x0146
            int r1 = r2.mo15302o()
            int r3 = r2.mo15302o()
            int r4 = r2.mo15302o()
            long r4 = (long) r4
            long r4 = r4 + r18
            r2.mo15302o()
            com.google.android.gms.internal.ads.i0 r1 = r0.m12377d(r1)
            if (r1 == 0) goto L_0x011e
            r3 = r3 & r14
            if (r3 != r14) goto L_0x0142
            r1.mo10977b(r4)
        L_0x0142:
            r1.mo10979d()
            goto L_0x011e
        L_0x0146:
            com.google.android.gms.internal.ads.i0[] r1 = r0.f9057g
            int r2 = r1.length
            r3 = 0
        L_0x014a:
            if (r3 >= r2) goto L_0x0154
            r4 = r1[r3]
            r4.mo10978c()
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0154:
            r0.f9064n = r6
            com.google.android.gms.internal.ads.tn4 r1 = r0.f9054d
            com.google.android.gms.internal.ads.b0 r2 = new com.google.android.gms.internal.ads.b0
            long r3 = r0.f9056f
            r2.<init>(r0, r3)
            r1.mo10059j(r2)
            r0.f9053c = r9
            long r1 = r0.f9061k
            r0.f9058h = r1
            return r7
        L_0x0169:
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            byte[] r2 = r2.mo15295h()
            r3 = r1
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r3.mo9984g(r2, r7, r5, r7)
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            r2.mo15293f(r7)
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            int r2 = r2.mo15302o()
            com.google.android.gms.internal.ads.y22 r3 = r0.f9051a
            int r3 = r3.mo15302o()
            r5 = 829973609(0x31786469, float:3.6145826E-9)
            if (r2 != r5) goto L_0x0190
            r0.f9053c = r4
            r0.f9063m = r3
            goto L_0x0198
        L_0x0190:
            long r1 = r23.mo9003T()
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f9058h = r1
        L_0x0198:
            return r7
        L_0x0199:
            long r13 = r0.f9061k
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01ab
            long r4 = r23.mo9003T()
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x01a8
            goto L_0x01ab
        L_0x01a8:
            r0.f9058h = r13
            return r7
        L_0x01ab:
            com.google.android.gms.internal.ads.y22 r4 = r0.f9051a
            byte[] r4 = r4.mo15295h()
            r5 = r1
            com.google.android.gms.internal.ads.fn4 r5 = (com.google.android.gms.internal.ads.fn4) r5
            r5.mo9986i(r4, r7, r3, r7)
            r23.mo9981W()
            com.google.android.gms.internal.ads.y22 r4 = r0.f9051a
            r4.mo15293f(r7)
            com.google.android.gms.internal.ads.e0 r4 = r0.f9052b
            com.google.android.gms.internal.ads.y22 r5 = r0.f9051a
            r4.mo9746a(r5)
            com.google.android.gms.internal.ads.y22 r4 = r0.f9051a
            int r4 = r4.mo15302o()
            com.google.android.gms.internal.ads.e0 r5 = r0.f9052b
            int r8 = r5.f8546a
            r12 = 1179011410(0x46464952, float:12690.33)
            if (r8 != r12) goto L_0x01db
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo10218n(r3, r7)
            return r7
        L_0x01db:
            if (r8 != r10) goto L_0x0221
            if (r4 == r11) goto L_0x01e0
            goto L_0x0221
        L_0x01e0:
            long r3 = r23.mo9003T()
            r0.f9061k = r3
            int r5 = r5.f8547b
            long r10 = (long) r5
            long r3 = r3 + r10
            long r3 = r3 + r16
            r0.f9062l = r3
            boolean r5 = r0.f9064n
            if (r5 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.g0 r5 = r0.f9055e
            java.util.Objects.requireNonNull(r5)
            int r5 = r5.f9623b
            r2 = 16
            r5 = r5 & r2
            if (r5 == r2) goto L_0x020f
            com.google.android.gms.internal.ads.tn4 r2 = r0.f9054d
            com.google.android.gms.internal.ads.m r3 = new com.google.android.gms.internal.ads.m
            long r4 = r0.f9056f
            r10 = 0
            r3.<init>(r4, r10)
            r2.mo10059j(r3)
            r0.f9064n = r6
            goto L_0x0215
        L_0x020f:
            r2 = 4
            r0.f9053c = r2
            r0.f9058h = r3
            return r7
        L_0x0215:
            long r1 = r23.mo9003T()
            r3 = 12
            long r1 = r1 + r3
            r0.f9058h = r1
            r0.f9053c = r9
            return r7
        L_0x0221:
            long r1 = r23.mo9003T()
            int r3 = r5.f8547b
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.f9058h = r1
            return r7
        L_0x022e:
            int r2 = r0.f9060j
            int r2 = r2 + -4
            com.google.android.gms.internal.ads.y22 r3 = new com.google.android.gms.internal.ads.y22
            r3.<init>((int) r2)
            byte[] r4 = r3.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9984g(r4, r7, r2, r7)
            com.google.android.gms.internal.ads.j0 r1 = com.google.android.gms.internal.ads.C2496j0.m14614b(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L_0x0335
            java.lang.Class<com.google.android.gms.internal.ads.g0> r2 = com.google.android.gms.internal.ads.C2384g0.class
            com.google.android.gms.internal.ads.a0 r2 = r1.mo11272a(r2)
            com.google.android.gms.internal.ads.g0 r2 = (com.google.android.gms.internal.ads.C2384g0) r2
            if (r2 == 0) goto L_0x032d
            r0.f9055e = r2
            int r3 = r2.f9624c
            long r3 = (long) r3
            int r2 = r2.f9622a
            long r9 = (long) r2
            long r3 = r3 * r9
            r0.f9056f = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.ua3 r1 = r1.f11152a
            int r3 = r1.size()
            r4 = 0
            r14 = 0
        L_0x026d:
            if (r4 >= r3) goto L_0x031a
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.ads.a0 r5 = (com.google.android.gms.internal.ads.C2161a0) r5
            int r9 = r5.zza()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L_0x0313
            com.google.android.gms.internal.ads.j0 r5 = (com.google.android.gms.internal.ads.C2496j0) r5
            int r9 = r14 + 1
            java.lang.Class<com.google.android.gms.internal.ads.h0> r10 = com.google.android.gms.internal.ads.C2421h0.class
            com.google.android.gms.internal.ads.a0 r10 = r5.mo11272a(r10)
            com.google.android.gms.internal.ads.h0 r10 = (com.google.android.gms.internal.ads.C2421h0) r10
            java.lang.Class<com.google.android.gms.internal.ads.k0> r13 = com.google.android.gms.internal.ads.C2533k0.class
            com.google.android.gms.internal.ads.a0 r13 = r5.mo11272a(r13)
            com.google.android.gms.internal.ads.k0 r13 = (com.google.android.gms.internal.ads.C2533k0) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L_0x029f
            java.lang.String r5 = "Missing Stream Header"
            com.google.android.gms.internal.ads.ot1.m18060e(r15, r5)
        L_0x029b:
            r23 = r9
            goto L_0x030c
        L_0x029f:
            if (r13 != 0) goto L_0x02a7
            java.lang.String r5 = "Missing Stream Format"
            com.google.android.gms.internal.ads.ot1.m18060e(r15, r5)
            goto L_0x029b
        L_0x02a7:
            int r15 = r10.f10137d
            r23 = r9
            long r8 = (long) r15
            int r15 = r10.f10135b
            long r11 = (long) r15
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = r11 * r15
            int r11 = r10.f10136c
            long r11 = (long) r11
            r16 = r8
            r20 = r11
            long r8 = com.google.android.gms.internal.ads.gb2.m13170g0(r16, r18, r20)
            com.google.android.gms.internal.ads.g4 r11 = r13.f11853a
            com.google.android.gms.internal.ads.e2 r12 = r11.mo10384b()
            r12.mo9762g(r14)
            int r13 = r10.f10138e
            if (r13 == 0) goto L_0x02cf
            r12.mo9769l(r13)
        L_0x02cf:
            java.lang.Class<com.google.android.gms.internal.ads.l0> r13 = com.google.android.gms.internal.ads.C2570l0.class
            com.google.android.gms.internal.ads.a0 r5 = r5.mo11272a(r13)
            com.google.android.gms.internal.ads.l0 r5 = (com.google.android.gms.internal.ads.C2570l0) r5
            if (r5 == 0) goto L_0x02de
            java.lang.String r5 = r5.f12537a
            r12.mo9767j(r5)
        L_0x02de:
            java.lang.String r5 = r11.f9673l
            int r5 = com.google.android.gms.internal.ads.d90.m11363b(r5)
            if (r5 == r6) goto L_0x02ed
            r11 = 2
            if (r5 != r11) goto L_0x02eb
            r15 = 2
            goto L_0x02ee
        L_0x02eb:
            r8 = 0
            goto L_0x030c
        L_0x02ed:
            r15 = r5
        L_0x02ee:
            com.google.android.gms.internal.ads.tn4 r5 = r0.f9054d
            com.google.android.gms.internal.ads.r r5 = r5.mo10060n(r14, r15)
            com.google.android.gms.internal.ads.g4 r11 = r12.mo9782y()
            r5.mo8823e(r11)
            com.google.android.gms.internal.ads.i0 r11 = new com.google.android.gms.internal.ads.i0
            int r10 = r10.f10137d
            r13 = r11
            r16 = r8
            r18 = r10
            r19 = r5
            r13.<init>(r14, r15, r16, r18, r19)
            r0.f9056f = r8
            r8 = r11
        L_0x030c:
            if (r8 == 0) goto L_0x0311
            r2.add(r8)
        L_0x0311:
            r14 = r23
        L_0x0313:
            int r4 = r4 + 1
            r8 = 0
            r11 = 2
            r12 = 3
            goto L_0x026d
        L_0x031a:
            com.google.android.gms.internal.ads.i0[] r1 = new com.google.android.gms.internal.ads.C2458i0[r7]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.i0[] r1 = (com.google.android.gms.internal.ads.C2458i0[]) r1
            r0.f9057g = r1
            com.google.android.gms.internal.ads.tn4 r1 = r0.f9054d
            r1.mo10058C()
            r1 = 3
            r0.f9053c = r1
            return r7
        L_0x032d:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        L_0x0335:
            r2 = r8
            int r1 = r1.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected header list type "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        L_0x0350:
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            byte[] r2 = r2.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9984g(r2, r7, r3, r7)
            com.google.android.gms.internal.ads.y22 r1 = r0.f9051a
            r1.mo15293f(r7)
            com.google.android.gms.internal.ads.e0 r1 = r0.f9052b
            com.google.android.gms.internal.ads.y22 r2 = r0.f9051a
            r1.mo9746a(r2)
            int r3 = r1.f8546a
            if (r3 != r10) goto L_0x0396
            int r2 = r2.mo15302o()
            r1.f8548c = r2
            com.google.android.gms.internal.ads.e0 r1 = r0.f9052b
            int r2 = r1.f8548c
            if (r2 != r9) goto L_0x037f
            int r1 = r1.f8547b
            r0.f9060j = r1
            r1 = 2
            r0.f9053c = r1
            return r7
        L_0x037f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "hdrl expected, found: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        L_0x0396:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "LIST expected, found: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        L_0x03ad:
            r2 = r8
            boolean r4 = r22.mo9023b(r23)
            if (r4 == 0) goto L_0x03bc
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo10218n(r3, r7)
            r0.f9053c = r6
            return r7
        L_0x03bc:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2346f0.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        int i;
        this.f9058h = -1;
        this.f9059i = null;
        for (C2458i0 f : this.f9057g) {
            f.mo10981f(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.f9057g.length == 0) {
            this.f9053c = 0;
            return;
        } else {
            i = 3;
        }
        this.f9053c = i;
    }
}
