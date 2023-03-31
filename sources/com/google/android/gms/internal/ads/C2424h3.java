package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.h3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2424h3 implements C2499j3 {

    /* renamed from: a */
    private final byte[] f10168a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque f10169b = new ArrayDeque();

    /* renamed from: c */
    private final C2759q3 f10170c = new C2759q3();

    /* renamed from: d */
    private C2461i3 f10171d;

    /* renamed from: e */
    private int f10172e;

    /* renamed from: f */
    private int f10173f;

    /* renamed from: g */
    private long f10174g;

    /* renamed from: a */
    private final long m13686a(rn4 rn4, int i) throws IOException {
        ((fn4) rn4).mo9984g(this.f10168a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f10168a[i2] & 255));
        }
        return j;
    }

    /* renamed from: d */
    public final void mo10724d() {
        this.f10172e = 0;
        this.f10169b.clear();
        this.f10170c.mo13467e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r0 == 1) goto L_0x0089;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10725e(com.google.android.gms.internal.ads.rn4 r14) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.i3 r0 = r13.f10171d
            com.google.android.gms.internal.ads.v91.m22048b(r0)
        L_0x0005:
            java.util.ArrayDeque r0 = r13.f10169b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.g3 r0 = (com.google.android.gms.internal.ads.C2387g3) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r14.mo9003T()
            long r4 = r0.f9652b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.android.gms.internal.ads.i3 r14 = r13.f10171d
            java.util.ArrayDeque r0 = r13.f10169b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.g3 r0 = (com.google.android.gms.internal.ads.C2387g3) r0
            int r0 = r0.f9651a
            com.google.android.gms.internal.ads.m3 r14 = (com.google.android.gms.internal.ads.C2610m3) r14
            com.google.android.gms.internal.ads.o3 r14 = r14.f13198a
            r14.mo12807h(r0)
            return r1
        L_0x0033:
            int r0 = r13.f10172e
            r2 = 2
            r3 = 4
            r4 = 0
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.internal.ads.q3 r0 = r13.f10170c
            long r5 = r0.mo13466d(r14, r1, r4, r3)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r14.mo9981W()
        L_0x0049:
            byte[] r0 = r13.f10168a
            r5 = r14
            com.google.android.gms.internal.ads.fn4 r5 = (com.google.android.gms.internal.ads.fn4) r5
            r5.mo9986i(r0, r4, r3, r4)
            byte[] r0 = r13.f10168a
            byte r0 = r0[r4]
            int r0 = com.google.android.gms.internal.ads.C2759q3.m19049b(r0)
            r6 = -1
            if (r0 == r6) goto L_0x0076
            if (r0 > r3) goto L_0x0076
            byte[] r6 = r13.f10168a
            long r6 = com.google.android.gms.internal.ads.C2759q3.m19050c(r6, r0, r4)
            int r7 = (int) r6
            com.google.android.gms.internal.ads.i3 r6 = r13.f10171d
            com.google.android.gms.internal.ads.m3 r6 = (com.google.android.gms.internal.ads.C2610m3) r6
            com.google.android.gms.internal.ads.o3 r6 = r6.f13198a
            boolean r6 = com.google.android.gms.internal.ads.C2684o3.m17445o(r7)
            if (r6 == 0) goto L_0x0076
            r5.mo10218n(r0, r4)
            long r5 = (long) r7
            goto L_0x007a
        L_0x0076:
            r5.mo10218n(r1, r4)
            goto L_0x0049
        L_0x007a:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            return r4
        L_0x0081:
            int r0 = (int) r5
            r13.f10173f = r0
            r13.f10172e = r1
            goto L_0x0089
        L_0x0087:
            if (r0 != r1) goto L_0x0095
        L_0x0089:
            com.google.android.gms.internal.ads.q3 r0 = r13.f10170c
            r5 = 8
            long r5 = r0.mo13466d(r14, r4, r1, r5)
            r13.f10174g = r5
            r13.f10172e = r2
        L_0x0095:
            com.google.android.gms.internal.ads.i3 r0 = r13.f10171d
            int r5 = r13.f10173f
            com.google.android.gms.internal.ads.m3 r0 = (com.google.android.gms.internal.ads.C2610m3) r0
            com.google.android.gms.internal.ads.o3 r6 = r0.f13198a
            int r7 = com.google.android.gms.internal.ads.C2684o3.m17444n(r5)
            if (r7 == 0) goto L_0x0183
            r8 = 0
            if (r7 == r1) goto L_0x0161
            r9 = 8
            if (r7 == r2) goto L_0x0138
            r2 = 3
            if (r7 == r2) goto L_0x00f5
            if (r7 == r3) goto L_0x00ec
            long r6 = r13.f10174g
            r11 = 4
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x00d2
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00bc
            goto L_0x00d2
        L_0x00bc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid float size: "
            r14.append(r0)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.ea0 r14 = com.google.android.gms.internal.ads.ea0.m11990a(r14, r8)
            throw r14
        L_0x00d2:
            int r2 = (int) r6
            long r6 = r13.m13686a(r14, r2)
            if (r2 != r3) goto L_0x00e0
            int r14 = (int) r6
            float r14 = java.lang.Float.intBitsToFloat(r14)
            double r2 = (double) r14
            goto L_0x00e4
        L_0x00e0:
            double r2 = java.lang.Double.longBitsToDouble(r6)
        L_0x00e4:
            com.google.android.gms.internal.ads.o3 r14 = r0.f13198a
            r14.mo12808i(r5, r2)
            r13.f10172e = r4
            return r1
        L_0x00ec:
            long r2 = r13.f10174g
            int r0 = (int) r2
            r6.mo12806e(r5, r0, r14)
            r13.f10172e = r4
            return r1
        L_0x00f5:
            long r2 = r13.f10174g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x0122
            int r3 = (int) r2
            if (r3 != 0) goto L_0x0104
            java.lang.String r14 = ""
            goto L_0x011a
        L_0x0104:
            byte[] r2 = new byte[r3]
            com.google.android.gms.internal.ads.fn4 r14 = (com.google.android.gms.internal.ads.fn4) r14
            r14.mo9984g(r2, r4, r3, r4)
        L_0x010b:
            if (r3 <= 0) goto L_0x0115
            int r14 = r3 + -1
            byte r6 = r2[r14]
            if (r6 != 0) goto L_0x0115
            r3 = r14
            goto L_0x010b
        L_0x0115:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r2, r4, r3)
        L_0x011a:
            com.google.android.gms.internal.ads.o3 r0 = r0.f13198a
            r0.mo12811l(r5, r14)
            r13.f10172e = r4
            return r1
        L_0x0122:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "String element size: "
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.ea0 r14 = com.google.android.gms.internal.ads.ea0.m11990a(r14, r8)
            throw r14
        L_0x0138:
            long r2 = r13.f10174g
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x014b
            int r3 = (int) r2
            long r2 = r13.m13686a(r14, r3)
            com.google.android.gms.internal.ads.o3 r14 = r0.f13198a
            r14.mo12809j(r5, r2)
            r13.f10172e = r4
            return r1
        L_0x014b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid integer size: "
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.ea0 r14 = com.google.android.gms.internal.ads.ea0.m11990a(r14, r8)
            throw r14
        L_0x0161:
            long r2 = r14.mo9003T()
            long r6 = r13.f10174g
            java.util.ArrayDeque r14 = r13.f10169b
            com.google.android.gms.internal.ads.g3 r0 = new com.google.android.gms.internal.ads.g3
            long r6 = r6 + r2
            r0.<init>(r5, r6, r8)
            r14.push(r0)
            com.google.android.gms.internal.ads.i3 r14 = r13.f10171d
            int r6 = r13.f10173f
            long r9 = r13.f10174g
            com.google.android.gms.internal.ads.m3 r14 = (com.google.android.gms.internal.ads.C2610m3) r14
            com.google.android.gms.internal.ads.o3 r5 = r14.f13198a
            r7 = r2
            r5.mo12810k(r6, r7, r9)
            r13.f10172e = r4
            return r1
        L_0x0183:
            long r0 = r13.f10174g
            r2 = r14
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            int r1 = (int) r0
            r2.mo10218n(r1, r4)
            r13.f10172e = r4
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2424h3.mo10725e(com.google.android.gms.internal.ads.rn4):boolean");
    }

    /* renamed from: f */
    public final void mo10726f(C2461i3 i3Var) {
        this.f10171d = i3Var;
    }
}
