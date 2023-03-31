package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3019x4 implements qn4, C2643n {

    /* renamed from: x */
    public static final xn4 f19953x = C2908u4.f18366b;

    /* renamed from: a */
    private final y22 f19954a = new y22(C2420h.f10130a);

    /* renamed from: b */
    private final y22 f19955b = new y22(4);

    /* renamed from: c */
    private final y22 f19956c = new y22();

    /* renamed from: d */
    private final y22 f19957d = new y22(16);

    /* renamed from: e */
    private final ArrayDeque f19958e = new ArrayDeque();

    /* renamed from: f */
    private final C2166a5 f19959f = new C2166a5();

    /* renamed from: g */
    private final List f19960g = new ArrayList();

    /* renamed from: h */
    private int f19961h = 0;

    /* renamed from: i */
    private int f19962i;

    /* renamed from: j */
    private long f19963j;

    /* renamed from: k */
    private int f19964k;

    /* renamed from: l */
    private y22 f19965l;

    /* renamed from: m */
    private int f19966m = -1;

    /* renamed from: n */
    private int f19967n;

    /* renamed from: o */
    private int f19968o;

    /* renamed from: p */
    private int f19969p;

    /* renamed from: q */
    private tn4 f19970q = tn4.f18174k;

    /* renamed from: r */
    private C2982w4[] f19971r = new C2982w4[0];

    /* renamed from: s */
    private long[][] f19972s;

    /* renamed from: t */
    private int f19973t;

    /* renamed from: u */
    private long f19974u;

    /* renamed from: v */
    private int f19975v;

    /* renamed from: w */
    private C3054y2 f19976w;

    public C3019x4(int i) {
    }

    /* renamed from: h */
    private static int m23058h(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: i */
    private static int m23059i(C2351f5 f5Var, long j) {
        int a = f5Var.mo10071a(j);
        return a == -1 ? f5Var.mo10072b(j) : a;
    }

    /* renamed from: j */
    private static long m23060j(C2351f5 f5Var, long j, long j2) {
        int i = m23059i(f5Var, j);
        if (i == -1) {
            return j2;
        }
        return Math.min(f5Var.f9116c[i], j2);
    }

    /* renamed from: k */
    private final void m23061k() {
        this.f19961h = 0;
        this.f19964k = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0185 A[LOOP:3: B:69:0x0182->B:71:0x0185, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ae  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23062l(long r28) throws com.google.android.gms.internal.ads.ea0 {
        /*
            r27 = this;
            r0 = r27
        L_0x0002:
            java.util.ArrayDeque r1 = r0.f19958e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0269
            java.util.ArrayDeque r1 = r0.f19958e
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.b4 r1 = (com.google.android.gms.internal.ads.C2202b4) r1
            long r3 = r1.f7086b
            int r1 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r1 != 0) goto L_0x0269
            java.util.ArrayDeque r1 = r0.f19958e
            java.lang.Object r1 = r1.pop()
            r3 = r1
            com.google.android.gms.internal.ads.b4 r3 = (com.google.android.gms.internal.ads.C2202b4) r3
            int r1 = r3.f8046a
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r4) goto L_0x0252
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.f19975v
            r12 = 1
            if (r4 != r12) goto L_0x0034
            r9 = 1
            goto L_0x0035
        L_0x0034:
            r9 = 0
        L_0x0035:
            com.google.android.gms.internal.ads.fo4 r13 = new com.google.android.gms.internal.ads.fo4
            r13.<init>()
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            com.google.android.gms.internal.ads.c4 r4 = r3.mo8664d(r4)
            if (r4 == 0) goto L_0x0058
            android.util.Pair r4 = com.google.android.gms.internal.ads.C2611m4.m16386a(r4)
            java.lang.Object r5 = r4.first
            com.google.android.gms.internal.ads.k60 r5 = (com.google.android.gms.internal.ads.k60) r5
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.k60 r4 = (com.google.android.gms.internal.ads.k60) r4
            if (r5 == 0) goto L_0x0054
            r13.mo10238b(r5)
        L_0x0054:
            r15 = r4
            r16 = r5
            goto L_0x005b
        L_0x0058:
            r15 = 0
            r16 = 0
        L_0x005b:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            com.google.android.gms.internal.ads.b4 r4 = r3.mo8663c(r4)
            if (r4 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.k60 r4 = com.google.android.gms.internal.ads.C2611m4.m16387b(r4)
            r10 = r4
            goto L_0x006b
        L_0x006a:
            r10 = 0
        L_0x006b:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            com.google.android.gms.internal.ads.v4 r17 = com.google.android.gms.internal.ads.C2945v4.f18909a
            r4 = r13
            r14 = r10
            r10 = r17
            java.util.List r3 = com.google.android.gms.internal.ads.C2611m4.m16388c(r3, r4, r5, r7, r8, r9, r10)
            int r4 = r3.size()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = r6
            r8 = 0
            r9 = -1
        L_0x0088:
            r18 = 0
            if (r8 >= r4) goto L_0x01c2
            java.lang.Object r20 = r3.get(r8)
            r10 = r20
            com.google.android.gms.internal.ads.f5 r10 = (com.google.android.gms.internal.ads.C2351f5) r10
            int r5 = r10.f9115b
            if (r5 != 0) goto L_0x00a1
            r22 = r3
            r24 = r4
            r0 = -1
            r3 = r1
            r1 = r6
            goto L_0x01b6
        L_0x00a1:
            com.google.android.gms.internal.ads.c5 r5 = r10.f9114a
            r22 = r3
            long r2 = r5.f7594e
            int r23 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r23 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            long r2 = r10.f9121h
        L_0x00ae:
            long r11 = java.lang.Math.max(r11, r2)
            com.google.android.gms.internal.ads.w4 r6 = new com.google.android.gms.internal.ads.w4
            com.google.android.gms.internal.ads.tn4 r7 = r0.f19970q
            r24 = r4
            int r4 = r5.f7591b
            com.google.android.gms.internal.ads.r r4 = r7.mo10060n(r8, r4)
            r6.<init>(r5, r10, r4)
            com.google.android.gms.internal.ads.g4 r4 = r5.f7595f
            java.lang.String r4 = r4.f9673l
            java.lang.String r7 = "audio/true-hd"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x00d2
            int r4 = r10.f9118e
            int r4 = r4 * 16
            goto L_0x00d6
        L_0x00d2:
            int r4 = r10.f9118e
            int r4 = r4 + 30
        L_0x00d6:
            com.google.android.gms.internal.ads.g4 r7 = r5.f7595f
            com.google.android.gms.internal.ads.e2 r7 = r7.mo10384b()
            r7.mo9769l(r4)
            int r4 = r5.f7591b
            r25 = r11
            r11 = 2
            if (r4 != r11) goto L_0x00f9
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f9
            int r4 = r10.f9115b
            r10 = 1
            if (r4 <= r10) goto L_0x00f9
            float r4 = (float) r4
            float r2 = (float) r2
            r3 = 1232348160(0x49742400, float:1000000.0)
            float r2 = r2 / r3
            float r4 = r4 / r2
            r7.mo9758e(r4)
        L_0x00f9:
            int r2 = r5.f7591b
            int r3 = com.google.android.gms.internal.ads.C2871t4.f17832b
            r3 = 1
            if (r2 != r3) goto L_0x0110
            boolean r2 = r13.mo10237a()
            if (r2 == 0) goto L_0x0110
            int r2 = r13.f9379a
            r7.mo9754c(r2)
            int r2 = r13.f9380b
            r7.mo9756d(r2)
        L_0x0110:
            int r2 = r5.f7591b
            r3 = 2
            com.google.android.gms.internal.ads.k60[] r4 = new com.google.android.gms.internal.ads.k60[r3]
            r3 = 0
            r4[r3] = r15
            java.util.List r10 = r0.f19960g
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0122
            r10 = 0
            goto L_0x0129
        L_0x0122:
            com.google.android.gms.internal.ads.k60 r10 = new com.google.android.gms.internal.ads.k60
            java.util.List r11 = r0.f19960g
            r10.<init>((java.util.List) r11)
        L_0x0129:
            r11 = 1
            r4[r11] = r10
            com.google.android.gms.internal.ads.k60 r12 = new com.google.android.gms.internal.ads.k60
            com.google.android.gms.internal.ads.j50[] r10 = new com.google.android.gms.internal.ads.j50[r3]
            r21 = r1
            r3 = r10
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.<init>(r0, r3)
            if (r2 != r11) goto L_0x0147
            if (r16 == 0) goto L_0x0141
            r12 = r16
        L_0x0141:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0181
        L_0x0147:
            r0 = 2
            if (r2 != r0) goto L_0x0141
            if (r14 == 0) goto L_0x0141
            r0 = 0
        L_0x014d:
            int r1 = r14.mo11568a()
            if (r0 >= r1) goto L_0x0141
            com.google.android.gms.internal.ads.j50 r1 = r14.mo11569b(r0)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.C2943v2
            if (r2 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.v2 r1 = (com.google.android.gms.internal.ads.C2943v2) r1
            java.lang.String r2 = r1.f18885a
            java.lang.String r3 = "com.android.capture.fps"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.k60 r12 = new com.google.android.gms.internal.ads.k60
            r0 = 1
            com.google.android.gms.internal.ads.j50[] r2 = new com.google.android.gms.internal.ads.j50[r0]
            r0 = 0
            r2[r0] = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.<init>(r0, r2)
            r1 = r0
            goto L_0x0181
        L_0x0179:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = r0 + 1
            goto L_0x014d
        L_0x0181:
            r0 = 0
        L_0x0182:
            r3 = 2
            if (r0 >= r3) goto L_0x018e
            r3 = r4[r0]
            com.google.android.gms.internal.ads.k60 r12 = r12.mo11571d(r3)
            int r0 = r0 + 1
            goto L_0x0182
        L_0x018e:
            int r0 = r12.mo11568a()
            if (r0 <= 0) goto L_0x0197
            r7.mo9770m(r12)
        L_0x0197:
            com.google.android.gms.internal.ads.r r0 = r6.f19464c
            com.google.android.gms.internal.ads.g4 r3 = r7.mo9782y()
            r0.mo8823e(r3)
            int r0 = r5.f7591b
            r3 = 2
            if (r0 != r3) goto L_0x01ae
            r0 = -1
            if (r9 != r0) goto L_0x01af
            int r3 = r21.size()
            r9 = r3
            goto L_0x01af
        L_0x01ae:
            r0 = -1
        L_0x01af:
            r3 = r21
            r3.add(r6)
            r11 = r25
        L_0x01b6:
            int r8 = r8 + 1
            r0 = r27
            r6 = r1
            r1 = r3
            r3 = r22
            r4 = r24
            goto L_0x0088
        L_0x01c2:
            r4 = r0
            r3 = r1
            r0 = -1
            r4.f19973t = r9
            r4.f19974u = r11
            r1 = 0
            com.google.android.gms.internal.ads.w4[] r2 = new com.google.android.gms.internal.ads.C2982w4[r1]
            java.lang.Object[] r1 = r3.toArray(r2)
            com.google.android.gms.internal.ads.w4[] r1 = (com.google.android.gms.internal.ads.C2982w4[]) r1
            r4.f19971r = r1
            int r2 = r1.length
            long[][] r3 = new long[r2][]
            int[] r5 = new int[r2]
            long[] r6 = new long[r2]
            boolean[] r2 = new boolean[r2]
            r7 = 0
        L_0x01de:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x01fa
            r8 = r1[r7]
            com.google.android.gms.internal.ads.f5 r8 = r8.f19463b
            int r8 = r8.f9115b
            long[] r8 = new long[r8]
            r3[r7] = r8
            r8 = r1[r7]
            com.google.android.gms.internal.ads.f5 r8 = r8.f19463b
            long[] r8 = r8.f9119f
            r21 = 0
            r9 = r8[r21]
            r6[r7] = r9
            int r7 = r7 + 1
            goto L_0x01de
        L_0x01fa:
            r21 = 0
            r7 = 0
        L_0x01fd:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x023d
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r11 = -1
        L_0x0207:
            int r12 = r1.length
            if (r10 >= r12) goto L_0x0219
            boolean r12 = r2[r10]
            if (r12 != 0) goto L_0x0216
            r12 = r6[r10]
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 > 0) goto L_0x0216
            r11 = r10
            r8 = r12
        L_0x0216:
            int r10 = r10 + 1
            goto L_0x0207
        L_0x0219:
            r8 = r5[r11]
            r9 = r3[r11]
            r9[r8] = r18
            r10 = r1[r11]
            com.google.android.gms.internal.ads.f5 r10 = r10.f19463b
            int[] r12 = r10.f9117d
            r12 = r12[r8]
            long r12 = (long) r12
            long r18 = r18 + r12
            r12 = 1
            int r8 = r8 + r12
            r5[r11] = r8
            int r9 = r9.length
            if (r8 >= r9) goto L_0x0238
            long[] r9 = r10.f9119f
            r8 = r9[r8]
            r6[r11] = r8
            goto L_0x01fd
        L_0x0238:
            r2[r11] = r12
            int r7 = r7 + 1
            goto L_0x01fd
        L_0x023d:
            r4.f19972s = r3
            com.google.android.gms.internal.ads.tn4 r0 = r4.f19970q
            r0.mo10058C()
            com.google.android.gms.internal.ads.tn4 r0 = r4.f19970q
            r0.mo10059j(r4)
            java.util.ArrayDeque r0 = r4.f19958e
            r0.clear()
            r0 = 2
            r4.f19961h = r0
            goto L_0x0266
        L_0x0252:
            r4 = r0
            java.util.ArrayDeque r0 = r4.f19958e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0266
            java.util.ArrayDeque r0 = r4.f19958e
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.b4 r0 = (com.google.android.gms.internal.ads.C2202b4) r0
            r0.mo8665e(r3)
        L_0x0266:
            r0 = r4
            goto L_0x0002
        L_0x0269:
            r4 = r0
            int r0 = r4.f19961h
            r1 = 2
            if (r0 == r1) goto L_0x0272
            r27.m23061k()
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3019x4.m23062l(long):void");
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return true;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        long j2;
        long j3;
        int b;
        C2982w4[] w4VarArr = this.f19971r;
        if (w4VarArr.length == 0) {
            C2680o oVar = C2680o.f14770c;
            return new C2569l(oVar, oVar);
        }
        int i = this.f19973t;
        long j4 = -1;
        if (i != -1) {
            C2351f5 f5Var = w4VarArr[i].f19463b;
            int i2 = m23059i(f5Var, j);
            if (i2 == -1) {
                C2680o oVar2 = C2680o.f14770c;
                return new C2569l(oVar2, oVar2);
            }
            long j5 = f5Var.f9119f[i2];
            j2 = f5Var.f9116c[i2];
            if (j5 >= j || i2 >= f5Var.f9115b - 1 || (b = f5Var.mo10072b(j)) == -1 || b == i2) {
                j3 = -9223372036854775807L;
            } else {
                j3 = f5Var.f9119f[b];
                j4 = f5Var.f9116c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            C2982w4[] w4VarArr2 = this.f19971r;
            if (i3 >= w4VarArr2.length) {
                break;
            }
            if (i3 != this.f19973t) {
                C2351f5 f5Var2 = w4VarArr2[i3].f19463b;
                long j6 = m23060j(f5Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m23060j(f5Var2, j3, j4);
                }
                j2 = j6;
            }
            i3++;
        }
        C2680o oVar3 = new C2680o(j, j2);
        if (j3 == -9223372036854775807L) {
            return new C2569l(oVar3, oVar3);
        }
        return new C2569l(oVar3, new C2680o(j3, j4));
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f19974u;
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        return C2203b5.m10196b(rn4, false);
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f19970q = tn4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0085 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r33, com.google.android.gms.internal.ads.C2532k r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f19961h
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0250
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01d0
            long r3 = r33.mo9003T()
            int r9 = r0.f19966m
            if (r9 != r8) goto L_0x00a3
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r22 = r18
            r25 = r22
            r9 = 0
            r20 = -1
            r21 = 1
            r24 = 1
            r27 = -1
        L_0x0034:
            com.google.android.gms.internal.ads.w4[] r5 = r0.f19971r
            int r15 = r5.length
            if (r9 >= r15) goto L_0x0088
            r5 = r5[r9]
            int r15 = r5.f19466e
            com.google.android.gms.internal.ads.f5 r5 = r5.f19463b
            int r12 = r5.f9115b
            if (r15 != r12) goto L_0x0044
            goto L_0x0085
        L_0x0044:
            long[] r5 = r5.f9116c
            r28 = r5[r15]
            long[][] r5 = r0.f19972s
            java.lang.Object r5 = com.google.android.gms.internal.ads.gb2.m13171h(r5)
            long[][] r5 = (long[][]) r5
            r5 = r5[r9]
            r30 = r5[r15]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = 0
            goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            if (r5 != 0) goto L_0x0068
            if (r24 != 0) goto L_0x0070
            r12 = 0
            goto L_0x006a
        L_0x0068:
            r12 = r24
        L_0x006a:
            if (r5 != r12) goto L_0x0079
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x0079
        L_0x0070:
            r24 = r5
            r20 = r9
            r22 = r28
            r25 = r30
            goto L_0x007b
        L_0x0079:
            r24 = r12
        L_0x007b:
            int r12 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x0085
            r21 = r5
            r27 = r9
            r18 = r30
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0088:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x009b
            if (r21 == 0) goto L_0x009b
            r15 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r15
            int r5 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r9 = r27
            goto L_0x009d
        L_0x009b:
            r9 = r20
        L_0x009d:
            r0.f19966m = r9
            if (r9 != r8) goto L_0x00a3
            goto L_0x01cf
        L_0x00a3:
            com.google.android.gms.internal.ads.w4[] r5 = r0.f19971r
            r5 = r5[r9]
            com.google.android.gms.internal.ads.r r9 = r5.f19464c
            int r12 = r5.f19466e
            com.google.android.gms.internal.ads.f5 r15 = r5.f19463b
            long[] r8 = r15.f9116c
            r10 = r8[r12]
            int[] r8 = r15.f9117d
            r8 = r8[r12]
            com.google.android.gms.internal.ads.s r15 = r5.f19465d
            long r3 = r10 - r3
            int r13 = r0.f19967n
            long r13 = (long) r13
            long r3 = r3 + r13
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x01cc
            r6 = 262144(0x40000, double:1.295163E-318)
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00ca
            goto L_0x01cc
        L_0x00ca:
            com.google.android.gms.internal.ads.c5 r2 = r5.f19462a
            int r2 = r2.f7596g
            r6 = 1
            if (r2 != r6) goto L_0x00d6
            r6 = 8
            long r3 = r3 + r6
            int r8 = r8 + -8
        L_0x00d6:
            int r2 = (int) r3
            r1.mo9980H(r2)
            com.google.android.gms.internal.ads.c5 r2 = r5.f19462a
            int r3 = r2.f7599j
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.internal.ads.y22 r2 = r0.f19955b
            byte[] r2 = r2.mo15295h()
            r4 = 0
            r2[r4] = r4
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r4
            int r4 = 4 - r3
        L_0x00f1:
            int r6 = r0.f19968o
            if (r6 >= r8) goto L_0x0183
            int r6 = r0.f19969p
            if (r6 != 0) goto L_0x012b
            r1.mo9987j(r2, r4, r3)
            int r6 = r0.f19967n
            int r6 = r6 + r3
            r0.f19967n = r6
            com.google.android.gms.internal.ads.y22 r6 = r0.f19955b
            r7 = 0
            r6.mo15293f(r7)
            com.google.android.gms.internal.ads.y22 r6 = r0.f19955b
            int r6 = r6.mo15300m()
            if (r6 < 0) goto L_0x0123
            r0.f19969p = r6
            com.google.android.gms.internal.ads.y22 r6 = r0.f19954a
            r6.mo15293f(r7)
            com.google.android.gms.internal.ads.y22 r6 = r0.f19954a
            r10 = 4
            r9.mo8821c(r6, r10)
            int r6 = r0.f19968o
            int r6 = r6 + r10
            r0.f19968o = r6
            int r8 = r8 + r4
            goto L_0x00f1
        L_0x0123:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        L_0x012b:
            r7 = 0
            int r6 = r9.mo8819a(r1, r6, r7)
            int r7 = r0.f19967n
            int r7 = r7 + r6
            r0.f19967n = r7
            int r7 = r0.f19968o
            int r7 = r7 + r6
            r0.f19968o = r7
            int r7 = r0.f19969p
            int r7 = r7 - r6
            r0.f19969p = r7
            goto L_0x00f1
        L_0x0140:
            com.google.android.gms.internal.ads.g4 r2 = r2.f7595f
            java.lang.String r2 = r2.f9673l
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0163
            int r2 = r0.f19968o
            if (r2 != 0) goto L_0x0160
            com.google.android.gms.internal.ads.y22 r2 = r0.f19956c
            com.google.android.gms.internal.ads.tm4.m21087b(r8, r2)
            com.google.android.gms.internal.ads.y22 r2 = r0.f19956c
            r3 = 7
            r9.mo8821c(r2, r3)
            int r2 = r0.f19968o
            int r2 = r2 + r3
            r0.f19968o = r2
        L_0x0160:
            int r8 = r8 + 7
            goto L_0x0168
        L_0x0163:
            if (r15 == 0) goto L_0x0168
            r15.mo13914d(r1)
        L_0x0168:
            int r2 = r0.f19968o
            if (r2 >= r8) goto L_0x0183
            int r2 = r8 - r2
            r3 = 0
            int r2 = r9.mo8819a(r1, r2, r3)
            int r3 = r0.f19967n
            int r3 = r3 + r2
            r0.f19967n = r3
            int r3 = r0.f19968o
            int r3 = r3 + r2
            r0.f19968o = r3
            int r3 = r0.f19969p
            int r3 = r3 - r2
            r0.f19969p = r3
            goto L_0x0168
        L_0x0183:
            com.google.android.gms.internal.ads.f5 r1 = r5.f19463b
            long[] r2 = r1.f9119f
            r3 = r2[r12]
            int[] r1 = r1.f9120g
            r1 = r1[r12]
            if (r15 == 0) goto L_0x01ac
            r21 = 0
            r22 = 0
            r2 = r15
            r16 = r9
            r17 = r3
            r19 = r1
            r20 = r8
            r15.mo13913c(r16, r17, r19, r20, r21, r22)
            r1 = 1
            int r12 = r12 + r1
            com.google.android.gms.internal.ads.f5 r1 = r5.f19463b
            int r1 = r1.f9115b
            if (r12 != r1) goto L_0x01ba
            r1 = 0
            r2.mo13911a(r9, r1)
            goto L_0x01ba
        L_0x01ac:
            r20 = 0
            r21 = 0
            r15 = r9
            r16 = r3
            r18 = r1
            r19 = r8
            r15.mo8824f(r16, r18, r19, r20, r21)
        L_0x01ba:
            int r1 = r5.f19466e
            r2 = 1
            int r1 = r1 + r2
            r5.f19466e = r1
            r1 = -1
            r0.f19966m = r1
            r1 = 0
            r0.f19967n = r1
            r0.f19968o = r1
            r0.f19969p = r1
            r8 = 0
            goto L_0x01cf
        L_0x01cc:
            r2.f11852a = r10
            r8 = 1
        L_0x01cf:
            return r8
        L_0x01d0:
            long r5 = r0.f19963j
            int r3 = r0.f19964k
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.mo9003T()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.y22 r3 = r0.f19965l
            if (r3 == 0) goto L_0x022f
            byte[] r10 = r3.mo15295h()
            int r11 = r0.f19964k
            int r6 = (int) r5
            r1.mo9987j(r10, r11, r6)
            int r5 = r0.f19962i
            if (r5 != r4) goto L_0x0214
            r3.mo15293f(r9)
            int r4 = r3.mo15300m()
            int r4 = m23058h(r4)
            if (r4 == 0) goto L_0x01fb
            goto L_0x0211
        L_0x01fb:
            r4 = 4
            r3.mo15294g(r4)
        L_0x01ff:
            int r4 = r3.mo15296i()
            if (r4 <= 0) goto L_0x0210
            int r4 = r3.mo15300m()
            int r4 = m23058h(r4)
            if (r4 == 0) goto L_0x01ff
            goto L_0x0211
        L_0x0210:
            r4 = 0
        L_0x0211:
            r0.f19975v = r4
            goto L_0x023a
        L_0x0214:
            java.util.ArrayDeque r4 = r0.f19958e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x023a
            java.util.ArrayDeque r4 = r0.f19958e
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.b4 r4 = (com.google.android.gms.internal.ads.C2202b4) r4
            com.google.android.gms.internal.ads.c4 r5 = new com.google.android.gms.internal.ads.c4
            int r6 = r0.f19962i
            r5.<init>(r6, r3)
            r4.mo8666f(r5)
            goto L_0x023a
        L_0x022f:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x023c
            int r3 = (int) r5
            r1.mo9980H(r3)
        L_0x023a:
            r11 = 0
            goto L_0x0244
        L_0x023c:
            long r3 = r33.mo9003T()
            long r3 = r3 + r5
            r2.f11852a = r3
            r11 = 1
        L_0x0244:
            r0.m23062l(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f19961h
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x0250:
            r3 = 1
            int r5 = r0.f19964k
            if (r5 != 0) goto L_0x027b
            com.google.android.gms.internal.ads.y22 r5 = r0.f19957d
            byte[] r5 = r5.mo15295h()
            r8 = 0
            boolean r5 = r1.mo9984g(r5, r8, r9, r3)
            if (r5 != 0) goto L_0x0264
            r3 = -1
            return r3
        L_0x0264:
            r0.f19964k = r9
            com.google.android.gms.internal.ads.y22 r3 = r0.f19957d
            r3.mo15293f(r8)
            com.google.android.gms.internal.ads.y22 r3 = r0.f19957d
            long r10 = r3.mo15280A()
            r0.f19963j = r10
            com.google.android.gms.internal.ads.y22 r3 = r0.f19957d
            int r3 = r3.mo15300m()
            r0.f19962i = r3
        L_0x027b:
            long r10 = r0.f19963j
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x029a
            com.google.android.gms.internal.ads.y22 r3 = r0.f19957d
            byte[] r3 = r3.mo15295h()
            r1.mo9987j(r3, r9, r9)
            int r3 = r0.f19964k
            int r3 = r3 + r9
            r0.f19964k = r3
            com.google.android.gms.internal.ads.y22 r3 = r0.f19957d
            long r5 = r3.mo15281B()
            r0.f19963j = r5
            goto L_0x02c5
        L_0x029a:
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c5
            long r5 = r33.mo9005b()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02b6
            java.util.ArrayDeque r3 = r0.f19958e
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.b4 r3 = (com.google.android.gms.internal.ads.C2202b4) r3
            if (r3 == 0) goto L_0x02b5
            long r5 = r3.f7086b
            goto L_0x02b6
        L_0x02b5:
            r5 = r7
        L_0x02b6:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c5
            long r7 = r33.mo9003T()
            long r5 = r5 - r7
            int r3 = r0.f19964k
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.f19963j = r5
        L_0x02c5:
            long r5 = r0.f19963j
            int r3 = r0.f19964k
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0402
            int r5 = r0.f19962i
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x03b0
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x03b0
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x03b0
            if (r5 != r7) goto L_0x02f5
            goto L_0x03b0
        L_0x02f5:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x037c
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x037c
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x037c
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x037c
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x037c
            if (r5 == r4) goto L_0x037c
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x037c
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x037c
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x034d
            goto L_0x037c
        L_0x034d:
            long r3 = r33.mo9003T()
            int r5 = r0.f19964k
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.f19962i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0374
            com.google.android.gms.internal.ads.y2 r3 = new com.google.android.gms.internal.ads.y2
            r8 = 0
            long r14 = r10 + r5
            long r12 = r0.f19963j
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r0.f19976w = r3
        L_0x0374:
            r3 = 0
            r0.f19965l = r3
            r3 = 1
            r0.f19961h = r3
            goto L_0x0006
        L_0x037c:
            if (r3 != r9) goto L_0x0380
            r3 = 1
            goto L_0x0381
        L_0x0380:
            r3 = 0
        L_0x0381:
            com.google.android.gms.internal.ads.v91.m22052f(r3)
            long r3 = r0.f19963j
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x038f
            r3 = 1
            goto L_0x0390
        L_0x038f:
            r3 = 0
        L_0x0390:
            com.google.android.gms.internal.ads.v91.m22052f(r3)
            com.google.android.gms.internal.ads.y22 r3 = new com.google.android.gms.internal.ads.y22
            long r4 = r0.f19963j
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.y22 r4 = r0.f19957d
            byte[] r4 = r4.mo15295h()
            byte[] r5 = r3.mo15295h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.f19965l = r3
            r3 = 1
            r0.f19961h = r3
            goto L_0x0006
        L_0x03b0:
            long r3 = r33.mo9003T()
            long r5 = r0.f19963j
            int r8 = r0.f19964k
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03e3
            int r5 = r0.f19962i
            if (r5 != r7) goto L_0x03e3
            com.google.android.gms.internal.ads.y22 r5 = r0.f19956c
            r5.mo15290c(r9)
            com.google.android.gms.internal.ads.y22 r5 = r0.f19956c
            byte[] r5 = r5.mo15295h()
            r6 = 0
            r1.mo9988l(r5, r6, r9)
            com.google.android.gms.internal.ads.y22 r5 = r0.f19956c
            com.google.android.gms.internal.ads.C2611m4.m16389d(r5)
            com.google.android.gms.internal.ads.y22 r5 = r0.f19956c
            int r5 = r5.mo15298k()
            r1.mo9980H(r5)
            r33.mo9981W()
        L_0x03e3:
            java.util.ArrayDeque r5 = r0.f19958e
            com.google.android.gms.internal.ads.b4 r6 = new com.google.android.gms.internal.ads.b4
            int r7 = r0.f19962i
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f19963j
            int r7 = r0.f19964k
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03fd
            r0.m23062l(r3)
            goto L_0x0006
        L_0x03fd:
            r32.m23061k()
            goto L_0x0006
        L_0x0402:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11992c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3019x4.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f19958e.clear();
        this.f19964k = 0;
        this.f19966m = -1;
        this.f19967n = 0;
        this.f19968o = 0;
        this.f19969p = 0;
        if (j == 0) {
            m23061k();
            return;
        }
        for (C2982w4 w4Var : this.f19971r) {
            C2351f5 f5Var = w4Var.f19463b;
            int a = f5Var.mo10071a(j2);
            if (a == -1) {
                a = f5Var.mo10072b(j2);
            }
            w4Var.f19466e = a;
            C2829s sVar = w4Var.f19465d;
            if (sVar != null) {
                sVar.mo13912b();
            }
        }
    }
}
